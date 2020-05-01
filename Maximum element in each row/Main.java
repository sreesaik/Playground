#include<bits/stdc++.h> 
using namespace std; 
const int N = 4;  
  
  
    // Print array element 
    void printArray(int result[], int no_of_rows) { 
        for (int i = 0; i < no_of_rows; i++) { 
            cout<< result[i]<<"\n"; 
        } 
  
    } 
  
    // Function to get max element 
    void maxelement(int no_of_rows, int arr[][N]) { 
        int i = 0; 
          
        // Initialize max to 0 at beginning 
        // of finding max element of each row 
        int max = 0; 
        int result[no_of_rows]; 
        while (i < no_of_rows) { 
            for (int j = 0; j < N; j++) { 
                if (arr[i][j] > max) { 
                    max = arr[i][j]; 
                } 
            } 
            result[i] = max; 
            max = 0; 
            i++; 
    
        } 
        printArray(result,no_of_rows); 
  
    } 
  
    // Driver code 
    int main() 
    { 
      	int n, m,i,j;
      cin>>n>>m;
        int arr[20][N];
      for(i=0;i<n;i++){
        for(j=0;j<m;j++){
          cin>>arr[i][j];
        }
      }
    // Calling the function  
        maxelement(n, arr); 
    }