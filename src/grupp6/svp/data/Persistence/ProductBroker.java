package grupp6.svp.data.Persistence;

import grupp6.svp.data.DataTransferObjects.DataTransferObject;
import grupp6.svp.data.DataTransferObjects.ProductData;
import grupp6.svp.data.DbConnect;
import sun.security.util.ObjectIdentifier;
import grupp6.svp.domain.*;

import javax.xml.crypto.Data;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
    public void update(DataTransferObject object) {

    }

    @Override
    public void delete(DataTransferObject obj, Connection con) {
        PreparedStatement preparedStatement = null;

        String deleteSQL = "DELETE FROM pgiei02.Product WHERE ProductID = ?";

        try {
            con = DbConnect.getConnection();
            preparedStatement = con.prepareStatement(deleteSQL);
            System.out.println(obj.getId());
            preparedStatement.setInt(1, obj.getId());

            // execute delete SQL stetement
            preparedStatement.executeUpdate();

            System.out.println("Record is deleted!");

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
    public List<DataTransferObject> find(DataTransferObject obj) {
        List<DataTransferObject> temp = new ArrayList<>();

        temp.add(getFromStorage(obj.getId(), DbConnect.getConnection()));

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
}