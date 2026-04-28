package com.app.tgtg.feature.authentication.ui;

import a3.f1;
import a3.x0;
import ah.a;
import ah.k;
import ah.n;
import android.os.Bundle;
import androidx.lifecycle.n1;
import e.f;
import e70.c;
import g9.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AuthenticationActivity extends n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f8960i = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f8961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f0 f8962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f8963h;

    public AuthenticationActivity() {
        super(0);
        this.f8963h = new n1(Reflection.getOrCreateKotlinClass(k.class), new a(this, 1), new a(this, 0), new a(this, 2));
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o30.f0.S(this, false);
        c cVar = this.f8961f;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        c.b(cVar, this, new x0(this, 1), 2);
        f.a(this, new d(new f1(this, 3), true, -813769858));
    }
}
