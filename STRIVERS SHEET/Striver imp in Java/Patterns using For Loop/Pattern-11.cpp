#include<iostream>
using namespace std;

int main(){

    int n;
    cout<<"Enter a number:";
    cin>>n;

    for(int i=1;i<=n;i++){

        int start;

        if(i%2==0) start=0; // check is the row is even or odd for even row print(0) else print(1)
        else start=1;

        for(int j=1;j<=i;j++){

            cout<<start<<" ";

            start=1-start; // the value gets updated
        }
        cout<<endl;
        
    }


}

/*  Pattern-11: Binary Number Triangle Pattern

1
0 1
1 0 1
0 1 0 1



*/