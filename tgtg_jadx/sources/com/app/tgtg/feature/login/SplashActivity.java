package com.app.tgtg.feature.login;

import a3.x;
import a3.x0;
import a40.d0;
import a70.a;
import ah.n;
import al.c0;
import al.r;
import al.u;
import al.v;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.g1;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import com.app.tgtg.R;
import com.app.tgtg.feature.charity.ui.MainCharityActivity;
import com.appsflyer.AppsFlyerLib;
import e70.c;
import f70.i;
import ft.o;
import ft.s;
import hv.j;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import mv.a0;
import mv.y;
import mv.z;
import qj.m;
import qj.q;
import qj.r1;
import qj.s1;
import tx.u0;
import v80.f0;
import z20.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class SplashActivity extends n {
    public static final /* synthetic */ int l = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f9037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f9038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ActivityResultLauncher f9039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o f9040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s f9041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f9042k;

    public SplashActivity() {
        super(2);
        this.f9037f = new n1(Reflection.getOrCreateKotlinClass(c0.class), new al.s(this, 1), new al.s(this, 0), new al.s(this, 2));
    }

    public final c0 a0() {
        return (c0) this.f9037f.getValue();
    }

    public final void b0() {
        c0 c0VarA0 = a0();
        if (!c0VarA0.f1524d.n().isCharityUser()) {
            if (!((Boolean) f0.E(g.f26549a, new v(c0VarA0, null, 2))).booleanValue()) {
                a0 a0Var = new a0();
                z zVar = ft.c.C() ? z.MY_STORE : z.DISCOVER;
                zVar.getClass();
                a0Var.f30138a = zVar;
                y yVar = y.MAIN_START;
                yVar.getClass();
                a0Var.f30140c = yVar;
                a0Var.f30143f = false;
                a0Var.c(this);
                return;
            }
        }
        startActivity(new Intent(this, (Class<?>) MainCharityActivity.class));
        finish();
    }

    public final void c0() {
        ((av.e) a0().l.getValue()).e(this, new al.c(new r(this, 2), 1));
        c0 c0VarA0 = a0();
        f0.B(c0VarA0.f1521a, null, null, new x(c0VarA0, (x70.c) null, 6), 3).J(new x0(c0VarA0, 2));
        new Handler(Looper.getMainLooper()).postDelayed(new u(c0VarA0, 0), 3000L);
    }

    public final void d0() {
        m mVar = a0().f1532m;
        if (mVar == null) {
            c0 c0VarA0 = a0();
            i iVar = i.SPLASH;
            c0VarA0.getClass();
            iVar.getClass();
            c0VarA0.f1529i.c(iVar);
            return;
        }
        q qVar = mVar instanceof q ? (q) mVar : null;
        if (qVar != null) {
            ft.c.M(qVar.f37132a);
        }
        i iVar2 = ((mVar instanceof s1) || (mVar instanceof r1)) ? i.WIDGET : i.DEEP_LINK;
        c0 c0VarA02 = a0();
        c0VarA02.getClass();
        iVar2.getClass();
        c0VarA02.f1529i.c(iVar2);
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        o30.f0.S(this, false);
        setTheme(R.style.AppTheme);
        super.onCreate(bundle);
        a.t(this, lv.s.J);
        int i11 = u0.f40557m;
        u0.f40557m = R.style.AppTheme;
        c cVar = this.f9042k;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        cVar.a(this, Lifecycle.State.CREATED, new r(this, 1));
        e eVarO = wd.a.o(this);
        eVarO.getClass();
        this.f9038g = eVarO;
        this.f9039h = registerForActivityResult(new g1(5), new d0());
        c0 c0VarA0 = a0();
        Intent intent = getIntent();
        intent.getClass();
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        c0VarA0.getClass();
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        appsFlyerLib.performOnDeepLinking(intent, applicationContext);
        appsFlyerLib.subscribeForDeepLink(new al.x(c0VarA0));
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        super.onResume();
        o oVar = this.f9040i;
        e eVar = null;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tokenManager");
            oVar = null;
        }
        oVar.f17954d = new al.q(this, 0);
        e eVar2 = this.f9038g;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("updateManager");
        } else {
            eVar = eVar2;
        }
        eVar.a().g(new w.z(new r(this, 0), 2));
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (!a0().f1523c.f4469b.a()) {
            d0();
            return;
        }
        c0 c0VarA0 = a0();
        x70.c cVar = null;
        if (((j) c0VarA0.f1528h).b()) {
            f0.B(m1.d(c0VarA0), null, null, new v(c0VarA0, cVar, 1), 3);
        }
        s sVar = this.f9041j;
        if (sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackingSettingsManager");
            sVar = null;
        }
        sVar.getClass();
        if (((Boolean) f0.E(g.f26549a, new ft.q(sVar, cVar, 1))).booleanValue()) {
            c0();
        } else {
            getSupportFragmentManager().e0(this, new w.z(this, 3));
            a0().f1529i.f16080a.a(new el.a(a0().f1532m != null, true));
        }
    }
}
