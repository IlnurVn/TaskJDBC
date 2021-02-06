package jm.task.core.jdbc;


import com.mysql.fabric.jdbc.FabricMySQLDriver;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) throws SQLException {

//        Util util = new Util();
//
//        String createUsersTable = "CREATE TABLE Users ("
//                + "id INT(15) NOT NULL AUTO_INCREMENT,"
//                + "name VARCHAR(10),"
//                + "lastname VARCHAR(10),"
//                + "age INT(3),"
//                + "PRIMARY KEY(id))";
//        try {
//            Statement statement = util.getConnection().createStatement();
//            statement.executeUpdate(createUsersTable);
//            System.out.println("Таблица пользователей создана");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("При создании таблицы пользователей произошисключение\n" + e);
//        }
//    }
//}
////-------------------------------------------
//        String saveUser = "INSERT INTO Users  VALUES (?,?,?,?)";
//        try {
//            PreparedStatement statement = util.getConnection().prepareStatement(saveUser);
//            statement.executeUpdate("INSERT INTO Users VALUES (1, 'Pavel', 'Pavlov',43)");
//            System.out.println("User был добавлен в базу данных");
//            statement.executeUpdate("INSERT INTO Users VALUES (2, 'Ivan', 'Ivanov',33)");
//            System.out.println("User был добавлен в базу данных");
//            statement.executeUpdate("INSERT INTO Users VALUES (3, 'Sergei', 'Sergeev',21)");
//            System.out.println("User был добавлен в базу данных");
//            statement.executeUpdate("INSERT INTO Users VALUES (4, 'Petr', 'Pertov',41)");
//            System.out.println("User был добавлен в базу данных");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("Во время тестирования сохранения пользователя произошло исключение\n" + e);
//        }
//    }
//}
  //-------------------------------------------
//        String getAllUsers = "select * from table_user";
//        try {
//            Statement statement = util.getConnection().createStatement();
//            ResultSet resultSet = statement.executeQuery(getAllUsers);
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId((long) resultSet.getInt("id"));
//                user.setName(resultSet.getString("name"));
//                user.setLastName(resultSet.getString("lastname"));
//                user.setAge(resultSet.getByte("age"));
//                System.out.println(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.printf("При попытке достать всех пользователей из базы данных произошло исключение\n" + e);
//        }
//    }
//}
// ---------------------------------------
//String cleanUsersTable = "TRUNCATE TABLE Users";
//        try {
//            Statement statement = util.getConnection().createStatement();
//            statement.executeUpdate(cleanUsersTable);
//            System.out.println("Таблица пользователей очищена");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("При  очистки таблицы пользователей произошло исключение\n" + e);
//
//        }
//    }
//}
// -------------------------------------------
//        String dropUsersTable = "DROP TABLE IF EXISTS Users";
//        try {
//            Statement statement = util.getConnection().createStatement();
//            statement.executeUpdate(dropUsersTable);
//            System.out.println("Таблица пользователей удалена");
//        } catch (SQLException e) {
//        e.printStackTrace();
//        System.out.println("При удалении таблицы пользователей произошло исключение");
//        }
//    }
//}
//--------------------------------------