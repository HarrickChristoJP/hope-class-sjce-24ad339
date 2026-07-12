#include<iostream>
using namespace std;

int main(){

    int n;
    cout<<"Enter a number:";
    cin>>n;

    for(int i=n;i>=0;i--){

        for(int j=1;j<=i;j++){

            cout<<j<<" ";
        }
        cout<<endl;
    }
    return 0;
}

/* Pattern-6: Inverted Numbered Right Pyramid

1 2 3 4
1 2 3
1 2
1

*/