//package ru.pakeev.springauth.components;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.security.core.Authentication;
//import org.springframework.stereotype.Component;
//import io.jsonwebtoken.*;
//import ru.pakeev.springauth.config.MyUserDetails;
//
//import java.util.Date;
//
//@Component
//public class JwtCore {
//    @Value("${testing.app.secret}")
//    private String secret;
//    @Value("${testing.app.lifetime}")
//    private String lifetime;
//
//    public String generateToken(Authentication authentication){
//        MyUserDetails myUserDetails = (MyUserDetails) authentication.getPrincipal();
//        return Jwts.builder().setSubject((myUserDetails.getUsername())).setIssuedAt(new Date())
//                .setExpiration(new Date((new Date()).getTime() + lifetime))
//                .signWith(SignatureAlgorithm.HS256, secret)
//                .compact();
//    }
//
//    public String getNameFromJwt(String token){
//        return Jwts.parser().setSigningKey(secret).parseClaimsJwt(token).getBody().getSubject;
//    }
//}
