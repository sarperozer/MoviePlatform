package com.sarper.Controller;

import com.sarper.Controller.interfaces.IMovieController;
import com.sarper.Service.interfaces.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController implements IMovieController {
    @Autowired
    private IMovieService movieService;
}
