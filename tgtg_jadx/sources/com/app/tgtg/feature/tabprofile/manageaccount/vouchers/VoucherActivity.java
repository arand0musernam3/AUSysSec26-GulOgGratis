package com.app.tgtg.feature.tabprofile.manageaccount.vouchers;

import ah.n;
import android.os.Bundle;
import androidx.lifecycle.n1;
import e.f;
import e40.a;
import e70.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import m90.z0;
import mv.a0;
import mv.z;
import o30.f0;
import qs.b;
import qs.i;
import ss.f1;
import ss.g1;
import ss.h1;
import ss.i1;
import ss.j1;
import ss.k1;
import ss.l1;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class VoucherActivity extends n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f9440h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f9441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f9442g;

    public VoucherActivity() {
        super(29);
        this.f9442g = new n1(Reflection.getOrCreateKotlinClass(i.class), new qs.c(this, 1), new qs.c(this, 0), new qs.c(this, 2));
    }

    public static int a0(l1 l1Var) {
        if ((l1Var instanceof g1) || (l1Var instanceof f1)) {
            return 0;
        }
        if (l1Var instanceof k1) {
            return 1;
        }
        if ((l1Var instanceof i1) || (l1Var instanceof j1) || (l1Var instanceof h1)) {
            return 2;
        }
        a.f();
        return 0;
    }

    public static boolean d0(l1 l1Var) {
        return (l1Var instanceof i1) || (l1Var instanceof j1) || (l1Var instanceof h1);
    }

    public final i b0() {
        return (i) this.f9442g.getValue();
    }

    public final void c0() {
        a0 a0Var = new a0();
        z zVar = z.DISCOVER;
        zVar.getClass();
        a0Var.f30138a = zVar;
        a0Var.f30144g = true;
        a0Var.c(this);
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f0.S(this, false);
        super.onCreate(bundle);
        c cVar = this.f9441f;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        c.b(cVar, this, new z0(this, 16), 2);
        f.a(this, new d(new b(this, 0), true, 1908898763));
    }
}
