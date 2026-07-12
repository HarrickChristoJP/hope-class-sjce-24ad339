#include<iostream>
using namespace std;

int main(){

    int n;
    cout<<"Enter a number:";
    cin>>n;

    char start='A';

    for(int i=1;i<=n;i++){

        

        for(int j=1;j<=i;j++){

            cout<<start<<" ";

             
        }
        start++;
        cout<<endl;
        
    }


}

/* Pattern-16: Alpha-Ramp Pattern

n=3

A
B B
C C C

3 x3 triangle

*/