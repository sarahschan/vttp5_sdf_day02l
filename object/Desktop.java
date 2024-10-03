package object;

public class Desktop extends Computer {
    
    private int weight;
    private boolean coolingSystem;


    // CONSTRUCTORS
    public Desktop(int weight, boolean coolingSystem) {
        this.weight = weight;
        this.coolingSystem = coolingSystem;
    }
    public Desktop(String cpu, String model, int ram, int year, boolean started, int weight, boolean coolingSystem) {
        super(cpu, model, ram, year, started);
        this.weight = weight;
        this.coolingSystem = coolingSystem;
    }


    // GETTERS & SETTERS
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public boolean isCoolingSystem() {
        return coolingSystem;
    }
    public void setCoolingSystem(boolean coolingSystem) {
        this.coolingSystem = coolingSystem;
    }


    // METHODS
    @Override
    public void start(){
        this.started = true;
        System.out.println("The computer has started up");
        
    }
    
    @Override
    public void shutdown(){
        this.started = false;
        System.out.println("The computer has shut down");
    }

    @Override
    public void displaySpec(){
        System.out.println("This desktop's specifications: ");
        System.out.println("Model: " + this.getModel());
        System.out.println("Year: " + this.getYear());
        System.out.println("CPU: " + this.getCpu());
        System.out.println("RAM: " + this.getRam());
        System.out.println("Weight: " + this.weight);
        System.out.println("Cooling System: " + this.coolingSystem);
    }

    

    

}
