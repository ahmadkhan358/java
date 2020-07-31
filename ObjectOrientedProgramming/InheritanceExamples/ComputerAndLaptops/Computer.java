abstract public class Computer {
    public CPU cpu = new CPU("I am called the brain of computer");
    public Keyboard keyboard = new Keyboard("I am input device, i have many keys to give input");
    public Monitor monitor = new Monitor("I am output device, i display the programs running on computer");
    public Mouse mouse = new Mouse("I am also an input device also called pointing device");

    abstract public String getMessage();
}
