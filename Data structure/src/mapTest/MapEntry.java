package mapTest;

public class MapEntry<K,V>{

	
	private final K key;
	private V value;
	private MapEntry<K,V>[] arr = new MapEntry[16];
	
	public MapEntry(K key, V value){
		this.key = key;
		this.value = value;
	}
	
	public K getKey(){
		return key;
	}
	public void setKey(K k){
		this.key = k;
	}
	
	public V getValue(){
		return value;
	}
	public void setValue(V v){
		this.value = v;
	}

	public boolean put(K k, V v){
		if(arr.length > 0) {
			
		}
	}
		
