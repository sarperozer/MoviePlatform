package com.sarper.Controller;

import com.sarper.Controller.interfaces.IMovieController;
import com.sarper.Controller.interfaces.IReviewController;
import com.sarper.Service.interfaces.IReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController implements IReviewController {
    @Autowired
    private IReviewService reviewService;
}
