package och02Git;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Person
 */
@WebServlet("/Person")
public class Person extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()    	HW02
     * 개인정보
											이름 : 김유신3
											아이디 : bb
											암호 : 1
											성별 : 남자
											수신메일 : 공지 배송
											직업 : 장군
     */
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charest=utf=8");
		String name 	= request.getParameter("name");
		String id		= request.getParameter("id");
		String password = request.getParameter("password");
		String gender	= request.getParameter("gender");
		String[] notice	= request.getParameterValues("notice");
		String job		= request.getParameter("job");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("이름 : "+name+"<br>");
		out.println("아이디 : "+id+"<br>");
		out.println("암호 : "+password+"<br>");
		out.println("성별 : "+gender+"<br>");
		out.println("수신메일 : ");
		if(notice != null) {
			for(int i = 0; i < notice.length; i++) {
				out.println(notice[i]+"<br>");
			}
		} else {out.println("없음<br>");}
		out.println("직업 : "+job+"<br>");
		out.close();
		
	}

}
