package vinitor.support.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vinitor.support.entities.User;
import vinitor.support.services.UserService;

import javax.inject.Inject;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("vinitor/api/support/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //Endpoint
    @GetMapping(path = "/getAll")
    public ResponseEntity<?> getAll() {
        return ok(userService.getAll());
    }


    @PostMapping(path = "/createTest")
    public ResponseEntity<?> createTest() {
        userService.create();
        return ok().build();
    }
}
