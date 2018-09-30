package com.example.jonathan.pokedex;

import java.util.UUID;

public class Pokemon {

    // The ID of this Pokemon
    private UUID mID;
    // Name, Information, and Stats
    private int mImage;
    private String mName;
    private String mType;
    private float mWeight;
    private float mHeight;
    private int mHP;
    private int mAttack;
    private int mDefense;
    private int mSpAttack;
    private int mSpDefense;
    private int mSpeed;

    public Pokemon() {
        mID = UUID.randomUUID();
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int image) {
        mImage = image;
    }

    public UUID getID() {
        return mID;
    }

    public void setID(UUID ID) {
        mID = ID;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public float getWeight() {
        return mWeight;
    }

    public void setWeight(float weight) {
        mWeight = weight;
    }

    public float getHeight() {
        return mHeight;
    }

    public void setHeight(float height) {
        mHeight = height;
    }

    public int getHP() {
        return mHP;
    }

    public void setHP(int HP) {
        mHP = HP;
    }

    public int getAttack() {
        return mAttack;
    }

    public void setAttack(int attack) {
        mAttack = attack;
    }

    public int getDefense() {
        return mDefense;
    }

    public void setDefense(int defense) {
        mDefense = defense;
    }

    public int getSpAttack() {
        return mSpAttack;
    }

    public void setSpAttack(int spAttack) {
        mSpAttack = spAttack;
    }

    public int getSpDefense() {
        return mSpDefense;
    }

    public void setSpDefense(int spDefense) {
        mSpDefense = spDefense;
    }

    public int getSpeed() {
        return mSpeed;
    }

    public void setSpeed(int speed) {
        mSpeed = speed;
    }
}
