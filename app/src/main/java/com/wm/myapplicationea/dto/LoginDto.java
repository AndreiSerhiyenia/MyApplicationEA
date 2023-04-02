package com.wm.myapplicationea.dto;

import java.io.Serializable;

public class LoginDto implements Serializable {
    private String login;
    private String haslo;

    public LoginDto(String login, String haslo) {
        this.login = login;
        this.haslo = haslo;
    }

    public String getLogin() {
        return login;
    }

    public String getHaslo() {
        return haslo;
    }
}
