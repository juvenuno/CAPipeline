package com.helloworld.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController 
{
@RequestMapping("/")
public String hello() 
{
return "<h1> This a new piece on info was added via PipelineCA. To prove it's working - NUNO CORREIA - Test </h1>" ;
}
}
