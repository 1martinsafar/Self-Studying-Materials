public class Main {

    public static void main(String[] args) {
        LinkedListM linkedList = new LinkedListM();

//        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra"
//        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney";
//
//        String[] data = stringData.split(" ");
//        for (String s : data) {
//            Node item = new Node(s);
//            linkedList.add(item);
//        }

//        Node item1 = new Node(1);
//        Node item2 = new Node(4);
//        Node item3 = new Node(2);
//        Node item4 = new Node(0);
//        Node item5 = new Node(9);
//        Node item6 = new Node(-21);

//        // ADDING NEGATIVE NUMBERS WORKS
//        Node item1 = new Node(1);
//        Node item2 = new Node(0);
//        Node item3 = new Node(-1);
//        Node item4 = new Node(-2);
//        Node item5 = new Node(-3);
//        Node item6 = new Node(-21);

        Node item1 = new Node(0);       // -3 -1 0 1 2 3
        Node item2 = new Node(2);
        Node item3 = new Node(1);
        Node item4 = new Node(-2);
        Node item5 = new Node(-1);
        Node item6 = new Node(9);
        Node item7 = new Node(-9);
        Node item8 = new Node(-3);
        Node item9 = new Node(2);
        Node item10 = new Node(0);
        Node item11 = new Node(4);
        Node item12 = new Node(-4);
        Node item13 = new Node(3);

        linkedList.add(item1);
        linkedList.add(item2);
        linkedList.add(item3);
        linkedList.add(item4);
        linkedList.add(item5);
        linkedList.add(item6);
        linkedList.add(item7);
        linkedList.add(item8);
        linkedList.add(item9);
        linkedList.add(item10);
        linkedList.add(item11);
        linkedList.add(item12);
        linkedList.add(item13);


//        System.out.println("HEAD: " + linkedList.getHead().getValue());
        linkedList.printItemValues();
    }
}
