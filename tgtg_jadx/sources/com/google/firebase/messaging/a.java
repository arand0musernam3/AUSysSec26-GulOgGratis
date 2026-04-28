package com.google.firebase.messaging;

import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m40.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12761a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m40.b f12762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m40.b f12763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m40.b f12764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m40.b f12765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m40.b f12766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m40.b f12767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m40.b f12768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m40.b f12769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m40.b f12770j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m40.b f12771k;
    public static final m40.b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m40.b f12772m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final m40.b f12773n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m40.b f12774o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m40.b f12775p;

    static {
        androidx.constraintlayout.widget.z zVarE = androidx.constraintlayout.widget.z.e();
        zVarE.f2542b = 1;
        f12762b = new m40.b("projectNumber", l1.i(l1.h(p40.e.class, zVarE.c())));
        androidx.constraintlayout.widget.z zVarE2 = androidx.constraintlayout.widget.z.e();
        zVarE2.f2542b = 2;
        f12763c = new m40.b("messageId", l1.i(l1.h(p40.e.class, zVarE2.c())));
        androidx.constraintlayout.widget.z zVarE3 = androidx.constraintlayout.widget.z.e();
        zVarE3.f2542b = 3;
        f12764d = new m40.b("instanceId", l1.i(l1.h(p40.e.class, zVarE3.c())));
        androidx.constraintlayout.widget.z zVarE4 = androidx.constraintlayout.widget.z.e();
        zVarE4.f2542b = 4;
        f12765e = new m40.b("messageType", l1.i(l1.h(p40.e.class, zVarE4.c())));
        androidx.constraintlayout.widget.z zVarE5 = androidx.constraintlayout.widget.z.e();
        zVarE5.f2542b = 5;
        f12766f = new m40.b("sdkPlatform", l1.i(l1.h(p40.e.class, zVarE5.c())));
        androidx.constraintlayout.widget.z zVarE6 = androidx.constraintlayout.widget.z.e();
        zVarE6.f2542b = 6;
        f12767g = new m40.b("packageName", l1.i(l1.h(p40.e.class, zVarE6.c())));
        androidx.constraintlayout.widget.z zVarE7 = androidx.constraintlayout.widget.z.e();
        zVarE7.f2542b = 7;
        f12768h = new m40.b("collapseKey", l1.i(l1.h(p40.e.class, zVarE7.c())));
        androidx.constraintlayout.widget.z zVarE8 = androidx.constraintlayout.widget.z.e();
        zVarE8.f2542b = 8;
        f12769i = new m40.b("priority", l1.i(l1.h(p40.e.class, zVarE8.c())));
        androidx.constraintlayout.widget.z zVarE9 = androidx.constraintlayout.widget.z.e();
        zVarE9.f2542b = 9;
        f12770j = new m40.b("ttl", l1.i(l1.h(p40.e.class, zVarE9.c())));
        androidx.constraintlayout.widget.z zVarE10 = androidx.constraintlayout.widget.z.e();
        zVarE10.f2542b = 10;
        f12771k = new m40.b("topic", l1.i(l1.h(p40.e.class, zVarE10.c())));
        androidx.constraintlayout.widget.z zVarE11 = androidx.constraintlayout.widget.z.e();
        zVarE11.f2542b = 11;
        l = new m40.b("bulkId", l1.i(l1.h(p40.e.class, zVarE11.c())));
        androidx.constraintlayout.widget.z zVarE12 = androidx.constraintlayout.widget.z.e();
        zVarE12.f2542b = 12;
        f12772m = new m40.b("event", l1.i(l1.h(p40.e.class, zVarE12.c())));
        androidx.constraintlayout.widget.z zVarE13 = androidx.constraintlayout.widget.z.e();
        zVarE13.f2542b = 13;
        f12773n = new m40.b("analyticsLabel", l1.i(l1.h(p40.e.class, zVarE13.c())));
        androidx.constraintlayout.widget.z zVarE14 = androidx.constraintlayout.widget.z.e();
        zVarE14.f2542b = 14;
        f12774o = new m40.b("campaignId", l1.i(l1.h(p40.e.class, zVarE14.c())));
        androidx.constraintlayout.widget.z zVarE15 = androidx.constraintlayout.widget.z.e();
        zVarE15.f2542b = 15;
        f12775p = new m40.b("composerLabel", l1.i(l1.h(p40.e.class, zVarE15.c())));
    }

    @Override // m40.a
    public final void a(Object obj, Object obj2) {
        z40.d dVar = (z40.d) obj;
        m40.d dVar2 = (m40.d) obj2;
        dVar2.b(f12762b, dVar.f47258a);
        dVar2.a(f12763c, dVar.f47259b);
        dVar2.a(f12764d, dVar.f47260c);
        dVar2.a(f12765e, dVar.f47261d);
        dVar2.a(f12766f, dVar.f47262e);
        dVar2.a(f12767g, dVar.f47263f);
        dVar2.a(f12768h, dVar.f47264g);
        dVar2.c(f12769i, dVar.f47265h);
        dVar2.c(f12770j, dVar.f47266i);
        dVar2.a(f12771k, dVar.f47267j);
        dVar2.b(l, 0L);
        dVar2.a(f12772m, dVar.f47268k);
        dVar2.a(f12773n, dVar.l);
        dVar2.b(f12774o, 0L);
        dVar2.a(f12775p, dVar.f47269m);
    }
}
