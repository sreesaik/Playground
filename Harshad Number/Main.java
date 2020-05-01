#include<iostream>
using namespace std;
int main()
{
  int num,sum = 0;  
    std::cin>>num;
    int n = num;   
    while(num > 0)
    {  
        int rem = num%10;  
        sum = sum + rem;  
        num = num/10;  
    }      
    if(n % sum == 0)  
        std::cout<<"Harshad Number";  
    else  
        std::cout<<"Not Harshad Number";
  
  //Type your code here.
}