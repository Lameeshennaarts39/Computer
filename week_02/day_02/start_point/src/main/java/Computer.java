public class Computer {

    private int storage;
    private String printer;

    public Computer(int storage) {
        this.storage = storage;
        this.printer = null;
    }
    public int getStorage(){
        return this.storage;
    }
    public void addStorage(int additionalStorage){
        this.storage += additionalStorage;
    }
    public void setPrinter(String newPrinter){
        this.printer = newPrinter;
    }
    public String getPrinter(){
        return this.printer;
    }
}