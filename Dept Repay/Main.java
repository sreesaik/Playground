#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  double interest,amount;
  double discount,final;
  std::cin>>a;
  std::cin>>b;
  std::cin>>c;
  interest=a*b*c/100;
  std::cout<<interest;
  amount=a+interest;
  std::cout<<"\n"<<amount;
  discount=((interest*2)/100);
  std::cout<<"\n"<<double(discount);
  final=a+interest-discount;
  std::cout<<"\n"<<final;
}