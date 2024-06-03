public class List <T>{

    private ListNode<T> firstNode;
    private ListNode<T> lastNode;
    private String name;

    public List() {
        this("list");
    }

    public List(String name) {
        this.name = name;
        firstNode = lastNode = null;
    }

    public void insertAtFront(T insertItem){
        if(isEmpty()){
            firstNode = lastNode = new ListNode<>(insertItem);
        }else{
            ListNode<T> currentNode = firstNode;
            firstNode = new ListNode<>(insertItem,null,firstNode);
            currentNode.setPrevNode(firstNode);
        }
    }


    public void insertAtBack(T insertItem){
        if(isEmpty()){
            firstNode = lastNode = new ListNode<>(insertItem);
        }else{
            ListNode<T> currentNode = lastNode;
            lastNode = new ListNode<>(insertItem,lastNode,null);
            currentNode.setNextNode(lastNode);
        }
    }

    public T removeFromFront(){
        if(isEmpty()){
            throw new EmptyListExc();
        }

        T data = firstNode.data;

        if(firstNode == lastNode){
            firstNode = lastNode = null;
        }else{
            firstNode = firstNode.nextNode;
            firstNode.setPrevNode(null);
        }

        return data;
    }

    public T removeFromBack(){
        if(isEmpty()){
            throw new EmptyListExc();
        }

        T data = lastNode.data;

        if(lastNode == firstNode){
            firstNode = lastNode = null;
        }else{
            lastNode = lastNode.prevNode;
            lastNode.setNextNode(null);
        }

        return data;
    }

    public void print(){
        if(isEmpty()){
            throw new EmptyListExc();
        }

        ListNode<T> current = firstNode;

        System.out.printf("This %s is: ",name);
        while(current != null){
            System.out.print(current.data);
            System.out.print(" ");
            current = current.nextNode;
        }

        System.out.println();
    }

    public boolean isEmpty(){
        return firstNode == null;
    }
}
