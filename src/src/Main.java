//SP1
/*
String name = "Ragnar";
int Health = 85;
int maxHealth = 100;
int level = 5;
int xp = 6000;
double gold = 156.5;
boolean isAlive = true;
char type = 'W';
String[] inventory = {"-Sword", "-Shield", "-Potion"};

void CharacterSheet() {
    System.out.println("===" + "MY CHARACTHER " + "===");
    System.out.println("NAME: " + name);
    System.out.println("HEALTH: " + Health);
    System.out.println("MAX HEALTH: " + maxHealth);
    System.out.println("LEVEL: " + level);
    System.out.println("XP: " + xp);
    System.out.println("GOLD: " + gold);
    System.out.println("ALIVE: " + isAlive);
    System.out.println("Character: " + type);
    System.out.println();
    System.out.println("INVENTORY: ");
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
    if (Health > 0) {
        return true;
    } else {
        System.out.println("YOUR CHARACTER DIED!");
        return false;

    }
}



void levelUp (){
    if (xp > 1000 * level){
        System.out.println(type + " Is ready to level up");
        System.out.println(type + " is now at LEVEL 6");
    } else {
        System.out.println(type + "XP needed");
    }

}

void ShowInventory () {

    {
        System.out.println(inventory.length + " items");
        for (int i = 0; i < inventory.length; i++) {
            System.out.println(i + 1+ ". " + inventory[i]);
        }
    }
}

void takenDamage(int amount){
    System.out.println(" ");
    System.out.println("=== COMBAT === ");
    Health -= amount;
    System.out.println("Your " + type + " Has taken " + amount + " damage ");

    System.out.println("Health: " + (Health + amount) + (" --> " ) + Health );


}

void heal(int amount){
    System.out.println();
    System.out.println("=== HEALTH ===");

    Health += amount;
    if (Health > 0){
        System.out.println("Your " + type + " heals " + amount + " HP ");
        System.out.println("Health: " + (Health - amount) + (" --> " ) + Health );;
    } else {
        System.out.println("Your character could've not heal");
    }
}

double getHealthPercentage(){
    double healthPercen = (double) Health / maxHealth * 100;
    return healthPercen;
}

void addXP(int amount){
    System.out.println();
    System.out.println("=== XP STATUS ===");
    xp += amount;
    System.out.println(type + " Gains " + amount + " XP!");
    System.out.println("Totalt XP: " + xp);
}

void addGold(double amount){
    System.out.println();
    System.out.println("=== GOLD ===");
    gold += amount;
    System.out.println("Gold: " + gold);
}

boolean removeGold(double amount){
    gold-=amount;
    if (gold > 0){
        System.out.println("Bought a potion");
        return true;
    } else {
        System.out.println("Not enough gold");
        return false;
    }
}


*/

void main() {
        Character myCharacter = new Character("Water-man",'W', 90, 20);
        Character zero1 = new Character("Venom",'V', 70, 20);

        myCharacter.CharacterSheet();



       /* System.out.println();
        System.out.println("===" + " STATUS " + "===");
    if (myCharacter.isHealthCritical()) {
        System.out.println("WARNING: FIND HEALING!!!");
    } */





        // Level up check - iteration 2
    /*
    myCharacter.levelUp();

        myCharacter.takenDamage(40);
        //Check if alive - iteration 2
       /* if (myCharacter.isAlive()) {
            System.out.println("YOUR CHARACTER IS STILL ALIVE!");
        } */


        // Character heals 50 HP
    /*
        myCharacter.heal(50);
        myCharacter.getHealthPercentage();
        System.out.println("Health percentage: " + myCharacter.getHealthPercentage() + "%");

        // Character gains 250 xp
        myCharacter.addXP(350);

        // character gains 24.5 gold
        myCharacter.addGold(23.5);

        // character removes 2 gold
        myCharacter.removeGold(2); */


//Iteration 4 - // Combat!
    System.out.println();
    zero1.CharacterSheet1();

    while (myCharacter.isAlive() && zero1.isAlive()) {
        myCharacter.attack(zero1);
        zero1.printStatus();

        if (zero1.isAlive()){
            zero1.attack(myCharacter);
            myCharacter.printStatus();
        }
        System.out.println("-----------");
    }
    if (myCharacter.isAlive()) {
        System.out.println(myCharacter.name + " WINS!!!");
    } else {
        System.out.println(zero1.name + " WINS!");
    }


    }



