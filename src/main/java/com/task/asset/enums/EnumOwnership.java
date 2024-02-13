package com.task.asset.enums;

public enum EnumOwnership {
    OWN("OWN"),
    RENTAL("RENTAL");

String value;

    public String getValue() {
        return value;
    }

    EnumOwnership(String value) {
        this.value = value;
    }

    public static EnumOwnership valueCheck(String value){
        for (EnumOwnership a : values()){
            if(a.getValue().equals(value)){
                return a;
            }
        }
        return null;
    }
}
