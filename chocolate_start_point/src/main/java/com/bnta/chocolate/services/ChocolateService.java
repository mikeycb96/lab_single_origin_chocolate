package com.bnta.chocolate.services;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChocolateService {

    @Autowired
    ChocolateRepository chocolateRepository;

//    @Autowired
//    EstateService estateService;

    public Chocolate chocolate(Chocolate chocolate){
        chocolateRepository.save(chocolate);
        return chocolate;
    }

}
