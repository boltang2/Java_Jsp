package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex4_cal
 */
@WebServlet("/cal.do")
public class Ex4_CalAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<head>");
		out.print("<title>간이 계산기</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("연산 성공<br>");
		out.print("+ 결과 : " + (num1 + num2) + "<br>");
		out.print("- 결과 : " + (num1 - num2) + "<br>");
		out.print("* 결과 : " + (num1 * num2) + "<br>");
		out.print("/ 결과 : " + (num1 / num2) + "<br>");
		out.print("</body>");
		out.print("</html>");
	}

}
