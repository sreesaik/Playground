#include<iostream>
using namespace std;
struct calculate
{float inch;
 float feet;
}t1,t2,sum;
int main()
{cin>>t1.feet>>t1.inch>>t2.feet>>t2.inch;
 sum.inch=t1.inch+t2.inch;
 sum.feet=t1.feet+t2.feet;
 if(sum.inch>12)
 {++sum.feet;
  sum.inch-=12;}
 cout<<sum.feet<<"\'"<<"-"<<sum.inch<<"\" ";
 
  //Type your code here.
}