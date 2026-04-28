package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0;
import ax.a0;
import com.app.tgtg.R;
import cy.v;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import tx.h0;
import tx.l;
import yx.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/FacebookActivity;", "Landroidx/fragment/app/o0;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class FacebookActivity extends o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10981c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Fragment f10982b;

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (a.f46339a.contains(this)) {
            return;
        }
        try {
            str.getClass();
            printWriter.getClass();
            super.dump(str, fileDescriptor, printWriter, strArr);
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.f10982b;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Fragment fragment;
        FacebookException facebookException;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!a0.f4864q.get()) {
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            a0.i(applicationContext);
        }
        setContentView(R.layout.com_facebook_activity_layout);
        if (!Intrinsics.areEqual("PassThrough", intent.getAction())) {
            Intent intent2 = getIntent();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag("SingleFragment");
            Fragment fragment2 = fragmentFindFragmentByTag;
            if (fragmentFindFragmentByTag == null) {
                if (Intrinsics.areEqual("FacebookDialogFragment", intent2.getAction())) {
                    l lVar = new l();
                    lVar.setRetainInstance(true);
                    lVar.show(supportFragmentManager, "SingleFragment");
                    fragment = lVar;
                } else {
                    v vVar = new v();
                    vVar.setRetainInstance(true);
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                    aVar.e(R.id.com_facebook_fragment_container, vVar, "SingleFragment", 1);
                    aVar.d();
                    fragment = vVar;
                }
                fragment2 = fragment;
            }
            this.f10982b = fragment2;
            return;
        }
        Intent intent3 = getIntent();
        intent3.getClass();
        Bundle bundleI = h0.i(intent3);
        if (a.f46339a.contains(h0.class) || bundleI == null) {
            facebookException = null;
        } else {
            try {
                String string = bundleI.getString("error_type");
                if (string == null) {
                    string = bundleI.getString("com.facebook.platform.status.ERROR_TYPE");
                }
                String string2 = bundleI.getString("error_description");
                if (string2 == null) {
                    string2 = bundleI.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
                }
                facebookException = (string == null || !string.equalsIgnoreCase("UserCanceled")) ? new FacebookException(string2) : new FacebookOperationCanceledException(string2);
            } catch (Throwable th2) {
                a.a(h0.class, th2);
                facebookException = null;
            }
        }
        Intent intent4 = getIntent();
        intent4.getClass();
        setResult(0, h0.e(intent4, null, facebookException));
        finish();
    }
}
