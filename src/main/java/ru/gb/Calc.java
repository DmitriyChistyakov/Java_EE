package ru.gb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Calc extends HttpServlet {

    // localhost: 8080/firstapp/calc?a=1&b=2  адрес: порт/url ? параметры & отделение параметров
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer a = Integer.valueOf(req.getParameter("a"));
        Integer b = Integer.valueOf(req.getParameter("b"));
        Integer sum = a+b;
        resp.getWriter().println(String.format("%s + %s = %s", a, b, sum));

    }
}
