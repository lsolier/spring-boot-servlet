package com.example.springboothelloworld.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName="helloFilter", urlPatterns="/helloServlet")
public class HelloFilter implements Filter {

  @Override
  public void doFilter(ServletRequest sRequest, ServletResponse sResponse, FilterChain filterChain)
      throws IOException, ServletException {
    System.out.println("Executing doFilter method");
    filterChain.doFilter(sRequest, sResponse);
    System.out.println("Done executing doFilter Method");
  }
}
