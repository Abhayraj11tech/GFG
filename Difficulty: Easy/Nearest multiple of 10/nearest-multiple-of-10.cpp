//{ Driver Code Starts
#include <iostream>
using namespace std;


// } Driver Code Ends

class Solution {
  public:
    string roundToNearest(string str) {
       
        int n = str.size();
        if (n == 0) return "";

        if (str[n - 1] - '0' <= 5) {
            str[n - 1] = '0';
            return str.substr(0, n);
        } else {
            str[n - 1] = '0';
            int i = n - 2;
            int carry = 1;

            while (i >= 0 && carry) {
                int currentDigit = str[i] - '0';
                currentDigit += carry;

                if (currentDigit > 9) {
                    str[i] = '0';
                    carry = 1;
                } else {
                    str[i] = currentDigit + '0';
                    carry = 0;
                }
                i--;
            }

            if (carry == 1) {
                str = '1' + str;
            }

            return str;
        }
    }
};



//{ Driver Code Starts.

int main() {

    int t;
    cin >> t;
    while (t--) {
        string str;
        cin >> str;
        Solution ob;
        cout << ob.roundToNearest(str) << endl;
    }

    return 0;
}
// } Driver Code Ends