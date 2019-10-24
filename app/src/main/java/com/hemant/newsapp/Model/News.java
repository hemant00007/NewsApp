package com.hemant.newsapp.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class News {

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("totalResult")
    @Expose
    private int  totalResult;


    @SerializedName("articles")
    @Expose
    private  List<Articles> articles;

    public News(String status, int totalResult, List<Articles> articles) {
        this.status = status;
        this.totalResult = totalResult;
        this.articles = articles;
    }
}
