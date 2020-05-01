#include<iostream>
#include<cstring>
using namespace std;
struct College
{ char name[100]; 
  char city[100]; 
 int establishmentYear; 
 float passPercentage; }p[10],temp;
int main()
{int n ,i,j;
 cout<<"Enter the number of colleges";
 cin>>n;
 for(i=1;i<=n;i++)
 {cout<<"\nEnter the details of college "<<i;
cout<<"\nEnter name";
  cin>>p[i].name;
cout<<"\nEnter city";
  cin>>p[i].city;
cout<<"\nEnter year of establishment";
  cin>>p[i].establishmentYear;
cout<<"\nEnter pass percentage";
  cin>>p[i].passPercentage;
 }
for(i=2;i<=n;i++)
{for(j=1;j<n-i;j++)
{if(strcmp(p[j].name,p[j+1].name)>0)
{temp=p[j];
 p[j]=p[j+1];
 p[j+1]=temp;}}}
 cout<<"\nDetails of colleges";
 for(i=1;i<=n;i++)
 {
cout<<"\nCollege:"<<i;
cout<<"\nName:"<<p[i].name;
cout<<"\nCity:"<<p[i].city;
cout<<"\nYear of establishment:"<<p[i].establishmentYear;
cout<<"\nPass percentage:"<<p[i].passPercentage;
 }
  //Type your code here.
}