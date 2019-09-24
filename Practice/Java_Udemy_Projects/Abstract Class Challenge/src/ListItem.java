
public abstract class ListItem {
    private ListItem prev;
    private ListItem next;
    private Integer value;

    public ListItem(Integer value) {
        this.prev = null;
        this.next = null;
        this.value = value;
    }

    public boolean nextItem() {
        if(this.next != null) {
            this.prev = this.next.prev;
            this.next = this.next.next;
            return true;
        }
        return false;
    }

    public boolean prevItem() {
        if(this.prev != null) {
            this.next = this.prev.next;
            this.prev = this.prev.prev;
            return true;
        }
        return false;
    }

    public int compareTo(ListItem item) {
        if(this.value == item.value) {
            return 0;
        } else if (this.value > item.value) {
            return 1;
        } else {
            return -1;
        }
    }

    public void printInfo() {
        System.out.println("================================");
        if(this.prev != null) {
            System.out.println("prev: " + this.prev.value);
        } else {
            System.out.println("prev: null");
        }
        System.out.println("this: " + this.value);
        if(this.next != null) {
            System.out.println("next: " + this.next.value);
        } else {
            System.out.println("next: null");
        }
        System.out.println("================================");

    }

    public ListItem getPrev() {
        return prev;
    }

    public void setPrev(ListItem prev) {
        if(prev != null) {
            System.out.println("prev set to: " + prev.getValue());
            this.prev = prev;
        } else {
            System.out.println("prev set to: null");
            this.prev = null;
        }
        //this.prev = prev;
    }

    public ListItem getNext() {
        return next;
    }

    public void setNext(ListItem next) {
        if(next != null) {
            System.out.println("next set to: " + next.getValue());
            this.next = next;
        } else {
            System.out.println("next set to: null");
            this.next = null;
        }
        //this.next = next;
    }

    public Integer getValue() {
        return value;
    }

    private void setValue(Integer value) {
        this.value = value;
    }
}
