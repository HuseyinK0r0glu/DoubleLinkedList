public class Main {
    public static void main(String[] args) {


        List<Integer> list = new List<Integer>();
        list.insertAtFront(-1);
        list.print();
        list.insertAtFront(0);
        list.print();
        list.insertAtBack(1);
        list.print();
        list.insertAtBack(5);
        list.print();

        int i = list.removeFromFront();
        System.out.println("removedItem:" + i);
        list.print();
        i = list.removeFromFront();
        System.out.println("removedItem:" + i);
        list.print();
        i = list.removeFromBack();
        System.out.println("removedItem:" + i);
        list.print();
        i = list.removeFromBack();
        System.out.println("removedItem:" + i);
    }
}