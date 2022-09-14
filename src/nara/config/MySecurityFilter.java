package nara.config;

import javax.servlet.*;
import java.io.IOException;

public class MySecurityFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Before");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("After");
    }
}
