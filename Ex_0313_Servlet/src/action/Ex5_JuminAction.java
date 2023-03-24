package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex5_JuminAction
 */
@WebServlet("/jumin.do")
public class Ex5_JuminAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String jumin = request.getParameter("jn");
		int gender = Integer.parseInt(jumin.substring(7, 8));
		int season = Integer.parseInt(jumin.substring(2, 4));
		String g_p = "";
		String s_p = "";
		if (gender % 2 == 1) {
			g_p = "남자";
		} else {
			g_p = "여자";
		}
		switch (season) {
		case 3:
		case 4:
		case 5:
			s_p = "봄";
			break;
		case 6:
		case 7:
		case 8:
			s_p = "여름";
			break;
		case 9:
		case 10:
		case 11:
			s_p = "가을";
			break;
		case 12:
		case 1:
		case 2:
			s_p = "겨울";
			break;
		default:
			break;
		}
		System.out.println(gender);
		System.out.println(season);

		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<head>");
		out.print("<title>주민 번호</title>");
		out.print("<style>table{border-collapse: collapse;} table td{border: 4px solid #333333; padding : 3px;}</style>");
		out.print("</head>");
		out.print("<body>");
		out.print("<table border='3'>");
		out.print("<tr><td>주민번호</td><td>" + jumin + "</td></tr>");
		out.print("<tr><td>성별</td><td>" + g_p + "</td></tr>");
		out.print("<tr><td>계절</td><td>" + s_p + "</td></tr>");
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}

}
