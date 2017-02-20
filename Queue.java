package queue;
import Prime.Node;

public class Queue<T> {
	//Variables
	private Node<T> _head, _tail;
	
	//Constructor
	public Queue(){
		_head = null;
		_tail = null;
	}
	
	public boolean isEmpty(){
		return _head == null;
	}
	
	public void enqueue(T x){
		Node<T> temp = new Node<T> (x, null);
		if(_tail!=null)
			_tail.setNext(temp);
		_tail = temp;
		if(_head==null)
			_head = temp;
	}
	
	public T dequeue(){
		if (this.isEmpty())
			return null;
		T temp = _head.getValue();
		_head = _head.getNext();
		return temp;
	}
	
	public T first(){
		return _head.getValue();
	}
	
	public String toString(){
		Node<T> temp = _head;
		String s = "";
		while(temp!=null){
			s = s + temp.getValue();
			temp = temp.getNext();
		}
		return s;
	}
}
