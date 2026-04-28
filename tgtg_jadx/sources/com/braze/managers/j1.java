package com.braze.managers;

import android.app.AlarmManager;
import android.content.Context;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.storage.c3;
import com.braze.storage.d3;
import com.braze.storage.i3;
import com.braze.storage.l1;
import com.braze.storage.o3;
import com.braze.storage.t2;
import com.braze.storage.u3;
import com.braze.storage.x1;
import com.braze.storage.z2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j1 implements r0 {
    public final p A;
    public final k0 B;
    public final j C;
    public final com.braze.storage.p D;
    public final com.braze.requests.i E;
    public final com.braze.requests.framework.g F;
    public final com.braze.triggers.managers.f G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BrazeConfigurationProvider f10014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f10015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v0 f10016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n0 f10017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f10019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f10020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c3 f10021i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.braze.storage.t0 f10022j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.braze.requests.util.a f10023k;
    public final u3 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.braze.storage.v0 f10024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.braze.events.d f10025n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i3 f10026o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g0 f10027p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.braze.events.a f10028q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.braze.dispatch.f f10029r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w f10030s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h0 f10031t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final y0 f10032u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final z2 f10033v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t2 f10034w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d3 f10035x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final r f10036y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final BrazeGeofenceManager f10037z;

    public j1(Context context, com.braze.configuration.e eVar, BrazeConfigurationProvider brazeConfigurationProvider, com.braze.events.e eVar2, o0 o0Var, q0 q0Var, v0 v0Var, boolean z11, boolean z12, n0 n0Var, boolean z13) {
        Context context2;
        com.braze.storage.v0 v0Var2;
        context.getClass();
        eVar.getClass();
        brazeConfigurationProvider.getClass();
        eVar2.getClass();
        o0Var.getClass();
        q0Var.getClass();
        v0Var.getClass();
        n0Var.getClass();
        this.f10013a = context;
        this.f10014b = brazeConfigurationProvider;
        this.f10015c = o0Var;
        this.f10016d = v0Var;
        this.f10017e = n0Var;
        this.f10018f = z13;
        String strA = eVar.a();
        this.f10019g = strA;
        String str = brazeConfigurationProvider.getBrazeApiKey().f10175a;
        this.f10020h = str;
        c3 c3Var = new c3(context);
        this.f10021i = c3Var;
        com.braze.storage.t0 t0Var = new com.braze.storage.t0(context);
        this.f10022j = t0Var;
        com.braze.requests.util.a aVar = new com.braze.requests.util.a(context);
        this.f10023k = aVar;
        com.braze.events.d dVar = new com.braze.events.d(c3Var, t0Var, true);
        this.f10025n = dVar;
        i3 i3Var = new i3(context, str, dVar);
        this.f10026o = i3Var;
        this.f10027p = new g0(context, strA, str, i3Var, dVar, new com.braze.communication.dust.i(), new com.braze.requests.util.b(i3Var.j(), i3Var.k(), i3Var.k(), i3Var.l()));
        new h1(i3Var, dVar, context);
        l1 l1Var = new l1(new o3(context, strA, str), dVar);
        com.braze.dispatch.f fVar = new com.braze.dispatch.f(context, dVar, new com.braze.dispatch.a(context));
        this.f10029r = fVar;
        Object systemService = context.getSystemService("alarm");
        systemService.getClass();
        w wVar = new w(context, l1Var, dVar, eVar2, (AlarmManager) systemService, brazeConfigurationProvider.getSessionTimeoutSeconds(), brazeConfigurationProvider.isSessionStartBasedTimeoutEnabled());
        this.f10030s = wVar;
        h0 h0Var = new h0(new x1(new com.braze.storage.j(context, strA, str), dVar));
        this.f10031t = h0Var;
        y0 y0Var = new y0(context, str, strA, dVar, i3Var);
        this.f10032u = y0Var;
        this.f10033v = new z2(context, strA, str);
        s sVar = new s(context, dVar, i3Var);
        t2 t2Var = new t2(context, str, strA);
        this.f10034w = t2Var;
        d3 d3Var = new d3(context, strA, str);
        this.f10035x = d3Var;
        r rVar = new r(context, strA, str, wVar, dVar, brazeConfigurationProvider, i3Var, h0Var, sVar, c3Var, y0Var, v0Var, t2Var, t0Var);
        this.f10036y = rVar;
        BrazeGeofenceManager brazeGeofenceManager = new BrazeGeofenceManager(context, str, rVar, brazeConfigurationProvider, i3Var, dVar);
        this.f10037z = brazeGeofenceManager;
        p pVar = new p(context, rVar, brazeConfigurationProvider);
        this.A = pVar;
        k0 k0Var = new k0(context, str, strA, dVar, eVar2, i3Var, rVar);
        this.B = k0Var;
        j jVar = new j(context, str, strA, dVar, eVar2, i3Var, rVar);
        this.C = jVar;
        com.braze.storage.p pVar2 = new com.braze.storage.p(context, strA, str, rVar, Constants.BRAZE_SDK_VERSION);
        this.D = pVar2;
        int i11 = com.braze.communication.c.f9591a;
        com.braze.requests.v vVar = new com.braze.requests.v(new com.braze.communication.e(new com.braze.communication.b(com.braze.communication.c.f9591a)), dVar, eVar2, i3Var, pVar2, rVar, aVar);
        this.E = new com.braze.requests.i(dVar, rVar);
        com.braze.requests.framework.g gVar = new com.braze.requests.framework.g(new com.braze.dispatch.h(this), vVar, z11, z13);
        this.F = gVar;
        com.braze.triggers.managers.f fVar2 = new com.braze.triggers.managers.f(context, rVar, dVar, eVar2, brazeConfigurationProvider, strA, str, gVar);
        this.G = fVar2;
        if (Intrinsics.areEqual(strA, "")) {
            context2 = context;
            this.l = new u3(context2, q0Var, c3Var, t0Var, null, null);
            this.f10024m = new com.braze.storage.v0(context2, null, null);
        } else {
            context2 = context;
            this.l = new u3(context2, q0Var, c3Var, t0Var, strA, str);
            this.f10024m = new com.braze.storage.v0(context2, strA, str);
        }
        synchronized (fVar) {
            try {
                fVar.l = z12;
                fVar.b();
                if (z12) {
                    fVar.f();
                } else {
                    fVar.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        u3 u3VarD = d();
        com.braze.storage.v0 v0Var3 = this.f10024m;
        if (v0Var3 != null) {
            v0Var2 = v0Var3;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
            v0Var2 = null;
        }
        this.f10028q = new com.braze.events.a(context2, pVar, dVar, rVar, u3VarD, v0Var2, fVar2, fVar2.f10874h, h0Var, brazeGeofenceManager, eVar2, brazeConfigurationProvider, pVar2, d3Var, i3Var, k0Var, v0Var, jVar);
    }

    public final String a() {
        return this.f10020h;
    }

    public final Context b() {
        return this.f10013a;
    }

    public final String c() {
        return this.f10019g;
    }

    public final u3 d() {
        u3 u3Var = this.l;
        if (u3Var != null) {
            return u3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userCache");
        return null;
    }
}
