package com.artesaniashogar.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com#
    final String BucketName = "artesaniaselhogar-eb199.appspot.com";

    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "artesaniasSitioProyecto";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";

    //El nombre del archivo Json
    final String archivoJsonFile = "artesaniaselhogar-eb199-firebase-adminsdk-3g3v7-01155426af.json";
}
