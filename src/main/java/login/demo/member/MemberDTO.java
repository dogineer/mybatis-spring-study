package login.demo.member;

public class MemberDTO {
    /*
    * DTO(Data Transfer Object) 는 계층 간 데이터 교환을 하기 위해 사용하는 객체로,
    * DTO는 로직을 가지지 않는 순수한 데이터 객체(getter & setter 만 가진 클래스)입니다.
    */
    private String userid;
    private String userpassword;
    private String username;
    private String userRegDate;
    private Grade  grade;

    public MemberDTO(String userid, String userpassword, String username, String userRegDate, Grade grade) {
        this.userid = userid;
        this.userpassword = userpassword;
        this.username = username;
        this.userRegDate = userRegDate;
        this.grade = grade;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserRegDate() {
        return userRegDate;
    }

    public void setUserRegDate(String userRegDate) {
        this.userRegDate = userRegDate;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
