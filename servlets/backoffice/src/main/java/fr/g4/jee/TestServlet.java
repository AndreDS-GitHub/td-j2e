package fr.g4.jee;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "TestServlet", urlPatterns = "/test-servlet")
public class TestServlet extends HttpServlet {
}
