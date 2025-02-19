package library;

public class MembersVip extends Member{
//   private Member memberVip;
    private String alias;

    public MembersVip(Member member) {
//        this.memberVip.setFirstName() = member.getFirstName();
        super(member.getFirstName(), member.getDni(), member.password, member.getSecondName());
//        super(firstname, password, lastname, dni);
    }

//    public MembersVip(string firstname, string password, string lastname, string dni) {
//        super(firstname, password, lastname, dni);
//    }

    public void getPassword() {
        System.out.println(this.password);
    }

//    public void setActiveMemberVip(Member member) {
//        this.memberVip.setFirstName(member.getFirstName());
//        this.memberVip.setLastName(member.getSecondName());
//        this.memberVip.setDni(member.getDni());
//        this.memberVip.setPassword(member.password);
//    }


    @Override
    public String getFirstName () {
        String alias = super.getFirstName();
        return alias.substring(0,1);
    }

    public void getAlias() {
    }
}
