#include<iostream>
using namespace std;
struct time
{int hour;
 int min;
 int sec;
}t1,t2,t3;
int main()
{cin>>t1.hour>>t1.min>>t1.sec;
 cin>>t2.hour>>t2.min>>t2.sec;
 if(t2.sec>t1.sec)
 { t1.sec+=60;
  t1.min-=1;
   t3.sec=t1.sec-t2.sec;}
 else
   t3.sec=t1.sec-t2.sec;
 
 if(t2.min>t1.min)
 {t1.min+=60;
  t1.hour-=1;
 t3.min=t1.min-t2.min;}
 else
 t3.min=t1.min-t2.min;
t3.hour=t1.hour-t2.hour;

 cout<<t3.hour<<":"<<t3.min<<":"<<t3.sec;
  //Type your code here.
}