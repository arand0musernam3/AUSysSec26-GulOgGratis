package com.app.tgtg.feature.survey.bringmagic;

import a3.f1;
import ah.n;
import android.os.Bundle;
import androidx.lifecycle.n1;
import cw.b;
import dq.a;
import dq.i;
import e.f;
import e70.c;
import ft.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o30.f0;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class BringBackMagicActivity extends n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f9257i = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f9258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f9259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f9260h;

    public BringBackMagicActivity() {
        super(7);
        this.f9258f = new n1(Reflection.getOrCreateKotlinClass(i.class), new a(this, 1), new a(this, 0), new a(this, 2));
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f0.S(this, false);
        c cVar = this.f9260h;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        c.b(cVar, this, null, 6);
        f.a(this, new d(new f1(this, 23), true, -764211783));
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        super.onResume();
        o oVar = this.f9259g;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tokenManager");
            oVar = null;
        }
        oVar.f17954d = new b(this, 3);
    }
}
