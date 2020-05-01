#include<iostream>
int main()
{
  int n,fact=1,i;
  std::cin>>n;
  if(n<=0)
  {
    std::cout<<"error";
  }
  else
  for(i=1;i<=n;i++)
  {
    fact=fact*i;
  }
  std::cout<<"The factorial of "<<n<<" is "<<fact;
  //Type your code here.
}