#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int n,m;
  cin>>n>>m;
  int a[20][20],b[20][20];
  int i,j,k,l,c[20][20];
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
  {
    cin>>a[i][j];
  }}
  for(k=0;k<n;k++)
  {
    for(l=0;l<m;l++)
    {
      cin>>b[k][l];
    }
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      c[i][j]=a[i][j]+b[i][j];
      cout<<c[i][j]<<" ";
    }
    cout<<"\n";
  }
}