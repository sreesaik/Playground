#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s=0,g=0;
  cin>>n;
  int a[15];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    if(a[i]%2==0)
      s=s+a[i];
    else 
      g=g+a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<s<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<g;
}