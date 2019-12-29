package com.example.springboot.couchbase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
@RequestMapping("/test")
public String welcome(){
	return "welcome";
}
}
