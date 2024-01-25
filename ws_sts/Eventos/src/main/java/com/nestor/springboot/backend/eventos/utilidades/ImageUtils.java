package com.nestor.springboot.backend.eventos.utilidades;


import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Component;

@Component
public class ImageUtils {
	public String saveImageBase64(String dir, String imageB64) {
	    // Divide la cadena base64 en dos partes: "data:image/png;base64," y los datos reales de la imagen.
	    String[] parts = imageB64.split(",");
	    
	    // Selecciona la segunda parte si existe, de lo contrario, toma la primera parte.
	    String base64 = parts.length > 1 ? parts[1] : parts[0];
	    
	    // Genera un nombre de archivo único basado en la marca de tiempo actual y la extensión .png.
	    String fileName = System.currentTimeMillis() + ".png";
	    
	    // Declara variables para almacenar la imagen y sus bytes.
	    BufferedImage image;
	    byte[] imageByte = Base64.getDecoder().decode(base64);
	    
	    try {
	        // Crea un objeto Path para el directorio donde se almacenará la imagen.
	        Path pathDir = Paths.get("public", "images", dir);
	        
	        // Verifica si el directorio existe; si no, créalo.
	        if (!Files.exists(pathDir)) {
	            Files.createDirectory(pathDir);	        	        	
	        }
	        
	        // Lee la imagen desde los bytes decodificados.
	        image = ImageIO.read(new ByteArrayInputStream(imageByte));
	        
	        // Crea un objeto Path para la ubicación completa del archivo de imagen.
	        Path path = Paths.get("public", "images", dir, fileName);
	        
	        // Escribe la imagen en el archivo en el sistema de archivos.
	        ImageIO.write(image, "png", path.toFile());
	        
	        // Retorna la ruta relativa del archivo de imagen recién guardado.
	        return "images" + "/" + dir + "/" + fileName;
	    } catch (IOException e) {
	        // En caso de error al procesar la imagen, imprime el mensaje de error.
	        System.err.println(e.getMessage());
	        
	        // Retorna una cadena vacía en caso de error.
	        return "";
	    }
	}
	
	public boolean deleteImage(String dir, String nombre) {
		try {
			Path path = Paths.get(dir, nombre);
			Files.deleteIfExists(path);
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}		
	}
}