package lr11_1;

class Nod
{
    public  int value;
    public Node next;
    Nod(int value, Node next){
        this.value= value;
        this.next= next;
    }
}

public class Task5_2{
    public static void main(String[] args)
    {
        Node head = null;
        for(int i = 10; i >= 0; i--){
            head = new Node(i, head);
        }

        Node ref = head;
        while(ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }

    }
}
