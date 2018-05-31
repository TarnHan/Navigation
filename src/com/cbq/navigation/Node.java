package com.cbq.navigation;

import java.util.*;

public class Node {  
    private int num;  
    private Map<Node,Double> child=new HashMap<Node,Double>();  
    public Node(int num){  
        this.num=num;  
    }  
    public int getNum() {  
        return num;  
    }  
    public void setNum(int name) {  
        this.num = num;  
    }  
    public Map<Node, Double> getChild() {  
        return child;  
    }  
    public void setChild(Map<Node, Double> child) {  
        this.child = child;  
    }  
}  
