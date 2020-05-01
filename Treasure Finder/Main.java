#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int arr[3];
  int i,j,div,INT_MIN;
  int large,min;
  for(i=0;i<3;i++)
    cin>>arr[i];
  large=min=INT_MIN;
  for(i=0;i<3;i++)
  {if(arr[i]>large)
  {min=large;
   large=arr[i];}
   else if(arr[i]>min && arr[i]<large)
     min=arr[i];}
  cout<<"The treasure is in box which has number "<<min;
  for(i=1;i<large;i++)
  {if(arr[0]%i==0 && arr[1]%i==0 && arr[2]%i==0)
    div=i;
  }
  cout<<"\nThe code to open the box is "<<div;
  //Type your code here.
}