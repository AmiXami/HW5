public class Hero {
    public static int[] Hp = {500,500,500,500};
    public static int[] Damage = {50,50,50,50};
    public static int[] Attributes = {1,2,3,4};
    public Hero(){

    }
    public Hero (int Hp[],int Damage[],int Attributes[]){
    this.Hp = Hp;
    this.Damage = Damage;
    this.Attributes = Attributes;
    }

    public static int[] getHp() {
        return Hp;
    }

    public static void setHp(int[] hp) {
        Hp = hp;
    }

    public static int[] getDamage() {
        return Damage;
    }

    public static void setDamage(int[] damage) {
        Damage = damage;
    }

    public static int[] getAttributes() {
        return Attributes;
    }

    public static void setAttributes(int[] attributes) {
        Attributes = attributes;
    }

}
