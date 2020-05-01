#include<iostream>
using namespace std;
int main()
{
  int days=7,total_hours=0,salary=0;
  while(days--)
  {
    int hour,sal=0;
    std::cin>>hour;
    total_hours+=hour;
    sal=100*hour;
    if(hour>8)
      sal+=(15*(hour-8));
    if(days==0)
      sal+=(sal*0.25);
    if(days==6)
      sal+=(sal*0.5);
    sal=100*hour;
    if(hour>8)
      sal+=(15*(hour-8));
    if(days==0)
      sal+=(sal*0.25);
     if(days==6)
      sal+=(sal*0.5);
    salary+=sal;
    
  }
  std::cout<<salary;
    
  //Type your code here.
}