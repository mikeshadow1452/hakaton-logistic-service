package fun.digitallpepper.logistic_service.service;

import fun.digitallpepper.logistic_service.model.RegionNode;

import java.util.HashMap;

public interface RegionNodeServise {
    RegionNode addRegionNode(Integer id);
    RegionNode getRegionNode(Integer id);
    RegionNode getRegionNode(String name);


}
