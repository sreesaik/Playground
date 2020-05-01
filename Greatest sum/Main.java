#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,count=0;
   std::cin>>n>>m;
  int a[n][n];
  int r[n];
  int c[n];
  
  memset(r,0,sizeof r);
  memset(c,0,sizeof c);
  
  for(int i=0;i<n;i++)
    for(int j=0;j<n;j++)
      std::cin>>a[i][j];
 
  
  for(int i=0; i<n; i++)
  {
    for(int j=0;j<n;j++)
    {
      r[i]+=a[i][j];
      c[i]+=a[j][i];
    }
  }
  
  std::cout<<"Sum of rows is ";
  int max1=r[0],index1=1;
  for(int i=0; i<n;i++)
  {
    std::cout<<r[i]<<" ";
    if(r[i]>max1) 
{
      max1=r[i];
      index1=i+1;
    }
  }
  
  std::cout<<"\nRow "<<index1<<" has maximum sum";
  
  std::cout<<"\nSum of columns is ";
  int max2=c[0],index2=1;
  for(int i=0; i<n;i++)
  {
    std::cout<<c[i]<<" ";
    if(c[i]>max2) 
    {
      max2=c[i];
      index2=i+1;
    }
  }
  
  std::cout<<"\nColumn "<<index2<<" has maximum sum";
  
  
}