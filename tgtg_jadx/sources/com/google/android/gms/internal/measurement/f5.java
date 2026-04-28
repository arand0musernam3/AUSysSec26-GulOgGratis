package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f5 implements Iterable, c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11408a;

    public f5(String str) {
        if (str != null) {
            this.f11408a = str;
        } else {
            i4.a.f("StringValue cannot be null.");
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Iterator c() {
        return new e5(this, 0);
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Boolean d() {
        return Boolean.valueOf(!this.f11408a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final String e() {
        return this.f11408a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f5) {
            return this.f11408a.equals(((f5) obj).f11408a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Double h() {
        String str = this.f11408a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final int hashCode() {
        return this.f11408a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e5(this, 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e4 A[PHI: r8
      0x02e4: PHI (r8v6 boolean) = (r8v12 boolean), (r8v13 boolean), (r8v16 boolean) binds: [B:100:0x02d0, B:101:0x02d2, B:103:0x02e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ee A[LOOP:0: B:108:0x02ec->B:109:0x02ee, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.c5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.c5 j(java.lang.String r29, com.google.android.gms.internal.measurement.b7 r30, java.util.ArrayList r31) {
        /*
            Method dump skipped, instruction units count: 1606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.f5.j(java.lang.String, com.google.android.gms.internal.measurement.b7, java.util.ArrayList):com.google.android.gms.internal.measurement.c5");
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final c5 m() {
        return new f5(this.f11408a);
    }

    public final String toString() {
        String str = this.f11408a;
        return e0.f.n(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }
}
