package az.kapital.KapitalBank.Controller;

import az.kapital.KapitalBank.Model.response.ResponseDetails;
import az.kapital.KapitalBank.Service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/kapital")
public class UsersController {
    private final UsersService usersService;

    @GetMapping("/{id}")
    public ResponseDetails getUsers(@PathVariable String id){
        return usersService.getUsers(id);
    }
}
