
package com.servletpackage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;


public class FirstServlet implements Servlet
{
    ServletConfig conf;
    //life cycle methods
    public void init(ServletConfig conf)
    {
        this.conf=conf;
        System.out.println("Initialization****************************");
    }
    
    public void service(ServletRequest req,ServletResponse resp) throws ServletException, IOException
    {
        System.out.println("servicing***********************************");
        resp.setContentType("text/html");
        PrintWriter p=resp.getWriter();

        p.println("<h1>this is service method</h1>");
        p.println("<h1>Time is : "+  new Date() +"</h1>");
    }
    
    public void destroy()
    {
        System.out.println("com.servletpackage.FirstServlet.destroy()");
    }
    
    
}
