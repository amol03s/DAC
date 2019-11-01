#include"complex.h"
using std::cout;
using std::cin;
using std::endl;
	complex::complex (int a,int b):real(a),img(b)
	{
	}	

	complex complex::add(int i)
	{
		complex temp;
		temp.real=i+real;
		temp.img=i+img;
		return temp;
	}
	complex complex::add(int a,int b)
	{
		complex temp;
		temp.real=a+real;
		temp.img=b +img;
		return temp;
	}

	complex complex::operator+(int x)
	{
		complex temp;
		temp.real=x +real;
		temp.img=x + img;
		return temp;
	}
	/*complex operator+(complex x)
	{
		complex temp;
		temp.real=x.real +real;
		temp.img=x.img + img;
		return temp;
	}*/
	complex complex::operator-(int x)
	{
		complex temp;
		temp.real=real-x;
		temp.img=img-x;
		return temp;
	}
	complex complex::operator-(complex x)
	{
		complex temp;
		temp.real= real-x.real;
		temp.img=  img-x.img;
		return temp;
	}
	
	complex complex::operator*(int x)
	{
		complex temp;
		temp.real=x*real;
		temp.img=x*img;
		return temp;
	}
	complex complex::operator*(complex x)
	{
		complex temp;
		temp.real=x.real*real;
		temp.img=x.img* img;
		return temp;
	}  
	complex complex::operator/(int x)
	{
		complex temp;
		temp.real=real/x;
		temp.img=img/x;
		return temp;
	}	
	complex complex::operator/(complex x)
	{
		complex temp;
		temp.real=real/x.real;
		temp.img=img/x.img;
		return temp;
	}
	complex complex::operator++()//pre
	{
		++real;
		++img;
		return *this;//real=++real;img=++img;
		/*
		complex temp;	
		temp.real=++real;
		temp.img=++img;
		return temp;
		*/	
	}
	complex complex::operator++(int)//Post
	{
		complex temp(*this);
		this->real++;
		this->img++;
		return temp;
		/*complex temp;	
		temp.real=real++;
		temp.img=img++;
		return temp;//real=++real;img=++img;
		*/
	}
	complex complex::operator--()
	{
		real=--real;
		img=--img;
	}
	complex complex::operator--(int)
	{
		real=--real;
		img=--img;
	}
	bool  complex::operator<(complex a)
	{
		if(real<this->real && img<this->img)
		{	
			return true;	
	
		}
		else
		{
			return false;
		}
		
	}

	void complex::set_real(int real){
		this->real=real;
	}
	void complex::set_img(int img){
		this->img=img;
	}	
	int complex::get_real(){
		return real;
	}	
	int complex::get_img(){
		return img;
	}	
	void complex::display()
	{
	cout<<real<<"+"<<img<<"i"<<endl;
	}
	 
complex operator+(complex t1,complex t2){
	complex temp;
	temp.real=t1.real+t2.real;
	//temp.set_real(t1.get_real()+t2.get_real());
	temp.img=t1.img+t2.img;
	//temp.set_img(t1.get_img()+t2.get_img());
	return temp;
}
std::ostream& operator<<(std::ostream &o,complex temp){
	o<<temp.real<<"+"<<temp.img<<"i";
	return o;
}
std::istream& operator>>(std::istream &i,complex& temp){
	cout<<"Enter real:";
	i>>temp.real;
	cout<<"Enter img:";
	i>>temp.img;
	return i;
}
