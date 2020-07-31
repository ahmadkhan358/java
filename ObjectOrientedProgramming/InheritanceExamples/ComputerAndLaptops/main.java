public class main {
    public static void main(String[] args) {
        Computer pc = new PC("I am PC, i am stationary but powerfull");
        Computer laptop = new Laptop("I am Laptop, i am portable but less powerfull");

        System.out.println(pc.getMessage());
        System.out.println("Now my devices will give their introduction");
        System.out.println(pc.cpu.getMessage());
        System.out.println(pc.keyboard.getMessage());
        System.out.println(pc.monitor.getMessage());
        System.out.println(pc.mouse.getMessage());

        System.out.print("\n\n\n");

        System.out.println(laptop.getMessage());
        System.out.println("Now my devices will give their introduction");
        System.out.println(laptop.cpu.getMessage());
        System.out.println(laptop.keyboard.getMessage());
        System.out.println(laptop.monitor.getMessage());
        System.out.println(laptop.mouse.getMessage());

    }
}
