package com.task.asset.enums;

public enum EnumExpiration {
    YES("YES"),
    NO("NO");

    final String expirationValue;

    public String getExpirationValue() {
        return expirationValue;
    }

    EnumExpiration(String expirationValue) {
        this.expirationValue = expirationValue;
    }

    public static EnumExpiration valueCheck(String value){
        for (EnumExpiration a : values()){
            if(a.getExpirationValue().equals(value)){
                return a;
            }
        }
        return null;
    }
}
