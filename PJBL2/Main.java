public class Main {
    public static void main(String[] args) {
    
        FileManager fm = new FileManager("./db/csv.csv");
        fm.lerArquivoScanner();
        fm.escreveArquivo();
    
    }
}
