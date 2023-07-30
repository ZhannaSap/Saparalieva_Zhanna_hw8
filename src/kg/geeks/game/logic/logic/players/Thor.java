package kg.geeks.game.logic.logic.players;

import java.util.Random;

public class Thor extends Hero{
    public Thor(int health, int damage, String name) {
        super(health, damage, SuperAbility.STUN, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random thor = new Random();
        boolean stun = thor.nextBoolean();
        if (stun){
            boss.setStunned(true);
            System.out.println("Thor stunned BOSS!!!");
        }
    }
}
