#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,gcd;
  int small=0;
  std::cin>>a>>b>>c>>d;
  if(a<b && a<c)
  {
    small=a;
  }
  else if(b<a && b<c)
  {
    small=b;
  }
  else
  {
    small=c;
  }
    if(a%small==0 && b%small==0 && c%small==0)
    {
    {
      gcd=small;
    }    
    small--;
  }
  if(d==gcd)
  {
    std::cout<<"Answer is correct.";
  }
  else
  {
    std::cout<<"Answer is wrong.";
  }
  return 0;
}
    