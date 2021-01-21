package JSB.spring.mvc.service;

import JSB.spring.mvc.vo.MemberVO;

import java.util.List;

public interface MemberService {
    String newMember(MemberVO mvo);
    String modifyMember(MemberVO mvo);
    String removeMember(String name);

    List<MemberVO> readMember();
    MemberVO readOneMember(String userid);

}
