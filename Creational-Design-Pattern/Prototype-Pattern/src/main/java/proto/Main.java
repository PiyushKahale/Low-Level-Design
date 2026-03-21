package proto;

import impl.Device;
import impl.Monster;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //The Prototype Design Pattern is the "Copy-Paste" of the programming world.
        //Instead of creating a brand-new object from scratch (which might involve heavy database queries or complex calculations),
        //you take an existing object and clone it.

        // 1. Set up the Prototype (The Fire Dragon)
        List<String> fireAbilities = new ArrayList<>();
        fireAbilities.add("Fire");
        fireAbilities.add("Fire Jutsu");

        Monster fireDragon = new Monster(1000,  fireAbilities);

        // 2. Clone the Prototype to create a Shadow Dragon
        Monster shadowDragon = fireDragon.clone();

        // 3. Modify the Clone
        shadowDragon.addAbilities("Shadow Jutsu");


        System.out.println("original: " + fireDragon);
        System.out.println("clone: " + shadowDragon);

        if(fireDragon.clone() != fireDragon) {
            System.out.println("\n✅ Success: Objects are different instances.");
        } else if (fireDragon.toString().equals(shadowDragon.toString())) {
            System.out.println("❌ Fail: Clone is linked to original.");
        } else {
            System.out.println("✅ Success: Clone is independent (Deep Copy worked).");
        }

        System.out.println("-----------------------------------------------------");

        List<Device> morningDevices = new ArrayList<>();
        Device light = new Device("Light", 50);
        morningDevices.add(light);

        SmartScene morningScene = new SmartScene("Morning",  morningDevices);

        // CLONE IT
        SmartScene partyScene = morningScene.clone();

        partyScene.sceneName = "Party";

        partyScene.devices.get(0).settings = 100;

        // VERIFY
        System.out.println("Original Scene: " + morningScene.devices);
        // Output: [Bedroom Light:50%] -> Success!

        System.out.println("Cloned Scene  : " + partyScene.devices);
        // Output: [Bedroom Light:100%] -> Success!

        // This will now be FALSE because they are different memory addresses
        System.out.println("Are they the same memory address? " +
                (morningScene.devices.get(0) == partyScene.devices.get(0)));

    }
}