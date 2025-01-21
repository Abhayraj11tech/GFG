//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class ReverseInSize {
    static Node head;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());

        while (t-- > 0) {

            String s[] = in.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            Node tail = head;
            for (int i = 1; i < s.length; i++) {
                int a = Integer.parseInt(s[i]);
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail = tail.next;
            }

            int k = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            Node res = ob.reverseKGroup(head, k);
            printList(res, out);
            out.println();

            out.println("~");
        }
        out.close();
    }

    public static void printList(Node node, PrintWriter out) {
        while (node != null) {
            out.print(node.data + " ");
            node = node.next;
        }
    }
}

// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/class Solution {
    public static Node reverseKGroup(Node head, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> sol = new ArrayList<>();
        int len = 0;
        Node curr = head;

        while (curr != null) {
            ++len;
            arr.add(curr.data);
            curr = curr.next;
        }

        int left = len % k;
      
        for (int i = 0; i < arr.size() - left; i += k) {
            int count = 0;
            ArrayList<Integer> brr = new ArrayList<>();
            while (count < k) {
                brr.add(arr.get(i + count));
                ++count;
            }
            Collections.reverse(brr); 
            sol.addAll(brr);
        }

        ArrayList<Integer> leftover = new ArrayList<>();
        for (int i = arr.size() - left; i < arr.size(); i++) {
            leftover.add(arr.get(i));
        }
        Collections.reverse(leftover);
        sol.addAll(leftover);

        Node solHead = new Node(sol.get(0));
        curr = solHead;
        for (int i = 1; i < sol.size(); i++) {
            curr.next = new Node(sol.get(i));
            curr = curr.next;
        }

        return solHead;
    }
}
