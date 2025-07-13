package com.cognizant.jwtApplication.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.web.bind.annotation.*;

import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    private static final Key key = Keys.hmacShaKeyFor("secretkeysecretkeysecretkey12".getBytes());

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        String username = getUser(authHeader);
        String token = generateToken(username);

        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        return response;
    }

    private String getUser(String authHeader) {
        String encoded = authHeader.replace("Basic ", "");
        String decoded = new String(Base64.getDecoder().decode(encoded));
        return decoded.split(":")[0]; 
    }

    private String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 20 * 60 * 1000))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }
}
