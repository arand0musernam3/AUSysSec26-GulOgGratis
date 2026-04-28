package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class oa {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f11698j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicReference f11699k = new AtomicReference();
    public static volatile oa l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final j30.l f11700m = o00.h0.C(h1.f11449f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8.h f11701a = new a8.h(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f11702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j30.l f11703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j30.l f11704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j30.l f11705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j30.l f11706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final od f11707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j30.l f11708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final cd f11709i;

    public oa(Context context, j30.l lVar, j30.l lVar2, j30.l lVar3, j30.l lVar4, j30.l lVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        lVar5.getClass();
        j30.l lVarC = o00.h0.C(lVar);
        j30.l lVarC2 = o00.h0.C(lVar2);
        j30.l lVarC3 = o00.h0.C(new ra(lVar3, 0));
        j30.l lVarC4 = o00.h0.C(lVar4);
        j30.l lVarC5 = o00.h0.C(lVar5);
        this.f11702b = applicationContext;
        this.f11703c = lVarC;
        this.f11704d = lVarC2;
        this.f11705e = lVarC3;
        this.f11706f = lVarC4;
        this.f11707g = new od(applicationContext, lVarC, lVarC4, lVarC2);
        this.f11708h = lVarC5;
        this.f11709i = new cd(applicationContext, lVarC, lVarC3, lVarC2);
    }

    public static void b() {
        synchronized (fa.f11412c) {
        }
        if (f11699k.get() == null && fa.f11413d == null) {
            fa.f11413d = new sa();
        }
    }

    public final o30.x0 a() {
        return (o30.x0) this.f11703c.get();
    }
}
