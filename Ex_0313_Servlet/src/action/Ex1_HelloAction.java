package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex1_HelloAction
 */

/*
 * Servlet( server + let ) 
 * 1) �� �������α׷��� ����� �ڹٱ���̸�, ����� ������� html������ �����ش�. 
 * 2) html�� �� �� ���� ������ �������� ������ �� �ִ�. 
 * 3) �ڹپ��� �ۼ��Ǿ� �־�, �ڹ��� �Ϲ����� Ư¡�� ��� ������ �ִ�. 
 * 4) �ڵ����� ������ ó���� �ȴ�(���� �ٹ����� Ŭ���̾�Ʈ���� ��û�� �����ϴ� ���� ����).
 */
@WebServlet("/hello.do") // url����(�ٸ� ������ ������ �̸����� �ۼ��ϸ� X)
public class Ex1_HelloAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// url ������ ȣ��Ǹ� �� ó�� ����Ǵ� �޼���(service)
		// request : ��û ó����ü
		// response : ���� ó����ü

		// ������ Ŭ���̾�Ʈ�� ip�� ���
		String ip = request.getRemoteAddr();
		System.out.println(ip + "�� ȯ���մϴ�.");
		System.out.println("--���� ��ü�� service�ż��尡 ȣ���--");

		// ����ó�� ��ü�� ���� �������� ����� ǥ��
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>���� ����</title>");
		out.print("<style>h1{color:red;}</style>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>" + ip + "�� ȯ���մϴ�.</h1>"); // PrintWriter�� ���ؼ� ȭ�鿡 ����� ���
		out.print("</body>");
		out.print("</html>");

	}

}
