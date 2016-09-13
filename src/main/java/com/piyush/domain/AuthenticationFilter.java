package com.piyush.domain;

import org.apache.commons.codec.binary.Base64;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.StringTokenizer;

public class AuthenticationFilter implements ContainerRequestFilter {

    private static final String AUTHORIZATION_HEADER = "AUTHORIZATION";

    @Override
    public void filter(ContainerRequestContext context) throws IOException {
        System.out.println("Inside the authentication filter...");

        if (context.getUriInfo().getRequestUri().toString().contains("/auth/details")) {

            if (null == context.getHeaders().getFirst(AUTHORIZATION_HEADER)) {
                context.abortWith(Response.status(Response.Status.BAD_REQUEST).build());
                return;
            }
            String headerValue = context.getHeaders().getFirst(AUTHORIZATION_HEADER).replace("Basic", "").trim();
            String decodedString = new String(Base64.decodeBase64(headerValue), "UTF-8");

            StringTokenizer tokenizer = new StringTokenizer(decodedString, ":");
            String username = tokenizer.nextToken();
            String password = tokenizer.nextToken();

            if (!("piyush".equals(username) && "kumar".equals(password))) {
                context.abortWith(Response.status(Response.Status.UNAUTHORIZED).build());
            }

            System.out.println("Authentication is done ... ");
        }
    }
}
