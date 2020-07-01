package controller;

import dao.UserDao;
import model.Room_details;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "RoomDetailServlet",urlPatterns = "/listRoom")
public class RoomDetailServlet extends HttpServlet {
    UserDao userDao = new UserDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action ==null){
            action="";
        }
        switch (action){
            case "login":
                showLogin(request,response);
                break;
            case "listMyRoom":
                showListRoom(request,response);
                break;
            default:
                break;
        }

    }

    private void showLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher=request.getRequestDispatcher("/jsp/login.jsp");
        dispatcher.forward(request, response);
    }

    private void showListRoom(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Room_details> list = new ArrayList<>(userDao.selectAllRoomDetails());
        request.setAttribute("list_room_details",list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("list-room.jsp");
        dispatcher.forward(request,response);
    }
}
