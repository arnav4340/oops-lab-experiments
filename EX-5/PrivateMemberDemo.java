
class SuperClass {
    private int privateValue = 42;

    public int getPrivateValue() {
        return privateValue; 
    }
}
class SubClass extends SuperClass {
    public void demonstrateAccess() {
        System.out.println("Private Value (accessed via method): " + getPrivateValue());
    }
}
public class PrivateMemberDemo {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.demonstrateAccess();
    }
}


