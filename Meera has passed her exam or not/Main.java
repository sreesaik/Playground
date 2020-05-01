#include<iostream>
int main()
{
int n,arr[15],i,a,flag=0;
std::cin>>n;
for(i=0;i<n;i++){
std::cin>>arr[i];
}
std::cin>>a;
for(i=0;i<n;i++){
if(arr[i]==a){
flag=1;
break;
}
}
if(flag==1)
std::cout<<"She passed her exam";
else
std::cout<<"She failed";
}