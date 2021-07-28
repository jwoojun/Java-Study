package com.example.ttd;

import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Member;

@Getter @Setter
public class Study {
    private final Status status = Status.DRAFT;
    private int limit;
    private String name;

    public Study(int limit, String name) {
        this.limit = limit;
        this.name = name;
    }

    public Study(int limit) {
        if(limit<0){
            throw new IllegalStateException("0보다 크거나 같아야 합니다.");
        }
        this.limit = limit;
    }
    public Study() {
    }


    public void setOwner(com.example.ttd.study.Member member_doesnt_exit) {
    }
}
