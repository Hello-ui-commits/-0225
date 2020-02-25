package io.cxy.jcartadministrationback.controller;

import io.cxy.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.cxy.jcartadministrationback.dto.in.ProductListInDTO;
import io.cxy.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.cxy.jcartadministrationback.dto.out.PageOutDTO;
import io.cxy.jcartadministrationback.dto.out.ProductListOutDTO;
import io.cxy.jcartadministrationback.dto.out.ProductUpdateOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @GetMapping("/list")
    public PageOutDTO<ProductListOutDTO> list(@RequestBody ProductListInDTO productListInDTO){
        return  null;
    }

    @GetMapping("/create")
    public Integer createProduct(@RequestBody ProductCreateInDTO productCreateInDTO){
        return null;
    }

    @GetMapping("/getById")
    public ProductUpdateOutDTO getById(@RequestParam Integer productId){
        return null;
    }

    @PostMapping("/update")
    public Integer update(@RequestBody ProductUpdateInDTO productUpdateInDTO){
        return null;
    }
    @PostMapping("/delete")
    public void delete(@RequestParam Integer productId){

    }
    @PostMapping("/deletes")
    public void deletes(@RequestParam Integer[] productId){

    }
}
