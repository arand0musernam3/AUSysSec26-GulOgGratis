package com.app.tgtg.feature.tabprofile.manageaccount.specialrewards;

import android.os.Bundle;
import android.widget.Toast;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.n1;
import com.app.tgtg.R;
import k.g;
import k.h;
import kotlin.jvm.internal.Reflection;
import lk.a;
import mr.e;
import mv.r0;
import o30.f0;
import p70.b;
import r70.c;
import u3.d;
import zz.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class SpecialRewardsActivity extends h implements c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f9434g = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f9435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9436c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9437d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n1 f9438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f9439f;

    public SpecialRewardsActivity() {
        addOnContextAvailableListener(new g(this, 6));
        this.f9438e = new n1(Reflection.getOrCreateKotlinClass(ns.g.class), new ns.c(this, 1), new ns.c(this, 0), new ns.c(this, 2));
        this.f9439f = new e(this, 2);
    }

    public final ns.g A() {
        return (ns.g) this.f9438e.getValue();
    }

    public final void B(Bundle bundle) {
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
        B(bundle);
        getOnBackPressedDispatcher().a(this.f9439f);
        e.f.a(this, new d(new a(this, 24), true, 104922045));
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        z().b();
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (r0.u(this)) {
            A().a();
        } else {
            Toast.makeText(this, getString(R.string.generic_error_unable_to_connect_to_internet_please_try_again_later), 0).show();
        }
    }

    public final b z() {
        if (this.f9435b == null) {
            synchronized (this.f9436c) {
                try {
                    if (this.f9435b == null) {
                        this.f9435b = new b(this);
                    }
                } finally {
                }
            }
        }
        return this.f9435b;
    }
}
