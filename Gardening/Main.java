#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  std::cin>>r;
  std::cin>>c;
  std::cin>>n;
  if(2<c && (n>r && n<=2*r))
    std::cout<<"It is a mango tree";
  else if((c-1!=0) && (n>r*(c-2)&&n<=r*(c-1)))
   std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
    
  //Type your code here.
}