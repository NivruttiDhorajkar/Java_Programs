#include<iostream>

using namespace std;

template <class T>
T Add(T i, T j)
{
    T Ans;
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
    double p = 90.1;
    double q = 67.8;
    double dRet =0;
    float fRet = 0.0f;

    iRet = Add(a,b);
    fRet = Add(x,y);
    dRet = Add(p,q);

    cout<<"Addition of integers:"<<iRet<<"\n";
    cout<<"Addition of floats :"<<fRet<<"\n";
    cout<<"Addition of doubles:"<<dRet<<"\n";

    return 0;
}
