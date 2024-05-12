package com.moutonperspicace.betterdndbeyond.controllers;

import com.moutonperspicace.betterdndbeyond.data.Dice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiceController {

    @GetMapping("/dice/{number}")
    public @ResponseBody int generateRandom(@PathVariable int number) {
        return new Dice(number).generate();
    }

}
