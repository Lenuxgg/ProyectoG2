package com.Tarea2G2.controller;

import com.Tarea2G2.domain.Cliente;
import com.Tarea2G2.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class IndexController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizando MVC");
        
        var clientes = clienteService.getClientes();
        model.addAttribute("Clientes", clientes);

        return "index";
    }
    
    @GetMapping("/nuevoCliente")
    public String nuevoCliente(Cliente cliente){
        return "modificarCliente";
    }
    @PostMapping("/guardarcliente")
    public String guardarCliente (Cliente cliente) {
        clienteService.save(cliente);
        return "redirect:/";
    }
    
    @GetMapping ("/modificarCliente/{id:Cliente}")
    public String modificarCliente(Cliente cliente, Model model){
      cliente = clienteService.getCliente(cliente);
      model.addAttribute("cliente", cliente);
      return "modificarCliente";
    }
    
    @GetMapping("/eliminarCliente/{id:Cliente}")
    public String eliminarCliente(Cliente cliente){
        clienteService.delete(cliente);
        return "redirect:/";
    }

}
