package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class qc {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s5 f11791i = new s5(14);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ic f11792j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile ae.c f11793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oa f11794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k30.m f11798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s5 f11799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jd f11800h;

    static {
        b3 b3Var = b3.f11272c;
        int i11 = k30.m.f25911c;
        f11792j = new ic(b3Var, false, k30.d0.f25887j);
    }

    public qc(oa oaVar, ic icVar) {
        this.f11794b = oaVar;
        Context context = oaVar.f11702b;
        String str = icVar.f11496d;
        if (str == null) {
            str = (String) icVar.f11493a.apply(context);
            icVar.f11496d = str;
        }
        this.f11795c = str;
        this.f11796d = "";
        this.f11797e = icVar.f11494b;
        this.f11798f = icVar.f11495c;
        this.f11793a = null;
        this.f11799g = new s5(15);
        this.f11800h = new jd(oaVar, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x0013, B:13:0x0026, B:15:0x0031, B:17:0x0039, B:19:0x0043, B:29:0x00a8, B:31:0x00ac, B:34:0x00b7, B:22:0x0061, B:24:0x0085, B:25:0x0092, B:27:0x009a, B:36:0x00bb, B:37:0x00be, B:38:0x00bf, B:8:0x000d), top: B:45:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x0013, B:13:0x0026, B:15:0x0031, B:17:0x0039, B:19:0x0043, B:29:0x00a8, B:31:0x00ac, B:34:0x00b7, B:22:0x0061, B:24:0x0085, B:25:0x0092, B:27:0x009a, B:36:0x00bb, B:37:0x00be, B:38:0x00bf, B:8:0x000d), top: B:45:0x0005, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ae.c a() {
        /*
            r6 = this;
            ae.c r0 = r6.f11793a
            if (r0 != 0) goto Lc3
            monitor-enter(r6)
            ae.c r0 = r6.f11793a     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto Lbf
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskWrites()     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.measurement.jd r1 = r6.f11800h     // Catch: java.lang.Throwable -> Lba
            ae.c r1 = r1.a()     // Catch: java.lang.Throwable -> Lba
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r0 = r1.f1246e     // Catch: java.lang.Throwable -> L5f
            androidx.recyclerview.widget.r1 r0 = (androidx.recyclerview.widget.r1) r0     // Catch: java.lang.Throwable -> L5f
            int r0 = r0.f3901b     // Catch: java.lang.Throwable -> L5f
            int r0 = r0 + (-2)
            r2 = 15
            if (r0 == r2) goto La7
            r2 = 16
            if (r0 == r2) goto La7
            com.google.android.gms.internal.measurement.oa r0 = r6.f11794b     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.measurement.od r2 = r0.f11707g     // Catch: java.lang.Throwable -> L5f
            r2.a()     // Catch: java.lang.Throwable -> L5f
            boolean r2 = r6.f11797e     // Catch: java.lang.Throwable -> L5f
            if (r2 != 0) goto L61
            com.google.android.gms.internal.measurement.jd r2 = r6.f11800h     // Catch: java.lang.Throwable -> L5f
            boolean r2 = r2.b()     // Catch: java.lang.Throwable -> L5f
            if (r2 != 0) goto L61
            java.lang.Object r2 = r1.f1243b     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L5f
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto L61
            o30.x0 r0 = r0.a()     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.measurement.kc r2 = new com.google.android.gms.internal.measurement.kc     // Catch: java.lang.Throwable -> L5f
            r3 = 0
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L5f
            r0.execute(r2)     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.measurement.ld r0 = com.google.android.gms.internal.measurement.ld.A()     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r1 = r1.f1246e     // Catch: java.lang.Throwable -> L5f
            androidx.recyclerview.widget.r1 r1 = (androidx.recyclerview.widget.r1) r1     // Catch: java.lang.Throwable -> L5f
            ae.c r2 = new ae.c     // Catch: java.lang.Throwable -> L5f
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L5f
            r0 = r2
            goto La8
        L5f:
            r0 = move-exception
            goto Lc1
        L61:
            o30.x0 r2 = r0.a()     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.measurement.kc r3 = new com.google.android.gms.internal.measurement.kc     // Catch: java.lang.Throwable -> L5f
            r4 = 3
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L5f
            r2.execute(r3)     // Catch: java.lang.Throwable -> L5f
            a8.h r2 = r0.f11701a     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r3 = r1.f1244c     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.measurement.u0 r3 = (com.google.android.gms.internal.measurement.u0) r3     // Catch: java.lang.Throwable -> L5f
            k30.m r4 = r6.f11798f     // Catch: java.lang.Throwable -> L5f
            java.lang.String r5 = r6.f11795c     // Catch: java.lang.Throwable -> L5f
            r2.C(r3, r4, r5)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = r6.f11796d     // Catch: java.lang.Throwable -> L5f
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L5f
            if (r2 != 0) goto L92
            o30.x0 r2 = r0.a()     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.measurement.kc r3 = new com.google.android.gms.internal.measurement.kc     // Catch: java.lang.Throwable -> L5f
            r4 = 1
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L5f
            r2.execute(r3)     // Catch: java.lang.Throwable -> L5f
        L92:
            com.google.android.gms.internal.measurement.jd r2 = r6.f11800h     // Catch: java.lang.Throwable -> L5f
            boolean r2 = r2.b()     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto La7
            o30.x0 r0 = r0.a()     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.measurement.kc r2 = new com.google.android.gms.internal.measurement.kc     // Catch: java.lang.Throwable -> L5f
            r3 = 2
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L5f
            r0.execute(r2)     // Catch: java.lang.Throwable -> L5f
        La7:
            r0 = r1
        La8:
            boolean r1 = r6.f11797e     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto Lb7
            java.lang.Object r1 = r0.f1246e     // Catch: java.lang.Throwable -> L5f
            androidx.recyclerview.widget.r1 r1 = (androidx.recyclerview.widget.r1) r1     // Catch: java.lang.Throwable -> L5f
            int r1 = r1.f3901b     // Catch: java.lang.Throwable -> L5f
            r2 = 17
            if (r1 != r2) goto Lb7
            goto Lbf
        Lb7:
            r6.f11793a = r0     // Catch: java.lang.Throwable -> L5f
            goto Lbf
        Lba:
            r1 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L5f
            throw r1     // Catch: java.lang.Throwable -> L5f
        Lbf:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5f
            return r0
        Lc1:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5f
            throw r0
        Lc3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.qc.a():ae.c");
    }

    public final void b() {
        jd jdVar = this.f11800h;
        oa oaVar = jdVar.f11521a;
        fb fbVar = (fb) oaVar.f11704d.get();
        String str = jdVar.f11523c;
        fbVar.getClass();
        str.getClass();
        aa aaVar = fbVar.f11415a;
        qz.t tVarBuilder = qz.u.builder();
        int i11 = 1;
        tVarBuilder.f37388a = new uc(str, i11);
        o30.a aVarB = fb.b(aaVar.doRead(tVarBuilder.a()).i(o30.g0.INSTANCE, new h1(13)));
        b3 b3Var = b3.f11273d;
        o30.x0 x0VarA = oaVar.a();
        int i12 = o30.v.f31928k;
        o30.u uVar = new o30.u(aVarB, b3Var);
        aVarB.a(uVar, wd.a.E(x0VarA, uVar));
        lc lcVar = new lc(jdVar, i11);
        oa oaVar2 = this.f11794b;
        o30.o0.f(uVar, lcVar, oaVar2.a()).a(new mc(this, uVar, i11), oaVar2.a());
    }
}
