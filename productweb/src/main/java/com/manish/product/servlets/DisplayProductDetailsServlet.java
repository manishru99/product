package com.manish.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mani.product.bo.ProductBO;
import com.mani.product.bo.ProductBOImpl;
import com.mani.product.dto.Product;

/**
 * Servlet implementation class DisplayProductDetailsServlet
 */
//@WebServlet("/DisplayProductDetailsServlet")
public class DisplayProductDetailsServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	private static final long serialVersionUID = 102831973239L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ProductBO bo = new ProductBOImpl();
		Product product = bo.findProduct(Integer.parseInt(request.getParameter("id")));
		
		PrintWriter out = response.getWriter();
		out.print("Product Details");
		out.print("Product ID:" + product.getId());
		out.print("Product Name:" + product.getName());
		out.print("Product Description:" + product.getDescription());
		out.print("Product Price:" + product.getPrice());
		
	}

}
