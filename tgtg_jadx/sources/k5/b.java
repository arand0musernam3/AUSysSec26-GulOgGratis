package k5;

import a3.j;
import android.os.Handler;
import b5.c2;
import b5.f1;
import b5.l1;
import b5.m0;
import b5.s1;
import c5.f2;
import i4.g0;
import kotlin.jvm.internal.LongCompanionObject;
import org.bouncycastle.asn1.BERTags;
import q1.o0;
import z5.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f25958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f25959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f25960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b4.b f25964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f25965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final defpackage.a f25966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h4.a f25967j;

    public b() {
        j jVar = new j(5, (char) 0);
        jVar.f399c = new long[BERTags.PRIVATE];
        jVar.f400d = new long[BERTags.PRIVATE];
        this.f25958a = jVar;
        this.f25959b = new e();
        this.f25960c = new o0();
        this.f25965h = -1L;
        this.f25966i = new defpackage.a(this, 27);
        this.f25967j = new h4.a();
    }

    public static boolean c(s1 s1Var) {
        c2 c2Var = s1Var.M;
        return (c2Var == null || g0.s(((f2) c2Var).b())) ? false : true;
    }

    public static long g(m0 m0Var) {
        l1 l1Var = m0Var.G;
        s1 s1Var = l1Var.f5858d;
        long jD = 0;
        for (s1 s1Var2 = l1Var.f5857c; s1Var2 != null && s1Var2 != s1Var; s1Var2 = s1Var2.f5968r) {
            if (c(s1Var2)) {
                return 9223372034707292159L;
            }
            jD = z5.j.d(jD, s1Var2.A);
        }
        return jD;
    }

    public static void i(m0 m0Var) {
        if (!m0Var.f5867c || c(m0Var.G.f5858d)) {
            return;
        }
        m0Var.f5867c = false;
        if (m0Var.f5871g) {
            m0Var.f5870f = g(m0Var);
            m0Var.f5871g = false;
        }
        if (z5.j.b(m0Var.f5870f, 9223372034707292159L)) {
            return;
        }
        o3.e eVarA = m0Var.A();
        Object[] objArr = eVarA.f31830a;
        int i11 = eVarA.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            i((m0) objArr[i12]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.b.a():void");
    }

    public final long b(m0 m0Var) {
        long j9;
        int i11 = m0Var.f5866b & 33554431;
        j jVar = this.f25958a;
        long[] jArr = (long[]) jVar.f399c;
        int i12 = jVar.f398b;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            if ((((int) jArr[i13 + 2]) & 33554431) == i11) {
                j9 = jArr[i13];
                break;
            }
        }
        j9 = Long.MAX_VALUE;
        if (j9 == LongCompanionObject.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((long) ((int) (j9 >> 32))) << 32) | (((long) ((int) j9)) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(b5.m0 r24) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.b.d(b5.m0):void");
    }

    public final void e(m0 m0Var) {
        if (m0Var.f5872h) {
            this.f25961d = true;
            int i11 = m0Var.f5866b & 33554431;
            j jVar = this.f25958a;
            long[] jArr = (long[]) jVar.f399c;
            int i12 = jVar.f398b;
            int i13 = 0;
            while (true) {
                if (i13 >= jArr.length - 2 || i13 >= i12) {
                    break;
                }
                int i14 = i13 + 2;
                long j9 = jArr[i14];
                if ((((int) j9) & 33554431) == i11) {
                    jArr[i14] = (((j9 >> 63) & 1) << 60) | j9;
                    break;
                }
                i13 += 3;
            }
        }
        j();
    }

    public final void f(m0 m0Var, boolean z11) {
        long j9;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean zJ = m0Var.J();
        l1 l1Var = m0Var.G;
        if (zJ) {
            m0 m0VarW = m0Var.w();
            if (m0VarW == null || m0VarW.f5867c) {
                j9 = m0VarW == null ? 0L : 9223372034707292159L;
            } else {
                if (m0VarW.f5871g) {
                    m0VarW.f5871g = false;
                    m0VarW.f5870f = g(m0VarW);
                }
                j9 = m0VarW.f5870f;
            }
            s1 s1Var = l1Var.f5858d;
            if (z5.j.b(j9, 9223372034707292159L) || c(s1Var)) {
                d(m0Var);
                return;
            }
            if (m0Var.f5867c) {
                d(m0Var);
                i(m0Var);
                return;
            }
            long jD = z5.j.d(j9, s1Var.A);
            f1 f1Var = m0Var.H.f5942p;
            int iE0 = f1Var.e0();
            int iD0 = f1Var.d0();
            long j11 = (((long) iE0) << 32) | (((long) iD0) & 4294967295L);
            int i15 = m0Var.f5866b;
            boolean z12 = m0Var.f5872h;
            j jVar = this.f25958a;
            if (!z12) {
                m0Var.f5872h = true;
                boolean zD = l1Var.d(1024);
                boolean zD2 = l1Var.d(16);
                boolean zA = this.f25959b.f25983a.a(i15);
                if (m0VarW != null) {
                    int i16 = m0VarW.f5866b;
                    int i17 = (int) (jD >> 32);
                    int i18 = (int) (jD & 4294967295L);
                    int i19 = 33554431;
                    int i21 = i15 & 33554431;
                    long[] jArr = (long[]) jVar.f399c;
                    int i22 = jVar.f398b;
                    int i23 = 0;
                    while (true) {
                        if (i23 >= jArr.length - 2 || i23 >= i22) {
                            break;
                        }
                        int i24 = i19;
                        long[] jArr2 = jArr;
                        if ((((int) jArr2[i23 + 2]) & i24) == i16) {
                            long j12 = jArr2[i23];
                            int i25 = ((int) (j12 >> 32)) + i17;
                            int i26 = ((int) j12) + i18;
                            jVar.n(i21, i25, i26, i25 + iE0, i26 + iD0, i16, zD, zD2, zA, i23);
                            break;
                        }
                        jArr = jArr2;
                        i23 += 3;
                        i19 = i24;
                        i16 = i16;
                    }
                } else {
                    int i27 = (int) (jD >> 32);
                    int i28 = (int) (jD & 4294967295L);
                    jVar.n(i15, i27, i28, i27 + iE0, i28 + iD0, (512 & 32) != 0 ? -1 : 0, zD, zD2, zA, -1);
                }
                this.f25961d = true;
            } else if (z11 || !z5.j.b(jD, m0Var.f5868d) || !l.a(j11, m0Var.f5869e)) {
                if (m0VarW != null) {
                    int i29 = m0VarW.f5866b;
                    int i31 = (int) (jD >> 32);
                    int i32 = (int) (jD & 4294967295L);
                    int i33 = i15 & 33554431;
                    long[] jArr3 = (long[]) jVar.f399c;
                    int i34 = jVar.f398b;
                    int i35 = 0;
                    while (true) {
                        if (i35 >= jArr3.length - 2 || i35 >= i34) {
                            break;
                        }
                        int i36 = iE0;
                        if ((((int) jArr3[i35 + 2]) & 33554431) == i29) {
                            long j13 = jArr3[i35];
                            i13 = i31;
                            i14 = i32;
                            int i37 = ((int) (j13 >> 32)) + i13;
                            int i38 = ((int) j13) + i14;
                            int i39 = i37 + i36;
                            int i41 = i38 + iD0;
                            int i42 = i35 + 3;
                            i11 = i29;
                            while (i42 < jArr3.length - 2 && i42 < i34) {
                                int i43 = i42 + 2;
                                int i44 = i34;
                                long j14 = jArr3[i43];
                                int i45 = i42;
                                if ((((int) j14) & 33554431) == i33) {
                                    long j15 = jArr3[i45];
                                    int i46 = i37 - ((int) (j15 >> 32));
                                    int i47 = i38 - ((int) j15);
                                    jArr3[i45] = (((long) i37) << 32) | (((long) i38) & 4294967295L);
                                    jArr3[i45 + 1] = (((long) i39) << 32) | (((long) i41) & 4294967295L);
                                    jArr3[i43] = j14 | (((j14 >> 63) & 1) << 60);
                                    if (i46 != 0 || i47 != 0) {
                                        jVar.u(i46, i47, (j14 & a.f25956b) | (((long) ((i45 + 3) & 33554431)) << 25));
                                    }
                                } else {
                                    i42 = i45 + 3;
                                    i34 = i44;
                                }
                            }
                            i12 = i34;
                            i35 = i42;
                        } else {
                            i11 = i29;
                            i12 = i34;
                            i13 = i31;
                            i14 = i32;
                        }
                        i35 += 3;
                        iE0 = i36;
                        i31 = i13;
                        i32 = i14;
                        i29 = i11;
                        i34 = i12;
                    }
                } else {
                    int i48 = (int) (jD >> 32);
                    int i49 = (int) (jD & 4294967295L);
                    int i51 = i48 + iE0;
                    int i52 = i49 + iD0;
                    int i53 = i15 & 33554431;
                    long[] jArr4 = (long[]) jVar.f399c;
                    int i54 = jVar.f398b;
                    int i55 = 0;
                    while (true) {
                        if (i55 >= jArr4.length - 2 || i55 >= i54) {
                            break;
                        }
                        int i56 = i55 + 2;
                        int i57 = i54;
                        int i58 = i55;
                        long j16 = jArr4[i56];
                        long[] jArr5 = jArr4;
                        if ((((int) j16) & 33554431) == i53) {
                            long j17 = jArr5[i58];
                            jArr5[i58] = (((long) i48) << 32) | (((long) i49) & 4294967295L);
                            jArr5[i58 + 1] = (((long) i51) << 32) | (((long) i52) & 4294967295L);
                            jArr5[i56] = j16 | (((j16 >> 63) & 1) << 60);
                            int i59 = i48 - ((int) (j17 >> 32));
                            int i61 = i49 - ((int) j17);
                            if ((i59 != 0) | (i61 != 0)) {
                                jVar.u(i59, i61, (j16 & a.f25956b) | (((long) ((i58 + 3) & 33554431)) << 25));
                            }
                        } else {
                            i55 = i58 + 3;
                            i54 = i57;
                            jArr4 = jArr5;
                        }
                    }
                }
                this.f25961d = true;
            }
            m0Var.f5869e = j11;
            m0Var.f5868d = jD;
        }
    }

    public final void h(m0 m0Var) {
        if (m0Var.f5872h) {
            int i11 = m0Var.f5866b & 33554431;
            j jVar = this.f25958a;
            long[] jArr = (long[]) jVar.f399c;
            int i12 = jVar.f398b;
            int i13 = 0;
            while (true) {
                if (i13 >= jArr.length - 2 || i13 >= i12) {
                    break;
                }
                int i14 = i13 + 2;
                if ((((int) jArr[i14]) & 33554431) == i11) {
                    jArr[i13] = -1;
                    jArr[i13 + 1] = -1;
                    jArr[i14] = a.f25957c;
                    break;
                }
                i13 += 3;
            }
            m0Var.f5872h = false;
            this.f25961d = true;
            this.f25963f = true;
        }
    }

    public final void j() {
        b4.b bVar = this.f25964g;
        boolean z11 = bVar != null;
        long j9 = this.f25959b.f25985c;
        if (j9 >= 0 || !z11) {
            if (this.f25965h == j9 && z11) {
                return;
            }
            if (bVar != null) {
                Handler handler = b4.c.f5682a;
                b4.c.f5682a.removeCallbacks(bVar);
            }
            Handler handler2 = b4.c.f5682a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j9, ((long) 16) + jCurrentTimeMillis);
            this.f25965h = jMax;
            b4.b bVar2 = new b4.b(0, this.f25966i);
            b4.c.f5682a.postDelayed(bVar2, jMax - jCurrentTimeMillis);
            this.f25964g = bVar2;
        }
    }
}
