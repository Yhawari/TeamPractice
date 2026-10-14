public class Main {

    public static void main(String[] args) {
        Team t = new Team("Team","Bei");
        Member m1 = new Member("Hani",21,"Ist");
        Member m2 = new Member("Maher",21,"BEi");
        Member m3 = new Member("Abd",21,"Usa");
        
        t.addMember(m1);
        t.addMember(m2);
        t.addMember(m3);
        
        Member foundm = t.getMember(50);
        if(foundm != null)
            System.out.println("Member found : " + foundm);
        else
            System.out.println("Member is not found");
        
        m2.setAge(90);
        System.out.println("Updated" + "/n " + t);
    }
}