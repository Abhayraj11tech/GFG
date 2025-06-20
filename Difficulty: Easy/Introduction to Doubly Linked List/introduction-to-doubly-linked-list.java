// User function Template for Java

class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        Node sol = new Node(arr[0]);
        Node curr = sol;
        for(int i=1;i<arr.length;i++){
            curr.next = new Node(arr[i]);
            curr.next.prev = curr;
            curr = curr.next;
        }
        curr.next = null;
        return sol;
    }
}