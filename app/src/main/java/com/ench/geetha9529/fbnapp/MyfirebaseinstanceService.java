package com.ench.geetha9529.fbnapp;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by enchanter20 on 4/7/17.
 */

public class MyfirebaseinstanceService extends FirebaseInstanceIdService {
    private static final String REG_TOKENN="REG_TOKENN";

    @Override
    public void onTokenRefresh()
    {
        String recent_token= FirebaseInstanceId.getInstance().getToken();
        Log.d(REG_TOKENN,recent_token);


    }


}
