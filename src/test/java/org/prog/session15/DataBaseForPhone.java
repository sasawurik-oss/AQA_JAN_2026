package org.prog.session15;

import java.sql.*;

public class DataBaseForPhone {

    private Connection connection;
    public DataBaseForPhone() throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db",
                "root",
                "password"
        );
        System.out.println("Connect");
    }

    public Integer priceForDb(String model) throws SQLException {

        String sql = "SELECT price FROM phones WHERE model = ?";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, model);

        ResultSet result = statement.executeQuery();

        if (result.next()) {
            return result.getInt("price");
        }

        return null;
    }

    public void addPhone(String model, int price) throws SQLException {

        String sql = "INSERT INTO phones(model, price) VALUES (?, ?)";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, model);
        statement.setInt(2, price);

        statement.executeUpdate();
    }

}
