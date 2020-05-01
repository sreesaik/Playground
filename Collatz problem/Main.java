#include<iostream>
using namespace std;
int main()
{
  int n,count=0;
  std::cin>>n;
  while(n!=1)
  {
    std::cout<<n<<"\n";
    if(n&1)
      n=3*n+1;
    else
    n=n/2;
    count++;
  }
      std::cout<<n<<"\n";
  std::cout<<count;
  return 0;
}