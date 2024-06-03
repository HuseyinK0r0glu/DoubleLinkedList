public class EmptyListExc extends RuntimeException{

    public EmptyListExc() {
        this("list");
    }

    public EmptyListExc(String message) {
        System.out.println(message + " is empty!");
    }
}
