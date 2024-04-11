package fun.digitallpepper.logistic_service.controller;

import lombok.Data;

@Data
public class ConnectedNodesRequest {
    private String name1;
    private String name2;
    private Long weight;
}