package io.cxy.jcartadministrationback.controller;

import io.cxy.jcartadministrationback.dto.in.OrderListInDTO;
import io.cxy.jcartadministrationback.dto.out.OrderByIdOutDTO;
import io.cxy.jcartadministrationback.dto.out.OrderListOutDTO;
import io.cxy.jcartadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrdersController {
    @GetMapping("/list")
    public PageOutDTO<OrderListOutDTO> List(@RequestBody OrderListInDTO orderListInDTO){

        return  null;
    }

    @GetMapping("/getById")
    public OrderByIdOutDTO getById(@RequestParam Integer OrderId){
        return null;
    }
}
