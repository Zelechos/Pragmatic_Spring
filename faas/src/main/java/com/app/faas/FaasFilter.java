package com.app.faas;


import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 *
 * CLase para implementar seguridad a los Faas
 */
@Component
public class FaasFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        if (req.getHeader("nonsecure") != null) {
            res.getOutputStream()
                    .write(
                        "{\"error\": \"ERROR DE SEGURIDAD!\"}".getBytes()
                    );
            return;
        }

        chain.doFilter(request, response);


    }
}
