ops={"+":1,"-":1,"*":2,"/":2,"^":3,"(":0}
stack=[]
ans=""
exp=input("Enter the expression :")

for ch in exp:
    if ch not in ops and ch!=")":
        ans+=ch
    elif ch=="(":
        stack.append(ch)
    elif ch==")":
        while stack and stack[-1]!="(":
            ans+=stack.pop()
        stack.pop()
    
    else:
        while stack and ops[stack[-1]]>=ops[ch] and ch!="^":
            ans+=stack.pop()
        stack.append(ch)

while stack:
    ans+=stack.pop()

print("The solution is :",ans)