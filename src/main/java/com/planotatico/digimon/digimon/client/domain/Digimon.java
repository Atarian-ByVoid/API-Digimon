package com.planotatico.digimon.digimon.client.domain;

import java.util.List;

public class Digimon {

    private String name;
	private String level;
	private List<Digimon> digimon;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public List<Digimon> getDigimon() {
        return digimon;
    }
    public void setDigimon(List<Digimon> digimon) {
        this.digimon = digimon;
    }
    
}
