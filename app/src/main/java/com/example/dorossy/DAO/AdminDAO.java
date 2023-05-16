package com.example.dorossy.DAO;

import com.example.dorossy.Models.Admin;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class AdminDAO {

    private DatabaseReference myRef;

    public AdminDAO() {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        myRef = db.getReference(Admin.class.getSimpleName());
    }


    // Add Admin...
    public Task<Void> add(Admin admin) {
        return myRef.push().setValue(admin);
    }

    // Update Admin...
    public Task<Void> update(String key, HashMap<String ,Object> hashMap) {
        return myRef.child(key).updateChildren(hashMap);
    }

    // Remove Admin...
    public Task<Void> remove(String key) {
        return myRef.child(key).removeValue();
    }
}
