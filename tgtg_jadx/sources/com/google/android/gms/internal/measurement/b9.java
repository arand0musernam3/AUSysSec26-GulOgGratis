package com.google.android.gms.internal.measurement;

import android.os.Build;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b9 extends k1 {
    private static final b9 zzaw;
    private static volatile h2 zzax;
    private long zzA;
    private int zzB;
    private String zzC;
    private String zzD;
    private boolean zzE;
    private t1 zzF;
    private String zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private String zzK;
    private long zzL;
    private long zzM;
    private String zzN;
    private String zzO;
    private int zzP;
    private String zzQ;
    private c9 zzR;
    private o1 zzS;
    private long zzT;
    private long zzU;
    private String zzV;
    private String zzW;
    private int zzX;
    private boolean zzY;
    private String zzZ;
    private boolean zzaa;
    private x8 zzab;
    private String zzac;
    private t1 zzad;
    private String zzae;
    private long zzaf;
    private boolean zzag;
    private String zzah;
    private boolean zzai;
    private String zzaj;
    private int zzak;
    private String zzal;
    private j8 zzam;
    private int zzan;
    private g8 zzao;
    private String zzap;
    private j9 zzaq;
    private long zzar;
    private String zzas;
    private p8 zzat;
    private String zzau;
    private t1 zzav;
    private int zzb;
    private int zze;
    private int zzf;
    private t1 zzg;
    private t1 zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private int zzr;
    private String zzs;
    private String zzt;
    private String zzu;
    private long zzv;
    private long zzw;
    private String zzx;
    private boolean zzy;
    private String zzz;

    static {
        b9 b9Var = new b9();
        zzaw = b9Var;
        k1.o(b9.class, b9Var);
    }

    public b9() {
        k2 k2Var = k2.f11555e;
        this.zzg = k2Var;
        this.zzh = k2Var;
        this.zzn = "";
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzs = "";
        this.zzt = "";
        this.zzu = "";
        this.zzx = "";
        this.zzz = "";
        this.zzC = "";
        this.zzD = "";
        this.zzF = k2Var;
        this.zzG = "";
        this.zzK = "";
        this.zzN = "";
        this.zzO = "";
        this.zzQ = "";
        this.zzS = l1.f11581e;
        this.zzV = "";
        this.zzW = "";
        this.zzZ = "";
        this.zzac = "";
        this.zzad = k2Var;
        this.zzae = "";
        this.zzah = "";
        this.zzaj = "";
        this.zzal = "";
        this.zzap = "";
        this.zzas = "";
        this.zzau = "";
        this.zzav = k2Var;
    }

    public static a9 Y() {
        return (a9) zzaw.j();
    }

    public static a9 Z(b9 b9Var) {
        i1 i1VarJ = zzaw.j();
        i1VarJ.f(b9Var);
        return (a9) i1VarJ;
    }

    public final boolean A() {
        return (this.zzb & 131072) != 0;
    }

    public final String A0() {
        return this.zzac;
    }

    public final /* synthetic */ void A1(long j9) {
        this.zzb |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
        this.zzv = j9;
    }

    public final boolean B() {
        return this.zzy;
    }

    public final boolean B0() {
        return (this.zze & 32768) != 0;
    }

    public final /* synthetic */ void B1() {
        this.zzb |= 32768;
        this.zzw = 161000L;
    }

    public final String C() {
        return this.zzz;
    }

    public final long C0() {
        return this.zzaf;
    }

    public final /* synthetic */ void C1(String str) {
        str.getClass();
        this.zzb |= 65536;
        this.zzx = str;
    }

    public final boolean D() {
        return (this.zzb & 524288) != 0;
    }

    public final boolean D0() {
        return this.zzag;
    }

    public final /* synthetic */ void D1() {
        this.zzb &= -65537;
        this.zzx = zzaw.zzx;
    }

    public final long E() {
        return this.zzA;
    }

    public final boolean E0() {
        return (this.zze & 131072) != 0;
    }

    public final /* synthetic */ void E1(boolean z11) {
        this.zzb |= 131072;
        this.zzy = z11;
    }

    public final boolean F() {
        return (this.zzb & 1048576) != 0;
    }

    public final String F0() {
        return this.zzah;
    }

    public final /* synthetic */ void F1() {
        this.zzb &= -131073;
        this.zzy = false;
    }

    public final int G() {
        return this.zzB;
    }

    public final boolean G0() {
        return (this.zze & 262144) != 0;
    }

    public final /* synthetic */ void G1(String str) {
        this.zzb |= 262144;
        this.zzz = str;
    }

    public final String H() {
        return this.zzC;
    }

    public final boolean H0() {
        return this.zzai;
    }

    public final /* synthetic */ void H1() {
        this.zzb &= -262145;
        this.zzz = zzaw.zzz;
    }

    public final String I() {
        return this.zzD;
    }

    public final boolean I0() {
        return (this.zze & 524288) != 0;
    }

    public final /* synthetic */ void I1(long j9) {
        this.zzb |= 524288;
        this.zzA = j9;
    }

    public final boolean J() {
        return (this.zzb & 8388608) != 0;
    }

    public final String J0() {
        return this.zzaj;
    }

    public final /* synthetic */ void J1(int i11) {
        this.zzb |= 1048576;
        this.zzB = i11;
    }

    public final boolean K() {
        return this.zzE;
    }

    public final int K0() {
        return this.zzak;
    }

    public final /* synthetic */ void K1(String str) {
        this.zzb |= 2097152;
        this.zzC = str;
    }

    public final t1 L() {
        return this.zzF;
    }

    public final boolean L0() {
        return (this.zze & 4194304) != 0;
    }

    public final /* synthetic */ void L1() {
        this.zzb &= -2097153;
        this.zzC = zzaw.zzC;
    }

    public final String M() {
        return this.zzG;
    }

    public final j8 M0() {
        j8 j8Var = this.zzam;
        return j8Var == null ? j8.B() : j8Var;
    }

    public final /* synthetic */ void M1(String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzD = str;
    }

    public final boolean N() {
        return (this.zzb & 33554432) != 0;
    }

    public final boolean N0() {
        return (this.zze & 8388608) != 0;
    }

    public final /* synthetic */ void N1() {
        this.zzb |= 8388608;
        this.zzE = false;
    }

    public final int O() {
        return this.zzH;
    }

    public final int O0() {
        return this.zzan;
    }

    public final void O1(ArrayList arrayList) {
        t1 t1Var = this.zzF;
        if (!((o0) t1Var).f11682a) {
            this.zzF = b3.i.h(t1Var);
        }
        n0.d(arrayList, this.zzF);
    }

    public final boolean P() {
        return (this.zzb & 536870912) != 0;
    }

    public final boolean P0() {
        return (this.zze & 16777216) != 0;
    }

    public final void P1() {
        this.zzF = k2.f11555e;
    }

    public final long Q() {
        return this.zzL;
    }

    public final g8 Q0() {
        g8 g8Var = this.zzao;
        return g8Var == null ? g8.Z() : g8Var;
    }

    public final /* synthetic */ void Q1(String str) {
        this.zzb |= 16777216;
        this.zzG = str;
    }

    public final boolean R() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final boolean R0() {
        return (this.zze & 67108864) != 0;
    }

    public final /* synthetic */ void R1(int i11) {
        this.zzb |= 33554432;
        this.zzH = i11;
    }

    public final String S() {
        return this.zzN;
    }

    public final j9 S0() {
        j9 j9Var = this.zzaq;
        return j9Var == null ? j9.v() : j9Var;
    }

    public final /* synthetic */ void S1() {
        this.zzb &= -268435457;
        this.zzK = zzaw.zzK;
    }

    public final boolean T() {
        return (this.zzb & 1) != 0;
    }

    public final int T0() {
        return this.zzf;
    }

    public final List T1() {
        return this.zzg;
    }

    public final boolean U() {
        return (this.zze & 134217728) != 0;
    }

    public final /* synthetic */ void U0(long j9) {
        this.zzb |= 536870912;
        this.zzL = j9;
    }

    public final void U1() {
        t1 t1Var = this.zzg;
        if (((o0) t1Var).f11682a) {
            return;
        }
        this.zzg = b3.i.h(t1Var);
    }

    public final long V() {
        return this.zzar;
    }

    public final /* synthetic */ void V0(String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzN = str;
    }

    public final void V1() {
        t1 t1Var = this.zzh;
        if (((o0) t1Var).f11682a) {
            return;
        }
        this.zzh = b3.i.h(t1Var);
    }

    public final boolean W() {
        return (this.zze & 536870912) != 0;
    }

    public final /* synthetic */ void W0() {
        this.zzb &= Integer.MAX_VALUE;
        this.zzN = zzaw.zzN;
    }

    public final void W1(List list) {
        t1 t1Var = this.zzav;
        if (!((o0) t1Var).f11682a) {
            this.zzav = b3.i.h(t1Var);
        }
        n0.d(list, this.zzav);
    }

    public final p8 X() {
        p8 p8Var = this.zzat;
        return p8Var == null ? p8.v() : p8Var;
    }

    public final /* synthetic */ void X0(int i11) {
        this.zze |= 2;
        this.zzP = i11;
    }

    public final int X1() {
        return this.zzg.size();
    }

    public final void Y0(List list) {
        RandomAccess randomAccess = this.zzS;
        if (!((o0) randomAccess).f11682a) {
            l1 l1Var = (l1) randomAccess;
            int i11 = l1Var.f11583c;
            this.zzS = l1Var.k(i11 + i11);
        }
        n0.d(list, this.zzS);
    }

    public final t8 Y1(int i11) {
        return (t8) this.zzg.get(i11);
    }

    public final /* synthetic */ void Z0(long j9) {
        this.zze |= 16;
        this.zzT = j9;
    }

    public final t1 Z1() {
        return this.zzh;
    }

    public final /* synthetic */ void a0() {
        this.zzb |= 1;
        this.zzf = 1;
    }

    public final /* synthetic */ void a1(long j9) {
        this.zze |= 32;
        this.zzU = j9;
    }

    public final int a2() {
        return this.zzh.size();
    }

    public final /* synthetic */ void b0(int i11, t8 t8Var) {
        U1();
        this.zzg.set(i11, t8Var);
    }

    public final /* synthetic */ void b1(String str) {
        this.zze |= 128;
        this.zzW = str;
    }

    public final l9 b2(int i11) {
        return (l9) this.zzh.get(i11);
    }

    public final /* synthetic */ void c0(t8 t8Var) {
        U1();
        this.zzg.add(t8Var);
    }

    public final /* synthetic */ void c1(String str) {
        str.getClass();
        this.zze |= 8192;
        this.zzac = str;
    }

    public final boolean c2() {
        return (this.zzb & 2) != 0;
    }

    public final /* synthetic */ void d0(Iterable iterable) {
        U1();
        n0.d(iterable, this.zzg);
    }

    public final /* synthetic */ void d1() {
        this.zze &= -8193;
        this.zzac = zzaw.zzac;
    }

    public final long d2() {
        return this.zzi;
    }

    public final void e0() {
        this.zzg = k2.f11555e;
    }

    public final void e1(Set set) {
        t1 t1Var = this.zzad;
        if (!((o0) t1Var).f11682a) {
            this.zzad = b3.i.h(t1Var);
        }
        n0.d(set, this.zzad);
    }

    public final boolean e2() {
        return (this.zzb & 4) != 0;
    }

    public final /* synthetic */ void f0(int i11) {
        U1();
        this.zzg.remove(i11);
    }

    public final /* synthetic */ void f1(String str) {
        str.getClass();
        this.zze |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
        this.zzae = str;
    }

    public final long f2() {
        return this.zzj;
    }

    public final /* synthetic */ void g0(int i11, l9 l9Var) {
        V1();
        this.zzh.set(i11, l9Var);
    }

    public final /* synthetic */ void g1(long j9) {
        this.zze |= 32768;
        this.zzaf = j9;
    }

    public final boolean g2() {
        return (this.zzb & 8) != 0;
    }

    public final /* synthetic */ void h0(l9 l9Var) {
        V1();
        this.zzh.add(l9Var);
    }

    public final /* synthetic */ void h1(boolean z11) {
        this.zze |= 65536;
        this.zzag = z11;
    }

    public final long h2() {
        return this.zzk;
    }

    public final /* synthetic */ void i0(int i11) {
        V1();
        this.zzh.remove(i11);
    }

    public final /* synthetic */ void i1(String str) {
        this.zze |= 131072;
        this.zzah = str;
    }

    public final boolean i2() {
        return (this.zzb & 16) != 0;
    }

    public final /* synthetic */ void j0(long j9) {
        this.zzb |= 2;
        this.zzi = j9;
    }

    public final /* synthetic */ void j1(boolean z11) {
        this.zze |= 262144;
        this.zzai = z11;
    }

    public final long j2() {
        return this.zzl;
    }

    public final /* synthetic */ void k0() {
        this.zzb &= -3;
        this.zzi = 0L;
    }

    public final /* synthetic */ void k1(String str) {
        str.getClass();
        this.zze |= 524288;
        this.zzaj = str;
    }

    public final boolean k2() {
        return (this.zzb & 32) != 0;
    }

    public final /* synthetic */ void l0(long j9) {
        this.zzb |= 4;
        this.zzj = j9;
    }

    public final /* synthetic */ void l1(int i11) {
        this.zze |= 1048576;
        this.zzak = i11;
    }

    public final long l2() {
        return this.zzm;
    }

    public final /* synthetic */ void m0(long j9) {
        this.zzb |= 8;
        this.zzk = j9;
    }

    public final /* synthetic */ void m1(j8 j8Var) {
        this.zzam = j8Var;
        this.zze |= 4194304;
    }

    public final String m2() {
        return this.zzn;
    }

    public final /* synthetic */ void n0(long j9) {
        this.zzb |= 16;
        this.zzl = j9;
    }

    public final /* synthetic */ void n1(int i11) {
        this.zze |= 8388608;
        this.zzan = i11;
    }

    public final String n2() {
        return this.zzo;
    }

    public final /* synthetic */ void o0() {
        this.zzb &= -17;
        this.zzl = 0L;
    }

    public final /* synthetic */ void o1(g8 g8Var) {
        this.zzao = g8Var;
        this.zze |= 16777216;
    }

    public final String o2() {
        return this.zzp;
    }

    public final /* synthetic */ void p0(long j9) {
        this.zzb |= 32;
        this.zzm = j9;
    }

    public final /* synthetic */ void p1(j9 j9Var) {
        this.zzaq = j9Var;
        this.zze |= 67108864;
    }

    public final String p2() {
        return this.zzq;
    }

    public final /* synthetic */ void q0() {
        this.zzb &= -33;
        this.zzm = 0L;
    }

    public final /* synthetic */ void q1(long j9) {
        this.zze |= 134217728;
        this.zzar = j9;
    }

    public final boolean q2() {
        return (this.zzb & 1024) != 0;
    }

    public final /* synthetic */ void r0() {
        this.zzb |= 64;
        this.zzn = AnalyticsPlatformParams.channel;
    }

    public final /* synthetic */ void r1(p8 p8Var) {
        this.zzat = p8Var;
        this.zze |= 536870912;
    }

    public final int r2() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzaw, "\u0004E\u0000\u0002\u0001YE\u0000\u0006\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=Xဈ>Y\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", t8.class, "zzh", l9.class, "zzi", "zzj", "zzk", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzl", "zzE", "zzF", l8.class, "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", k0.f11545h, "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", d7.class});
        }
        if (i12 == 3) {
            return new b9();
        }
        if (i12 == 4) {
            return new a9(zzaw);
        }
        if (i12 == 5) {
            return zzaw;
        }
        if (i12 != 6) {
            throw null;
        }
        h2 h2Var = zzax;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (b9.class) {
            try {
                j1Var = zzax;
                if (j1Var == null) {
                    j1Var = new j1(zzaw);
                    zzax = j1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j1Var;
    }

    public final /* synthetic */ void s0(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzo = str;
    }

    public final /* synthetic */ void s1(String str) {
        this.zze |= 1073741824;
        this.zzau = str;
    }

    public final String s2() {
        return this.zzs;
    }

    public final String t() {
        return this.zzt;
    }

    public final boolean t0() {
        return (this.zze & 2) != 0;
    }

    public final /* synthetic */ void t1() {
        String str = Build.MODEL;
        str.getClass();
        this.zzb |= 256;
        this.zzp = str;
    }

    public final String u() {
        return this.zzu;
    }

    public final int u0() {
        return this.zzP;
    }

    public final /* synthetic */ void u1() {
        this.zzb &= -257;
        this.zzp = zzaw.zzp;
    }

    public final boolean v() {
        return (this.zzb & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0;
    }

    public final boolean v0() {
        return (this.zze & 16) != 0;
    }

    public final /* synthetic */ void v1(String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzq = str;
    }

    public final long w() {
        return this.zzv;
    }

    public final long w0() {
        return this.zzT;
    }

    public final /* synthetic */ void w1(int i11) {
        this.zzb |= 1024;
        this.zzr = i11;
    }

    public final boolean x() {
        return (this.zzb & 32768) != 0;
    }

    public final boolean x0() {
        return (this.zze & 128) != 0;
    }

    public final /* synthetic */ void x1(String str) {
        str.getClass();
        this.zzb |= NewHope.SENDB_BYTES;
        this.zzs = str;
    }

    public final long y() {
        return this.zzw;
    }

    public final String y0() {
        return this.zzW;
    }

    public final /* synthetic */ void y1(String str) {
        str.getClass();
        this.zzb |= 4096;
        this.zzt = str;
    }

    public final String z() {
        return this.zzx;
    }

    public final boolean z0() {
        return (this.zze & 8192) != 0;
    }

    public final /* synthetic */ void z1(String str) {
        str.getClass();
        this.zzb |= 8192;
        this.zzu = str;
    }
}
