package com.tienda.controller;


import com.tienda.domain.Cliente;
import com.tienda.service.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class indexController {
    
    @Autowired
    private ClienteService ClienteService;
    
    @GetMapping("/")
    public String inicio(Model model){
        
        var clientes=ClienteService.getClientes();
        
        model.addAttribute("clientes",clientes);

        return "index";
    }
    
    @GetMapping("/nuevoCliente")
    public String nuevoCliente(Cliente cliente) {
        
        return "modificarCliente";
        
    }
    @PostMapping("/guardarCliente")
    public String guardarCliente(Cliente cliente) {
        ClienteService.save(cliente);
        return "redirect:/";
    }
    
    @GetMapping("/modificarCliente/{idCliente}")
    public String modificarCliente(Cliente cliente, Model model) {
        cliente = ClienteService.getCliente(cliente);
        model.addAttribute("cliente",cliente);
        return "modificarCliente";
        
    }
    
    @GetMapping("/eliminarCliente/{idCliente}")
    public String eliminarCliente(Cliente cliente, Model model) {
        ClienteService.delete(cliente);
        return "redirect:/";
      }
    
}