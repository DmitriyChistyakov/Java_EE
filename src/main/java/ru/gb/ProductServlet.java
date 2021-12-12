package ru.gb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/** если не делать аннотацию в  web.xml */
//@WebServlet(name = "ProductServlet", urlPatterns = "/product-annotations")

public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Product[] products ={
                new Product(1, "milk", 45.50),
                new Product(2, "banana", 99),
                new Product(3, "Tomato", 150.55),
                new Product(4, "Kefir", 44),
                new Product(5, "Watermelon", 22),
                new Product(6, "pumpkin", 450),
                new Product(7, "broomstick", 50),
                new Product(8, "radish", 34),
                new Product(9, "curd", 124),
                new Product(10, "egg", 99.50),
        };

        for (Product product: products) {
            resp.getWriter().println("id = " +product.getId()+ ", " +
                    "title = " + product.getTitle() + ", " +
                    "cost = " + product.getCost());
        }
    }
}
