public class LinkedListM {
    private ListItem head;
    private ListItem current;

    public LinkedListM() {
        this.head = null;
        this.current = null;
    }

    public boolean add(ListItem item) {

        System.out.println("ADDING: " + item.getValue());

        if(head == null) {
            System.out.println("First item added.");
            this.head = item;
            this.current = item;
            return true;
        }

        if(item.getValue() == this.current.getValue()) {
            System.out.println("~~~ duplicate, canceling");
            return false;
        }

        System.out.println("CURRENT: " + this.current.getValue());

        if(item.getValue() < this.current.getValue()) {
            if(this.current.getPrev() == null) {
                System.out.println("At the smallest number");
                item.setPrev(null);
                item.setNext(this.current);
                this.current.setPrev(item);
                this.head = item;
                return true;
            }

            while(item.getValue() < this.current.getValue() && this.current.getPrev() != null) {
                System.out.println("< Moving lower, to: " + this.current.getPrev().getValue());
                this.current = this.current.getPrev();
            }

            if(item.getValue() == this.current.getValue()) {
                System.out.println("~~~ duplicate, canceling");
                return false;
            }

            if(item.getValue() < this.current.getValue()) {
                item.setNext(this.current);
                item.setPrev(this.current.getPrev());
                if(this.current.getPrev() != null) {
                    this.current.getPrev().setNext(item);
                }
                this.current.setPrev(item);
                this.head = item;
            } else {
                item.setNext(this.current.getNext());
                item.setPrev(this.current);
                if(this.current.getNext() != null) {
                    this.current.getNext().setPrev(item);
                }
                this.current.setNext(item);
            }

            return true;

        }

        if(item.getValue() > this.current.getValue()) {
            if(this.current.getNext() == null) {
                System.out.println("At the biggest number");
                item.setPrev(this.current);
                item.setNext(null);
                this.current.setNext(item);
                return true;
            }

            while(item.getValue() > this.current.getValue() && this.current.getNext() != null) {
                System.out.println("> Moving higher, to: " + this.current.getNext().getValue());
                this.current = this.current.getNext();
            }

            if(item.getValue() == this.current.getValue()) {
                System.out.println("~~~ duplicate, canceling");
                return false;
            }

            System.out.println("Stopped at: " + this.current.getValue());

            if(item.getValue() > this.current.getValue()) {
                item.setPrev(this.current);
                item.setNext(this.current.getNext());
                if(this.current.getNext() != null) {
                    this.current.getNext().setPrev(item);
                }
                this.current.setNext(item);
            } else {
                item.setPrev(this.current.getPrev());
                item.setNext(this.current);
                if(this.current.getPrev() != null) {
                    this.current.getPrev().setNext(item);
                }
                this.current.setPrev(item);
            }
            return true;
        }

        return false;
    }

    public void printItemValues() {
        while(this.head != null) {
            System.out.println("================================");
            if(this.head.getPrev() != null) {
                System.out.println("prev: " + this.head.getPrev().getValue());
            } else {
                System.out.println("prev: null");
            }
            System.out.println("this: " + this.head.getValue() + " <");
            if(this.head.getNext() != null) {
                System.out.println("next: " + this.head.getNext().getValue());
            } else {
                System.out.println("next: null");
            }
            System.out.println("================================");
            this.head = this.head.getNext();
        }
    }

    public ListItem getHead() {
        return head;
    }

    public ListItem getCurrent() {
        return current;
    }
}
