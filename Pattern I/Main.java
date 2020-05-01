#include<iostream>
using namespace std;
int main()
{
  int i,j,m,n,no;
  cin>>no;
  for(i=0;i<4;i++)
  {
    for(j=0;j<=i;j++)
    {
      cout<<no;
    }
    cout<<"\n";
    no++;
  }
  no--;
for(m=1;m<=4;m++)
{
  for(n=4;n>=m;n--)
  {
    cout<<no;
  }
  cout<<"\n";
  no--;
}
}