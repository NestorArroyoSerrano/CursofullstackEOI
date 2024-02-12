package com.nestor.springboot.backend.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

	@RequestMapping("/error")
    public String handleError() {
        // Lógica para manejar errores personalizados
        return "error"; // Asegúrate de tener una vista llamada "error" configurada en tu aplicación
    }

    public String getErrorPath() {
        return "/customError"; // Cambia la ruta si es necesario y asegúrate de tener una vista llamada "customError"
    }
}