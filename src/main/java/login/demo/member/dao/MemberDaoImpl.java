package login.demo.member.dao;

import login.demo.member.MemberDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl implements MemberDao{

    private final SqlSession session;

    public MemberDaoImpl(SqlSession session) {
        this.session = session;
    }

    @Override
    public void memberSave(MemberDto memberDto){
        System.out.println("memberSave run ...");

        String namespace = "login.demo.mapper.memberMapper";
        session.insert(namespace + "memberSave");
    }
}
