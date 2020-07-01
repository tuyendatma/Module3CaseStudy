package controller;

import dao.UserDao;
import model.Account;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "Servlet",urlPatterns = "/hello")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String account_name = request.getParameter("username");
        String password = request.getParameter("password");
        String username = request.getParameter("full_name");
        int phone_number= Integer.parseInt(request.getParameter("phone_number")) ;
        String email= request.getParameter("email");

        Account account = new Account(account_name,password,username,phone_number,email);
        System.out.println(account.getAccount_name());
        UserDao userDao = new UserDao();
        userDao.setInsert_account(account);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try{
            switch (action){
                case "create":
                    showFormLogin(request,response);
                    break;
                default:
                    break;
            }

        }catch (Exception ex){
            throw new ServletException(ex);

        }

    }

    private void showFormLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("create_account.jsp");
        dispatcher.forward(request, response);
    }

}
