package com.vishal.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  private static final Log LOG = LogFactory.getLog(Controller.class);

  @Autowired
  private Environment env ;

  @RequestMapping(value = "/v1/demo", method = RequestMethod.GET)
  public ResponseEntity<Void> deleteRedisKeys() throws Exception {
    String property = env.getProperty("data");
    System.out.println(property);
    return new ResponseEntity<Void>(HttpStatus.CREATED);
  }
}