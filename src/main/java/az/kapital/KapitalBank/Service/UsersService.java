package az.kapital.KapitalBank.Service;

import az.kapital.KapitalBank.Model.response.ResponseDetails;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UsersService {
    public ResponseDetails getUsers(String id){
        System.out.println("User`s id:"+id);
        return ResponseDetails.builder()
                .name("Emrah")
                .surname("Garashov")
                .birthday(LocalDate.of(1998,10,14))
                .id("1234567890")
                .username("Emrah Garashov")
                .password("@1234")
                .build();
    }
}
