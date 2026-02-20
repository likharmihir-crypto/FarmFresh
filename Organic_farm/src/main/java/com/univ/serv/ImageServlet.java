package com.univ.serv;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.univ.DAO.CustomerDAO;


@WebServlet("/ImageServlet")
@MultipartConfig(maxFileSize=16177215L)
public class ImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ImageServlet() {
        super();
       }

			protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String price = request.getParameter("price");
		        String type = request.getParameter("type");
		        InputStream in = null;
		        String message = null;
		        Part filePart = request.getPart("photo");
		        String fnm = "";
		        if (filePart != null) {
		            fnm = filePart.getSubmittedFileName();
		            System.out.println(fnm);
		            System.out.println(filePart.getSize());
		            System.out.println(filePart.getContentType());
		            in = filePart.getInputStream();
		        }

		        CustomerDAO dao = new CustomerDAO();
		        int row = dao.uploadFile(fnm, price, type, in);
		        if (row > 0) {
		            response.sendRedirect("admin/file.jsp");
		        }
       
       }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
