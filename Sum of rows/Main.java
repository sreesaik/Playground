#include <cstdlib>
#include <iostream>
#define size 100
using namespace std;
//Our function to find and display the sum of each row
void rowSum(int arr[size][size] ,int m,int n){
    int sum;
    
    //finding column sum
    for(int i = 0; i < n; i++){
        sum = 0;
        
        for(int j = 0; j < m; j++){
            sum = sum + arr[i][j];      //adding each element of row
        }
        
        cout<<sum<<endl;     
    }
}
//function to find and display sum of each column
void columnSum(int arr[size][size], int m, int n){
    int sum;
    
    //finding column sum
    for(int i = 0; i < n; i++){
        sum = 0;
        
        for(int j = 0;j < m; j++){
            sum = sum + arr[j][i];      //adding each element of column
        }
          
    }
}
int main(int argc, char** argv) {
    int arr[size][size], m ,n;
    
    
    cin>>m;
    
    cin>>n;
    
    //initializing the matrix
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            cin>>arr[i][j];
        }
    }
    
    rowSum(arr, m, n);
    
   
    columnSum(arr, m ,n);
    
    return 0;
}