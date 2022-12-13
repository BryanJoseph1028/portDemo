/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.ingenieria.sistemas.portdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bryan1010p
 */
@RestController
public class BasicCalculator {
    @GetMapping("/suma")
    public int suma(@RequestParam int a, @RequestParam int b){
        return a + b;
    }
    @GetMapping("/resta")
    public int resta(@RequestParam int a, @RequestParam int b){
        return a - b;
    }
}
