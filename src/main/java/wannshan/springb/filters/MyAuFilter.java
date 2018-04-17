package wannshan.springb.filters;

import javax.servlet.*;
import java.io.IOException;

/**
 * 文件功能：xxxx
 *
 */
public class MyAuFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        /**
         * 功能：xxxx
         * .
         */

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("test filter....");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        /**
         * 功能：xxxx
         *
         */

    }
}
