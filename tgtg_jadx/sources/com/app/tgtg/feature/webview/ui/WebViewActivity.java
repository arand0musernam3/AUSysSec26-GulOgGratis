package com.app.tgtg.feature.webview.ui;

import a3.f1;
import ah.n;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.activity.e0;
import androidx.lifecycle.n1;
import bt.b;
import c50.p;
import dt.a;
import e.f;
import e70.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import lv.s;
import o30.f0;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class WebViewActivity extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9458k = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f9459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f9460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f9461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public WebView f9462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e0 f9463j;

    public WebViewActivity() {
        super(8);
        this.f9461h = new n1(Reflection.getOrCreateKotlinClass(dt.c.class), new a(this, 1), new a(this, 0), new a(this, 2));
        this.f9463j = new e0(this, 7);
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f0.S(this, false);
        super.onCreate(bundle);
        this.f9462i = new WebView(this);
        c cVar = this.f9460g;
        b bVar = null;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        c.b(cVar, this, new p(this, 12), 2);
        getOnBackPressedDispatcher().a(this.f9463j);
        n1 n1Var = this.f9461h;
        Boolean bool = (Boolean) ((dt.c) n1Var.getValue()).f15170a.a("STORE_REFERRAL");
        a70.a.t(this, bool != null ? bool.booleanValue() : false ? s.f28217b : s.J);
        b bVar2 = this.f9459f;
        if (bVar2 != null) {
            bVar = bVar2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("webViewClient");
        }
        bVar.f6703c = ((dt.c) n1Var.getValue()).f15172c;
        f.a(this, new d(new f1(this, 24), true, 2135906363));
    }

    @Override // ah.n, k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f9463j.remove();
        b bVar = this.f9459f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewClient");
            bVar = null;
        }
        bVar.f6703c = null;
    }
}
