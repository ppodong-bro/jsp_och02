package och02Git;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Num
 */
@WebServlet("/Num")
public class Num extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Num() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * // 연산결과 덧셈 : 100 + 2 = 102 뺄셈 : 100 - 2 = 98 곱셈 : 100 * 2 = 200 나눗셈 : 100 / 2
		 * = 50
		 */
		response.setContentType("text/html; charest=utf=8");
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int sum = num1+num2;
		int min = num1-num2;
		int mul = num1*num2;
		int div = num1/num2;
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("덧셈 : " + num1 + "+" + num2 + "=" + sum+"<br>" );
		out.println("뺄셈 : " + num1 + "-" + num2 + "=" + min+"<br>" );
		out.println("곱셈 : " + num1 + "x" + num2 + "=" + mul+"<br>" );
		out.println("나눗셈 : " + num1 + "/" + num2 + "=" + div+"<br>" );
		out.println("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
