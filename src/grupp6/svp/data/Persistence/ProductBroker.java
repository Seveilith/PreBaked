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

/**
 * Created by alo on 2017-05-08.
 */
public class ProductBroker extends Broker {

    @Override
    public void insert(DataTransferObject object) {

    }

    @Override
    public void update(DataTransferObject object) {

    }

    @Override
    public void delete(DataTransferObject object) {

    }

    @Override
    public List<DataTransferObject> find(DataTransferObject obj){
        List<DataTransferObject> temp = new ArrayList<>();
        if (cache.containsKey(obj.getId())) {
            temp.add((DataTransferObject) cache.get(obj.getId()));
            return temp;
        }

        temp.add(getFromStorage(obj.getId(), dbCon.getConnection())); //OCH CONNECTIOn
        cache.put(obj.getId(), obj);

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

            while (rs.next()){
                productData.setProductId(rs.getInt("ProductID"));
                productData.setProductName(rs.getString("ProductName"));
                productData.setProductDescription(rs.getString("ProductDescription"));
                productData.setProductPrice(rs.getInt("ProductPrice"));
                productData.setProductQuantity(rs.getInt("ProductQuantity"));
            }

            dbCon.returnConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productData;
    }
}
