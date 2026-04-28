package com.app.tgtg.feature.charity.ui.help;

import ah.m;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.n1;
import g3.y0;
import hi.a;
import hi.e;
import k.h;
import kotlin.jvm.internal.Reflection;
import o30.f0;
import p70.b;
import r70.c;
import u3.d;
import zz.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class CharityContactUsActivity extends h implements c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f8983f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f8984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8985c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8986d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n1 f8987e;

    public CharityContactUsActivity() {
        addOnContextAvailableListener(new m(this, 22));
        this.f8987e = new n1(Reflection.getOrCreateKotlinClass(e.class), new a(this, 1), new a(this, 0), new a(this, 2));
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
        f0.S(this, false);
        e.f.a(this, new d(new y0(this, 6), true, -185520093));
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        z().b();
    }

    public final b z() {
        if (this.f8984b == null) {
            synchronized (this.f8985c) {
                try {
                    if (this.f8984b == null) {
                        this.f8984b = new b(this);
                    }
                } finally {
                }
            }
        }
        return this.f8984b;
    }
}
