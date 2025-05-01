class Club {
    static String clubName; 
    String memberName; 

    
    public Club(String memberName) {
        this.memberName = memberName;
    }

    
    static void displayClubName() {
        System.out.println("Club Name: " + clubName);
    }

    
    void displayMemberInfo() {
        System.out.println("Club Name: " + clubName + ", Member Name: " + memberName);
    }
}


public class ClubDemo {
    public static void main(String[] args) {
        
        Club.clubName = "Chess Club";

        
        Club member1 = new Club("Alice");
        Club member2 = new Club("Bob");
        Club member3 = new Club("Charlie");

        
        Club.displayClubName();

        
        member1.displayMemberInfo();
        member2.displayMemberInfo();
        member3.displayMemberInfo();
    }
}

