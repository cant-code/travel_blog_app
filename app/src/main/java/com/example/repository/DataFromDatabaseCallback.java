package com.example.repository;

import com.example.travelblog.Blog;

import java.util.List;

public interface DataFromDatabaseCallback {
    void onSuccess(List<Blog> blogList);
}
