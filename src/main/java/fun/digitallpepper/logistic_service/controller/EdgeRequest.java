package fun.digitallpepper.logistic_service.controller;

import lombok.Data;

@Data
public class EdgeRequest {

    private String region1;  // Первый регион
    private String region2;  // Второй регион
    private Integer weight;
    private Integer distance; // Расстояние
    private Integer time; // Скорость (например, в км/ч)

}

