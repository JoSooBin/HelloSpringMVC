package JSB.spring.mvc.controller;

import JSB.spring.mvc.service.SungJukV13Service;
import JSB.spring.mvc.vo.SungJukVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

//URL           view
//~/sungjuk     (sungjuk.jsp)
//~/sungjukok     (sungjuk.jsp)

//~/sungjukok     (sungjuk.jsp)
//~/sungjukok     (sungjuk.jsp)

@Controller
public class SungJukControlloer {

    @Autowired
    private SungJukV13Service sjsrv13;

    @GetMapping("/sungjuk") //성적 입력폼
    public String sungjuk(){
        return "sungjuk";
    }

    //성적입력처리(post방식으로 요청시 호출됨)
    //성적입력폼에 입력한 내용들은 스프링 컨테이너에 의해 SungJukVO의 멤버변수에 자동으로 저장됨
    //단, form의 각 변수명과 SungJukVO의 멤버변수명은 일치해야 함

    //~/sungjuk -> /sungjukok -> sjsrv13 -> sjdao12
    // view     WAS     service     dao
    @PostMapping("/sungjukok")
    public ModelAndView sungjukok(SungJukVO sjvo){
        ModelAndView mv = new ModelAndView();

        mv.setViewName("sungjukok");
        mv.addObject("result",sjsrv13.newSungJuk(sjvo));
        mv.addObject("sj",sjvo);

        return mv;
    }


    //성적조회
    //학생번호, 이름, 국어, 영어, 수학, 등록일, 형태로 출력
    //~/sungjuklist -> sjsrv13 -> sjdao12 -> db
    // view    service     dao
    @GetMapping("/sungjuklist")
    public ModelAndView sungjuklist(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sungjuklist");
        mv.addObject("sjlist", sjsrv13.readSungJuk());

        return mv;
    }

    @GetMapping("/sungjukview") //성적조회
    public ModelAndView sungjukview(){
        return null;
    }
}
