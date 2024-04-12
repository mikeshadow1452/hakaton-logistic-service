package fun.digitallpepper.logistic_service.controller;

import fun.digitallpepper.logistic_service.model.RegionNode;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class EdgeRequest {

    private String region1;  // Первый регион
    private String region2;  // Второй регион
    private Long weight;

}

