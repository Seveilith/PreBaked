package grupp6.svp.data.Persistence;

import grupp6.svp.data.DataTransferObjects.*;
import grupp6.svp.data.DbConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductBroker extends Broker {

    @Override
    public void insert(DataTransferObject object, Connection con) {
        String insertTableSQL = "INSERT INTO pgiei02.Product" +
                "(ProductID, ProductName, ProductDescription, ProductPrice, ProductQuantity)" +
                " VALUES(?,?,?,?,?)";

        ProductData product = (ProductData) object;

        try {
            PreparedStatement preparedStatement = con.prepareStatement(insertTableSQL);
            preparedStatement.setInt(1, product.getId());
            preparedStatement.setString(2, product.getProductName());
            preparedStatement.setString(3, product.getProductDescription());
            preparedStatement.setInt(4, product.getProductPrice());
            preparedStatement.setInt(5, product.getProductQuantity());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(DataTransferObject obj, Connection con) {
        PreparedStatement preparedStatement = null;
        String deleteSQL = "DELETE FROM pgiei02.Product WHERE ProductID = ?";

        try {
            con = DbConnect.getConnection();
            preparedStatement = con.prepareStatement(deleteSQL);
            preparedStatement.setInt(1, obj.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {

            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (con != null) {
                DbConnect.returnConnection(con);
            }
        }
    }

    @Override
    public DataTransferObject find(DataTransferObject obj) {
        DataTransferObject temp = getFromStorage(obj.getId(), DbConnect.getConnection());

        return temp;
    }

    @Override
    public DataTransferObject getFromStorage(int id, Connection con) {
        ProductData productData = new ProductData();

        String sqlSelect = "SELECT * FROM pgiei02.Product WHERE ProductID = ?";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sqlSelect);
            preparedStatement.setObject(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                productData.setId(rs.getInt("ProductID"));
                productData.setProductName(rs.getString("ProductName"));
                productData.setProductDescription(rs.getString("ProductDescription"));
                productData.setProductPrice(rs.getInt("ProductPrice"));
                productData.setProductQuantity(rs.getInt("ProductQuantity"));
            }

            DbConnect.returnConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productData;
    }

    public List<DataTransferObject> getAllFromStorage(Connection con) {
        List<DataTransferObject> products = new ArrayList<>();
        String sqlSelectAll = "SELECT * FROM pgiei02.Product";

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sqlSelectAll);

            while (rs.next()) {
                ProductData data = new ProductData();
                data.setId(rs.getInt("ProductID"));
                data.setProductName(rs.getString("ProductName"));
                data.setProductDescription(rs.getString("ProductDescription"));
                data.setProductPrice(rs.getInt("ProductPrice"));
                data.setProductQuantity(rs.getInt("ProductQuantity"));

                products.add(data);
            }


            return products;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}