package com.task.asset.enums;

public enum EnumStatus {
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE");

    String statusValue;

    EnumStatus(String statusValue) {
        this.statusValue = statusValue;
    }
}
