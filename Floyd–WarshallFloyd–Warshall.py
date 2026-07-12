num=10**9

mat=[
    [10,89,num,48],
    [num,22,66,47],
    [36,75,54,num],
    [25,63,num,45]
]

l=len(mat)

for k in range(l):
    for i in range(l):
        for j in range(l):

            if mat[i][k]+mat[k][j]<mat[i][j]:
                mat[i][j]=mat[i][k]+mat[k][j]

for i in mat:
    print(i)