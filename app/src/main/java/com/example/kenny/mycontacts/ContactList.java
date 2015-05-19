package com.example.kenny.mycontacts;

import java.util.ArrayList;

/**
 * Created by Kenny on 15-05-19.
 */
public class ContactList extends ArrayList<Contact> {
    private static ContactList sInstance = null;

    private ContactList() {}

    public static ContactList getInstance() {
        if (sInstance == null){
            sInstance = new ContactList();
        }
        return sInstance;
    }

}
