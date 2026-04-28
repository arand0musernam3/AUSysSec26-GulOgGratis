package com.app.tgtg.feature.tabprofile.manageaccount;

import ah.n;
import android.os.Bundle;
import androidx.activity.e0;
import androidx.lifecycle.n1;
import e.f;
import e70.c;
import g3.y0;
import hr.d;
import hr.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ManageAccountActivity extends n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f9348i = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f9349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f9350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e0 f9351h;

    public ManageAccountActivity() {
        super(17);
        this.f9349f = new n1(Reflection.getOrCreateKotlinClass(i.class), new d(this, 1), new d(this, 0), new d(this, 2));
        this.f9351h = new e0(this, 22);
    }

    public final i a0() {
        return (i) this.f9349f.getValue();
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f0.S(this, false);
        super.onCreate(bundle);
        getOnBackPressedDispatcher().a(this.f9351h);
        c cVar = this.f9350g;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        c.b(cVar, this, null, 6);
        f.a(this, new u3.d(new y0(this, 15), true, 1743766688));
    }
}
