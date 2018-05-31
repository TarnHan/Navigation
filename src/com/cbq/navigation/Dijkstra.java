package com.cbq.navigation;

import java.util.*;

public class Dijkstra {  
    Set<Node> open=new HashSet<Node>();  
    Set<Node> close=new HashSet<Node>();  
    Map<Integer,Double> path=new HashMap<Integer,Double>();  
    Map<Integer,String> pathInfo=new HashMap<Integer,String>();  
    public Node init(int str){  
    	int temp=1;
    	int j=str-1;
    	matrix m=new matrix();
		double num[][]=m.getmatrix();
		for(int i=0;i<42;i++){
			if(temp!=str){
				if(num[j][i]!=Double.MAX_VALUE){
					path.put(temp, num[j][i]);
					pathInfo.put(temp, str+"->"+temp);
				}else{
					path.put(temp, Double.MAX_VALUE);
					pathInfo.put(temp, str+"");
				}
			}
			temp+=1;
		}
        Node start=new MapBuilder().build(open,close,str);  
        return start;  
    }  
    public void computePath(Node start){  
        Node nearest=getShortestPath(start);
        if(nearest==null){  
            return;  
        }  
        close.add(nearest);  
        open.remove(nearest);  
        Map<Node,Double> childs=nearest.getChild();  
        for(Node child:childs.keySet()){  
            if(open.contains(child)){
                Double newCompute=path.get(nearest.getNum())+childs.get(child);  
                if(path.get(child.getNum())>newCompute){
                    path.put(child.getNum(), newCompute);  
                    pathInfo.put(child.getNum(), pathInfo.get(nearest.getNum())+"->"+child.getNum());  
                }  
            }  
        }  
        computePath(start);
        computePath(nearest);
    }  
    public int[] printPathInfo(int c){  
        Set<Map.Entry<Integer, String>> pathInfos=pathInfo.entrySet();
        String s1="";
        for(Map.Entry<Integer, String> pathInfo:pathInfos){
        	if(pathInfo.getKey()==c){
        		// System.out.println(pathInfo.getValue());
        		 s1=pathInfo.getValue();
        	}           
        }
        String[] strList=s1.split("->");
        int[] numlist=new int[strList.length];
        for(int i=0;i<strList.length;i++){
        	numlist[i]=Integer.parseInt(strList[i]);
        }
        return numlist;
    }  
   
    private Node getShortestPath(Node node){  
        Node res=null;  
        double minDis=Double.MAX_VALUE;  
        Map<Node,Double> childs=node.getChild();  
        for(Node child:childs.keySet()){  
            if(open.contains(child)){  
                double distance=childs.get(child);  
                if(distance<minDis){  
                    minDis=distance;  
                    res=child;  
                }  
            }  
        }  
        return res;  
    }  
}  
