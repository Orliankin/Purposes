package ua.orlyankin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String DATE = "date";
	private static final String NAME = "name";
	private static final String DESCRIPTION = "description";

	public AddServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.append("	<!DOCTYPE html>" + "<html>" + "<head>" + "<title>Add your purpose</title>" + "</head>"
				+ "<body>" + "<fieldset>" + "<legend><strong>Add your purpose below:</strong></legend>" + "<h6>"
				+ "</h6>" + "<form method = 'Post' action='AddServlet'>" + "<p>" + "Date<input type='date' name='date'>"
				+ "Name<input type='text' name='name'>" + "Description<input type='text' name='description'>"
				+ "<button type='submit'>Save</button>" + "<button autofocus vlue='next'>View</button>" + "</p>"
				+ "</fieldset>" + "</form>" + ViewServlet.viewPupposes() + "</body>" + "</html>");
		writer.flush();

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String date = request.getParameter(DATE);
		String name = request.getParameter(NAME);
		String description = request.getParameter(DESCRIPTION);
		ViewServlet.purposesList.add(new Purposes(date, name, description));
		doGet(request, response);

		// PrintWriter out = response.getWriter();

		// for (Purposes purposes : purposesList) {
		// out.println(purposes.toString());
		// }
		// out.close();
	}

}