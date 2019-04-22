package com.princeodzalasapp.fr.wmlibraryandroidx.models;

import com.chad.library.adapter.base.entity.MultiItemEntity;

public class MultipleItem implements MultiItemEntity {

    public static final int LISTE_NORMAL = 1;
    public static final int PUB_HAUT = 2;
    public static final int PUB_BAS = 3;
    public static final int PUB_MILIEU = 4;
    public static final int LIST_ESPACE = 5;
    public static final int LIST_ACTUS = 6;
    public static final int LIST_VIDEO = 7;
    public static final int LISTE_NORMAL_ICON = 8;
    public static final int LISTE_NORMAL_IMAGE = 9;
    public static final int TEXT_NORMAL = 10;
    public static final int TEXT_NORMAL_BLANC = 11;
    public static final int TEXT_IMAGE = 12;
    public static final int TEXT_IMAGE_BLANC = 13;
    public static final int CARD_RECYCLER = 14;
    public static final int CARD_IMAGE = 15;
    public static final int CARD_IMAGE_TITRE = 16;
    public static final int TEXT_ICON = 17;
    public static final int TEXT_ICON_BLANC = 18;
    public static final int LIGNE_100= 20;
    public static final int LIGNE_85= 21;
    public static final int CHIPS = 22;
    public static final int CHIPS_BADGE = 23;

    // Publicités
    public static final int PUB_FB_NATIF = 100;
    public static final int PUB_ADMOB_BARNIERRE = 101;
    public static final int PUB_ADMOB_LARGE_BANNER = 102;
    public static final int PUB_ADMOB_MEDIUM_RECTANGLE = 103;
    public static final int PUB_ADMOB_SMART_BANNER = 104;

    private MyActus mActus;
    private MyVideo mVideo;
    private MyListe mListe;
    private MyListeIcon mListeIcon;
    private MyListeUrl mListeUrl;
    private String mtext;
    private int itemType;

    public MultipleItem(int itemType, String mtext) {
        this.mtext = mtext;
        this.itemType = itemType;
    }
    public MultipleItem(int itemType, MyActus mActus) {
        this.mActus = mActus;
        this.itemType = itemType;
    }
    public MultipleItem(int itemType, MyVideo mVideo) {
        this.mVideo = mVideo;
        this.itemType = itemType;
    }
    public MultipleItem(int itemType, MyListe mListe) {
        this.mListe = mListe;
        this.itemType = itemType;
    }
    public MultipleItem(int itemType, MyListeIcon mListeIcon) {
        this.mListeIcon = mListeIcon;
        this.itemType = itemType;
    }
    public MultipleItem(int itemType, MyListeUrl mListeUrl) {
        this.mListeUrl = mListeUrl;
        this.itemType = itemType;
    }
    public MultipleItem(int itemType) {
        this.itemType = itemType;
    }

    public String getText() {
        return mtext;
    }
    public MyActus getActus() {
        return mActus;
    }
    public MyVideo getVideo() {
        return mVideo;
    }
    public MyListe getListe() {
        return mListe;
    }
    public MyListeIcon getListeIcon() {
        return mListeIcon;
    }
    public MyListeUrl getListeUrl() {
        return mListeUrl;
    }

    @Override
    public int getItemType() {
        return itemType;
    }

}

