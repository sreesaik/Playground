#include<iostream>
#include <bits/stdc++.h>
#include<string.h>
using namespace std;
int main ()
{
    string str,t, temp;
cin>>str;
  cin>>t;
reverse(str.begin(),str.end());
  if(str==t)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}