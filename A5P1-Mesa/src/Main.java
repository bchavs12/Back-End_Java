import model.Usuario;
import service.ProxyServiceDownload;

public class Main {
    public static void main(String[] args) {
        ProxyServiceDownload proxy = new ProxyServiceDownload();

        Usuario p1 = new Usuario("Bruno","Premium",01,"three Little birds");
        proxy.DownloadValidation(p1.getName(), p1.getIsPremium(),p1.getID(),p1.getMusica());
    }
}