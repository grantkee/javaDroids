public class Droid {
  String name;
  int batteryLevel;

  // constructor
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }

  // introduce droid's name
  public String toString(){
    return "Hello, human. I am the droid known as " + name + ".";
  }

  // action method
  public void performTask(String task){
    System.out.println(name + " is performing: " + task);
    batteryLevel = batteryLevel - 10;
  }

  // report battery level
  public void energyReport(){
    System.out.println(name + "'s battery level: " + batteryLevel);
  }

  public void energyTransfer(Droid one, int energyToTransfer){
    System.out.println("transferring energy....");
    this.batteryLevel = this.batteryLevel - energyToTransfer;
    one.batteryLevel = one.batteryLevel + energyToTransfer;
    System.out.println(energyToTransfer + " energy transfered");
  }

  // main method here
  public static void main(String[] args){
    Droid foo = new Droid("Foo");
    System.out.println("Starting battery levels: " + foo.batteryLevel);
    foo.performTask("singing");
    foo.energyReport();

    Droid bar = new Droid("Bar");
    bar.performTask("coding");
    bar.energyReport();
    foo.energyTransfer(bar, 10);
    
    System.out.println(foo.name+"'s new energy level: " + foo.batteryLevel);
    System.out.println(bar.name+"'s new energy level: " + bar.batteryLevel);
  }
}