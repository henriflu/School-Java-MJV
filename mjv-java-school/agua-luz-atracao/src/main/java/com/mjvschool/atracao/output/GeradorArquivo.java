package com.mjvschool.atracao.output;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.lang.String;
import com.mjvschool.atracao.model.contrato.Contrato;
import com.mjvschool.atracao.util.TextoUtil;
import static javafx.beans.binding.Bindings.concat;

public class GeradorArquivo {
	public void gerarArquivoCsv(List<Contrato> contratos) {
		StringBuilder conteudo =new StringBuilder();
		for(Contrato ct: contratos) {
			conteudo.append(ct.getCadastro().getNome().concat(";").concat(ct.getCadastro().getCpf()));
			conteudo.append("\n");
		}
		
		System.out.println(conteudo.toString());
		
		File output = new File("C:\\Estudo\\School-Java-MJV\\mjv-java-school\\agua-luz-output");
		if(!output.exists())
			output.mkdirs();
		
		Path path = Paths.get("C:\\Estudo\\School-Java-MJV\\mjv-java-school\\agua-luz-output\\agua-luz-contratos.csv");

		try {
			Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void gerarArquivoTxt(List<Contrato> contratos) {
		StringBuilder conteudo =new StringBuilder();
		
		for(Contrato ct: contratos) {
			conteudo.append(ct.getCadastro().getCpf()); 
			conteudo.append(TextoUtil.ajustar(ct.getCadastro().getNome(), 30));
			conteudo.append(ct.getCadastro().getCelular());
                        conteudo.append(TextoUtil.ajustar(ct.getCadastro().getEndereco().getLogradouro(), 20));
                        conteudo.append(TextoUtil.ajustar(ct.getCadastro().getEndereco().getNumero(), 10));
                        conteudo.append(TextoUtil.ajustar(ct.getCadastro().getEndereco().getBairro(), 15));
                        conteudo.append(TextoUtil.ajustar(ct.getCadastro().getEndereco().getCidade(), 20));
                        conteudo.append(TextoUtil.ajustar(ct.getCadastro().getEndereco().getEstado().toUpperCase(), 20));
                        conteudo.append(TextoUtil.tirarCaracteres(ct.getCadastro().getEndereco().getCep()));
                        conteudo.append(TextoUtil.converter(ct.getNumeroProtocolo()));
                        
			conteudo.append("\n");
		}
		
		System.out.println(conteudo.toString());
		
		File output = new File("C:\\Estudo\\School-Java-MJV\\mjv-java-school\\agua-luz-output");
		if(!output.exists())
			output.mkdirs();
		
		Path path = Paths.get("C:\\Estudo\\School-Java-MJV\\mjv-java-school\\agua-luz-output\\agua-luz-contratos.txt");

		try {
			Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
