
public class Team {
	 private String name;
	    private String city;
	    private Member [] members = new Member[100];
	    private int nbOfMembers;
	    
	    public Team (String name, String city){
	        this.name = name;
	        this.city = city;
	    }
	    
	    public void addMember(Member m){
	        if(this.nbOfMembers < 100){
	        members[this.nbOfMembers++] = m;
	    }
	    }
	    
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getNbOfMembers() {
	        return nbOfMembers;
	    }

	    public void setNbOfMembers(int nbOfMembers) {
	        this.nbOfMembers = nbOfMembers;
	    }
	    
	    public Member getMember(int c){
	        for (int i = 0; i < this.nbOfMembers; i++){
	            if(members[i].getAge() == c )
	                return members[i];
	        }
	        return null;
	    }
	    
	    
	    public int getMembersFromCity(String c){
	        int count = 0;
	        for(int i = 0; i < this.nbOfMembers ; i++){
	            if(members[i].getCity().equals(c))
	            count++;
	        }
	        return count;
	    }
	    
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append(name).append(" - ").append(city).append(" - ").append(nbOfMembers).append("\n");
	        for (int i = 0; i < nbOfMembers; i++) {
	            sb.append(members[i].toString()).append("\n");
	        }
	        return sb.toString();
	    }


}
