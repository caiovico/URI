//https://www.urionlinejudge.com.br/judge/pt/problems/view/2120
import java.util.*;
import java.io.*;
import java.util.stream.*;
class Nodes{
	public static void insertNode(Node head, Node newNode){
		while (true){
			Node father = head;
			boolean right;
			if (newNode.getValue() > head.getValue()){
				head = head.getRight();
				right = true;
			}else{
				head = head.getLeft();
				right = false;
			}
			if (head==null){
				newNode.setFather(father);
				if (right){
					father.setRight(newNode);
				}else{
					father.setLeft(newNode);
				}
				break;
			}	
		}
	}
}
class Node{
	private int value; 
	private Node left, right, father;
	public Node(int i){
		value = i;
	}
	public int getValue(){
		return value;
	}
	public Node getLeft(){
		return left;
	} 
	public Node getRight(){
		return right;
	}
	public void setLeft(Node n){
		left = n;
	}
	public void setRight(Node n){
		right = n;
	}
	public void setFather(Node n){
		father = n;
	}
	public Node getFather(){
		return father;
	}
	public String toString(){
		return ""+value;
	}
}
public class URI2120{
	public static void main(String[] args) {
		Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while(scn.hasNextInt()){
			Map<Integer,Node> positionNode = new TreeMap<>();
			final int N = scn.nextInt();
			final Node root = new Node(scn.nextInt());
			for(int i=2;i<=N;i++){
				Node actualNode = new Node(scn.nextInt());
				positionNode.put(i,actualNode);
				Nodes.insertNode(root,actualNode);
			}
			final int Q = scn.nextInt();
			String answer =
			Stream.generate(scn::nextInt)
				  .limit(Q)
				  .map(i -> positionNode.get(i))
				  .map(Node::getFather)
				  .map(Node::toString)
				  .collect(Collectors.joining(" "));	
			System.out.println(answer);	  		
		}
	}
}