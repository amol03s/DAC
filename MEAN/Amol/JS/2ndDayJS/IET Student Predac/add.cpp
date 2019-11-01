#include<iostream>
#include"complex.h"
using std::cout;
using std::cin;
using std::endl;
int main()
{
	complex c,c1(10,20),c2(200,10 );
	/*c=c2.add(2);
	c.display();
	c=c2.add(10,20);
	c.display();
	cout<<"\n\t**********Overloading***********";
	cout<<"\n\t\t\tc1(40,20),c2(2,10 )\n";
*/
	cout<<"\n\n\tAddition\n";//overload +
	c=c1+c2; //c1.operator+(c2)	//operator+(c1,c2)	
	c.display();
	cout<<"\tc1(40,20)+10\n\n";
	c=c1+10; //c1.operator+(10)//c1.operator+(c2) //operator+(c1,10) //operator+(c,c1)
	c.display();
	c=20+c1; //operator+(dum(complex),c1)
	cout<<"c:"<<c<<endl;//cout.operator<<(c)// operator<<(cout,c);
	cin>>c;
	cout<<"Cin values"<<c<<endl;
	/*cout<<"\n\n\tSubstract\n";//overload -
	c=c1-c2;
	c.display();
	cout<<"\tc1(40,20)-10\n\n";
	c=c1-10;
	c.display();
	cout<<"\n\n\tMultiply\n";//overload *
	c=c1*c2;
	c.display();
	cout<<"\tc1(40,20)*10\n\n";
	c=c1*10;
	c.display();
	cout<<"\n\n\tDivision\n";//overload /
	c=c1/c2;
	c.display();
	cout<<"\tc1(40,20)*10\n\n";
	c=c1/10;
	c.display();
	cout<<"\n\n\t Unary Operator----c1(40,20)\n";
	++c1;
	c1.display();
	--c1;
	c1.display();

	cout<<"\n\n**************Relational****************";
	cout<<"\n\nc1(40,20),c2(2,10 )";
   	if(c1<c2)
	{
		cout<<"\n\n\tC1 is less than c2\n"<<endl;
	}
	else
	{
		cout<<"\n\n\tC2 is less than C1\n"<<endl;
	}

	/*complex c1(10,20);
	complex temp1;
	temp1=++c1;//c1.operator++();
	temp1=c1++;//c1.operator++(int);
	temp1.display();
	c1.display();*/
}

