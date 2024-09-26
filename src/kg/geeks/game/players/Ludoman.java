package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Ludoman extends Hero{
    public Ludoman(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BROSOK_KOSTEY);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        int kost1 = RPG_Game.random.nextInt(6) + 1;
        int kost2 = RPG_Game.random.nextInt(6) + 1;

        if (kost2 ==kost1){
            boss.setHealth((boss.getHealth()) - (boss.getHealth()/2)); //'произведение чисел' не знал, что такое произведение чисел
            System.out.println("Warrior " + this.getName() + " hit critically with damage ");
        }
    }
}
