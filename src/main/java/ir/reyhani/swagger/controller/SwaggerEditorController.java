package ir.reyhani.swagger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwaggerEditorController {

    @GetMapping("/swagger-editor")
    public String swaggerEditor() {
        return "swagger-editor/index.html";  // Assuming swagger-editor is in static folder
    }
}