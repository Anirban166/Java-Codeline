Node Insert(Node head, int data) 
{
    Node n = new Node();
    n.data = data;
    n.next = null;
    
    if (head == null) {
        return n;
    } else {
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = n;
        return head;
    }
}
