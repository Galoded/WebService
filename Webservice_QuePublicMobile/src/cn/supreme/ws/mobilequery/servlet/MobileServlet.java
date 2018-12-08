package cn.supreme.ws.mobilequery.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.supreme.ws.selfmobile.service.MobileInterface;

public class MobileServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MobileInterface mobileService;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String mobile = req.getParameter("mobileNumber");
		
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		mobileService = (MobileInterface) context.getBean("selfMobileWs");
		String result = mobileService.query(mobile);
		req.setAttribute("result", result);
		req.getRequestDispatcher("/WEB-INF/jsps/mobileQuery.jsp").forward(req, res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		doGet(req,res);
	}
}
