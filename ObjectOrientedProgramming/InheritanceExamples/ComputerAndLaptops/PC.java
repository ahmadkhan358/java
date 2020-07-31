public class PC extends Computer {
    private String message;

    public PC(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }
}
