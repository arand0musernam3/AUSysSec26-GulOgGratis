package com.google.android.gms.internal.measurement;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class bf implements yf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bf f11290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f11291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Thread f11294e;

    public bf(String str, bf bfVar, xf xfVar) {
        this.f11293d = str;
        this.f11290a = bfVar;
        this.f11291b = bfVar.f11291b;
        this.f11292c = bfVar.f11292c;
        this.f11294e = Thread.currentThread();
    }

    public static String a(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        xf xfVarC = hf.c();
        yf yfVar = xfVarC.f12043b;
        String str = this.f11293d;
        if (yfVar == null) {
            throw new gf(e0.f.n(new StringBuilder(str.length() + 101), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
        }
        if (this == yfVar) {
            hf.b(xfVarC, ((bf) yfVar).f11290a);
            this.f11294e = null;
            return;
        }
        String str2 = ((bf) yfVar).f11293d;
        StringBuilder sb2 = new StringBuilder(str.length() + 79 + str2.length() + 1);
        j4.s.A(sb2, "Tried to end span ", str, ", but that span is not the current span. The current span is ", str2);
        sb2.append(".");
        throw new gf(sb2.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
    
        r4 = r4.f11947d;
        r10 = java.lang.Integer.valueOf(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
    
        if (r4.containsKey(r10) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bf, code lost:
    
        ((com.google.android.gms.internal.measurement.uf) r1.f12017g).f11947d.put(r10, new com.google.android.gms.internal.measurement.uf(r8, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        if (r15 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cf, code lost:
    
        r15.f11946c = (com.google.android.gms.internal.measurement.uf) r1.f12017g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e1, code lost:
    
        if (r15 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
    
        r15.f11946c = (com.google.android.gms.internal.measurement.uf) r1.f12017g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
    
        r1.f12012b = r8;
        r1.f12013c++;
        r1.c();
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.bf.toString():java.lang.String");
    }

    public bf(String str, UUID uuid, String str2, xf xfVar) {
        this.f11293d = str;
        this.f11290a = null;
        this.f11291b = uuid;
        this.f11292c = str2;
        xfVar.getClass();
        this.f11294e = Thread.currentThread();
    }
}
