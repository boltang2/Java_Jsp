package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex2_GreetAction
 */
@WebServlet("/greet.do")
public class Ex2_GreetAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// �Ķ���ͷ� �Ѿ���� ��� �����ʹ� �ݵ�� ���ڿ� ������ ���޵ȴ�.
		// Ŭ���̾�Ʈ�� ������ �Ķ���� ������ �޾ƾ� �Ѵ�.
		String msg = request.getParameter("nation");

		// �߸��� �Ķ���� ������ ����
		// 1) greet.do? nation = -> isEmpty()
		// 2) greet.do? -> null�� ����
		String result = "";
		if (msg == null || msg.isEmpty()) {
			result = "�ȳ��ϼ���";
		}

		if (msg.equals("kor")) {
			result = "�ȳ��ϼ���";
		} else if (msg.equals("eng")) {
			result = "Hello";
		}

		System.out.println(result);

		// �Ķ���Ϳ� ���� �������� ���ϴ� ����ó�� ��ü
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print(result);
		out.print("</body>");
		out.print("</html>");
	}

}
