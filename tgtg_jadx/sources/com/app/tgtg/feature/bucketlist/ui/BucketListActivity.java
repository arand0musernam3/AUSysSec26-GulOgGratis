package com.app.tgtg.feature.bucketlist.ui;

import ah.n;
import android.os.Bundle;
import androidx.lifecycle.n1;
import cv.i;
import e.f;
import e70.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import lh.d0;
import mr.e;
import o30.f0;
import oh.a;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class BucketListActivity extends n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f8968i = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f8969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f8970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f8971h;

    public BucketListActivity() {
        super(25);
        this.f8970g = new n1(Reflection.getOrCreateKotlinClass(oh.c.class), new a(this, 1), new a(this, 0), new a(this, 2));
        this.f8971h = new e(this, 3);
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f0.S(this, false);
        super.onCreate(bundle);
        getOnBackPressedDispatcher().a(this.f8971h);
        c cVar = this.f8969f;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        c.b(cVar, this, null, 6);
        oh.c cVar2 = (oh.c) this.f8970g.getValue();
        String str = (String) cVar2.f32553b.a("FILLER_TYPE");
        if (str != null) {
            d0 d0Var = cVar2.f32554c;
            d0Var.getClass();
            d0Var.f27783a.d(i.SCREEN_DISCOVER_BUCKET, dv.a.TYPE, str);
        }
        f.a(this, new d(new lk.a(this, 26), true, -724475122));
    }
}
