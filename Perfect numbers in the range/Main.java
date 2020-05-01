#include<iostream>
using namespace std;
int main()
{
  int x,y,num,i,sum;
  std::cin>>x;
  std::cin>>y;
  for(i=x;i<=y;i++){
    num=1;
    sum = 0;
    while(num<i){
      if(i%num==0)
           sum=sum+num;
          num++;
    }
    if(sum==i)
      std::cout<<i<<" ";
  }
}
 