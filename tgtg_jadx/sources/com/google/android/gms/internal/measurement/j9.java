package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j9 extends k1 {
    private static final j9 zzh;
    private static volatile h2 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        j9 j9Var = new j9();
        zzh = j9Var;
        k1.o(j9.class, j9Var);
    }

    public static h9 u() {
        return (h9) zzh.j();
    }

    public static j9 v() {
        return zzh;
    }

    public final /* synthetic */ void A(int i11) {
        this.zzg = i11 - 1;
        this.zzb |= 4;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", k0.f11551o, "zzf", k0.f11549m, "zzg", k0.f11550n});
        }
        if (i12 == 3) {
            return new j9();
        }
        if (i12 == 4) {
            return new h9(zzh);
        }
        if (i12 == 5) {
            return zzh;
        }
        if (i12 != 6) {
            throw null;
        }
        h2 h2Var = zzi;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (j9.class) {
            try {
                j1Var = zzi;
                if (j1Var == null) {
                    j1Var = new j1(zzh);
                    zzi = j1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j1Var;
    }

    public final i9 t() {
        i9 i9VarC = i9.c(this.zzf);
        return i9VarC == null ? i9.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : i9VarC;
    }

    public final /* synthetic */ void w(i9 i9Var) {
        this.zzf = i9Var.a();
        this.zzb |= 2;
    }

    public final int x() {
        int i11;
        int i12 = this.zze;
        if (i12 != 0) {
            i11 = 2;
            if (i12 != 1) {
                if (i12 != 2) {
                    i11 = 4;
                    if (i12 != 3) {
                        i11 = i12 != 4 ? 0 : 5;
                    }
                } else {
                    i11 = 3;
                }
            }
        } else {
            i11 = 1;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[PHI: r3
      0x0017: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:7:0x0009, B:11:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y() {
        /*
            r4 = this;
            int r0 = r4.zzg
            r1 = 1
            if (r0 == 0) goto L19
            r2 = 2
            if (r0 == r1) goto L1a
            r3 = 3
            if (r0 == r2) goto L17
            r2 = 4
            if (r0 == r3) goto L1a
            r3 = 5
            if (r0 == r2) goto L17
            if (r0 == r3) goto L15
            r2 = 0
            goto L1a
        L15:
            r2 = 6
            goto L1a
        L17:
            r2 = r3
            goto L1a
        L19:
            r2 = r1
        L1a:
            if (r2 != 0) goto L1d
            return r1
        L1d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.j9.y():int");
    }

    public final /* synthetic */ void z(int i11) {
        this.zze = i11 - 1;
        this.zzb |= 1;
    }
}
