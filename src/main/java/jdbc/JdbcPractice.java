package jdbc;

import jdbc.dao.EmployerDao;
import jdbc.dao.EmployerJdbcImpl;
import jdbc.dao.UserDaoImpl;
import jdbc.dao.UsersDao;

import java.sql.*;

public class JdbcPractice {
//    public static final String DB_URL = "jdbc:MySql://localhost:3306/new_schema_java?serverTimezone=UTC";
//    public static final String DB_LOGIN = "root";
//    public static final String DB_PASSWORD = "1488";
    public static void main(String[] args) {

//        try(Connection connection = DriverManager.getConnection(DB_URL,DB_LOGIN,DB_PASSWORD);
//        Statement statement = connection.createStatement()
//        ) {
//
//
//            ResultSet resultSet = statement.executeQuery("select Name, Age from new_schema_java.employers;");
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("Name") + ":" + resultSet.getInt("age"));
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

        EmployerDao dao = new EmployerJdbcImpl();
        System.out.println("dao.findAgeByName(\"tanya\") = " + dao.findAgeByName("TANYA"));

        UsersDao daoUser = new UserDaoImpl();
        System.out.println("daoUser.getAgeByUserName(\"andrey\") = " + daoUser.getAgeByUserName("andrey"));


    }
}
