package calculadora;

public class Calculadora {
	
	private int ans; 
	
	public Calculadora() {
		ans = 0; 
	}
	
	public int add(int a, int b) {
		ans = a + b;
		return ans;
				
	}
	
	public int add(int v) {
		ans += v;
		return ans;
	}
	
	public int sub(int a, int b) {
		ans = a - b;
		return ans;
	}
	
	public int sub(int v) {
		ans -= v ;
		return ans;
	}
	
	public int ans() {
		return ans; 
	}
	
	public int clear() {
		
		return ans = 0;
	}
	
	public static void main(String[] args) {
		
	
	}
	

}
