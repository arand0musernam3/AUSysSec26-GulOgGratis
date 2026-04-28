package com.app.tgtg.feature.itemview.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n1;
import cv.i;
import e.f;
import e70.c;
import en.g;
import f0.f2;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import m90.z0;
import mr.e;
import mv.a;
import o30.f0;
import pm.m;
import qk.b;
import qk.l;
import u3.d;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ItemViewActivity extends g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9011k = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f9012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f70.g f9013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n1 f9014i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f9015j;

    public ItemViewActivity() {
        super(1);
        this.f9014i = new n1(Reflection.getOrCreateKotlinClass(l.class), new b(this, 1), new b(this, 0), new b(this, 2));
        this.f9015j = new e(this, 4);
    }

    public final l E() {
        return (l) this.f9014i.getValue();
    }

    @Override // en.g, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f0.S(this, false);
        super.onCreate(bundle);
        getOnBackPressedDispatcher().a(this.f9015j);
        c cVar = this.f9012g;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        c.b(cVar, this, new z0(this, 15), 2);
        f.a(this, new d(new m(this, 1), true, 2111086846));
    }

    @Override // en.g, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        if (intent.hasExtra("ITEM_ID")) {
            finish();
            startActivity(intent, a.b(this));
            return;
        }
        E().d(i.DEBUG_ADYEN_REDIRECT_HANDLE_INTENT, h0.g.E(new Pair(dv.a.TYPE, new dv.c(intent.getDataString()))));
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("PaymentFragment");
        yi.f0 f0Var = fragmentFindFragmentByTag instanceof yi.f0 ? (yi.f0) fragmentFindFragmentByTag : null;
        if (f0Var != null) {
            f0Var.E(intent);
        }
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((m1) ((f2) E().f37190e.f28697a).f16653f).i(ok.m.f32612a);
    }
}
