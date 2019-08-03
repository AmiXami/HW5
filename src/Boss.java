import java.util.Random;

public class Boss {
    private int hp;
    private int damage;
    private static int[] Attributes = {0,1,2,3,4};
    public Boss (int hp,int damage,int Attributes[]){

    }

    public static void changeBossAttributes(){
        Random r = new Random();
        int randomAttributes = r.nextInt(4)+1;
        Attributes[0] = Attributes[randomAttributes];

    }

    public static int[] getAttributes() {
        return Attributes;
    }

    public static void setAttributes(int[] attributes) {
        Attributes = attributes;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
