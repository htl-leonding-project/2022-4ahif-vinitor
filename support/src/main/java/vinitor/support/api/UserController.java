package vinitor.support.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("vinitor/api/support/users")
public class UserController {

    @GetMapping(path="/getAll")
    public ResponseEntity<?> getAll(){
        return ok("test");
    }
}
