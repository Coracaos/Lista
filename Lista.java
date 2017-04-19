package pe.edu.lista.lib;

/**
 * 
 * @author edu
 *	
 *	Lista :
 *
 *	agregar -> add(Object value)
 *	vacia   -> empty()
 *	obtener por indice -> index(int n)
 *	tamaño -> size()
 *	imprimir lista -> print()
 *	pasar lista a un arreglo -> toArray()
 *	
 */

public class Lista {
	
	private Nodo lista;
	
	public Lista() {
		lista = null;
	}
	
	
	public boolean empty(){
		return lista == null ? true : false;
	}
	
	public void add(Object obj){
		
		if(lista == null){
			lista = new Nodo(obj);
		}else{
			Nodo actual = lista;
			
			while(actual.getNext()!= null){
				actual = actual.getNext();
			}
			
			actual.setNext(new Nodo(obj));
		}
	}
	
	public Object index(int n){
		
		Nodo actual = lista;
		
		for(int i = 0; i < n; i++){
			actual = actual.getNext();
		}
		return actual.getValue();
	}
	
	public int size(){
		Nodo actual = lista;
		int n=0;
		while(actual != null){
			actual = actual.getNext();
			n ++;
		}
		return n;
	}
	
	public void print(){
		
		Nodo actual = lista;
		
		while(actual != null){
			System.out.println(actual.getValue());
			actual = actual.getNext();
		}
	}
	
	public Object[] toArray(){
		
		int n = size();
		
		Object[] arreglo = new Object[n] ;
		
		for(int i=0; i < n; i++){
			arreglo[i] = index(i);
		}
		
		return arreglo;
	}
}
