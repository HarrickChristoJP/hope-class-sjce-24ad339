#include<iostream>
using namespace std;

int main(){

    int n;
    cout<<"Enter a number:";
    cin>>n;

    

    for(int i=n;i>=1;i--){

        char start='A';

        for(int j=1;j<=i;j++){

            cout<<start<<" ";

            start+=1; 
        }
        cout<<endl;
        
    }


}

/* Pattern-15: Reverse Letter Triangle Pattern
n=3

A B C
A B
A

3 x3 triangle

*/