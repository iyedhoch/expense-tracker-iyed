package controller;

import model.Clients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.ClientService;

@Controller
@RequestMapping("/clients")
public class ClienController {
    @Autowired
    private ClientService clientservice;

    @GetMapping
    public list<Clients> getallclients(){
        return clientservice.getall();
    }

    @PostMapping
    public Clients addclient(Clients client){
        return clientservice.addclient(client);
    }

    @PutMapping
    public Clients updateclient(Clients client){
        return clientservice.updateclient
    }

    @DeleteMapping
    public Clients deleteclient(Clients client){
        return clientservice.deleteclient
    }


}
