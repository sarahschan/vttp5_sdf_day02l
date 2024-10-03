package object;

public class Computer {

    private String cpu;
    private String model;
    private int ram;
    private int year;
    protected boolean started = false;

    
    //Empty constructor
    public Computer() {
        this.cpu = "default cpu";
        this.model = "default model";
        this.ram = 0;
        this.year = 0;
        this.started = false;
    }

    //Constructor with parameters
    public Computer(String cpu, String model, int ram, int year, boolean started) {
        this.cpu = cpu;
        this.model = model;
        this.ram = ram;
        this.year = year;
    }



    public String getCpu() {
        return this.cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return this.ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isStarted() {
        return this.started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    //Methods
    public void start(){
        this.started = true;
        System.out.println("The computer has started up");
        
    }
    
    public void shutdown(){
        this.started = false;
        System.out.println("The computer has shut down");
    }


    public void displaySpec(){
        System.out.println("This computer's specifications: ");
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("CPU: " + this.cpu);
        System.out.println("RAM: " + this.ram);
    }


    

}
