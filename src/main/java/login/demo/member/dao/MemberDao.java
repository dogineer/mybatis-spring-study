package login.demo.member.dao;

import login.demo.member.MemberDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDao {
    void memberSave(MemberDto memberDTO); // 멤버 데이터 등록
}
