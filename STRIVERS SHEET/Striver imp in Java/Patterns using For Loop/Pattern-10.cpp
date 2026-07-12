#include<iostream>
using namespace std;

int main(){

    int n;
    cout<<"Enter a number:";
    cin>>n;

    for(int i=1;i<=n;i++){
        
        for(int j=1;j<=i;j++){

            cout<<"*";
        }
        cout<<endl;
    }
    for(int i=n-1;i>=1;i--){
        
        for(int j=1;j<=i;j++){

            cout<<"*";
        }
        cout<<endl;
    }


}

/*  Pattern-10: Half Diamond Star Pattern

Input Format: N = 6
Result:   
     *
     **
     *** 
     ****
     *****
     ******  
     *****
     ****
     ***    
     **
     *



*/