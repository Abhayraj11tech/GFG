//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GfG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(str[i]));
                tail = tail.next;
            }
            Solution obj = new Solution();
            head = obj.addOne(head);
            printList(head);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node addOne(Node head) {
        StringBuilder number = new StringBuilder();
        Node temp = head;
        
        while (temp != null) {
            number.append(temp.data);
            temp = temp.next;
        }
        
        int carry = 1;
        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = number.charAt(i) - '0' + carry;
            number.setCharAt(i, (char) ((digit % 10) + '0'));
            carry = digit / 10;
        }
        
        if (carry > 0) {
            number.insert(0, carry);
        }
        
        Node sol = new Node(number.charAt(0) - '0');
        Node current = sol;
        for (int i = 1; i < number.length(); i++) {
            current.next = new Node(number.charAt(i) - '0');
            current = current.next;
        }
        
        return sol;
    }
}
