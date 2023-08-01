package com.ideathon.autoresolver.controller;


import lombok.extern.slf4j.Slf4j;

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
        log.trace("A TRACE Message");
        log.debug("A DEBUG Message");
        log.info("An INFO Message");
        log.warn("A WARN Message");
        log.error("Connectivity to the hbase database was lost");

        log.error("Postgres database connectivity was lost");

        return "Howdy! An Error has occurred when displaying this page. Please check the error logs file.";
    }
}