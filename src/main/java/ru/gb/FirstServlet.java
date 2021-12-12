package ru.gb;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/** Servlet -сущности, которые позваляют общаться по http, принимать и возвращать запросы*/


public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /** обработка get-запросов (получение данных) к сервлету
         *   req - то что пришло
         *   resp - то что отдаем
         *   */
        resp.getWriter().println("Hello world!");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /** обработка пост-запросов (создание данных)
         * req - то что пришло
         * resp - то что отдаем
         * */
        super.doPost(req, resp);
    }
}
