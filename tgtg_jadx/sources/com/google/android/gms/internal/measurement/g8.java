package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g8 extends k1 {
    private static final g8 zzp;
    private static volatile h2 zzq;
    private int zzb;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private long zzl;
    private z1 zzm;
    private z1 zzn;
    private String zzo;

    static {
        g8 g8Var = new g8();
        zzp = g8Var;
        k1.o(g8.class, g8Var);
    }

    public g8() {
        z1 z1Var = z1.f12078b;
        this.zzm = z1Var;
        this.zzn = z1Var;
        this.zze = "";
        this.zzf = "";
        this.zzg = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzo = "";
    }

    public static d8 Y() {
        return (d8) zzp.j();
    }

    public static g8 Z() {
        return zzp;
    }

    public final /* synthetic */ void A() {
        this.zzb &= -65;
        this.zzk = zzp.zzk;
    }

    public final /* synthetic */ void B(long j9) {
        this.zzb |= 128;
        this.zzl = j9;
    }

    public final z1 C() {
        z1 z1Var = this.zzm;
        if (!z1Var.f12079a) {
            this.zzm = z1Var.a();
        }
        return this.zzm;
    }

    public final z1 D() {
        z1 z1Var = this.zzn;
        if (!z1Var.f12079a) {
            this.zzn = z1Var.a();
        }
        return this.zzn;
    }

    public final /* synthetic */ void E(String str) {
        this.zzb |= 256;
        this.zzo = str;
    }

    public final /* synthetic */ void F() {
        this.zzb &= -257;
        this.zzo = zzp.zzo;
    }

    public final boolean G() {
        return (this.zzb & 1) != 0;
    }

    public final String H() {
        return this.zze;
    }

    public final boolean I() {
        return (this.zzb & 2) != 0;
    }

    public final String J() {
        return this.zzf;
    }

    public final boolean K() {
        return (this.zzb & 4) != 0;
    }

    public final String L() {
        return this.zzg;
    }

    public final boolean M() {
        return (this.zzb & 8) != 0;
    }

    public final long N() {
        return this.zzh;
    }

    public final boolean O() {
        return (this.zzb & 16) != 0;
    }

    public final String P() {
        return this.zzi;
    }

    public final boolean Q() {
        return (this.zzb & 32) != 0;
    }

    public final String R() {
        return this.zzj;
    }

    public final boolean S() {
        return (this.zzb & 64) != 0;
    }

    public final String T() {
        return this.zzk;
    }

    public final boolean U() {
        return (this.zzb & 128) != 0;
    }

    public final long V() {
        return this.zzl;
    }

    public final boolean W() {
        return (this.zzb & 256) != 0;
    }

    public final String X() {
        return this.zzo;
    }

    public final /* synthetic */ void a0(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void b0() {
        this.zzb &= -2;
        this.zze = zzp.zze;
    }

    public final /* synthetic */ void c0(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void d0() {
        this.zzb &= -3;
        this.zzf = zzp.zzf;
    }

    public final /* synthetic */ void e0(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzp, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2\u000bဈ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", e8.f11375a, "zzn", f8.f11409a, "zzo"});
        }
        if (i12 == 3) {
            return new g8();
        }
        if (i12 == 4) {
            return new d8(zzp);
        }
        if (i12 == 5) {
            return zzp;
        }
        if (i12 != 6) {
            throw null;
        }
        h2 h2Var = zzq;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (g8.class) {
            try {
                j1Var = zzq;
                if (j1Var == null) {
                    j1Var = new j1(zzp);
                    zzq = j1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j1Var;
    }

    public final /* synthetic */ void t() {
        this.zzb &= -5;
        this.zzg = zzp.zzg;
    }

    public final /* synthetic */ void u(long j9) {
        this.zzb |= 8;
        this.zzh = j9;
    }

    public final /* synthetic */ void v(String str) {
        this.zzb |= 16;
        this.zzi = str;
    }

    public final /* synthetic */ void w() {
        this.zzb &= -17;
        this.zzi = zzp.zzi;
    }

    public final /* synthetic */ void x(String str) {
        this.zzb |= 32;
        this.zzj = str;
    }

    public final /* synthetic */ void y() {
        this.zzb &= -33;
        this.zzj = zzp.zzj;
    }

    public final /* synthetic */ void z(String str) {
        this.zzb |= 64;
        this.zzk = str;
    }
}
