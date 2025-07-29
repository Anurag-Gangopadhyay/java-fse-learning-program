package com.cognizant.spring_learn.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import java.util.Base64;
import java.util.Date;

@RestController
public class AuthenticationController {

    private final String SECRET_KEY = "mySuperSecretKeyThatIsAtLeast32CharsLong123"; // Use a stronger key in real applications

    @RequestMapping(value = "/authenticate", method = RequestMethod.GET)
    public String authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Basic")) {
            String base64Credentials = authHeader.substring("Basic".length()).trim();
            byte[] decoded = Base64.getDecoder().decode(base64Credentials);
            String credentials = new String(decoded);
            String[] values = credentials.split(":", 2);

            String username = values[0];
            String password = values[1];

            // Dummy validation, replace with real user verification
            if ("user".equals(username) && "pwd".equals(password)) {
                String token = Jwts.builder()
                        .setSubject(username)
                        .setIssuedAt(new Date())
                        .setExpiration(new Date(System.currentTimeMillis() + 60 * 60 * 1000)) // 1 hour
                        .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                        .compact();

                return "{\"token\":\"" + token + "\"}";
            } else {
                throw new RuntimeException("Invalid Credentials");
            }
        } else {
            throw new RuntimeException("Missing Authorization Header");
        }
    }
}
