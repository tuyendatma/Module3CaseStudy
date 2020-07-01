package dao;

import model.Account;
import model.Room_details;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private String jdbcURL = "jdbc:mysql://localhost:3306/hotel_database";
    private String jdbcUsername = "root";
    private String jdbcPassword = "123456";

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            System.out.println("khong ket noi duoc");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("khong ket noi duoc");
            e.printStackTrace();
        }
        return connection;
    }

    public void executeSQL(String SQL) throws Exception{
        Connection connect = getConnection();
        PreparedStatement preparedStatement = (PreparedStatement) connect.createStatement();
        preparedStatement.executeUpdate(SQL);
    }

    public ResultSet selectData(String SQL) throws Exception{
        Connection connect = getConnection();
        PreparedStatement preparedStatement = (PreparedStatement) connect.createStatement();
        ResultSet rs = preparedStatement.executeQuery(SQL);
        return rs;
    }

    String select_all_user = "select * from account";
    public List<Account> selectAllUser(){
        List<Account> list_account = new ArrayList<>();
        Connection connect = getConnection();
        try {
            PreparedStatement preparedStatement = connect.prepareStatement(select_all_user);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
            String account_name = rs.getString(1);
            String password = rs.getString(2);
            String user_name = rs.getString(3);
            int phone_number = rs.getInt(4);
            String email =rs.getString(5);
            Account account = new Account(account_name,password,user_name,phone_number,email);
            list_account.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list_account;
    }

    String select_all_room_details = "select * from room_details";
    public List<Room_details> selectAllRoomDetails(){
        List<Room_details> list_room_details = new ArrayList<>();
        Connection connect = getConnection();
        try {
            PreparedStatement preparedStatement = connect.prepareStatement(select_all_room_details);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id_room_details = rs.getInt(1);
                int id_room = rs.getInt(2);
                String name_room = rs.getString(3);
                double price = rs.getDouble(4);
                String description = rs.getString(5);
                int amount = rs.getInt(6);
//                System.out.println(id_room);
//                System.out.println(id_room_details);
//                System.out.println(name_room);
//                System.out.println(price);
//                System.out.println(description);
//                System.out.println(amount);
                Room_details room_details = new Room_details(id_room_details,id_room,name_room,price,description,amount);
//                System.out.println("room name: "+room_details.getName_room());
                list_room_details.add(room_details);
//                System.out.println("list room size: "+list_room_details.size());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list_room_details;
    }

//    public static void main(String[] args) {
//        UserDao userDao =new UserDao();
//        ArrayList<Room_details> list = new ArrayList<>(userDao.selectAllRoomDetails());
//
//    }
    String insert_account = "insert into account(account_name, password, user_name, phone_number, email) value(?,?,?,?,?)";
    public void setInsert_account(Account account){
        Connection connection =getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insert_account);
            preparedStatement.setString(1,account.getAccount_name());
            preparedStatement.setString(2,account.getPassword());
            preparedStatement.setString(3,account.getUsername());
            preparedStatement.setInt(4,account.getPhone_number());
            preparedStatement.setString(5,account.getEmail());
            preparedStatement.executeUpdate();



        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Account account = new Account("phuong","123","phuongSo",1234567,"phuong@gmail.com");
        UserDao userDao = new UserDao();
        userDao.setInsert_account(account);
    }
}
