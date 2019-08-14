Node InsertNth(Node head, int data, int position) 
{
    Node newNode = new Node();
    newNode.data = data;
    
    if (position == 0) {
        newNode.next = head;
        return newNode;
    } else {
        // Get Node one element before desired position 
        Node n = head;
        for (int i = 0; i < position - 1; i++) {
            n = n.next;
        }
        
        // Insert new Node 
        newNode.next = n.next;
        n.next = newNode;
        
        return head;
    }
}
