#include <iostream>
using namespace std;
int main() {
    // Type your code here
int i,j;
int n ;
  cin>>n;
for(i=1;i<=n;i++)
{
    for(j=1;j<=n;j++)
    {

        if(i%2==0)
        {
            if(j==1)
            {
                cout<<i+1;
            }
            else
                cout<<i;
        }
        else
        {
            if(j==n)
            {
                cout<<i+1;
                break;
            }
            else
            {
                cout<<i;
            }
        }
    }
    cout<<"\n";
}
    return 0;
}