package io.cxy.jcartadministrationback.dto.out;

public class AdministratorProfileOutDto {
    private Integer AdministratorId;

    private String userName;

    private String realName  ;

    private String email;

    private String avatarUrl;

    public Integer getAdministratorId() {
        return AdministratorId;
    }

    public void setAdministratorId(Integer administratorId) {
        AdministratorId = administratorId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
