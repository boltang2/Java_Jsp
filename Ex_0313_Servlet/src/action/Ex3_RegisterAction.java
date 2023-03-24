package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex3_RegisterAction
 */
@WebServlet("/join.do")
public class Ex3_RegisterAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		int age = Integer.parseInt(request.getParameter("age"));

		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<body>");
		out.print("회원가입 성공<br>");
		out.print("ID : " + id + "<br>");
		out.print("PWD : " + pwd + "<br>");
		out.print("AGE : " + age + "<br>");
		out.print("</body>");
		out.print("</html>");
	}

}
