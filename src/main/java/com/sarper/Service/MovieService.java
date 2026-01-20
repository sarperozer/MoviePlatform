package com.sarper.Service;

import com.sarper.Repository.MovieRepository;
import com.sarper.Service.interfaces.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService implements IMovieService {
    @Autowired
    private MovieRepository movieRepository;
}
