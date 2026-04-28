package com.app.tgtg.feature.login.onboarding;

import ah.m;
import android.os.Bundle;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.app.tgtg.R;
import e40.a;
import gl.l;
import k.h;
import o30.f0;
import p70.b;
import r70.c;
import zz.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class OnboardingActivity extends h implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f9054e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f9055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9056c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9057d = false;

    public OnboardingActivity() {
        addOnContextAvailableListener(new m(this, 17));
    }

    public final void A(Bundle bundle) {
        super.onCreate(bundle);
        z().d();
    }

    @Override // r70.b
    public final Object a() {
        return z().a();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return f.q(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        A(bundle);
        setContentView(R.layout.onboarding_activity);
        f0.S(this, false);
        ViewCompat.k0(findViewById(android.R.id.content), new a(21));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.f(R.id.frameLayout, new l(), null);
        aVar.d();
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        z().b();
    }

    public final b z() {
        if (this.f9055b == null) {
            synchronized (this.f9056c) {
                try {
                    if (this.f9055b == null) {
                        this.f9055b = new b(this);
                    }
                } finally {
                }
            }
        }
        return this.f9055b;
    }
}
