#include<iostream>
using namespace std;

int main(){

    int n;
    cout<<"Enter a number:";
    cin>>n;

    for(int i=1;i<=n;i++){

        for(int j=1;j<=i;j++){

            cout<<j<<" ";
        }
        cout<<endl;
    }
}



/* Pattern - 3: Right-Angled Number Pyramid

1
1 2
1 2 3
1 2 3 4


*/