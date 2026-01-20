package com.sarper.Controller;

import com.sarper.Controller.interfaces.IUserController;
import com.sarper.Service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements IUserController {
    @Autowired
    private IUserService userService;
}
