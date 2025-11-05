package com.devmind.springapp;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Getter
@Setter
@Component
public class WisdomWordsService {


    private String message = "Hard work pays off";

}
