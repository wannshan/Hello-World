package wannshan.springb.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 文件功能：xxxx
 *
 */
@WebFilter
public class MyAuFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("test filter....");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
