#include<iostream>

using namespace std;

int Addi(int i, int j)
{
    int Ans=0;
    Ans= i+j;
    return Ans; 
}

float Addf(float i, float j)
{
    float Ans=0;
    Ans= i+j;
    return Ans; 
}

int main()
{
    int a=10;
    int b=11;
    int iRet=0;
    float x = 90.1f;
    float y = 67.8f;
    float fRet = 0.0f;

    iRet = Addi(a,b);
    fRet = Addf(x,y);

    cout<<"Addition of integers:"<<iRet<<"\n";
    cout<<"Addition of floats :"<<fRet<<"\n";

    return 0;
}
