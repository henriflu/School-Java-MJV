package com.mjvschool.atracao.util;
import java.lang.String;

public class TextoUtil {
	public static String preencher(String textoOriginal, int tamanhoMaximo) {
		String formato = "%-" + tamanhoMaximo + "s";
		String novaString = String.format(formato, textoOriginal);
		return novaString;
	}
	public static String cortar(String textoOriginal, int tamanhoMaximo) {
		String  novaString = textoOriginal.substring(0, Math.min(tamanhoMaximo, textoOriginal.length()));
		return novaString;
	}
	public static String ajustar(String textoOriginal, int tamanhoMaximo) {
		String novaString = preencher(textoOriginal, tamanhoMaximo);
		novaString = cortar(novaString, tamanhoMaximo);
		return novaString;
	}
        
        public static String converter(long numero){
                
                String str = String.valueOf(numero);
                return str;
        }
        
        public static String tirarCaracteres(String cep){
            cep = cep.replaceAll("\\D","");
               return cep;
        }

        
	public static void main(String[] args) {
		String nomeCompleto = "Gleyson Sampaio de Oliveira";
		System.out.println(cortar(nomeCompleto, 30));
	}
}
