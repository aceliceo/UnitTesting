package com.example.adalberto.unittest;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Adalberto on 5/18/2016.
 */
public class UserPreferences {
    public static final String USER_PREFERENCES = "user_preferences";
    public static final String USER_NAME = "user_name";
    public static final String LAST_NAME = "last_name";
    public static final String BIRTH_DATE = "birth_date";
    public static final String GENDER = "gender";

    public UserPreferences(){

    }

    public static SharedPreferences getSettings(Context context) {
        return context.getSharedPreferences(USER_PREFERENCES, Context.MODE_PRIVATE);
    }

    public static SharedPreferences.Editor getSettingsEditor(Context context) {
        return getSettings(context).edit();
    }

    public static SharedPreferences.Editor getSettingsEditor(SharedPreferences preferences){
        return preferences.edit();
    }

    public static void setUserName(Context context, String name) {
        SharedPreferences.Editor perfs = getSettings(context).edit();
        perfs.putString(USER_NAME, name).commit();
    }

//    public static void setUserName(Context context, String name) {
//        getSettingsEditor(context).putString(USER_NAME, name).commit();
//    }

    public static String getUserName(Context context) {
        return getSettings(context).getString(USER_NAME, "");
    }

    public static void setLastName(Context context, String lastname) {
        getSettingsEditor(context).putString(LAST_NAME, lastname).commit();
    }

    public static String getLastName(Context context) {
        return getSettings(context).getString(LAST_NAME, "");
    }

    public static void setBirthDate(Context context, String birthdate) {
        getSettingsEditor(context).putString(BIRTH_DATE, birthdate).commit();
    }

    public static String getBirthDategetUserName(Context context) {
        return getSettings(context).getString(BIRTH_DATE, "");
    }

    public static void setGender(Context context, String gender) {
        getSettingsEditor(context).putString(GENDER, gender).commit();
    }

    public static String getGender(Context context) {
        return getSettings(context).getString(GENDER, "");
    }
}
