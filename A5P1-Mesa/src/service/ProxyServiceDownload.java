package service;

import model.IDownload;

public class ProxyServiceDownload implements IDownload {
    @Override
    public void DownloadValidation(String name, String isPremium, int ID, String musica) {
        if (isPremium.equals("Premium" )){
            DownloadService downloadService = new DownloadService();
            downloadService.DownloadValidation(name,isPremium,ID,musica);
            System.out.println("Download Finalizado!");
        } else{
            System.out.println("Você não pode fazer esse download, assine o Premium");
        }
    }
}
