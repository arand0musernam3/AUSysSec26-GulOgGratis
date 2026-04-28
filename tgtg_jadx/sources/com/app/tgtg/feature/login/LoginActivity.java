package com.app.tgtg.feature.login;

import a3.f1;
import ah.n;
import al.f;
import al.p;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.lifecycle.n1;
import com.app.tgtg.R;
import dn.k;
import e70.c;
import el.a;
import el.d;
import f70.b;
import f70.i;
import f70.o;
import ft.q;
import kotlin.Pair;
import kotlin.collections.c0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import lv.s;
import mv.r0;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class LoginActivity extends n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f9032j = new b(LoginActivity.class, null, true, false, false, null, c0.c(335577088), Integer.valueOf(R.anim.rotate_in), Integer.valueOf(R.anim.rotate_out), false, 570);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f9033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f9034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f9035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9036i;

    public LoginActivity() {
        super(1);
        this.f9034g = new n1(Reflection.getOrCreateKotlinClass(p.class), new f(this, 1), new f(this, 0), new f(this, 2));
    }

    public final p a0() {
        return (p) this.f9034g.getValue();
    }

    public final void b0(String str) {
        p pVarA0 = a0();
        str.getClass();
        d dVar = pVarA0.f1575n;
        dVar.getClass();
        dVar.f16080a.a(new o(Uri.parse(str)));
    }

    public final void c0(Function0 function0) {
        if (!r0.u(this)) {
            Toast.makeText(this, getResources().getText(R.string.generic_error_unable_to_connect_to_internet_please_try_again_later), 0).show();
            return;
        }
        getSupportFragmentManager().e0(this, new a50.d(1, this, function0));
        p pVarA0 = a0();
        i iVar = (i) a0().f1572j.a("ORIGIN");
        if (iVar == null) {
            iVar = i.UNKNOWN;
        }
        pVarA0.f1575n.f16080a.a(new a(wd.a.A(iVar), false));
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        tx.i iVar;
        super.onActivityResult(i11, i12, intent);
        k kVar = a0().f1586y;
        if (kVar == null || (iVar = (tx.i) kVar.f15018b) == null) {
            return;
        }
        iVar.a(i11, i12, intent);
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        f0.S(this, false);
        super.onCreate(bundle);
        a70.a.t(this, s.f28245z);
        e.f.a(this, new u3.d(new f1(this, 4), true, 260044951));
        a0().f1580s.e(this, new al.c(new al.a(this, 1), 0));
        a0().f1577p.e(this, new qt.b(new al.a(this, 2), 0));
        c cVar = this.f9033f;
        x70.c cVar2 = null;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        c.b(cVar, this, new al.a(this, 0), 2);
        ft.s sVar = a0().f1570h;
        sVar.getClass();
        v80.f0.E(g.f26549a, new q(sVar, cVar2, 3));
        i iVar = (i) a0().f1572j.a("ORIGIN");
        if (iVar == null) {
            iVar = i.UNKNOWN;
        }
        if (iVar != i.WIDGET) {
            p.g(a0(), cv.i.CORE_LANDING_PRESENTED);
            return;
        }
        p pVarA0 = a0();
        cv.i iVar2 = cv.i.CORE_LANDING_PRESENTED;
        dv.b bVarE = h0.g.E(new Pair(dv.a.SOURCE, new dv.c("Widget")));
        iVar2.getClass();
        pVarA0.f1569g.c(iVar2, bVarE);
    }
}
