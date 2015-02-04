package com.example.ssh;

import java.io.File;

public class SshConfig {

    private File privateKeyFile;
    private byte[] privateKeyPhrase;
    private String username;
    private String privateKeyFilePassword;
    private String userPassword;

    public File getPrivateKeyFile() {
        return privateKeyFile;
    }

    public void setPrivateKeyFile(File privateKeyFile) {
        this.privateKeyFile = privateKeyFile;
    }

    public byte[] getPrivateKeyPhrase() {
        return privateKeyPhrase;
    }

    public void setPrivateKeyPhrase(byte[] privateKeyPhrase) {
        this.privateKeyPhrase = privateKeyPhrase;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPrivateKeyFilePassword() {
        return privateKeyFilePassword;
    }

    public void setPrivateKeyFilePassword(String privateKeyFilePassword) {
        this.privateKeyFilePassword = privateKeyFilePassword;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

}
