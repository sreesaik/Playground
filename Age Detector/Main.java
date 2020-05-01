#include<iostream>
using namespace std;
int main()
{
  int b,c,n;
  std::cin>>b;
  std::cin>>c;
  if(c<b)
  {
    b=100-b;
    n=c+b;
    std::cout<<n;
  }
  else
  {
    std::cout<<c-b;
  }
  //Type your code here.
}