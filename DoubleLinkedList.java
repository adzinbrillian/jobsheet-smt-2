package QUIZ2;

public class DoubleLinkedList {

    Node head, tail;
    int size;
    
    DoubleLinkedList(){
        head = tail = null;
        size=0;
    }
    boolean isEmpty(){
        return size==0;
    }
    void addFirst(int data){
        Node nu = new Node(data);
        if(isEmpty()){
            head = tail = nu;
        }else{
            nu.n = head;
            head.p = nu;
            head = nu;
        }
        size++;
    } 
    void deleteFirst(){
        head = head.n;
        head.p = null;
        size--;
    }
    void print(){
        Node tmp = head;
        while(tmp!=null){
            System.out.print(""+tmp.data+"-");
            tmp = tmp.n;
        }
        System.out.println("");
    }

    //1. Complete the missing code addLast
    void addLast(int data){
        Node nu = new Node(data);
        if(isEmpty()){
            head = tail = nu;
        }else{
            tail.n = nu;
            nu.p = tail;
            tail = nu;
        }
        size++;
    }

    //2. Complete the deleteLast
    void deleteLast(){
        if (!isEmpty()) {
            if (head == tail) { // only one element
                head = tail = null;
            } else {
                tail = tail.p;
                tail.n = null;
            }
            size--;
        }
    }
    
    //3. Complete the printFromTail
    void printFromTail(){
        Node tmp = tail;
        while (tmp != null) {
            System.out.print(tmp.data + "-");
            tmp = tmp.p;
        }
        System.out.println("");
    }
    
    //4. Complete getPositionFromTail
    int getPositionFromTail(int data){
        Node tmp = tail;
        int position = 0;
        while (tmp != null) {
            if (tmp.data == data) {
                return position;
            }
            position++;
            tmp = tmp.p;
        }
        return -1; // if data not found
    }
    
    //5. Complete getLastPositionFromTail
    int getLastPositionFromTail(int data){
        Node tmp = tail;
        int position = 0;
        while (tmp != null) {
            if (tmp.data == data) {
                return position;
            }
            position++;
            tmp = tmp.p;
        }
        return -1; // if data not found
    }
    
    //6. Complete getAverage
    double getAverage(){
        if (isEmpty()) return 0.0;
        double sum = 0;
        Node tmp = head;
        while (tmp != null) {
            sum += tmp.data;
            tmp = tmp.n;
        }
        return sum / size;
    }
    
    //7. Complete the missing code getNodeByIndex
    Node getNodeByIndex(int index){
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.n;
        }
        return tmp;
    }
    
    //8. Complete getMedian
    double getMedian(){
        if (isEmpty()) return 0.0;
        sort();
        if (size % 2 == 0) {
            int mid1 = size / 2;
            int mid2 = mid1 - 1;
            return (getNodeByIndex(mid1).data + getNodeByIndex(mid2).data) / 2.0;
        } else {
            return getNodeByIndex(size / 2).data;
        }
    }

    private void sort() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }
    //9. Complete main to make a simulation
    public static void main(String[] args){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        dll.deleteFirst();
        dll.print();
    
        dll.addLast(100);
        dll.addLast(50);
        dll.print();
        dll.deleteLast();
        dll.print();
    
        System.out.println("Print from tail:");
        dll.printFromTail();
    
        System.out.println("Position of 10 from tail: " + dll.getPositionFromTail(10));
        System.out.println("Last position of 10 from tail: " + dll.getLastPositionFromTail(10));
        System.out.println("Average: " + dll.getAverage());
        System.out.println("Median: " + dll.getMedian());
    }

    
}