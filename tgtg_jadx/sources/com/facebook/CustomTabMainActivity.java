package com.facebook;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import ax.a0;
import ax.r;
import cy.e0;
import cy.f0;
import d9.c;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import m1.a;
import oz.m;
import tx.d;
import tx.h0;
import tx.j;
import tx.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class CustomTabMainActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10978c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10979a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f10980b;

    public final void a(int i11, Intent intent) {
        Bundle bundle;
        d dVar = this.f10980b;
        if (dVar != null) {
            c.a(this).d(dVar);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
            if (stringExtra != null) {
                Uri uri = Uri.parse(stringExtra);
                bundle = n0.C(uri.getQuery());
                bundle.putAll(n0.C(uri.getFragment()));
            } else {
                bundle = new Bundle();
            }
            Intent intent2 = getIntent();
            intent2.getClass();
            Intent intentE = h0.e(intent2, bundle, null);
            if (intentE != null) {
                intent = intentE;
            }
            setResult(i11, intent);
        } else {
            Intent intent3 = getIntent();
            intent3.getClass();
            setResult(i11, h0.e(intent3, null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        f0 f0Var;
        a aVar;
        m mVarC;
        boolean z11;
        Uri uriA;
        super.onCreate(bundle);
        if (Intrinsics.areEqual("CustomTabActivity.action_customTabRedirect", getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle != null || (stringExtra = getIntent().getStringExtra("CustomTabMainActivity.extra_action")) == null) {
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra("CustomTabMainActivity.extra_params");
        String stringExtra2 = getIntent().getStringExtra("CustomTabMainActivity.extra_chromePackage");
        e0 e0Var = f0.Companion;
        String stringExtra3 = getIntent().getStringExtra("CustomTabMainActivity.extra_targetApp");
        e0Var.getClass();
        f0[] f0VarArrValues = f0.values();
        int length = f0VarArrValues.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                f0Var = f0.FACEBOOK;
                break;
            }
            f0Var = f0VarArrValues[i11];
            if (Intrinsics.areEqual(f0Var.toString(), stringExtra3)) {
                break;
            } else {
                i11++;
            }
        }
        if (r.$EnumSwitchMapping$0[f0Var.ordinal()] == 1) {
            aVar = new tx.e0(bundleExtra, stringExtra);
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            if (Intrinsics.areEqual(stringExtra, "oauth")) {
                uriA = n0.a(j.e(), "oauth/authorize", bundleExtra);
            } else {
                uriA = n0.a(j.e(), a0.d() + "/dialog/" + stringExtra, bundleExtra);
            }
            if (!yx.a.f46339a.contains(aVar)) {
                try {
                    aVar.f28697a = uriA;
                } catch (Throwable th2) {
                    yx.a.a(aVar, th2);
                }
            }
        } else {
            aVar = new a(bundleExtra, stringExtra);
        }
        if (yx.a.f46339a.contains(aVar)) {
            z11 = false;
        } else {
            try {
                ReentrantLock reentrantLock = cy.d.f13494d;
                reentrantLock.lock();
                t5.a aVar2 = cy.d.f13493c;
                cy.d.f13493c = null;
                reentrantLock.unlock();
                mVarC = new ae.c(aVar2).c();
                ((Intent) mVarC.f33836b).setPackage(stringExtra2);
            } catch (Throwable th3) {
                yx.a.a(aVar, th3);
            }
            try {
                Uri uri = (Uri) aVar.f28697a;
                Intent intent = (Intent) mVarC.f33836b;
                intent.setData(uri);
                startActivity(intent, (Bundle) mVarC.f33837c);
                z11 = true;
            } catch (ActivityNotFoundException unused) {
                z11 = false;
            }
        }
        this.f10979a = false;
        if (!z11) {
            setResult(0, getIntent().putExtra("CustomTabMainActivity.no_activity_exception", true));
            finish();
        } else {
            d dVar = new d(this, 4);
            this.f10980b = dVar;
            c.a(this).b(dVar, new IntentFilter("CustomTabActivity.action_customTabRedirect"));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        if (Intrinsics.areEqual("CustomTabMainActivity.action_refresh", intent.getAction())) {
            c.a(this).c(new Intent("CustomTabActivity.action_destroy"));
            a(-1, intent);
        } else if (Intrinsics.areEqual("CustomTabActivity.action_customTabRedirect", intent.getAction())) {
            a(-1, intent);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f10979a) {
            a(0, null);
        }
        this.f10979a = true;
    }
}
