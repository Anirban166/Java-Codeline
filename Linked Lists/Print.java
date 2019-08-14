//Normal order Print:
void Print(Node head) 
{
    Node n = head;
    while (n != null) 
    {
        System.out.println(n.data);
        n = n.next;
    }
}

//Reverse order Print:

void reversePrint(SinglyLinkedListNode n) 
{
    if (n != null) 
    {
        reversePrint(n.next);
        System.out.println(n.data);
    }
}
