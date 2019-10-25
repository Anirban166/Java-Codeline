package assignmentsByAnirban;

public class ADTPolynomial 
{
    private Node first = new Node(0, 0);  
    private Node last  = first;

    private static class Node 
    {
        int coef;
        int exp;
        Node next;
        Node(int coef, int exp) 
        {
            this.coef = coef;
            this.exp  = exp;
        }
    }

    private ADTPolynomial() 
    { }

    public ADTPolynomial(int coef, int exp) 
    {
        last.next = new Node(coef, exp);
        last = last.next;
    }

    public ADTPolynomial Add(ADTPolynomial b) 
    {
    	ADTPolynomial a = this;
    	ADTPolynomial c = new ADTPolynomial();
        Node x = a.first.next;
        Node y = b.first.next;
        while (x != null || y != null) 
        {
            Node t = null;
            if      (x == null)     { t = new Node(y.coef, y.exp);  y = y.next; }
            else if (y == null)     { t = new Node(x.coef, x.exp);  x = x.next; }
            else if (x.exp > y.exp) { t = new Node(x.coef, x.exp);  x = x.next; } 
            else if (x.exp < y.exp) { t = new Node(y.coef, y.exp);  y = y.next; } 

            else 
            {
                int coef = x.coef + y.coef;
                int exp  = x.exp;
                x = x.next;
                y = y.next;
                if (coef == 0) continue;
                t = new Node(coef, exp);
            }
        
            c.last.next = t;
            c.last = c.last.next;
        }
        return c;
    }
    
    public ADTPolynomial Subtract(ADTPolynomial b) 
    {
    	ADTPolynomial a = this;
    	ADTPolynomial c = new ADTPolynomial();
        Node x = a.first.next;
        Node y = b.first.next;
        while (x != null || y != null) 
        {
            Node t = null;
            if      (x == null)     { t = new Node(y.coef, y.exp);  y = y.next; }
            else if (y == null)     { t = new Node(x.coef, x.exp);  x = x.next; }
            else if (x.exp > y.exp) { t = new Node(x.coef, x.exp);  x = x.next; } 
            else if (x.exp < y.exp) { t = new Node(y.coef, y.exp);  y = y.next; } 

            else 
            {
                int coef = x.coef - y.coef;
                int exp  = x.exp;
                x = x.next;
                y = y.next;
                if (coef == 0) continue;
                t = new Node(coef, exp);
            }
        
            c.last.next = t;
            c.last = c.last.next;
        }
        return c;
    }
    
    public ADTPolynomial Multiply(ADTPolynomial b)
    {
    	ADTPolynomial a = this;
    	ADTPolynomial c = new ADTPolynomial();
        for (Node x = a.first.next; x!= null; x = x.next) 
        {
        	ADTPolynomial temp = new ADTPolynomial();
            for (Node y = b.first.next; y!= null; y = y.next) 
            {
                temp.last.next = new Node(x.coef * y.coef, x.exp + y.exp);
                temp.last = temp.last.next;
            }
            c = c.Add(temp);
        }
        return c;
    }

    public String toString() 
    {
        String s = "";
        for (Node x = first.next; x != null; x = x.next) 
        {
            if      (x.coef > 0) s = s + " + " +   x.coef  + "x^" + x.exp;
            else if (x.coef < 0) s = s + " - " + (-x.coef) + "x^" + x.exp;
        }
        return s;
    }
}
