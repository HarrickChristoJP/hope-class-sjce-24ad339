#include<iostream>
using namespace std;

int main(){

    int n;
    cout<<"Enter a number:";
    cin>>n;

    for(int i=1;i<=n;i++){

        for(int j=1;j<=i;j++){

            cout<<i<<" ";
        }
        cout<<endl;
    }
}

/* Pattern-4: Right-Angled Number Pyramid - II

1
2 2
3 3 3
4 4 4 4

*/