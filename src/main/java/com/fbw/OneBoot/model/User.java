package com.fbw.OneBoot.model;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.account_id
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.token
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    private String token;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gmt_Create
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gmt_Modicied
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    private Long gmtModicied;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.bio
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    private String bio;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.avatar_url
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    private String avatarUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.account_id
     *
     * @return the value of user.account_id
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.account_id
     *
     * @param accountId the value for user.account_id
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.token
     *
     * @return the value of user.token
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.token
     *
     * @param token the value for user.token
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gmt_Create
     *
     * @return the value of user.gmt_Create
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gmt_Create
     *
     * @param gmtCreate the value for user.gmt_Create
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gmt_Modicied
     *
     * @return the value of user.gmt_Modicied
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    public Long getGmtModicied() {
        return gmtModicied;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gmt_Modicied
     *
     * @param gmtModicied the value for user.gmt_Modicied
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    public void setGmtModicied(Long gmtModicied) {
        this.gmtModicied = gmtModicied;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.bio
     *
     * @return the value of user.bio
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    public String getBio() {
        return bio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.bio
     *
     * @param bio the value for user.bio
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    public void setBio(String bio) {
        this.bio = bio == null ? null : bio.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.avatar_url
     *
     * @return the value of user.avatar_url
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.avatar_url
     *
     * @param avatarUrl the value for user.avatar_url
     *
     * @mbg.generated Tue Apr 14 10:19:31 CST 2020
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }
}