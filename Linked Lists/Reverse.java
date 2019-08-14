//Singly

static SinglyLinkedListNode reverse(SinglyLinkedListNode head) 
{
    if (head == null || head.next == null) 
    {
        return head;
    }
    SinglyLinkedListNode prev = null;
    SinglyLinkedListNode curr = head;
    SinglyLinkedListNode next = null;
    while (curr != null) 
    {
        next = curr.next;
        curr.next = prev; // changes arrow direction
        prev = curr;
        curr = next;
    }
    return prev;
}

//Doubly:

DoublyLinkedListNode reverse(DoublyLinkedListNode head) 
{
    if (head == null || head.next == null) 
    {
        return head;
    }
    DoublyLinkedListNode prev = null;
    DoublyLinkedListNode curr = head;
    DoublyLinkedListNode next = null;
    while (curr != null) 
    {
        next = curr.next;
        curr.next = prev;
        curr.prev = next;
        prev = curr;
        curr = next;
    }
    return prev;
}
