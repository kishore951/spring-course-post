package com.nestdigital.course.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {

   @GetMapping("/")
        public String Homepage(){
            return "Welcome to my home page";
        }

        @PostMapping("/read")
        public String Readpage(){
       return "read page";
        }

        @GetMapping("/viewall")
    public List viewall(){
       List<String> myList=new ArrayList<>();
       myList.add("{'name':'kishore','age':'21'}");
       return  myList;
        }
    }



