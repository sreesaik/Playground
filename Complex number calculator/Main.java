#include <iostream>
#include <cmath>
using namespace std;
struct ComplexNumber
{
double real1 ,real2 ,
  img1 , img2 ;
};
//the addition function
void addition( ComplexNumber &cn )
{
     cout<< cn.real1+cn.real2 << "+" << cn.img1 + cn.img2 << "i" ;
}
 
//the subtraction function
void subtraction( ComplexNumber &cn )
{
if((cn.img1-cn.img2)< 0 )
{
  cout<<cn.real1-cn.real2<<"+(" << cn.img1-cn.img2 << ")i" ;
}
else
  cout<< cn.real1-cn.real2 << "+" << cn.img1-cn.img2 << "i" ;
}
 
//the multiplication
void multiplication( ComplexNumber &cn )
{

 
  cout<< (cn.real1*cn.real2)- (cn.img1*cn.img2)<< (cn.img1*cn.real2) + (cn.img2*cn.real1) << "i" ;
}
 
//the division function
//the main() function
int main( )
{
ComplexNumber cn ;
  int n;
  cin>>n;
 

cin >> cn.real1 >> cn.img1 ;
cin.ignore( ) ;
 

cin>> cn.real2 >> cn.img2 ;
cin.ignore( ) ;
switch(n)
{
 case 1:
 addition(cn) ; 
 break;
    //perform addition
  case 2:
  subtraction(cn) ;
  break;//perform subtraction
  case 3:
multiplication(cn) ;
    break;//perform multiplication
//perform division
  default:
    cout<<"Invalid choice";
}
 
cin.get( ) ;
return 0 ;
}