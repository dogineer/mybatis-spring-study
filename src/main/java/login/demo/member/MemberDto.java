package login.demo.member;

public class MemberDto {
    /*
     * DTO(Data Transfer Object) 는 계층 간 데이터 교환을 하기 위해 사용하는 객체로,
     * DTO는 로직을 가지지 않는 순수한 데이터 객체(getter & setter 만 가진 클래스)입니다.
     */
    private String userid;
    private String userpassword;
//    private Grade grade;

    public MemberDto(String userid, String userpassword) {
        this.userid = userid;
        this.userpassword = userpassword;
//        this.grade = grade;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    @Override
    public String toString() {
        return "userid = " + userid + " userpassword = " + userpassword;
    }

    //    public Grade getGrade() {
//        return grade;
//    }
//
//    public void setGrade(Grade grade) {
//        this.grade = grade;
//    }
}
