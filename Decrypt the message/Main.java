#include<iostream>
using namespace std;
int main()
{
  int x,y,num,i,sum=0;
  std::cin>>x;
  std::cin>>y;
  num=x+y;
  for(i=1;i<num;i++)
  {
    if(num%i==0)
    {
      sum+=i;
    }
  }
  if(sum==num)
  {
    std::cout<<"They can read the message";
  }
  else
  {
    std::cout<<"They can't read the message";
  }
  return 0;
}