package io.cxy.jcartadministrationback.controller;

import io.cxy.jcartadministrationback.dto.in.CustomerListInDTO;
import io.cxy.jcartadministrationback.dto.out.CustomerListOutDTO;
import io.cxy.jcartadministrationback.dto.out.CustomerShowOutDTO;
import io.cxy.jcartadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerControlelr {
    @GetMapping("/list")
    public PageOutDTO<CustomerListOutDTO> Lsit(@RequestBody CustomerListInDTO customerListInDTO){
        return null;
    }
    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        return null;
    }
}
