package kz.greetgo.blog.stand.beans;

import kz.greetgo.blog.stand.utils.WebAppContextRegistration;
import kz.greetgo.depinject.core.Bean;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.webapp.WebAppContext;

import javax.servlet.*;
import java.io.IOException;
import java.util.EnumSet;

@Bean
public class Utf8FilterRegistration implements Filter,WebAppContextRegistration{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Hello World");
    }

    @Override
    public void destroy() {

    }

    @Override
    public void registerTo(WebAppContext webAppContext) {
        webAppContext.addFilter(new FilterHolder(this),"/", EnumSet.of(
                DispatcherType.INCLUDE,DispatcherType.REQUEST));
        printRegistration();
    }

    @Override
    public double priority() {
        return 0;
    }
}
