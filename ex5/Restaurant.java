class Chef {
    public void makeSpecialDish() {
        System.out.println("The chef is making a special dish.");
    }
}


class ItalianChef extends Chef {
    @Override
    public void makeSpecialDish() {
        System.out.println("Italian Chef is making pasta.");
    }
}


class ChineseChef extends Chef {
    @Override
    public void makeSpecialDish() {
        System.out.println("Chinese Chef is making dumplings.");
    }
}


class MexicanChef extends Chef {
    @Override
    public void makeSpecialDish() {
        System.out.println("Mexican Chef is making tacos.");
    }
}

class Indianchef extends Chef {
    @Override
    public void makeSpecialDish(){
        System.out.println("Indian chef making Dosa");
    }
}

public class Restaurant {
    public static void main(String[] args) {
        
        Chef[] chefs = {
            new ItalianChef(),
            new ChineseChef(),
            new MexicanChef(),
            new Indianchef(),
        };

        
        System.out.println("=== Restaurant Special Dishes ===");
        for (Chef chef : chefs) {
            chef.makeSpecialDish();  
 }
}
}
