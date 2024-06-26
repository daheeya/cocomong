package com.sw.cocomong.Object;

public class FoodObj {
    private String username;
    private String refname;
    private String foodname;
    private String expiredate;
    private String category;
    private String memo;
    private String favorite;

    public FoodObj(String username, String refname,String foodname, String expiredate, String category, String memo, String favorite){
        this.username=username;
        this.refname=refname;
        this.foodname=foodname;
        this.expiredate=expiredate;
        this.category=category;
        this.memo=memo;
        this.favorite=favorite;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRefname() {
        return refname;
    }

    public void setRefname(String refname) {
        this.refname = refname;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getExpiredate() {
        return expiredate;
    }

    public void setExpiredate(String expiredate) {
        this.expiredate = expiredate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }
}
