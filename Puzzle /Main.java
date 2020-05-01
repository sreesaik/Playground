#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int n,m,a[50][50];
  int t[50][50];
  cin>>n>>m;
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    {
      cin>>a[i][j];
    }
  }
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      t[i][j]=a[j][i];
      cout<<t[i][j]<<" ";
    }
    cout<<"\n";
  }
}