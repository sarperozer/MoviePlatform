package com.sarper.Service;

import com.sarper.Repository.ReviewRepository;
import com.sarper.Service.interfaces.IReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService implements IReviewService {

    @Autowired
    private ReviewRepository reviewRepository;
}
