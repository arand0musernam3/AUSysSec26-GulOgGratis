package com.google.android.gms.internal.measurement;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class jg implements ig, sg {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f11528i = new String();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Level f11529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ng f11531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qg f11532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public xg f11533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f11534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f11535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s5 f11536h;

    public jg(s5 s5Var, Level level) {
        Objects.requireNonNull(s5Var);
        this.f11536h = s5Var;
        d.f11331a.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.f11531c = null;
        this.f11532d = null;
        this.f11533e = null;
        this.f11534f = null;
        this.f11535g = null;
        g1.c(level, "level");
        this.f11529a = level;
        this.f11530b = nanos;
    }

    @Override // com.google.android.gms.internal.measurement.sg
    public final sg a() {
        pg pgVar = new pg();
        pgVar.f11762b = 0;
        if (this.f11532d == null) {
            this.f11532d = pgVar;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [com.google.android.gms.internal.measurement.xg] */
    /* JADX WARN: Type inference failed for: r10v22, types: [com.google.android.gms.internal.measurement.yg] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.google.android.gms.internal.measurement.jg] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [com.google.android.gms.internal.measurement.xg] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [com.google.android.gms.internal.measurement.xg] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // com.google.android.gms.internal.measurement.sg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r19, java.lang.Object[] r20) {
        /*
            Method dump skipped, instruction units count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.jg.b(java.lang.String, java.lang.Object[]):void");
    }

    @Override // com.google.android.gms.internal.measurement.sg
    public final sg c(Throwable th2) {
        tg tgVar = mg.f11639a;
        g1.c(tgVar, "metadata key");
        if (th2 != null) {
            e(tgVar, th2);
        }
        return this;
    }

    public final la d() {
        ng ngVar = this.f11531c;
        return ngVar != null ? ngVar : ih.f11500e;
    }

    public final void e(tg tgVar, Object obj) {
        if (this.f11531c == null) {
            ng ngVar = new ng();
            ngVar.f11673e = new Object[8];
            ngVar.f11674f = 0;
            this.f11531c = ngVar;
        }
        this.f11531c.l(tgVar, obj);
    }
}
