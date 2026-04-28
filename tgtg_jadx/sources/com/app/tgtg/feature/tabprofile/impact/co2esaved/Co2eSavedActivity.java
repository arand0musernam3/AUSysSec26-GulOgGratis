package com.app.tgtg.feature.tabprofile.impact.co2esaved;

import a70.a;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import cv.i;
import k.g;
import k.h;
import kotlin.jvm.internal.Reflection;
import lv.s;
import mr.e;
import o30.f0;
import p70.b;
import pm.m;
import r70.c;
import u3.d;
import zz.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class Co2eSavedActivity extends h implements c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f9306g = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f9307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9308c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9309d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n1 f9310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f9311f;

    public Co2eSavedActivity() {
        addOnContextAvailableListener(new g(this, 21));
        this.f9310e = new n1(Reflection.getOrCreateKotlinClass(uq.e.class), new uq.b(this, 1), new uq.b(this, 0), new uq.b(this, 2));
        this.f9311f = new e(this, 11);
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
        f0.S(this, false);
        A(bundle);
        a.t(this, s.B);
        getOnBackPressedDispatcher().a(this.f9311f);
        n1 n1Var = this.f9310e;
        ((uq.e) n1Var.getValue()).f41501b.b(i.SCREEN_CO2_SAVED);
        e.f.a(this, new d(new m(this, 16), true, -1452896020));
        uq.e eVar = (uq.e) n1Var.getValue();
        v80.f0.B(m1.d(eVar), null, null, new uq.d(eVar, null), 3);
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        z().b();
    }

    public final b z() {
        if (this.f9307b == null) {
            synchronized (this.f9308c) {
                try {
                    if (this.f9307b == null) {
                        this.f9307b = new b(this);
                    }
                } finally {
                }
            }
        }
        return this.f9307b;
    }
}
