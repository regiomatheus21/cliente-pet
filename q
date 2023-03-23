[1mdiff --git a/src/main/java/br/com/petz/clientepet/cliente/application/api/ClienteController.java b/src/main/java/br/com/petz/clientepet/cliente/application/api/ClienteController.java[m
[1mindex 0f0706e..a1ee2a7 100644[m
[1m--- a/src/main/java/br/com/petz/clientepet/cliente/application/api/ClienteController.java[m
[1m+++ b/src/main/java/br/com/petz/clientepet/cliente/application/api/ClienteController.java[m
[36m@@ -4,6 +4,9 @@[m [mimport lombok.RequiredArgsConstructor;[m
 import lombok.extern.log4j.Log4j2;[m
 import org.springframework.web.bind.annotation.RestController;[m
 import br.com.petz.clientepet.cliente.application.service.ClienteService;[m
[32m+[m
[32m+[m[32mimport java.util.List;[m
[32m+[m
 @RestController[m
 @Log4j2[m
 @RequiredArgsConstructor[m
[36m@@ -17,4 +20,12 @@[m [mpublic class ClienteController implements ClienteAPI{[m
         log.info("[finaliza] ClienteController - postCliente");[m
         return clienteCriado;[m
     }[m
[32m+[m
[32m+[m[32m    @Override[m
[32m+[m[32m    public List<ClientelistResponse> getTodosClientes() {[m
[32m+[m[32m        log.info("[inicia] ClienteController - getTodosClientes");[m
[32m+[m[32m        log.info("[Finaliza] ClienteController - getTodosClientes");[m
[32m+[m
[32m+[m[32m        return null;[m
[32m+[m[32m    }[m
 }[m
[1mdiff --git a/src/main/java/br/com/petz/clientepet/cliente/application/api/ClientelistResponse.java b/src/main/java/br/com/petz/clientepet/cliente/application/api/ClientelistResponse.java[m
[1mindex b16c1e6..78a5c45 100644[m
[1m--- a/src/main/java/br/com/petz/clientepet/cliente/application/api/ClientelistResponse.java[m
[1m+++ b/src/main/java/br/com/petz/clientepet/cliente/application/api/ClientelistResponse.java[m
[36m@@ -1,5 +1,11 @@[m
 package br.com.petz.clientepet.cliente.application.api;[m
 [m
[31m-public class ClientelistResponse {[m
[32m+[m[32mimport java.util.UUID;[m
 [m
[32m+[m[32mpublic class ClientelistResponse {[m
[32m+[m[32m    private UUID idCliente;[m
[32m+[m[32m    private String nomeCompleto;[m
[32m+[m[32m    private String cpf;[m
[32m+[m[32m    private String email;[m
[32m+[m[32m    private String celular;[m
 }[m
