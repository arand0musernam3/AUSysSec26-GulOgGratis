package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.o0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import lz.b;
import lz.i;
import se.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@KeepName
public class SignInHubActivity extends o0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f11037g = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11038b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SignInConfiguration f11039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Intent f11042f;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f11038b) {
            return;
        }
        setResult(0);
        if (i11 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f11033b) != null) {
                i iVarH = i.H(this);
                GoogleSignInOptions googleSignInOptions = this.f11039c.f11036b;
                synchronized (iVarH) {
                    ((b) iVarH.f28446b).c(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f11040d = true;
                this.f11041e = i12;
                this.f11042f = intent;
                getSupportLoaderManager().c(0, new d(this, 28));
                f11037g = false;
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                z(intExtra);
                return;
            }
        }
        z(8);
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            z(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            z(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f11039c = signInConfiguration;
        if (bundle != null) {
            boolean z11 = bundle.getBoolean("signingInGoogleApiClients");
            this.f11040d = z11;
            if (z11) {
                this.f11041e = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 == null) {
                    Log.e("AuthSignInClient", "Sign in result data cannot be null");
                    setResult(0);
                    finish();
                    return;
                } else {
                    this.f11042f = intent2;
                    getSupportLoaderManager().c(0, new d(this, 28));
                    f11037g = false;
                    return;
                }
            }
            return;
        }
        if (f11037g) {
            setResult(0);
            z(12502);
            return;
        }
        f11037g = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.f11039c);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f11038b = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            z(17);
        }
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f11037g = false;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f11040d);
        if (this.f11040d) {
            bundle.putInt("signInResultCode", this.f11041e);
            bundle.putParcelable("signInResultData", this.f11042f);
        }
    }

    public final void z(int i11) {
        Status status = new Status(i11, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f11037g = false;
    }
}
