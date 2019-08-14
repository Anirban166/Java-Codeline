Node Insert(Node head, int x) 
{
    Node n = new Node();
    n.data = x;
    n.next = head;
    return n;
}
