
package com.servletpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class SecondClass extends GenericServlet
{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("inside service overidden class");
        res.setContentType("text/html");
        PrintWriter p=res.getWriter();
        p.println("This is from overidden service method");
    }


    
}
