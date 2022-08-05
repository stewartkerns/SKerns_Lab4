package SKerns_Lab4;

class Lab4 {

    private class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        Node(int value) {
            this.value = value;
            this.next = null;
        }

    }
    private Node first;
    private Node last;
    public Lab4() {
        first = null;
        last = null;
    }
    public static void main(String[] args){
    Lab4 lab = new Lab4();

    }

    //welcome
    public static void welcome(){
        System.out.println("This program reads the file lab4.dat and inserts " +
                "the elements into a linked\nlist in nondescending order. " +
                "The contents of the linked list are then\ndisplayed to the " +
                "user in column form.");
    }

    //goodbye
    public static void goodbye(){
        System.out.println("Thanks for using the linked list program");
    }
}
