package com.example.controller;
import com.example.dao.UserDAO;
import com.example.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/login")
public class Servlet extends HttpServlet {
    private UserDAO dao;

    @Override
    public void init() throws ServletException {
        dao = new UserDAO();

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        List<User>  users = dao.getAllUsers();
        boolean found = false;
        for(int i = 0; i<users.size(); i++){
            if(name.equals(users.get(i).getUsername()) && password.equals(users.get(i).getPassword())){
                found = true;
            }
        }
        if(found){
            session.setAttribute("username", name);
            RequestDispatcher view = request.getRequestDispatcher("checkout.jsp");
            view.forward(request, response);
        }
        else{
            RequestDispatcher view = request.getRequestDispatcher("signup.jsp");
            view.forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher view = request.getRequestDispatcher("login.jsp");
        view.forward(request, response);
    }
}
