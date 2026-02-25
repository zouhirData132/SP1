//SP1


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



