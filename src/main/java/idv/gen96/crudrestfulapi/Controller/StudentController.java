package idv.gen96.crudrestfulapi.Controller;

import idv.gen96.crudrestfulapi.Entity.User;
import idv.gen96.crudrestfulapi.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/users")
public class StudentController {
    private UserService userService;

    //使用POST傳資料到http://localhost:8080/api/users建立新user
    //create user RESTful API
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    //在網址列輸入http://localhost:8080/api/users/{id}來查詢指定id的user資訊
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(name = "id") long userId){
        User user = userService.getUserById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
