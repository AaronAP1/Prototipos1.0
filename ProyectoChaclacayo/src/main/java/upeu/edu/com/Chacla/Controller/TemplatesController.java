/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.com.Chacla.Controller;



import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TemplatesController {
    
    @GetMapping("/principal")
    public String Principal(){
    return "principal";
    }
    
}
