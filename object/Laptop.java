package object;

public class Laptop extends Computer {
    
    private String operatingSystem;
    private Integer weight;
    private String batteryLife;
    private String screenSize;

    // Constructors
    public Laptop() {

    }


    public Laptop(String operatingSystem, Integer weight, String batteryLife, String screenSize) {
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.batteryLife = batteryLife;
        this.screenSize = screenSize;
    }


    public Laptop(String cpu, String model, int ram, int year, boolean started, String operatingSystem, int weight,
            String batteryLife, String screenSize) {
        super(cpu, model, ram, year, started);
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.batteryLife = batteryLife;
        this.screenSize = screenSize;
    }


    
    // Getters & Setters
    public String getOperatingSystem() {
        return this.operatingSystem;
    }


    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }


    public Integer getWeight() {
        return this.weight;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }


    public String getBatteryLife() {
        return this.batteryLife;
    }


    public void setBatteryLife(String batteryLife) {
        this.batteryLife = batteryLife;
    }


    public String getScreenSize() {
        return this.screenSize;
    }


    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
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
        System.out.println("This laptop's specifications: ");
        System.out.println("Model: " + this.getModel());
        System.out.println("Year: " + this.getYear());
        System.out.println("CPU: " + this.getCpu());
        System.out.println("RAM: " + this.getRam());
        System.out.println(this.operatingSystem);
        System.out.println(this.weight);
        System.out.println(this.batteryLife);
        System.out.println(this.screenSize);
    }
    
}
