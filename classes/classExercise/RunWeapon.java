package com.qa.classes.classExercise;
import com.qa.classes.classExercise.weapons.Weapon;

public class RunWeapon {
    public static void main(String[] args) {

        Weapon weapon1 = new Weapon();
        Weapon weapon2 = new Weapon();

        weapon1.setDamageOutput(10);
        weapon2.setDamageOutput(20);

        weapon1.setBroken(false);
        weapon2.setBroken(true);

        weapon1.setName("Axe");
        weapon2.setName("Handgun");

        weapon1.setDurability(100);
        weapon2.setDurability(100);

        weapon1.setPrice(15);
        weapon2.setPrice(45);

        System.out.println(weapon1);
        System.out.println(weapon2);

        Weapon weapon3 = new Weapon("Spear", 15, 70, 20, true, true, false, "Normal");
        System.out.println(weapon3);

        Weapon weapon4 = new Weapon("Sniper", 100, 80);
        System.out.println(weapon4);

        Weapon weapon5 = new Weapon();

        System.out.println(Weapon.getPeacefulMode());
        Weapon.togglePeacefulMode();
        System.out.println(Weapon.getPeacefulMode());
        Weapon.setPeacefulMode(false);
        System.out.println(Weapon.getPeacefulMode());

        // Arrays and Strings
        // Create array
        Weapon[] armoury = {weapon1, weapon2, weapon3, weapon4,  weapon5};

        // Print weapons in Armoury
        for (int i = 0; i < armoury.length; i++) {
            System.out.println("Armour slot " + (i + 1) + ": " + armoury[i].getName());
        }

        // fix all weapons
        for (Weapon weapon: armoury){
            if (weapon.isBroken()){
                weapon.setBroken(false);
                System.out.println(weapon.getName() + " has been repaired");
            } else {
                System.out.println(weapon.getName() + " is not broken, so was not repaired.");
            }
        }

        String[] words = {"Hello", "my", "name", "is", "Matthew"};
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word + " ");
        }
        System.out.println(sb);







    }
}
