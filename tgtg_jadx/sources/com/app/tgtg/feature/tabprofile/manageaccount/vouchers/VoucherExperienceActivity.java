package com.app.tgtg.feature.tabprofile.manageaccount.vouchers;

import android.os.Bundle;
import androidx.lifecycle.n1;
import e70.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import mv.a0;
import mv.z;
import o30.f0;
import qs.a;
import qs.e;
import qs.f;
import qs.h;
import ss.a1;
import ss.b1;
import ss.c1;
import ss.d1;
import ss.e1;
import ss.y0;
import ss.z0;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class VoucherExperienceActivity extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f9443h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f9444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f9445g;

    public VoucherExperienceActivity() {
        super(0);
        this.f9445g = new n1(Reflection.getOrCreateKotlinClass(h.class), new f(this, 1), new f(this, 0), new f(this, 2));
    }

    public static int C(e1 e1Var) {
        if ((e1Var instanceof z0) || (e1Var instanceof y0)) {
            return 0;
        }
        if (e1Var instanceof d1) {
            return 1;
        }
        if ((e1Var instanceof b1) || (e1Var instanceof c1) || (e1Var instanceof a1)) {
            return 2;
        }
        e40.a.f();
        return 0;
    }

    public static boolean F(e1 e1Var) {
        return (e1Var instanceof c1) || (e1Var instanceof a1);
    }

    public final h D() {
        return (h) this.f9445g.getValue();
    }

    public final void E() {
        a0 a0Var = new a0();
        z zVar = z.DISCOVER;
        zVar.getClass();
        a0Var.f30138a = zVar;
        a0Var.f30144g = true;
        a0Var.c(this);
    }

    @Override // qs.a, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f0.S(this, false);
        super.onCreate(bundle);
        c cVar = this.f9444f;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        c.b(cVar, this, new m90.z0(this, 17), 2);
        e.f.a(this, new d(new e(this, 0), true, 601456183));
    }
}
