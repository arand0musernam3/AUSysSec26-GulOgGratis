package a3;

import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s2 f402a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r4.a f406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function1 f407f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h4.b f412k;
    public z4.z l;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n1 f420t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f421u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public v80.b0 f422v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public u f423w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f424x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.k1 f403b = m3.i.w(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.k1 f404c = m3.i.w(Boolean.TRUE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function1 f405d = new s0(this, 7);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s2.l f408g = new s2.l();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g4.v f409h = new g4.v();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m3.k1 f410i = m3.i.w(Boolean.FALSE);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m3.i0 f411j = m3.i.q(new n0(this, 4));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m3.k1 f413m = new m3.k1(Unit.f26487a, m3.f.f29272d);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m3.k1 f414n = m3.i.w(new h4.b(0));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m3.k1 f415o = m3.i.w(new h4.b(0));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m3.k1 f416p = m3.i.w(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m3.k1 f417q = m3.i.w(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m3.k1 f418r = m3.i.w(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m3.k1 f419s = m3.i.w(null);

    public j2(s2 s2Var) {
        this.f402a = s2Var;
        s2Var.f561e = new s0(this, 8);
        s2Var.f562f = new z1(this, 0);
        s2Var.f563g = new a2(this);
        int i11 = 2;
        s2Var.f564h = new n0(this, i11);
        s2Var.f565i = new s0(this, i11);
        s2Var.f566j = new s0(this, 3);
    }

    public final long a(z4.z zVar, long j9) {
        z4.z zVar2 = this.l;
        if (zVar2 == null || !zVar2.n()) {
            return 9205357640488583168L;
        }
        return j().g(zVar, j9);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r13 = this;
            a3.i0 r0 = r13.f()
            r1 = 0
            if (r0 == 0) goto L11
            a3.s2 r0 = r13.f402a
            q1.v r2 = r0.a()
            int r2 = r2.f35838e
            if (r2 != 0) goto L14
        L11:
            r0 = r1
            goto La2
        L14:
            m5.e r2 = new m5.e
            r2.<init>()
            z4.z r3 = r13.j()
            java.util.ArrayList r3 = r0.c(r3)
            int r4 = r3.size()
            java.util.ListIterator r4 = r3.listIterator(r4)
        L29:
            boolean r5 = r4.hasPrevious()
            r6 = -1
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.previous()
            a3.s r5 = (a3.s) r5
            q1.v r7 = r0.a()
            long r8 = r5.f549a
            java.lang.Object r5 = r7.b(r8)
            a3.i0 r5 = (a3.i0) r5
            if (r5 == 0) goto L29
            a3.h0 r7 = r5.f385a
            int r7 = r7.f367b
            a3.h0 r5 = r5.f386b
            int r5 = r5.f367b
            if (r7 == r5) goto L29
            int r4 = r4.nextIndex()
            goto L54
        L53:
            r4 = r6
        L54:
            if (r4 == r6) goto L9e
            int r5 = r3.size()
            r6 = 0
            r7 = r6
        L5c:
            if (r7 >= r5) goto L9e
            java.lang.Object r8 = r3.get(r7)
            a3.s r8 = (a3.s) r8
            q1.v r9 = r0.a()
            long r10 = r8.f549a
            java.lang.Object r9 = r9.b(r10)
            a3.i0 r9 = (a3.i0) r9
            if (r9 == 0) goto L9b
            m5.h r8 = r8.d()
            a3.h0 r10 = r9.f385a
            int r10 = r10.f367b
            a3.h0 r9 = r9.f386b
            int r9 = r9.f367b
            long r9 = m5.k0.b(r10, r9)
            if (r7 < r4) goto L86
            r11 = 1
            goto L87
        L86:
            r11 = r6
        L87:
            int r12 = m5.t0.g(r9)
            int r9 = m5.t0.f(r9)
            r2.e(r8, r12, r9)
            if (r11 != 0) goto L9b
            r8 = 10
            java.lang.StringBuilder r9 = r2.f29525a
            r9.append(r8)
        L9b:
            int r7 = r7 + 1
            goto L5c
        L9e:
            m5.h r0 = r2.j()
        La2:
            if (r0 == 0) goto Lb6
            java.lang.String r2 = r0.f29538b
            int r2 = r2.length()
            if (r2 <= 0) goto Lad
            r1 = r0
        Lad:
            if (r1 == 0) goto Lb6
            kotlin.jvm.functions.Function1 r0 = r13.f407f
            if (r0 == 0) goto Lb6
            r0.invoke(r1)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.j2.b():void");
    }

    public final s c(h0 h0Var) {
        return (s) this.f402a.f559c.b(h0Var.f368c);
    }

    public final Pair d() {
        int iNextIndex;
        int iG;
        int length;
        if (f() == null) {
            return null;
        }
        s2 s2Var = this.f402a;
        if (s2Var.f558b.isEmpty()) {
            return null;
        }
        m5.e eVar = new m5.e();
        ArrayList arrayListC = s2Var.c(j());
        ListIterator listIterator = arrayListC.listIterator(arrayListC.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            i0 i0Var = (i0) s2Var.a().b(((s) listIterator.previous()).f549a);
            if (i0Var != null && i0Var.f385a.f367b != i0Var.f386b.f367b) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex != -1) {
            int size = arrayListC.size();
            int i11 = 0;
            iG = -1;
            length = -1;
            int i12 = 0;
            while (i12 < size) {
                s sVar = (s) arrayListC.get(i12);
                i0 i0Var2 = (i0) s2Var.a().b(sVar.f549a);
                if (i0Var2 != null) {
                    m5.h hVarD = sVar.d();
                    long jB = m5.k0.b(i0Var2.f385a.f367b, i0Var2.f386b.f367b);
                    int i13 = i12 >= iNextIndex ? 1 : i11;
                    if (iG == -1) {
                        iG = m5.t0.g(jB);
                        eVar.e(hVarD, i11, m5.t0.g(jB));
                    }
                    eVar.e(hVarD, m5.t0.g(jB), m5.t0.f(jB));
                    StringBuilder sb2 = eVar.f29525a;
                    if (i13 == 0) {
                        sb2.append('\n');
                    } else {
                        length = sb2.length();
                        eVar.e(hVarD, m5.t0.f(jB), hVarD.f29538b.length());
                    }
                }
                i12++;
                i11 = 0;
            }
        } else {
            iG = -1;
            length = -1;
        }
        m5.h hVarJ = eVar.j();
        if (iG == -1 || length == -1) {
            return null;
        }
        return new Pair(hVarJ, new m5.t0(m5.k0.b(iG, length)));
    }

    public final m2.t0 e() {
        return (m2.t0) this.f418r.getValue();
    }

    public final i0 f() {
        return (i0) this.f403b.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f404c.getValue()).booleanValue();
    }

    public final boolean h() {
        i0 i0VarF = f();
        if (i0VarF != null) {
            h0 h0Var = i0VarF.f386b;
            h0 h0Var2 = i0VarF.f385a;
            if (!Intrinsics.areEqual(h0Var2, h0Var)) {
                if (h0Var2.f368c == h0Var.f368c) {
                    return true;
                }
                z4.z zVarJ = j();
                s2 s2Var = this.f402a;
                ArrayList arrayListC = s2Var.c(zVarJ);
                int size = arrayListC.size();
                for (int i11 = 0; i11 < size; i11++) {
                    i0 i0Var = (i0) s2Var.a().b(((s) arrayListC.get(i11)).f549a);
                    if (i0Var != null && i0Var.f385a.f367b != i0Var.f386b.f367b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void i() {
        r4.a aVar;
        q1.k0 k0Var = q1.w.f35850a;
        k0Var.getClass();
        this.f402a.f567k.setValue(k0Var);
        this.f424x = false;
        o();
        if (f() != null) {
            this.f405d.invoke(null);
            if (!g() || (aVar = this.f406e) == null) {
                return;
            }
            aVar.a(9);
        }
    }

    public final z4.z j() {
        z4.z zVar = this.l;
        if (zVar != null) {
            if (!zVar.n()) {
                c2.a.a("unattached coordinates");
            }
            return zVar;
        }
        c2.a.b("null coordinates");
        qc.y.m();
        return null;
    }

    public final void k(boolean z11) {
        m3.k1 k1Var = this.f404c;
        if (((Boolean) k1Var.getValue()).booleanValue() != z11) {
            k1Var.setValue(Boolean.valueOf(z11));
            o();
        }
    }

    public final void l(i0 i0Var) {
        this.f403b.setValue(i0Var);
        if (i0Var != null) {
            m();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r20 = this;
            r0 = r20
            a3.i0 r1 = r0.f()
            z4.z r2 = r0.l
            r3 = 0
            if (r1 == 0) goto L14
            a3.h0 r4 = r1.f385a
            if (r4 == 0) goto L14
            a3.s r4 = r0.c(r4)
            goto L15
        L14:
            r4 = r3
        L15:
            if (r1 == 0) goto L20
            a3.h0 r5 = r1.f386b
            if (r5 == 0) goto L20
            a3.s r5 = r0.c(r5)
            goto L21
        L20:
            r5 = r3
        L21:
            if (r4 == 0) goto L28
            z4.z r6 = r4.c()
            goto L29
        L28:
            r6 = r3
        L29:
            if (r5 == 0) goto L30
            z4.z r7 = r5.c()
            goto L31
        L30:
            r7 = r3
        L31:
            m3.k1 r8 = r0.f417q
            m3.k1 r9 = r0.f416p
            if (r1 == 0) goto Lab
            if (r2 == 0) goto Lab
            boolean r10 = r2.n()
            if (r10 == 0) goto Lab
            if (r6 != 0) goto L44
            if (r7 != 0) goto L44
            goto Lab
        L44:
            h4.c r10 = a3.l2.c(r2)
            r13 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            if (r6 == 0) goto L78
            r15 = 1
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            long r11 = r4.a(r1, r15)
            long r18 = r11 & r13
            int r4 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r4 != 0) goto L60
            goto L7d
        L60:
            long r11 = r2.g(r6, r11)
            h4.b r4 = new h4.b
            r4.<init>(r11)
            m2.t0 r6 = r0.e()
            m2.t0 r15 = m2.t0.SelectionStart
            if (r6 == r15) goto L7e
            boolean r6 = a3.l2.a(r11, r10)
            if (r6 == 0) goto L7d
            goto L7e
        L78:
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
        L7d:
            r4 = r3
        L7e:
            r9.setValue(r4)
            if (r7 == 0) goto La7
            r4 = 0
            long r4 = r5.a(r1, r4)
            long r11 = r4 & r13
            int r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r1 != 0) goto L8f
            goto La7
        L8f:
            long r1 = r2.g(r7, r4)
            h4.b r4 = new h4.b
            r4.<init>(r1)
            m2.t0 r5 = r0.e()
            m2.t0 r6 = m2.t0.SelectionEnd
            if (r5 == r6) goto La6
            boolean r1 = a3.l2.a(r1, r10)
            if (r1 == 0) goto La7
        La6:
            r3 = r4
        La7:
            r8.setValue(r3)
            return
        Lab:
            r9.setValue(r3)
            r8.setValue(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.j2.m():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean n(long j9, long j11, boolean z11, j0 j0Var) {
        ArrayList arrayList;
        n1 x2Var;
        m5.q0 q0Var;
        long j12;
        ArrayList arrayList2;
        int i11;
        long jE;
        int i12;
        p1 p1Var;
        long j13;
        long j14;
        l lVarR;
        l lVar;
        l lVar2;
        boolean z12;
        int i13;
        ArrayList arrayList3;
        l lVar3;
        ArrayList arrayList4;
        l lVar4;
        l lVar5;
        l lVar6;
        p1 p1Var2;
        int i14;
        int i15;
        int i16;
        h0 h0Var;
        int i17;
        h0 h0Var2;
        this.f418r.setValue(z11 ? m2.t0.SelectionStart : m2.t0.SelectionEnd);
        this.f419s.setValue(new h4.b(j9));
        z4.z zVarJ = j();
        s2 s2Var = this.f402a;
        ArrayList arrayListC = s2Var.c(zVarJ);
        int i18 = q1.t.f35829a;
        q1.i0 i0Var = new q1.i0(6);
        int size = arrayListC.size();
        int i19 = 0;
        for (int i21 = 0; i21 < size; i21++) {
            i0Var.e(i21, ((s) arrayListC.get(i21)).f549a);
        }
        long j15 = 9223372034707292159L;
        long j16 = 9205357640488583168L;
        p1 p1Var3 = new p1(j9, j11, zVarJ, z11, (j11 & 9223372034707292159L) == 9205357640488583168L ? null : f(), new d2(i0Var, i19));
        int size2 = arrayListC.size();
        int i22 = 0;
        while (true) {
            arrayList = p1Var3.f516h;
            if (i22 >= size2) {
                break;
            }
            s sVar = (s) arrayListC.get(i22);
            z4.z zVarC = sVar.c();
            if (zVarC == null || (q0Var = (m5.q0) sVar.f551c.invoke()) == null) {
                i12 = size2;
                i13 = i22;
                arrayList4 = arrayListC;
                i11 = i19;
                j12 = j15;
                j14 = j16;
                p1Var2 = p1Var3;
            } else {
                j12 = j15;
                long jG = p1Var3.f511c.g(zVarC, 0L);
                long jE2 = h4.b.e(p1Var3.f509a, jG);
                int i23 = i19;
                long j17 = p1Var3.f510b;
                if ((j17 & j12) == j16) {
                    i11 = i23;
                    arrayList2 = arrayListC;
                    jE = j16;
                } else {
                    arrayList2 = arrayListC;
                    i11 = i23;
                    jE = h4.b.e(j17, jG);
                }
                long j18 = sVar.f549a;
                i12 = size2;
                int i24 = i22;
                long j19 = q0Var.f29619c;
                float f11 = (int) (j19 >> 32);
                float f12 = (int) (j19 & 4294967295L);
                int i25 = (int) (jE2 >> 32);
                l lVar7 = Float.intBitsToFloat(i25) < 0.0f ? l.BEFORE : Float.intBitsToFloat(i25) > f11 ? l.AFTER : l.ON;
                int i26 = (int) (jE2 & 4294967295L);
                l lVar8 = Float.intBitsToFloat(i26) < 0.0f ? l.BEFORE : Float.intBitsToFloat(i26) > f12 ? l.AFTER : l.ON;
                boolean z13 = p1Var3.f512d;
                i0 i0Var2 = p1Var3.f513e;
                if (z13) {
                    j14 = j16;
                    p1Var = p1Var3;
                    j13 = j18;
                    lVarR = d40.t1.r(lVar7, lVar8, p1Var, j13, i0Var2 != null ? i0Var2.f386b : null);
                    z12 = z13;
                    i13 = i24;
                    arrayList3 = arrayList;
                    arrayList4 = arrayList2;
                    lVar4 = lVar7;
                    lVar = lVar4;
                    lVar5 = lVar8;
                    lVar2 = lVar5;
                    lVar3 = lVarR;
                    lVar6 = lVar3;
                } else {
                    p1Var = p1Var3;
                    j13 = j18;
                    j14 = j16;
                    lVarR = d40.t1.r(lVar7, lVar8, p1Var, j13, i0Var2 != null ? i0Var2.f385a : null);
                    lVar = lVar7;
                    lVar2 = lVar8;
                    z12 = z13;
                    i13 = i24;
                    arrayList3 = arrayList;
                    lVar3 = lVar;
                    arrayList4 = arrayList2;
                    lVar4 = lVarR;
                    lVar5 = lVar4;
                    lVar6 = lVar2;
                }
                p1Var2 = p1Var;
                l lVarB = s1.b(lVar, lVar2);
                if (lVarB == l.ON || lVarB != lVarR) {
                    int length = q0Var.f29617a.f29603a.f29538b.length();
                    d2 d2Var = p1Var2.f514f;
                    if (z12) {
                        int iC = d40.t1.C(jE2, q0Var);
                        if (i0Var2 == null || (h0Var2 = i0Var2.f386b) == null) {
                            i17 = iC;
                            length = i17;
                        } else {
                            i17 = iC;
                            int iCompare = d2Var.compare(Long.valueOf(h0Var2.f368c), Long.valueOf(j13));
                            if (iCompare < 0) {
                                length = i11;
                            } else if (iCompare <= 0) {
                                length = h0Var2.f367b;
                            }
                        }
                        i16 = length;
                        i15 = i17;
                    } else {
                        int iC2 = d40.t1.C(jE2, q0Var);
                        if (i0Var2 == null || (h0Var = i0Var2.f385a) == null) {
                            i14 = iC2;
                            i15 = i14;
                        } else {
                            i14 = iC2;
                            int iCompare2 = d2Var.compare(Long.valueOf(h0Var.f368c), Long.valueOf(j13));
                            if (iCompare2 < 0) {
                                length = i11;
                            } else if (iCompare2 <= 0) {
                                length = h0Var.f367b;
                            }
                            i15 = length;
                        }
                        i16 = i14;
                    }
                    int iC3 = (jE & j12) == j14 ? -1 : d40.t1.C(jE, q0Var);
                    int i27 = p1Var2.f519k + 2;
                    p1Var2.f519k = i27;
                    long j21 = j13;
                    f0 f0Var = new f0(j21, i27, i15, i16, iC3, q0Var);
                    p1Var2.f517i = p1Var2.a(p1Var2.f517i, lVar4, lVar5);
                    p1Var2.f518j = p1Var2.a(p1Var2.f518j, lVar3, lVar6);
                    p1Var2.f515g.e(arrayList3.size(), j21);
                    arrayList3.add(f0Var);
                }
            }
            i22 = i13 + 1;
            i19 = i11;
            size2 = i12;
            p1Var3 = p1Var2;
            j15 = j12;
            j16 = j14;
            arrayListC = arrayList4;
        }
        p1 p1Var4 = p1Var3;
        boolean z14 = i19;
        int i28 = p1Var4.f519k + 1;
        int size3 = arrayList.size();
        if (size3 == 0) {
            x2Var = null;
        } else if (size3 != 1) {
            int i29 = p1Var4.f517i;
            int i31 = i29 == -1 ? i28 : i29;
            int i32 = p1Var4.f518j;
            x2Var = new r(p1Var4.f515g, arrayList, i31, i32 == -1 ? i28 : i32, p1Var4.f512d, p1Var4.f513e);
        } else {
            f0 f0Var2 = (f0) CollectionsKt.h0(arrayList);
            int i33 = p1Var4.f517i;
            int i34 = i33 == -1 ? i28 : i33;
            int i35 = p1Var4.f518j;
            x2Var = new x2(p1Var4.f512d, i34, i35 == -1 ? i28 : i35, p1Var4.f513e, f0Var2);
        }
        if (x2Var == null || !x2Var.i(this.f420t)) {
            return z14;
        }
        i0 i0VarA = j0Var.a(x2Var);
        if (!Intrinsics.areEqual(i0VarA, f())) {
            if (g()) {
                ArrayList arrayList5 = s2Var.f558b;
                int size4 = arrayList5.size();
                int i36 = z14 ? 1 : 0;
                while (true) {
                    if (i36 >= size4) {
                        break;
                    }
                    if (((s) arrayList5.get(i36)).d().f29538b.length() > 0) {
                        r4.a aVar = this.f406e;
                        if (aVar != null) {
                            aVar.a(9);
                        }
                    } else {
                        i36++;
                    }
                }
            }
            s2Var.f567k.setValue(x2Var.h(i0VarA));
            this.f405d.invoke(i0VarA);
            this.f421u = z14;
        }
        this.f420t = x2Var;
        return true;
    }

    public final void o() {
        v80.b2 b2Var;
        if (((Boolean) this.f410i.getValue()).booleanValue()) {
            boolean z11 = this.f424x;
            s2.l lVar = this.f408g;
            if (z11 && g()) {
                if (((h4.c) this.f411j.getValue()) == null) {
                    return;
                }
                lVar.a();
            } else {
                s2.j jVar = lVar.f38778a;
                if (jVar == null || (b2Var = jVar.f38775u) == null) {
                    return;
                }
                b2Var.a(null);
                jVar.f38775u = null;
            }
        }
    }
}
