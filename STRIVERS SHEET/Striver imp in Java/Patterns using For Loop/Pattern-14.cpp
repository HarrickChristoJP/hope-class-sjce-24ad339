#include<iostream>
using namespace std;

int main(){

    int n;
    cout<<"Enter a number:";
    cin>>n;

    

    for(int i=1;i<=n;i++){

        char start='A';

        for(int j=1;j<=i;j++){

            cout<<start<<" ";

            start+=1; 
        }
        cout<<endl;
        
    }


}

/* Pattern-14: Increasing Letter Triangle Pattern

n=3

A
A B
A B C

3 x3 triangle

*/