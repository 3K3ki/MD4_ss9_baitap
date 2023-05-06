package controller;

import model.entity.Catalog;
import model.service.catalog.CatalogImp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CatalogServlet", value = "/CatalogServlet")
public class CatalogServlet extends HttpServlet {
    private CatalogImp catalogServiceImpl = new CatalogImp();
    private List<Catalog> lists ;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
