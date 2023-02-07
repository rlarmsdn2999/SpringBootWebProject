package org.zerock.club.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.club.security.dto.ClubAuthMemberDTO;

@Controller
@RequestMapping("/sample")
public class SampleController {
    @GetMapping("/all")
    public void exAll(){
        System.out.println("exAll...");
    }
    @GetMapping("/member")
    public void member(@AuthenticationPrincipal ClubAuthMemberDTO clubAuthMember){
        System.out.println("exMember...");
        System.out.println(clubAuthMember);
    }
    @GetMapping("/admin")
    public void admin(){
        System.out.println("admin...");
    }
}
