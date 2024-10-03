package object;

import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static void main(String[] args) {
        
        Computer asusComputer = new Computer(
            "5GHz 8 core", "Asus 8000",32,
            2024, false);
        // Alternatively:
        // asusComputer.setCpu("5GHz 8 core");
        // asusComputer.setModel("Asus 800");
        // asusComputer.setRam(32);
        // asusComputer.setYear(2024);
        // asusComputer.isStarted(false)
        // asusComputer.displaySpec();
        System.out.println("-----");
        

        Laptop appleLaptop = new Laptop( "8GHz 10 core", 
            "MacBook Pro", 64, 2024, false,
            "iOS", 2, "12 hours",
            "13in");
        // appleLaptop.displaySpec();
        System.out.println("-----");


        Desktop hpDesktop = new Desktop("8GHz 16 core", "hp 1600", 16,
            2022, false, 5, true);
        // hpDesktop.displaySpec();
        System.out.println("-----");


        // CREATE AN ARRAY LIST FOR ALL MACHINES
        List<Computer> machines = new ArrayList<>();
        machines.add(asusComputer);
        machines.add(appleLaptop);
        machines.add(hpDesktop);


        // PRINT OUT SPECS FOR EACH OF THE MACHINES IN THE ARRAY LIST
        // for (Computer machine : machines) {
        //     machine.displaySpec();
        // }

        //alternatively....
        for (int i = 0; i < machines.size(); i++) {
            System.out.println("Machine " + (i+1) + " - ");
            machines.get(i).displaySpec();
            System.out.println("\n-----\n");
        }
        

        
    }
    


}

// TO COMPILE
// be in the vttp5_sdf_day02l directory
// javac --source-path object -d target object/*.java
//
// TO RUN
// java -cp target object.App