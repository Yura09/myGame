public class Main {
    public static void main(String[] args) {
        Hero hero=new Archer(100,100);
        Hero hero1=new Warrior(90,90);
        hero.attack(hero1);
        hero1.heal();
        System.out.println(hero1.health);
    }
}
