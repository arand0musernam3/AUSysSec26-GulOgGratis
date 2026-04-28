package com.app.tgtg.feature.rating;

import a3.f1;
import a70.a;
import ah.m;
import android.os.Bundle;
import androidx.activity.e0;
import androidx.lifecycle.ViewModelProvider$Factory;
import k.h;
import lv.s;
import o30.f0;
import p70.b;
import r70.c;
import u3.d;
import zz.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class RatingActivity extends h implements c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f9233f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f9234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9235c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9236d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0 f9237e;

    public RatingActivity() {
        addOnContextAvailableListener(new m(this, 3));
        this.f9237e = new e0(this, 1);
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
        getOnBackPressedDispatcher().a(this.f9237e);
        f0.S(this, false);
        a.t(this, s.B);
        e.f.a(this, new d(new f1(this, 6), true, -1180041715));
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        z().b();
    }

    public final b z() {
        if (this.f9234b == null) {
            synchronized (this.f9235c) {
                try {
                    if (this.f9234b == null) {
                        this.f9234b = new b(this);
                    }
                } finally {
                }
            }
        }
        return this.f9234b;
    }
}
