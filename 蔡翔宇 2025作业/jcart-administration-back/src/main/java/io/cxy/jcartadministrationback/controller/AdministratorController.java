package io.cxy.jcartadministrationback.controller;

import io.cxy.jcartadministrationback.dto.in.AdministratorAddInDTO;
import io.cxy.jcartadministrationback.dto.in.AdministratorLoginInDTO;
import io.cxy.jcartadministrationback.dto.in.AdministratorResetPwdInDTO;
import io.cxy.jcartadministrationback.dto.in.AdministratorUpdateInDto;
import io.cxy.jcartadministrationback.dto.out.AdministratorProdfileOutDto;
import io.cxy.jcartadministrationback.dto.out.AdministratorProfileOutDto;
import io.cxy.jcartadministrationback.dto.out.AdministratorUpdateOutDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {
    //管理员登录页
    @GetMapping("/login")
    public String login(@RequestBody AdministratorLoginInDTO administratorLoginInDTO){
        return null;
    }
    //管理员个人页
    @PostMapping("/getProfile")
    public AdministratorProfileOutDto getProfile(@RequestParam(required = false)Integer administratorId){
        return  null;
    }
    //管理员列表页
    @GetMapping("/profile")
    public AdministratorProdfileOutDto Profile(){
        return null;
    }
    //管理员添加页
    @PostMapping("/add")
    public void addadministrator(@RequestBody AdministratorAddInDTO administratorAddInDTO){

    }
    //编辑管理员页面
    @GetMapping("/update")
    public AdministratorUpdateOutDto updateProfile(@RequestParam("administratorId")Integer administratorId){
        return null;
    }
    //查询管理员页面
    @PostMapping("/update")哪个是你的代码?
    public void UpdateProdile(@RequestBody AdministratorUpdateInDto administratorUpdateInDto){

    }
    //根据email查询是否正确
    @GetMapping("/getPwdRestCode")
    public String getPwdRestCode(@RequestParam String email){
        return null;
    }
    //重新设置新的密码
    @PostMapping("/restpwd")
    public void restpwd(@RequestBody AdministratorResetPwdInDTO administratorResetPwdInDTO){

    }
}
