package service;

import model.IDownload;

public class DownloadService implements IDownload{

    @Override
    public void DownloadValidation(String name, String isPremium, int ID, String musica) {
        System.out.println("Usuário " + isPremium + " o Seu download da musica: " + musica + ", Está Sendo executado! "
        );
    }
}
