#include<iostream>
using namespace std;
int main()
{
  int n,m,a[20][20],i,j;
  cin>>n>>m;
  for(i=0;i<n;i++){
    for(j=0;j<m;j++){
      cin>>a[i][j];
    }
  }
  int max=a[0][0];
  for(i=0;i<n;i++){
    for(j=0;j<m;j++){
      if(a[i][j]>max){
        max=a[i][j];
      }
    }
  }
  cout<<"The maximum element is "<<max;
  return 0;
  
}