package JSB.spring.mvc.controller;

import JSB.spring.mvc.service.MemberService;
import JSB.spring.mvc.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {

    @Autowired
    private MemberService msrv04;

    @GetMapping("/member")
    public String member(){
        return "member";
    }

    @PostMapping("/memberok")
    public ModelAndView member(MemberVO mvo){
        ModelAndView mv = new ModelAndView();

        mv.setViewName ("memberok");
        mv.addObject("result", msrv04.newMember(mvo));
        mv.addObject("mvo",mvo);

        return mv;
    }

    @GetMapping("/memberlist")
    public ModelAndView memberlist(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("memberlist"); //
        mv.addObject("mvos", msrv04.readMember());

        return mv;
    }

    @GetMapping("/memberview")
    public ModelAndView memberview(String userid){
        ModelAndView mv = new ModelAndView();

        mv.setViewName("memberview");
        mv.addObject("mvo", msrv04.readOneMember(userid));

        return mv;
    }
}
