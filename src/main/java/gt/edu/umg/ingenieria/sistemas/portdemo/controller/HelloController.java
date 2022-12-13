/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.ingenieria.sistemas.portdemo.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bryan1010p
 */
@RestController
public class HelloController {
@GetMapping("/saludo")    
public String helloworld(){
    return "hola mundo";
    }
@GetMapping("hola-con-nombre")
public String Sayhelloto(@RequestParam String name, @RequestParam String ciudad){
    return String.format("hola %s como esta el clima por alla en %s?",name,ciudad);
    }
@GetMapping("/que-hora-es")
public String whattimeisit(){
    Date now = new Date();
    DateFormat dateFormat = new SimpleDateFormat("HH:mm");
    return dateFormat.format(now);
    }
}
