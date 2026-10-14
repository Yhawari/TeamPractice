
public class Member {
	private String name;
	   private int age = 18;
	   private String city;
	   
	   public Member(String name, int age, String city){
	       this.name = name;
	       this.age = age;
	       this.city = city;
	   }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        if(age >= 18 || age <= 90){
	            this.age = age;
	        }        
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }
	   
	   
	    public String fromatInitials(){
	        String [] parts = name.split(" ");
	        if (parts.length >= 2){
	            return parts[0].charAt(0) + " " + parts[1].charAt(0) + age;
	        }
	        else 
	            return name.charAt(0) + " " + age;
	    }

	    @Override
	    public String toString() {
	        return "Member{" + "name=" + name + " - age=" + age +  " - city=" + city + '}' + fromatInitials();
	    }
	    
	    
}
