package setAndmap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class exercicio {

	public static void main(String[] args) {
		
		Map<String, Integer> votos =  new TreeMap<>();
		
		String path = "caminho do arquivo";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] campos = line.split(",");
				String nome = campos[0];
				int count = Integer.parseInt(campos[1]);
				
				if (votos.containsKey(nome)) {
					votos.put(nome, count + votos.get(nome));
				} else {
					votos.put(nome, count);
				}
				
				line = br.readLine();
			}
			
			for (String key : votos.keySet()) {
				System.out.println();
			}
			
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
	}

}
