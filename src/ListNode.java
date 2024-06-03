public class ListNode <T>{

    T data;
    ListNode<T> prevNode;
    ListNode<T> nextNode;

    public ListNode(T data) {
        this(data,null,null);
    }

    public ListNode(T data, ListNode<T> prevNode, ListNode<T> nextNode) {
        this.data = data;
        this.prevNode = prevNode;
        this.nextNode = nextNode;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListNode<T> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(ListNode<T> prevNode) {
        this.prevNode = prevNode;
    }

    public ListNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListNode<T> nextNode) {
        this.nextNode = nextNode;
    }
}
