package aulaDezesseis;

import java.util.HashMap;

public class ExemploHashMap {
	public static void main(String[] args) {
		HashMap<String, String> estados = new HashMap<>();
		//As chaves serão sempre únicas
		estados.put("RS","Rio Grande do Sul");
		estados.put("SC", "Santa Catarina");
		estados.put("PR", "Paraná");
		estados.put("RJ", "Rio de Janeiro");
		estados.put("SP", "São Paulo");
		//Imprimindo a HashMap
		System.out.println(estados);
		//Obtendo um elemento pela chave
		System.out.println(estados.get("RS"));
		System.out.println(estados.get("RM"));
		//Listando as chaves
		System.out.println(estados.keySet());
		//Listando os valores
		System.out.println(estados.values());
		//Iterando as chaves
		for(String uf:estados.keySet()){
			System.out.print(uf+" ");
		}
		//Pesquisando pela chave
		System.out.println("Pesquisando pela chave 'RS' "+estados.containsKey("RS"));
		//
		System.out.println("Pesquisando pela chave 'MT' "+estados.containsKey("MT"));
		//Pesquisando pelo valor
		System.out.println("Pesquisando por Rio de Janeiro "+estados.containsValue("Rio de Janeiro"));
		//Não é possível dois valores com a mesma chave, neste caso o HashMap vai
		// atualizar o valor para o novo inserido
		estados.put("RS", "Rio Grande");
		System.out.println(estados);
		//Removendo um objeto...
		estados.remove("RS");
		System.out.println(estados);

	}
}
