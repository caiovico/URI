//https://www.urionlinejudge.com.br/judge/pt/problems/view/1194
import java.util.*;
import java.io.*;
class Node<T>{
	private T value; 
	private Node<T> left, right, father;
	public Node(T i){
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
	public void setLeft(Node<T> n){
		left = n;
		left.setFather(this);
	}
	public void setRight(Node<T> n){
		right = n;
		right.setFather(this);
	}
	public void setFather(Node<T> n){
		father = n;
	}
	public Node getFather(){
		return father;
	}
	public String toString(){
		if value == null{
			return "";
		}
		return ""+value;
	}
	public boolean equals(Object o){
		Node<T> other = (Node)o;
		if (this.value().equals(other.value()))
			return true;
		else
			return false;
	}
}

//prefix & infix
public class URI1194{
	public static void main(String[] args) {
		Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		final int C = scn.nextInt();
		for (int i=0;i<C;i++){
			final int N = scn.nextInt();
			Deque<Node<String>> prefix = new ArrayDeque<>(
											Arrays.asList(scn.next()
												.split("")).stream()
														   .map(s->new Node<>(s))
												     	   .collect(Collectors.toList()));
			Deque<Node<String>> infix  = new ArrayDeque<>(
											Arrays.asList(scn.next()
												.split("")).stream()
														   .map(s->new Node<>(s)
														   .collect(Collectors.toList()));
			Node actual = new Node(prefix.pollFirst());
			while (prefix.peekFirst()!=null){
				if (prefix.peekFirst().equals(infix.peekFirst())){
					while (true){
						if ()
					}
				}else{
					actual.setLeft(prefix.pollFirst());
					actual = actual.getLeft();
				}
			}
		}
	}
}