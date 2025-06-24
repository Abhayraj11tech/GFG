
class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        Arrays.sort(arr);
        int count = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=0){
                continue;
            }
            else{
                if(arr[i]==count){
                    ++count;
                }
                else if(arr[i]>count){
                   break;
                }
            }
        }
        return count;
    }
}
