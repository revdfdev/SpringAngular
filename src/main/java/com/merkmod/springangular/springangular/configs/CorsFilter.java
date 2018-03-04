package com.merkmod.springangular.springangular.configs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CorsFilter implements Filter {

    private static final Logger LOGGER = LoggerFactory.getLogger(CorsFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        LOGGER.debug("=== Adding Cors filters ====");

        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        httpServletResponse.setHeader("Access-Control-Max-Age", "3600");
        httpServletResponse.setHeader("Access-Control-Allow-Headers", "X-PINGOTHER,Content-Type,X-Requested-With,accept," +
                "Origin,Access-Control-Request-Method,Access-Control-Request-Headers,Authorization");
        httpServletResponse.setHeader("Access-Control-Expose-Headers", "xsrf-token");
        chain.doFilter(request, response);

    }

    @Override
    public void destroy() {

    }
}
