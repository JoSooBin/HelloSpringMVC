package JSB.spring.mvc.dao;

import JSB.spring.mvc.vo.SungJukVO;

import java.util.ArrayList;
import java.util.List;

public interface SungJukV12DAO {
    String insertSungJuk(SungJukVO sj);
    List<SungJukVO> selectSungJuk();
    SungJukVO selectOneSungJuk(String sjno);
    String updateSungJuk(SungJukVO sj);
    String deleteSungJuk(int sjno);
}
