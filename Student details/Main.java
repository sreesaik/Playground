#include<bits/stdc++.h>
using namespace std;
struct Student{
  char name[30];
  char department[20];
  int yearofstudy;
  float cgpa;
};
int comparator(const void* p,const void* q)
{
  return strcmp(((struct Student*)p)->name,
                ((struct Student*)q)->name);
}
int main()
{
  int n;
 std::cout<<"Enter the number of students";
 std::cin>>n;
  struct Student arr[n];
 for(int i=0;i<n;i++)
 {
   std::cout<<"\nEnter the details of student "<<i+1;
  std::cout<<"\nEnter name";
   std::cin>>arr[i].name;
  cout<<"\nEnter department";
  std::cin>>arr[i].department;
  cout<<"\nEnter year of study";
  std::cin>>arr[i].yearofstudy;
  cout<<"\nEnter cgpa";
  std::cin>>arr[i].cgpa;
 }
  std::cout<<"\nDetails of students";
  qsort(arr,n,sizeof(struct Student),comparator);
 for(int i=0;i<n;i++)
 {
   std::cout<<"\nStudent "<<i+1;
  std::cout<<"\nName:";std::cout<<arr[i].name;
  std::cout<<"\nDepartment:";std::cout<<arr[i].department;
  std::cout<<"\nYear of study:"; std::cout<<arr[i].yearofstudy;
  std::cout<<"\nCGPA:"; std::cout<<arr[i].cgpa;
 }
}