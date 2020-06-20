package br.com.loja.cliente.lojamodulocliente;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapJava {

	public static void main(String[] args) {
		HashMap<Integer,Map<String,Set<String>>> mapaCidades = new HashMap<>();
		Map<String,Set<String>> estadoCidadeES = new HashMap<>();
		Map<String,Set<String>> estadoCidadeMG = new HashMap<>();
		
		Set<String> cidadesES = Set.of("Guarapari","Vila Velha","Serra","Cariacica");
		Set<String> cidadesMG = Set.of("BH","João Monlevade","Ipatinga","Governador Valadares","Ipanema");
		
 		estadoCidadeES.put("ES",cidadesES);		
		estadoCidadeMG.put("MG",cidadesMG);
		
		mapaCidades.put(1,estadoCidadeES);
		mapaCidades.put(2,estadoCidadeMG);
		
		System.out.println(mapaCidades.get(2));

	}

}
