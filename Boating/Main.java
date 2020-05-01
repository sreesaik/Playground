#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int total,a,c;
  std::cin>>total>>a>>c;
  a=a*75;
  c=c*30;
  if(total>(a+c))
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
  return 0;
}