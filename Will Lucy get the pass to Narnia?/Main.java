#include<iostream>
int main()
{
  int m,n,s;
  std::cin>>m;
  std::cin>>n;
  std::cin>>s;
  std::cout<<"Enter first number : Enter second number : Menu";
  std::cout<<"\n1.Addition";
  std::cout<<"\n2.Subtraction";
  std::cout<<"\n3.Multiplication";
  std::cout<<"\n4.Division";
  std::cout<<"\n5.Remainder";
  switch(s)
  {
    case 1:
      std::cout<<"\n"<<m+n;
      break;
    case 2:
      std::cout<<"\n"<<m-n;
      break;
    case 3:
      std::cout<<"\n"<<m*n;
      break;
    case 4:
      std::cout<<"\n"<<m/n;
      break;
    case 5:
      std::cout<<"\n"<<m%n;
      break;
    default:
      std::cout<<"\nInvalid operation";
  }
  return 0;
}