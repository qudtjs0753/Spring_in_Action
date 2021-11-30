package com.example.tacocloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: kbs
 */
//검색시에 HomeController class가 컴포넌트로 식별되게 하는것이 주 역할
    //즉 HomeController를 자동으로 찾고 컨텍스트의 bean으로 HomeController의 인스턴스 생성.
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
}
