package com.nus.workshop37.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/upload", 
                produces=MediaType.MULTIPART_FORM_DATA_VALUE, 
                consumes=MediaType.APPLICATION_JSON_VALUE )
public class PostController {
    
}
