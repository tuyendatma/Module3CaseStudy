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
import java.util.ArrayList;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    UserDao userDao=new UserDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action ==null){
            action="";
        }
        switch (action){
            case "listMyRoom":
                showLogin(request,response);
                break;
            default:
                break;
        }
        String account_name = request.getParameter("account_name");
        String password = request.getParameter("password");
        System.out.println(account_name);
        System.out.println(password);
        ArrayList<Account> list_account =  new ArrayList<>(userDao.selectAllUser());
        boolean is_match=false;
        for (Account account: list_account
             ) {
            if (account_name.equals(account.getAccount_name()) && password.equals(account.getPassword())){
                is_match=true;
                break;
            }
        }

        if (is_match){
            request.setAttribute("message","dang nhap thanh cong");
        }else {
            request.setAttribute("message","dang nhap khong thanh cong");
        }

    }

    private void showLogin(HttpServletRequest request, HttpServletResponse response) {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
