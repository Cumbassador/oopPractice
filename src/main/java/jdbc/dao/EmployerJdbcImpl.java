package jdbc.dao;

import java.sql.*;

public class EmployerJdbcImpl implements EmployerDao{
    public static final String DB_URL = "jdbc:MySql://localhost:3306/new_schema_java?serverTimezone=UTC";
    public static final String DB_LOGIN = "";
    public static final String DB_PASSWORD = "";

//    @Override
//    public int findAgeByName(String name) {
//        try(Connection connection = DriverManager.getConnection(DB_URL,DB_LOGIN,DB_PASSWORD);
//            Statement statement = connection.createStatement()
//        ) {
//
//            ResultSet resultSet = statement.executeQuery("select age from new_schema_java.employers where name = '"+ name +"'");
//            resultSet.next();
//            return resultSet.getInt("age");
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
@Override
public int findAgeByName(String name) {
    try(Connection connection = DriverManager.getConnection(DB_URL,DB_LOGIN,DB_PASSWORD);
        PreparedStatement preparedStatement = connection.prepareStatement("select age from new_schema_java.employers where name = ?")
    ) {

        preparedStatement.setString(1,"tanya");
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return resultSet.getInt("age");

    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    }
}
