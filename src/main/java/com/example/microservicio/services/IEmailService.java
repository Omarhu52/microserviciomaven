package com.example.microservicio.services;

import com.example.microservicio.services.models.CorreoRequest;

public interface IEmailService {
    void enviarCorreo(CorreoRequest correoRequest);
}
