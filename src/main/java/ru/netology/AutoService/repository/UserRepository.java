package ru.netology.AutoService.repository;

import org.springframework.stereotype.Repository;
import ru.netology.AutoService.Authorities;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> result = new ArrayList<>();
        if (user.equalsIgnoreCase("yuri") && password.equals("123")) {
            result.add(Authorities.READ);
        } else if (user.equalsIgnoreCase("admin") && password.equals("1111")) {
            result.add(Authorities.WRITE);
        } else if (user.equalsIgnoreCase("ivan") && password.equals("333")) {
            result.add(Authorities.DELETE);
        }
        return result;
    }
}
