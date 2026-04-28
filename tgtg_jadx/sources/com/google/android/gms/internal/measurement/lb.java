package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class lb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final lb f11598b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k30.p f11599a;

    static {
        int i11 = k30.p.f25916f;
        f11598b = new lb(k30.e0.f25894h);
    }

    public lb(k30.p pVar) {
        this.f11599a = pVar;
    }

    public static lb a(x0 x0Var) throws zzaeh {
        String strW;
        long j9;
        kb kbVar;
        int iG = x0Var.G();
        if (iG < 0) {
            c50.w.o("Negative number of flags");
            return null;
        }
        int i11 = k30.p.f25916f;
        k30.n nVar = new k30.n(k30.v.f25925a);
        long j11 = 0;
        for (int i12 = 0; i12 < iG; i12++) {
            long jH = x0Var.H();
            int i13 = (int) jH;
            long j12 = jH >>> 3;
            if (j12 == 0) {
                j9 = 0;
                strW = x0Var.w();
            } else {
                long j13 = j12 + j11;
                if (j13 > 2305843009213693951L) {
                    c50.w.o("Flag name larger than max size");
                    return null;
                }
                strW = null;
                j9 = j13;
            }
            int i14 = i13 & 7;
            if (i14 == 0 || i14 == 1) {
                kbVar = new kb(j9, strW, i14, 0L, null);
            } else if (i14 == 2) {
                kbVar = new kb(j9, strW, i14, x0Var.H(), null);
            } else if (i14 == 3) {
                kbVar = new kb(j9, strW, i14, Double.doubleToRawLongBits(x0Var.o()), null);
            } else if (i14 == 4) {
                kbVar = new kb(j9, strW, i14, 0L, x0Var.w());
            } else {
                if (i14 != 5) {
                    c50.w.o(e0.f.h(i14, "Unrecognized flag type ", new StringBuilder(String.valueOf(i14).length() + 23)));
                    return null;
                }
                kbVar = new kb(j9, strW, i14, 0L, x0Var.z());
            }
            long j14 = kbVar.f11567a;
            if (j14 != 0) {
                j11 = j14;
            }
            nVar.a(kbVar);
        }
        return new lb(nVar.e());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lb)) {
            return false;
        }
        return this.f11599a.equals(((lb) obj).f11599a);
    }

    public final int hashCode() {
        k30.p pVar = this.f11599a;
        pVar.getClass();
        return na0.a.q0(pVar);
    }
}
