package login.demo.member.controller;

import login.demo.member.MemberDto;
import login.demo.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm(){
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(MemberForm form){
        MemberDto memberDTO = new MemberDto(
                form.getUserid(),
                form.getUserpassword()
        );

        System.out.println("/members/new post");

        memberService.join(memberDTO);

        return "redirect:/";
    }
}
