import java.util.ArrayList;

public class Character {

    String name;
    int Health;
    int maxHealth;
    int level;
    int xp;
    double gold;
    boolean isAlive;
    char type = 'W';
    String[] inventory;
    int attackDamage;



    public Character(String name, char type, int Health, int attackDamage) {
        this.name = name;
        this.Health = 85;
        this.maxHealth = 100;
        this.level = 1;
        this.xp = 2000;
        this.gold = 20;
        this.type = type;
        this.isAlive = true;
        this.inventory = new String[]{"Sword", "Shield", "Potion"};
        this.attackDamage = attackDamage;
    }


    void CharacterSheet() {
        System.out.println("===" + " MY CHARACTER " + "===");
        System.out.println("NAME: " + name);
        System.out.println("HEALTH: " + Health);
        System.out.println("MAX HEALTH: " + maxHealth);
        System.out.println("LEVEL: " + level);
        System.out.println("XP: " + xp);
        System.out.println("GOLD: " + gold);
        System.out.println("ALIVE: " + isAlive);
        System.out.println("Character: " + type);
        System.out.println();
        System.out.println("INVENTORY: " );
        ShowInventory();
    }

    void CharacterSheet1() {
        System.out.println("===" + " ENEMY CHARACTER " + "===");
        System.out.println("NAME: " + name);
        System.out.println("HEALTH: " + Health);
        System.out.println("MAX HEALTH: " + maxHealth);
        System.out.println("LEVEL: " + level);
        System.out.println("XP: " + xp);
        System.out.println("GOLD: " + gold);
        System.out.println("ALIVE: " + isAlive);
        System.out.println("Character: " + type);
        System.out.println();
        System.out.println("INVENTORY: " );
        ShowInventory();
    }




    boolean isHealthCritical() {

        if (Health < ((maxHealth / 100) * 25) && Health > 0) {
            System.out.println("CRITICAL HEALTH");
            return true;
        } else {
            return false;
        }

    }

    boolean isAlive() {

        return Health > 0;
        }



    public void levelUp() {

        if (xp > 1000 * level) {
            System.out.println(type + ": Is ready to level up");
        } else {
            System.out.println(type + " XP needed");
        }

    }

    void ShowInventory() {

             System.out.println(inventory.length + " items");
            for (int i = 0; i < inventory.length; i++) {
                System.out.println(i + 1 + ". " + inventory[i]);
            }
    }

    void takenDamage(int amount) {
        System.out.println(" ");
        System.out.println("=== COMBAT === ");
        Health -= amount;
        System.out.println("Your " + type + " Has taken " + amount + " damage ");

        System.out.println("Health: " + (Health + amount) + (" --> ") + Health);


    }

    void heal(int amount) {
        System.out.println();
        System.out.println("=== HEALTH ===");

        Health += amount;
        if (Health > 0) {
            System.out.println("Your " + type + " heals " + amount + " HP ");
            System.out.println("Health: " + (Health - amount) + (" --> ") + Health);
            ;
        } else {
            System.out.println("Your character could've not heal");
        }
    }

    double getHealthPercentage() {

        double healthPercen = (double) Health / maxHealth * 100;
        return healthPercen;
    }

    void addXP(int amount) {
        System.out.println();
        System.out.println("=== XP STATUS ===");
        xp += amount;
        System.out.println(type + " Gains " + amount + " XP!");
        System.out.println("Totalt XP: " + xp);
    }

    void addGold(double amount) {
        System.out.println();
        System.out.println("=== GOLD ===");
        gold += amount;
        System.out.println("Gold: " + gold);
    }

    boolean removeGold(double amount) {
        gold -= amount;
        if (gold > 0) {
            System.out.println("Bought a potion");
            return true;
        } else {
            System.out.println("Not enough gold");
            return false;
        }
    }

    void attack(Character opponent){
        System.out.println(name + " attacks " + opponent.name);
        opponent.Health -= attackDamage;
    }

    public void printStatus(){
        System.out.println(name + " (" + type + ") HP: " + Health);

    }

}


