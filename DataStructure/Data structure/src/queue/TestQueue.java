package queue;
/*
 * 큐 ==> 선입선출
 * 큐에서 수행되는 일반적인 연산자
 * 1. enqueue(E e) ==> 큐의 맨 뒤의 요소를 추가
 * 2. E dequeue ==> 큐의 맨 앞에 있는 요소 제거
 * 
 * */
public class TestQueue<E> {

	private int front;	// 요소 제거 혹은 반환
	private int rear;	// 요소 삽입
	private int count; 	// 큐의 크기
	private int capacity; 	//큐의 용량	
	private E[] queue; 		// 큐를 위한 배열 선언
	
	public TestQueue(){
		//큐를 초기화 하는 생성자 
	}
	
	
}
