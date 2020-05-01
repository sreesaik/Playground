#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,n,f=0,s=0;
  cin>>a>>b>>c>>d;
  s=a+c;
 f=b+d;
  if(f>100)
  {
 f=f-100;
    s=s+1;
  }
  else
  {
    f=b+d;
  }
  cout<<s<<"\n"<<f;
}