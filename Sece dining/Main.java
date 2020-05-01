#include<iostream>
using namespace std;
int main()
{
  string door;
  int side;
  cin>>door>>side;
  if(door=="front" && side==1)
    cout<<"Left Handed";
   else if(door=="front" && side==0)
    cout<<"Right Handed";
  else if(door=="rear" && side==1)
    cout<<"Right Handed";
  else if(door=="rear" && side==0)
    cout<<"Left Handed";
  //Type your code here.
}