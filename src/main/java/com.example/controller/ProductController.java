package com.example.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.dao.ProductDAO;
import com.example.model.Cart;
import com.example.model.Product;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;


@WebServlet({ "", "/product" })
public class ProductController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private ProductDAO dao;

    @Override
    public void init() throws ServletException {
        dao = new ProductDAO();


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("products", dao.getAllProducts());
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Cart cart;
        double sum ;
        if(session.getAttribute("sum")==null){
            sum = 0.0;
        }
        else{
            sum= (double)session.getAttribute("sum");
        }
        if(session.getAttribute("cart")==null){
            cart = new Cart();

        }
        else{
            cart=(Cart)session.getAttribute("cart");
        }

        String id = request.getParameter("productId");
        int productId;
        productId = Integer.parseInt(id);
        List<Product> products = dao.getAllProducts();
        for(int i = 0; i < products.size();i++){
            if(products.get(i).getId()==productId){
                cart.addToCart(products.get(i));
                sum+=products.get(i).getPrice();
                session.setAttribute("sum", sum);
                session.setAttribute("cart", cart);
            }
        }
        request.setAttribute("products", dao.getAllProducts());
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request, response);

    }

}