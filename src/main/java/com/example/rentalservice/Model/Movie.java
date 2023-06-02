package com.example.rentalservice.Model;

import com.example.rentalservice.Data.Enum.Genre;
import lombok.Data;

import java.util.Date;

@Data
public class Movie {
    private long id;
    private String title;
    private Date releaseDate;
    private Genre genre;
}
