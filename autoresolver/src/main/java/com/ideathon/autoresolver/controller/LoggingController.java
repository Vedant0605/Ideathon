package com.ideathon.autoresolver.controller;


import com.ideathon.autoresolver.entity.Resolver;
import com.ideathon.autoresolver.repository.ResolverRepository;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@Slf4j
public class LoggingController {


    @RequestMapping("/")
    public String mainPage(){
        return "Solution service is UP!";
    }
    @RequestMapping("/desiredpage")
    public String index() {

        int resolvedCount =1;
        log.trace("A TRACE Message");
        log.debug("A DEBUG Message");
        log.info("An INFO Message");
        log.warn("A WARN Message");


        log.error("Connectivity to the hbase database was lost");

        log.error("Postgres database connectivity was lost");

        if(resolvedCount==0){

            return  "Howdy! An Error has occurred when displaying this page. Please check the error logs file.";

        }
        if(resolvedCount == 1){
            return "Your Desired page is visible!";
        }
        return  "Howdy! An Error has occurred when displaying this page. Please check the error logs file.";
    }
}