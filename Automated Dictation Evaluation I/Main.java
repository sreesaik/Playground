#include <iostream> 
using namespace std; 
  
void relationalOperation(string s1, string s2) 
{ 
  
    if (s1 == s2) 
        cout <<"It is correct";  
  else cout<<"It is wrong";
} 
  
// Main function 
int main() 
{ 
    string s1;
    string s2; 
  cin>>s1>>s2;
    relationalOperation(s1, s2); 
    return 0; 
}