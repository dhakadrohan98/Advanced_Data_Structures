//package com.kumar.tree;
//
//public class DFSTraversalFromBottomToTop {
//
//
//
//--->height[n+1]
//
//
//void DFS(integer node,G[][],used[],parent[]){
//    
//    used[node] = 1 ; 
//    
//    for(auto u: G[node]){ //iterating all children "u" of "node"
//        
//        if(used[u]==0){
//            //if this node/branch has never been visited before 
//            //just go into it and search it using dfs in recursion
//            parent[u] = node ; 
//            DFS(u,G,used,parent);
//            
//        }
//    }
//    
//    
//    print(node)
//    ----> bottom up traversal 
//    //5
//    h = 0 ; 
//    for(auto child: G[node]){
//        
//        if(child==parent[node]){
////            it means the child node is parent of the node
////            it is not the child
////            ignore it
//        }
//        
//        else{
//            
//            h = max(h,height[child]) 
//            
//        }
//        
//        
//        
//    }
//    
//    height[node] = 1 + h 
//    
//    
//}
//
//-> n 
//G[n+5][]  
//i = 1 ; 
//while(i<=n-1){
//    read(u)
//    read(v)
//    G[u].push_back(v);
//    G[v].push_back(u); 
//    i++;
//}
//    
//used[n+1]-->0
//parent[n+1]-->0
//    
//DFS(1,G,used,parent); //starts from node 1  
//    
//    
//// print height of each node
//i = 1 
//while(i<=n){
//    print(height[i])
//    i=i+1
//}
//    
//    
//    return 0 ; 
//}
//}
