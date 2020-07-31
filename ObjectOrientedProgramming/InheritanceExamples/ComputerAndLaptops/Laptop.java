public class Laptop extends Computer {
    private String message;

    public Laptop(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }
}
