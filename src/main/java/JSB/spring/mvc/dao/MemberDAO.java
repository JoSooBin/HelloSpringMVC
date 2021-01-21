package JSB.spring.mvc.dao;

import JSB.spring.mvc.vo.MemberVO;

import java.util.List;

public interface MemberDAO {
    int insertMember(MemberVO mvo);
    int updateMember(MemberVO mvo);
    int deleteMember(String name);
    List<MemberVO> selectMember();
    MemberVO selectOneMember(String userid);
}
