//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Main {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = sc.nextLine();
            Scanner ss = new Scanner(input);

            while (ss.hasNextInt()) {
                arr.add(ss.nextInt());
            }

            Node head = new Node(arr.get(0));
            Node tail = head;

            for (int i = 1; i < arr.size(); ++i) {
                tail.next = new Node(arr.get(i));
                tail = tail.next;
            }

            Solution ob = new Solution();
            Node[] result = ob.alternatingSplitList(head);
            printList(result[0]);
            printList(result[1]);
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java
/*
struct Node
{
    int data;
    struct Node* next;

    Node(int x){
        data = x;
        next = NULL;
    }

};
*/
class Solution {
    Node[] alternatingSplitList(Node head) {
        ArrayList<Node> arr = new ArrayList<>();
        ArrayList<Node> brr = new ArrayList<>();
        int count = 0;
        while(head != null) {
            if(count % 2 == 0) {
                arr.add(head);
            } else {
                brr.add(head);
            }
            count++;
            head = head.next;
        }
        
        for(int i = 0; i < arr.size() - 1; i++) {
            arr.get(i).next = arr.get(i + 1);
        }
        if (!arr.isEmpty()) {
            arr.get(arr.size() - 1).next = null;
        }
        
        for(int i = 0; i < brr.size() - 1; i++) {
            brr.get(i).next = brr.get(i + 1);
        }
        if (!brr.isEmpty()) {
            brr.get(brr.size() - 1).next = null;
        }

        Node[] result = new Node[2];
        result[0] = arr.isEmpty() ? null : arr.get(0);
        result[1] = brr.isEmpty() ? null : brr.get(0);
        return result;
    }
}
