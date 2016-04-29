package io.github.didriklind.javaClasses;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BlogControllerServlet
 */
@WebServlet("/BlogControllerServlet")
public class BlogControllerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public BlogControllerServlet() {
        super();
    }

  //(Work that u normally do in constructor u do here in a servlet)
	public void init(ServletConfig config) throws ServletException {
		System.out.println("EE");
		//In my case I dont use database, so I just generate some simple blog data.
		DBAndDAOImitation.genereteBlogs();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	// A simple solution by identifying action depending on the blogId qs is null or not.
	//Though it is not so beautiful, the code is simple to read!
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			//query string
			String idQueryStr = request.getParameter("blogId");
			//System.out.println(idQueryStr);
			if(idQueryStr == null) {
				listBlogs(request, response);
			}else {
				listBlog(request, response);
			}
		} catch (Exception e) {				
			e.printStackTrace();
		}
		
	}

	private void listBlogs(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ArrayList<BlogBean> beans = DBAndDAOImitation.getAllBlogs();
		
		request.setAttribute("BLOG_LIST", beans);
		
		//begärd-avsändare (=RequestDispatcher)
		RequestDispatcher dispatcher = 
			request.getRequestDispatcher("/start.jsp");
		dispatcher.forward(request, response);
		
	}

	private void listBlog(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int id = Integer.parseInt(request.getParameter("blogId"));
		BlogBean bean = DBAndDAOImitation.getBlog(id);
		
		request.setAttribute("BLOG", bean);
		
		//begärd-avsändare (=RequestDispatcher)
		RequestDispatcher dispatcher = 
			request.getRequestDispatcher("/blog.jsp");
		dispatcher.forward(request, response);
		
	}

}