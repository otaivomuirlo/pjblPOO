import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    private String caminhoArquivo;

    public FileManager(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public void lerArquivoScanner(){

        File file = new File(caminhoArquivo);
        try {
            Scanner scanner = new Scanner(file);
            String cabecalho = scanner.nextLine();
            System.out.println(cabecalho);
            while (scanner.hasNextLine()){
                String dado = scanner.nextLine();
                Scanner dadoSeparado = new Scanner(dado).useDelimiter(",");
                System.out.println("ID "+ dadoSeparado.nextInt());
                System.out.println("Nome "+ dadoSeparado.next());
                System.out.println("Preco "+ dadoSeparado.nextDouble());
                dadoSeparado.close();
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void escreveArquivo(){
        try {
            FileWriter writer = new FileWriter("arquivo.txt");
            writer.write("1 linha\n2 linha");
            writer.append("\nFim do arquivo");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
