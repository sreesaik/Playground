#include<iostream>
using namespace std;
int main()
{
  int n,i,a=11;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cout<<a*a<<" ";
    a=a+4;
  }
}