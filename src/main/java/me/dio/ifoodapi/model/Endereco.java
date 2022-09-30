package me.dio.ifoodapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Endereco {
    private String cep;
    private String complemento;
}
