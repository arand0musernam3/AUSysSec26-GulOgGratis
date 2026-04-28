package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.measurement.w5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11050b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11051a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f11051a = 0;
            setResult(i12, intent);
            if (booleanExtra) {
                qz.g gVarE = qz.g.e(this);
                if (i12 == -1) {
                    w5 w5Var = gVarE.f37348n;
                    w5Var.sendMessage(w5Var.obtainMessage(3));
                } else if (i12 == 0) {
                    gVarE.j(new pz.b(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i11 == 2) {
            this.f11051a = 0;
            setResult(i12, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f11051a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f11051a = bundle.getInt("resolution");
        }
        if (this.f11051a == 1) {
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            i0.h(num);
            AlertDialog alertDialogC = GoogleApiAvailability.f11044d.c(this, num.intValue(), 2, this);
            if (alertDialogC != null) {
                GoogleApiAvailability.g(this, alertDialogC, "GooglePlayServicesErrorDialog", this);
            }
            this.f11051a = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f11051a = 1;
            } catch (ActivityNotFoundException e5) {
                e = e5;
                if (extras.getBoolean("notify_manager", true)) {
                    qz.g.e(this).j(new pz.b(22, null, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String string = pendingIntent.toString();
                    String strN = e0.f.n(new StringBuilder(string.length() + 36), "Activity not found while launching ", string, ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strN = strN.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", strN, e);
                }
                googleApiActivity.f11051a = 1;
                finish();
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        } catch (ActivityNotFoundException e12) {
            e = e12;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e13) {
            e = e13;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f11051a);
        super.onSaveInstanceState(bundle);
    }
}
