package com.app.tgtg.feature.logincharity.ui;

import android.os.Bundle;
import androidx.lifecycle.n1;
import e.f;
import e70.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import mr.e;
import o30.f0;
import pm.m;
import qs.a;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class LoginCharityActivity extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f9074i = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f9075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f9076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f9077h;

    public LoginCharityActivity() {
        super(4);
        this.f9075f = new n1(Reflection.getOrCreateKotlinClass(wl.c.class), new wl.a(this, 1), new wl.a(this, 0), new wl.a(this, 2));
        this.f9077h = new e(this, 13);
    }

    @Override // qs.a, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getOnBackPressedDispatcher().a(this.f9077h);
        f0.S(this, false);
        c cVar = this.f9076g;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        c.b(cVar, this, null, 6);
        f.a(this, new d(new m(this, 25), true, 1649204149));
    }
}
