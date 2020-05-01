#include<bits/stdc++.h>
using namespace std;

int main()
{
  //Type your code here.
  int total_balls,total_runs,runs_scored,balls;
   std::cin>>total_balls>>total_runs>>runs_scored>>balls;
  int total_overs=(total_balls)/6;
   std::cout<<total_overs<<endl;
  float overs_finished = (((balls)/6)*10 + (balls%6));
   overs_finished/=10;
   std::cout<<overs_finished<<endl;
  float crr = (float)(runs_scored)/overs_finished;
   std::cout<<fixed<<setprecision(1)<<crr<<endl;
  float trr = (float)total_runs/total_overs;
   std::cout<<fixed<<setprecision(1)<<trr<<endl;
  
  if(crr>=trr)
    std::cout<<"Eligible to Win"<<endl;
  else
    std::cout<<"Not Eligible to Win"<<endl;
  return 0;
}