import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1, urlPatterns = "/booking")
public class BookingServlet extends HttpServlet {

    public BookingServlet() {
        System.out.println("Creating a Booking servlet");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String source=req.getParameter("source");
        String des=req.getParameter("destination");
        String start=req.getParameter("startDate");
        String ret=req.getParameter("returnDate");
        String type=req.getParameter("seatType");
        String ticket=req.getParameter("totalTicket");
        String male=req.getParameter("No of Male");
        String female=req.getParameter("No of Female");

        System.out.println("Name:"+name);
        System.out.println("Source:"+source);
        System.out.println("Destination:"+des);
        System.out.println("Start Date :"+start);
        System.out.println("Return Date :"+ret);
        System.out.println("Seat Type:"+type);
        System.out.println("Total Ticket :"+ticket);
        System.out.println("No Of Male:"+male);
        System.out.println("No Of Female:"+female);

        resp.setContentType("text/html");

        PrintWriter printWriter= resp.getWriter();

        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("</body>");
        printWriter.println("<h1 class=\"text-center\">Booking was success</h1>");
        printWriter.println("<h3> Name: "+req.getParameter("name"));
        printWriter.println("</h3>");
        printWriter.println("<h3> Source: "+req.getParameter("source"));
        printWriter.println("</h3>");
        printWriter.println("<h3> Destination: "+req.getParameter("destination"));
        printWriter.println("</h3>");
        printWriter.println("<h3> Start Date: "+req.getParameter("startDate")+"</h3>");
        printWriter.println("<h3> Return Date: "+req.getParameter("returnDate"));
        printWriter.println("</h3>");
        printWriter.println("<h3> Seat Type: "+req.getParameter("seatType"));
        printWriter.println("</h3>");
        printWriter.println("<h3> Total Ticket: "+req.getParameter("totalTicket"));
        printWriter.println("</h3>");
        printWriter.println("<h3> No of Male: "+req.getParameter("noOfMale"));
        printWriter.println("</h3>");
        printWriter.println("<h3> No of Female: "+req.getParameter("noOfFemale"));
        printWriter.println("</h3>");
        printWriter.println("</html>");

    }

}