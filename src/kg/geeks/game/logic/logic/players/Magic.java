package kg.geeks.game.logic.logic.players;

import java.util.Random;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int minIncr = 2;
        int maxIncr = 5;
        int n = random.nextInt(maxIncr - minIncr)+minIncr;
        for (Hero hero:heroes) {
            hero.setDamage(hero.getDamage()+ n);
            System.out.println("Magic " + this.getName() + " increased damage of hero " + hero.getName() + " +" + n + "points!!!");
        }
    }
}
