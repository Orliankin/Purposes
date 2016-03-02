package ua.orlyankin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static final List<Purposes> purposesList = new ArrayList<Purposes>();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.append("<!DOCTYPE html>" + "<html>" + "<head>" + "<title>View</title>" + "</head>" + "<body>"
				+ "<strong>It's your </strong>" + "</html");
		out.print(/* this. */viewPupposes());
	}

	public static String viewPupposes() {
		StringBuilder sb = new StringBuilder("<p><strong>Purposes:</strong></p>");
		sb.append("<table style='border'>");
		for (Purposes purp : purposesList) {
			sb.append("<tr><td style='border'>").append(purp.getDate() + purp.getName() + purp.getDescription())
					.append("</td></tr>");
		}
		sb.append("</table>");
		return sb.toString();

	}
}
