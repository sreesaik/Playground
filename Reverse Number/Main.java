#include <iostream>
int main() 
{
  int n,rem,revno=0;
  std::cin>>n;
  while(n>0)
  {
    rem=n%10;
    revno=revno*10+rem;
    n /=10;
  }
  std::cout<<revno;
    
    
	// Type your code here
	return 0;
}