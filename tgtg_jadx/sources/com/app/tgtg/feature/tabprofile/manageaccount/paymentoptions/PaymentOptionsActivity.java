package com.app.tgtg.feature.tabprofile.manageaccount.paymentoptions;

import android.os.Bundle;
import androidx.activity.e0;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import k.g;
import k.h;
import kotlin.jvm.internal.Reflection;
import ks.a;
import ks.e;
import o30.f0;
import p70.b;
import r70.c;
import u3.d;
import zz.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class PaymentOptionsActivity extends h implements c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f9428g = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f9429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9430c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9431d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n1 f9432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e0 f9433f;

    public PaymentOptionsActivity() {
        addOnContextAvailableListener(new g(this, 1));
        this.f9432e = new n1(Reflection.getOrCreateKotlinClass(ks.h.class), new e(this, 1), new e(this, 0), new e(this, 2));
        this.f9433f = new e0(this, 27);
    }

    public final b A() {
        if (this.f9429b == null) {
            synchronized (this.f9430c) {
                try {
                    if (this.f9429b == null) {
                        this.f9429b = new b(this);
                    }
                } finally {
                }
            }
        }
        return this.f9429b;
    }

    public final ks.h B() {
        return (ks.h) this.f9432e.getValue();
    }

    public final void C(Bundle bundle) {
        super.onCreate(bundle);
        A().d();
    }

    @Override // r70.b
    public final Object a() {
        return A().a();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return f.q(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f0.S(this, false);
        C(bundle);
        getOnBackPressedDispatcher().a(this.f9433f);
        e.f.a(this, new d(new a(this), true, 495839600));
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        A().b();
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        super.onResume();
        ks.h hVarB = B();
        v80.f0.B(m1.d(hVarB), null, null, new gf.g(hVarB, null, 21), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0327  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(m3.n r41, int r42) {
        /*
            Method dump skipped, instruction units count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.feature.tabprofile.manageaccount.paymentoptions.PaymentOptionsActivity.z(m3.n, int):void");
    }
}
