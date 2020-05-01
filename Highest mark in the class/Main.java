#include<iostream>
int main()
{
 int i, n;
    float arr[100];
    std::cin>>n;
    for(i = 0; i < n; ++i)
    {
       std::cin>>arr[i];
    }
    for(i = 1;i < n; ++i)
    {
       if(arr[0] < arr[i])
           arr[0] = arr[i];
    }
    std::cout<<arr[0];
    return 0;
}