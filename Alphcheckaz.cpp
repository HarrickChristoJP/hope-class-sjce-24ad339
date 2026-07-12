#include <iostream>
#include <vector>
using namespace std;

void solve(){
    string s;
    cin>>s;
    int flag=0;
    for(char ch:s){
        flag=flag!(l<<(ch-'a'));

    }
    cout<<((flag==(l<<26)-1)?"YES":"NO");
}