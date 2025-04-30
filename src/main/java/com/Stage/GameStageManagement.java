package com.Stage;

import com.Stage.impl.Forest;

import java.util.ArrayList;
import java.util.List;

public class GameStageManagement {
    //逻辑管理地图池
    private List<mapStage> mapStages = new ArrayList<>();
    public GameStageManagement() {
        mapStages.add(new Forest());
    }
    public int getMapBySId(int id){
        for (mapStage mapStage : mapStages) {
            if (mapStage.getStageId() == id) {
                return mapStage.getStageId();
            }
        }
        return 0;
    }
    public int getMapByName(String name){
        for (mapStage mapStage : mapStages) {
            if (mapStage.getStageName().equals(name)) {
                return mapStage.getStageId();
            }
        }
        return 0;
    }

    public List<mapStage> getMapStages() {
        return mapStages;
    }
}
