#include<iostream>
using namespace std;

int main(){

    int n;
    cout<<"Enter a number:";
    cin>>n;

    for(int i=n;i>=0;i--){

        for(int j=1;j<=n-i;j++){  // space 

            cout<<" ";

        }

     // to print the *
        for(int j=1;j<=(2*i-1);j++){

            cout<<"*";
        }

        cout<<endl;
    }

}


/* Pattern-8: Inverted Star Pyramid

*********
 ******* 
  *****
   ***
    *

*/