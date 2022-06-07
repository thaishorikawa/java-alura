package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;

	public class TestaPerformance {

	    public static void main(String[] args) {

	        Collection<Integer> numeros = new ArrayList<Integer>();

	        long inicioInsercao = System.currentTimeMillis();

	        for (int i = 1; i <= 50000; i++) {
	            numeros.add(i);
	        }

	        long fimInsercao = System.currentTimeMillis();

	        long inicioBusca = System.currentTimeMillis();

	        for (Integer numero : numeros) {
	            numeros.contains(numero);  
	        }

	        long fimBusca = System.currentTimeMillis();

	        long tempoDeExecucaoInsercao = fimInsercao - inicioInsercao;
	        long tempoDeExecucaoBusca = fimBusca - inicioBusca;

	        System.out.println("Tempo gasto com a Inserção: " + tempoDeExecucaoInsercao);
	        System.out.println("Tempo gasto com a Busca: " + tempoDeExecucaoBusca);
	    }

}
