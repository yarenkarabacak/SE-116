package HeroOfTheDungeon;


public class Swords extends Weapons{

    private String swordType;


    public Swords(String name, int weight, int value, int damage, int range, String swordType) {
        super(name, weight, value, damage, range);
        this.swordType = swordType;
    }

    public String getSwordType() {
        return swordType;
    }

    public void setSwordType(String swordType) {
        this.swordType = swordType;
    }


    public static Swords newWeakSword() {
        return new Swords("Scissor Dagger",1,2,1,2,"Dagger");
    }

    public static Swords newSword() {
        return new Swords("Lion Sword",2,4,2,4,"Short Sword");
    }

    public static Swords newEpicSword() {
        return new Swords("Kiyanite Sword",4,8,4,8,"Long Sword");
    }
}
