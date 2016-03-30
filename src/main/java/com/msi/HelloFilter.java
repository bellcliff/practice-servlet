package com.msi;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by Bo-yang on 3/30/2016.
 */
public class HelloFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        ((HttpServletResponse) response).setHeader("X-BO", request.getRemoteHost());
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
