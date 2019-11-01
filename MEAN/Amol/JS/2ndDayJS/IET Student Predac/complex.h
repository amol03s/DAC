#include<iostream>
class complex
{
	int real,img;
	friend complex operator+(complex,complex);
	friend std::ostream& operator<<(std::ostream&,complex);
	friend std::istream& operator>>(std::istream &i,complex& temp);
public:
	complex (int a=0,int b=0);	
	complex add(int i);
	complex add(int a,int b);
	complex operator+(int x);
	/*complex operator+(complex x)
	{
		complex temp;
		temp.real=x.real +real;
		temp.img=x.img + img;
		return temp;
	}*/
	complex operator-(int x);
	complex operator-(complex x);
	complex operator*(int x);
	complex operator*(complex x);  
	complex operator/(int x);	
	complex operator/(complex x);
	complex operator++();//pre;
	complex operator++(int);//Post;
	complex operator--();
	complex operator--(int);
	bool  operator<(complex a);
	void set_real(int real);
	void set_img(int img);	
	int get_real();	
	int get_img();	
	void display();	
}; 
