#include<iostream>
using namespace std;

int main(){

    int n;
    cout<<"Enter a number:";
    cin>>n;

    int start=1;

    for(int i=1;i<=n;i++){

        

        for(int j=1;j<=i;j++){

            cout<<start<<" ";

            start=1+start; 
        }
        cout<<endl;
        
    }


}

/*  Pattern-13: Increasing Number Triangle Pattern

n=3

1 
2 3
4 5 6

3 x3 triangle

*/