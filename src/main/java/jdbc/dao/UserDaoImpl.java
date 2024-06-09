package jdbc.dao;

import java.sql.*;

public class UserDaoImpl implements UsersDao{
    public static final String DB_URL = "jdbc:MySql://localhost:3306/new_schema_java?serverTimezone=UTC";
    public static final String DB_LOGIN = "";
    public static final String DB_PASSWORD = "";

    @Override
    public int getAgeByUserName(String name) {
        try(Connection connection = DriverManager.getConnection(DB_URL,DB_LOGIN,DB_PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement("select age from new_schema_java.users where name = ?")

        ) {
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return resultSet.getInt("age");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
