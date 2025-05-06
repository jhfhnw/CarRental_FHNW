package ch.fhnw.car_rental.security.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenService {

    private static final String SECRET_KEY = "your-secret-key";
    private static final long EXPIRATION_TIME = 86400000; // 1 Tag in Millisekunden

    public String generateToken(String username) {
        return Jwts.builder()
                   .setSubject(username)
                   .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                   .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                   .compact();
    }

    public String validateToken(String token) {
        return Jwts.parser()
                   .setSigningKey(SECRET_KEY)
                   .parseClaimsJws(token)
                   .getBody()
                   .getSubject();
    }
}