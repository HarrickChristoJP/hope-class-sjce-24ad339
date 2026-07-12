def dfs(graph,start):
    visited=set()
    path=[]
    stack=[start]

    while stack:
        node=stack.pop()

        if node not in stack:
            visited.add(node)
            path.append(node)

            for i in graph[node]:
                stack.append(i)
    
    return path

graph={
    'A':['B','C'],
    'B':[],
    'C':['D','E'],
    'D':[],
    'E':[]

}

print("The answer is :",dfs(graph,'A'))