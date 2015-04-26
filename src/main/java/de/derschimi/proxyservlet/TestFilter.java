package de.derschimi.proxyservlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by daniel on 26.04.2015.
 */
public class TestFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {

        String url = null;
        if (request instanceof HttpServletRequest) {
            url = ((HttpServletRequest) request).getRequestURL().toString();
        }
        HttpServletResponse r = (HttpServletResponse) response;
        response.getWriter().write("not allowed");
        r.sendRedirect( "/" );



        //chain.doFilter(request, response);

    }

    public void destroy() {
    }

}