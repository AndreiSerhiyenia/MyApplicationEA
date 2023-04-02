package com.wm.myapplicationea.dto;

import java.io.Serializable;

public class RegistrationDto implements Serializable {
    private String login;
    private String haslo;
    private String haslo2;
    public RegistrationDto(String login, String haslo, String haslo2) {
        this.login = login;
        this.haslo = haslo;
        this.haslo2 = haslo2;
    }

    public String getLogin() { return login; }

    public String getHaslo() { return haslo; }

    public String getHaslo2() { return haslo2; }

    public boolean isHasloEquals(){
        return haslo != null && haslo2 != null
                && !haslo.isEmpty() && !haslo2.isEmpty()
                && haslo.equals(haslo2);
    }

    public boolean hasFieldsFilled(){
        return login != null && !login.isEmpty()
                && haslo != null && !haslo.isEmpty()
                && haslo2 != null && !haslo2.isEmpty();
    }
}