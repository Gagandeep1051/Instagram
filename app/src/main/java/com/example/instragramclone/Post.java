package com.example.instragramclone;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

import org.parceler.Parcel;

//@Parcel(analyze={Post.class})
@ParseClassName("Post")
public class Post extends ParseObject {

    public static final String KEY_DESCRIPTION = "Description";
    public static final String KEY_IMAGE ="Image";
    public static final String KEY_USER="User";

    public Post(){ }

    public String getDescription(){
        return getString(KEY_DESCRIPTION);
    }

    public void setDescription(String Description){
        put(KEY_DESCRIPTION, Description);
    }
    public ParseFile getImage(){
        return getParseFile(KEY_IMAGE);

    }
    public void setImage(ParseFile parseFile){
        put(KEY_IMAGE, parseFile);
    }



    public ParseUser getUser(){
        return getParseUser(KEY_USER);
    }
    public void setUser(ParseUser User){
        put(KEY_USER, User);
    }


}
