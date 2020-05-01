#include<iostream>
using namespace std;
struct Employee
{char name[30];
 int eid;
 int age;
 char designation[90];
 int salary;
};
Employee details(Employee);
void displaydata(Employee);
int main()
{Employee p;
 p=details(p);
 displaydata(p);
 return 0;
}
Employee details(Employee p)
{cout<<"Enter name:";
 cin>>p.name;
cout<<"\nEnter ID:";
 cin>>p.eid;
cout<<"\nEnter age:";
 cin>>p.age;
cout<<"\nEnter designation:";
 cin>>p.designation;
cout<<"\nEnter Salary:";
 cin>>p.salary;
 return (p);
}
void displaydata(Employee p)
{cout<<"\nEmployee Details";
cout<<"\nName of the Employee : "<<p.name;
cout<<"\nID of the Employee : "<<p.eid;
cout<<"\nAge of the Employee : "<<p.age;
cout<<"\nDesignation of the Employee : "<<p.designation;
cout<<"\nSalary of the Employee : "<<p.salary;
}