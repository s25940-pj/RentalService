package com.example.rentalservice.Service;

import com.example.rentalservice.Model.Movie;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.MessageFormat;

@Service
public class RentalService {
    private final RestTemplate restTemplate;

    public RentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Movie getById(long id) {
        ResponseEntity<Movie> exchange = restTemplate.exchange(
                "http://localhost:8080/movies/{id}",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                Movie.class,
                id
        );

        return exchange.getBody();
    }

    public
}
