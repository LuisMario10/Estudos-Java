package DAO;

import com.mysql.cj.x.protobuf.MysqlxPrepare;
import db.ConnectionDataBase;
import models.ProductModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class ProductDAO {
    public void insertProduct(ProductModel product) {
        String SQL = "INSERT INTO products(product_name, price, quantity, is_promotion) VALUES (?,?,?,?);";
        PreparedStatement ps = null;
        try {
            ps = ConnectionDataBase.getConnectionWithDataBase().prepareStatement(SQL);
            ps.setString(1, product.getNameProduct());
            ps.setFloat(2, product.getPrice());
            ps.setInt(3, product.getQuantity());
            ps.setBoolean(4, product.isPromotion());

            ps.execute();
            ps.close();
            System.out.printf("Mensage: Produto %s adicionado com sucesso!!!\n", product.getNameProduct());
        } catch (SQLException e) {
            System.out.println("Error in System: Cadastro foi interrompido por: ");
            e.printStackTrace();
        }

    }


    public void updateProduct(int id, ProductModel product) {
        String SQL = "UPDATE products SET product_name = ?, price = ?, quantity = ?, is_promotion = ? WHERE id = ?";
        try {
            PreparedStatement ps = ConnectionDataBase.getConnectionWithDataBase().prepareStatement(SQL);
            ps.setString(1, product.getNameProduct());
            ps.setFloat(2, product.getPrice());
            ps.setInt(3, product.getQuantity());
            ps.setBoolean(4, product.isPromotion());
            ps.setInt(5, id);

            ps.execute();
            ps.close();
            System.out.println("Mensage: Produto Atualizado com Sucesso!!!");
        } catch(SQLException e) {
            System.out.println("Erro in System: O Produto nao foi atualizado por: ");
            e.printStackTrace();
        }
    }

    public void deleteProduct(int id) {
        String SQL = "DELETE FROM products WHERE id = ?";
        try {
            PreparedStatement ps = ConnectionDataBase.getConnectionWithDataBase().prepareStatement(SQL);
            ps.setInt(1, id);
            ps.execute();
            ps.close();
            System.out.println("Mensage: Produto deletado com sucesso!!!");
        } catch (SQLException e) {
            System.out.println("Error in System: produto nao foi deletado por causa de: ");
            e.printStackTrace();
        }
    }
}
