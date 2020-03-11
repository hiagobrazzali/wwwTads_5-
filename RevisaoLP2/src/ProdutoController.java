import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProdutoController {
	
	
	public static String maisVendido(ArrayList<Produto> produto) {
		
	        Map<Produto,Integer> qtde = new HashMap<>();

	        for(Produto prod : produto){
	            if(qtde.containsKey(prod)){ 
	                Integer n = qtde.get(prod);
	                qtde.put(prod, n+1); 
	            }else{
	                qtde.put(prod,1);
	            }
	        }
	        System.out.println(qtde);
		
		
		return null;
	}
}