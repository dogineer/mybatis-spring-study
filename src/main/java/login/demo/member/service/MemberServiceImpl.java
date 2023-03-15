package login.demo.member.service;

import login.demo.member.dao.MemberDao;
import login.demo.member.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberServiceImpl implements MemberService{
    private final MemberDao memberDao;

    @Autowired
    public MemberServiceImpl(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    public void join(MemberDto memberDto) {
        System.out.println("MemberService join");
        System.out.println(memberDto.toString());

        memberDao.memberSave(memberDto);
    }
}
