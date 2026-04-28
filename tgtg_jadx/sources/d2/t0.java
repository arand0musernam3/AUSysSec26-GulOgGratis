package d2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements z4.a1, e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f13928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f13929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f13931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f13932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r0 f13933f;

    public t0(f fVar, h hVar, float f11, d0 d0Var, float f12, r0 r0Var) {
        this.f13928a = fVar;
        this.f13929b = hVar;
        this.f13930c = f11;
        this.f13931d = d0Var;
        this.f13932e = f12;
        this.f13933f = r0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int k(List list, int i11, int i12, int i13, r0 r0Var) {
        int i14;
        long jA;
        int i15 = 0;
        if (list.isEmpty()) {
            jA = q1.l.a(0, 0);
        } else {
            int i16 = Integer.MAX_VALUE;
            com.google.android.gms.internal.measurement.q0 q0Var = new com.google.android.gms.internal.measurement.q0(r0Var, z5.b.a(0, i11, 0, Integer.MAX_VALUE), i12, i13);
            z4.t tVar = (z4.t) CollectionsKt.Q(0, list);
            int iV = tVar != null ? tVar.V(i11) : 0;
            int iW = tVar != null ? tVar.w(iV) : 0;
            boolean z11 = true;
            if (list.size() > 1) {
                i14 = 1;
            } else {
                i14 = 1;
                z11 = false;
            }
            int i17 = 0;
            if (q0Var.b(z11, 0, q1.l.a(i11, Integer.MAX_VALUE), tVar == null ? null : new q1.l(q1.l.a(iW, iV)), 0, 0, 0, false, false).f13821b) {
                q1.l lVarA = r0Var.a(0, 0, tVar != null ? i14 : 0);
                jA = q1.l.a(lVarA != null ? (int) (lVarA.f35783a & 4294967295L) : 0, 0);
            } else {
                int size = list.size();
                int i18 = i11;
                int i19 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (true) {
                    if (i19 >= size) {
                        break;
                    }
                    int i25 = i18 - iW;
                    int i26 = i19 + 1;
                    int iMax = Math.max(i24, iV);
                    z4.t tVar2 = (z4.t) CollectionsKt.Q(i26, list);
                    int iV2 = tVar2 != null ? tVar2.V(i11) : i15;
                    int iW2 = tVar2 != null ? tVar2.w(iV2) + i12 : i15;
                    int i27 = i26 - i22;
                    boolean z12 = i19 + 2 < list.size() ? i14 : i15;
                    int i28 = i23;
                    int i29 = iV2;
                    int i31 = iW2;
                    k0 k0VarB = q0Var.b(z12, i27, q1.l.a(i25, i16), tVar2 == null ? null : new q1.l(q1.l.a(iW2, iV2)), i28, i17, iMax, false, false);
                    if (k0VarB.f13820a) {
                        int i32 = iMax + i13 + i17;
                        ax.r0 r0VarA = q0Var.a(k0VarB, tVar2 != null, i28, i32, i25, i27);
                        int i33 = i31 - i12;
                        i23 = i28 + 1;
                        if (k0VarB.f13821b) {
                            if (r0VarA != null) {
                                long j9 = r0VarA.f4992a;
                                if (!r0VarA.f4993b) {
                                    i32 += ((int) (j9 & 4294967295L)) + i13;
                                }
                            }
                            i17 = i32;
                            i21 = i26;
                        } else {
                            i22 = i26;
                            i17 = i32;
                            iW = i33;
                            i24 = 0;
                            i18 = i11;
                        }
                    } else {
                        iW = i31;
                        i18 = i25;
                        i23 = i28;
                        i24 = iMax;
                    }
                    i19 = i26;
                    i21 = i19;
                    iV = i29;
                    i16 = Integer.MAX_VALUE;
                    i15 = 0;
                    i14 = 1;
                }
                jA = q1.l.a(i17 - i13, i21);
            }
        }
        return (int) (jA >> 32);
    }

    @Override // z4.a1
    public final int a(z4.u uVar, List list, int i11) {
        List list2 = (List) CollectionsKt.Q(1, list);
        z4.t tVar = list2 != null ? (z4.t) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.Q(2, list);
        this.f13933f.b(tVar, list3 != null ? (z4.t) CollectionsKt.firstOrNull(list3) : null, z5.b.b(0, i11, 7));
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = kotlin.collections.n0.f26529a;
        }
        int iQ0 = uVar.q0(this.f13930c);
        int size = list4.size();
        int i12 = 0;
        int iMax = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < size) {
            int iY = ((z4.t) list4.get(i12)).y(i11) + iQ0;
            int i15 = i12 + 1;
            if (i15 - i13 == Integer.MAX_VALUE || i15 == list4.size()) {
                iMax = Math.max(iMax, (i14 + iY) - iQ0);
                i13 = i12;
                i14 = 0;
            } else {
                i14 += iY;
            }
            i12 = i15;
        }
        return iMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    @Override // z4.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(z4.u r36, java.util.List r37, int r38) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.t0.b(z4.u, java.util.List, int):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v34, types: [T, z4.m1] */
    /* JADX WARN: Type inference failed for: r3v38, types: [T, z4.m1] */
    @Override // z4.a1
    public final z4.v0 c(z4.w0 w0Var, List list, long j9) {
        boolean z11;
        z4.t0 t0Var;
        Iterator it;
        int i11;
        z4.t0 t0Var2;
        long j11;
        q1.l lVar;
        k0 k0Var;
        ax.r0 r0VarA;
        char c3;
        z4.t0 t0Var3;
        Ref.ObjectRef objectRef;
        long j12;
        q1.l lVar2;
        int i12;
        int i13;
        Integer numValueOf;
        q1.l lVar3;
        k0 k0Var2;
        long jA;
        long jA2;
        if (!((ArrayList) list).isEmpty()) {
            int iH = z5.a.h(j9);
            r0 r0Var = this.f13933f;
            if (iH != 0 || r0Var.f13901a == o0.Visible) {
                List list2 = (List) CollectionsKt.O(list);
                if (list2.isEmpty()) {
                    return z4.w0.f(w0Var, 0, 0, new cp.i(7));
                }
                List list3 = (List) CollectionsKt.Q(1, list);
                z4.t0 t0Var4 = list3 != null ? (z4.t0) CollectionsKt.firstOrNull(list3) : null;
                List list4 = (List) CollectionsKt.Q(2, list);
                z4.t0 t0Var5 = list4 != null ? (z4.t0) CollectionsKt.firstOrNull(list4) : null;
                list2.size();
                r0Var.getClass();
                m1 m1Var = m1.Horizontal;
                long jG = c.G(c.p(10, c.n(j9, m1Var)), m1Var);
                if (t0Var4 != null) {
                    if (d2.b(d2.a(t0Var4)) == 0.0f) {
                        d2.a(t0Var4);
                        z11 = true;
                        z4.m1 m1VarD = t0Var4.D(jG);
                        r0Var.f13906f = new q1.l(q1.l.a(m1VarD.e0(), m1VarD.d0()));
                        r0Var.f13903c = m1VarD;
                        m1VarD.e0();
                        m1VarD.d0();
                    } else {
                        z11 = true;
                        t0Var4.V(t0Var4.w(Integer.MAX_VALUE));
                    }
                    r0Var.f13902b = t0Var4;
                } else {
                    z11 = true;
                }
                if (t0Var5 != null) {
                    if (d2.b(d2.a(t0Var5)) == 0.0f) {
                        d2.a(t0Var5);
                        z4.m1 m1VarD2 = t0Var5.D(jG);
                        r0Var.f13907g = new q1.l(q1.l.a(m1VarD2.e0(), m1VarD2.d0()));
                        r0Var.f13905e = m1VarD2;
                        m1VarD2.e0();
                        m1VarD2.d0();
                    } else {
                        t0Var5.V(t0Var5.w(Integer.MAX_VALUE));
                    }
                    r0Var.f13904d = t0Var5;
                }
                Iterator it2 = list2.iterator();
                long jN = c.n(j9, m1Var);
                o3.e eVar = new o3.e(new z4.v0[16], 0);
                int i14 = z5.a.i(jN);
                int iK = z5.a.k(jN);
                int iH2 = z5.a.h(jN);
                q1.g0 g0Var = q1.p.f35804a;
                q1.g0 g0Var2 = new q1.g0();
                ArrayList arrayList = new ArrayList();
                int iCeil = (int) Math.ceil(w0Var.c0(this.f13930c));
                int iCeil2 = (int) Math.ceil(w0Var.c0(this.f13932e));
                long jA3 = z5.b.a(0, i14, 0, iH2);
                long jG2 = c.G(c.p(14, jA3), m1Var);
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                if (it2.hasNext()) {
                    try {
                        t0Var = (z4.t0) it2.next();
                    } catch (IndexOutOfBoundsException unused) {
                        t0Var = null;
                    }
                } else {
                    t0Var = null;
                }
                if (t0Var != null) {
                    if (d2.b(d2.a(t0Var)) == 0.0f) {
                        d2.a(t0Var);
                        it = it2;
                        ?? D = t0Var.D(jG2);
                        objectRef2.element = D;
                        i11 = iK;
                        jA2 = q1.l.a(D.e0(), D.d0());
                    } else {
                        it = it2;
                        i11 = iK;
                        int iW = t0Var.w(Integer.MAX_VALUE);
                        jA2 = q1.l.a(iW, t0Var.V(iW));
                    }
                    t0Var2 = t0Var;
                    j11 = jA3;
                    lVar = new q1.l(jA2);
                } else {
                    it = it2;
                    i11 = iK;
                    t0Var2 = t0Var;
                    j11 = jA3;
                    lVar = null;
                }
                Integer numValueOf2 = lVar != null ? Integer.valueOf((int) (lVar.f35783a >> 32)) : null;
                Integer numValueOf3 = lVar != null ? Integer.valueOf((int) (lVar.f35783a & 4294967295L)) : null;
                q1.f0 f0Var = new q1.f0();
                Integer num = numValueOf2;
                q1.f0 f0Var2 = new q1.f0();
                Integer num2 = numValueOf3;
                q1.h0 h0Var = new q1.h0();
                r0 r0Var2 = this.f13933f;
                com.google.android.gms.internal.measurement.q0 q0Var = new com.google.android.gms.internal.measurement.q0(r0Var2, jN, iCeil, iCeil2);
                q1.l lVar4 = lVar;
                k0 k0VarB = q0Var.b(it.hasNext(), 0, q1.l.a(i14, iH2), lVar4, 0, 0, 0, false, false);
                if (k0VarB.f13821b) {
                    k0Var = k0VarB;
                    r0VarA = q0Var.a(k0Var, lVar4 != null ? z11 : false, -1, 0, i14, 0);
                } else {
                    k0Var = k0VarB;
                    r0VarA = null;
                }
                z4.t0 t0Var6 = t0Var2;
                ax.r0 r0Var3 = r0VarA;
                int i15 = i14;
                int i16 = iCeil;
                k0 k0Var3 = k0Var;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = iH2;
                int iMin = i11;
                while (!k0Var3.f13821b && t0Var6 != null) {
                    num.getClass();
                    int iIntValue = num.intValue();
                    num2.getClass();
                    q1.h0 h0Var2 = h0Var;
                    int i25 = i19 + iIntValue;
                    int iMax = Math.max(i17, num2.intValue());
                    int i26 = i15 - iIntValue;
                    int i27 = i18 + 1;
                    r0Var2.getClass();
                    arrayList.add(t0Var6);
                    g0Var2.i(i18, objectRef2.element);
                    t0Var6.G();
                    int i28 = i27 - i21;
                    if (it.hasNext()) {
                        try {
                            t0Var3 = (z4.t0) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            t0Var3 = null;
                        }
                        t0Var6 = t0Var3;
                    } else {
                        t0Var6 = null;
                    }
                    objectRef2.element = null;
                    if (t0Var6 != null) {
                        if (d2.b(d2.a(t0Var6)) == 0.0f) {
                            d2.a(t0Var6);
                            ?? D2 = t0Var6.D(jG2);
                            objectRef2.element = D2;
                            objectRef = objectRef2;
                            jA = q1.l.a(D2.e0(), D2.d0());
                        } else {
                            objectRef = objectRef2;
                            int iW2 = t0Var6.w(Integer.MAX_VALUE);
                            jA = q1.l.a(iW2, t0Var6.V(iW2));
                        }
                        j12 = jG2;
                        lVar2 = new q1.l(jA);
                    } else {
                        objectRef = objectRef2;
                        j12 = jG2;
                        lVar2 = null;
                    }
                    Integer numValueOf4 = lVar2 != null ? Integer.valueOf(((int) (lVar2.f35783a >> 32)) + i16) : null;
                    Integer numValueOf5 = lVar2 != null ? Integer.valueOf((int) (lVar2.f35783a & 4294967295L)) : null;
                    boolean zHasNext = it.hasNext();
                    long jA4 = q1.l.a(i26, i24);
                    if (lVar2 == null) {
                        i12 = i26;
                        i13 = i24;
                        numValueOf = numValueOf4;
                        lVar3 = null;
                    } else {
                        numValueOf4.getClass();
                        int iIntValue2 = numValueOf4.intValue();
                        numValueOf5.getClass();
                        i12 = i26;
                        i13 = i24;
                        numValueOf = numValueOf4;
                        lVar3 = new q1.l(q1.l.a(iIntValue2, numValueOf5.intValue()));
                    }
                    k0 k0VarB2 = q0Var.b(zHasNext, i28, jA4, lVar3, i22, i23, iMax, false, false);
                    if (k0VarB2.f13820a) {
                        iMin = Math.min(Math.max(iMin, i25), i14);
                        int i29 = i23 + iMax;
                        com.google.android.gms.internal.measurement.q0 q0Var2 = q0Var;
                        ax.r0 r0VarA2 = q0Var2.a(k0VarB2, lVar2 != null ? z11 : false, i22, i29, i12, i28);
                        q0Var = q0Var2;
                        k0Var2 = k0VarB2;
                        f0Var2.c(iMax);
                        i24 = (i24 - i29) - iCeil2;
                        f0Var.c(i27);
                        i22++;
                        int i31 = i29 + iCeil2;
                        r0Var3 = r0VarA2;
                        i21 = i27;
                        i15 = i14;
                        numValueOf = numValueOf != null ? Integer.valueOf(numValueOf.intValue() - i16) : null;
                        i23 = i31;
                        i17 = 0;
                        i19 = 0;
                    } else {
                        k0Var2 = k0VarB2;
                        i17 = iMax;
                        i19 = i25;
                        i24 = i13;
                        i15 = i12;
                    }
                    k0 k0Var4 = k0Var2;
                    i18 = i27;
                    k0Var3 = k0Var4;
                    h0Var = h0Var2;
                    objectRef2 = objectRef;
                    num = numValueOf;
                    num2 = numValueOf5;
                    jG2 = j12;
                }
                q1.h0 h0Var3 = h0Var;
                if (r0Var3 != null) {
                    long j13 = r0Var3.f4992a;
                    arrayList.add((z4.t0) r0Var3.f4994c);
                    g0Var2.i(arrayList.size() - 1, (z4.m1) r0Var3.f4995d);
                    int i32 = f0Var.f35790b - 1;
                    if (r0Var3.f4993b) {
                        f0Var2.f(i32, Math.max(f0Var2.a(i32), (int) (j13 & 4294967295L)));
                        f0Var.f(i32, f0Var.b() + 1);
                    } else {
                        f0Var2.c((int) (j13 & 4294967295L));
                        f0Var.c(f0Var.b() + 1);
                    }
                }
                int size = arrayList.size();
                z4.m1[] m1VarArr = new z4.m1[size];
                for (int i33 = 0; i33 < size; i33++) {
                    m1VarArr[i33] = g0Var2.b(i33);
                }
                int i34 = f0Var.f35790b;
                int[] iArr = new int[i34];
                int[] iArr2 = new int[i34];
                int[] iArr3 = f0Var.f35789a;
                int iMax2 = iMin;
                int i35 = 0;
                int i36 = 0;
                int i37 = 0;
                while (i36 < i34) {
                    int i38 = iArr3[i36];
                    int iA = f0Var2.a(i36);
                    q1.h0 h0Var4 = h0Var3;
                    if (h0Var4.a(i36)) {
                        c3 = CharCompanionObject.MAX_VALUE;
                    } else {
                        int iH3 = z5.a.h(j11);
                        c3 = CharCompanionObject.MAX_VALUE;
                        iA = iH3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : z5.a.h(j11) - i37;
                    }
                    h0Var3 = h0Var4;
                    q1.f0 f0Var3 = f0Var2;
                    int[] iArr4 = iArr2;
                    int i39 = i16;
                    z4.v0 v0VarA = f2.a(this, iMax2, z5.a.j(j11), z5.a.i(j11), iA, i39, w0Var, arrayList, m1VarArr, i35, i38, iArr, i36);
                    int iB = v0VarA.b();
                    int height = v0VarA.getHeight();
                    iArr4[i36] = height;
                    i37 += height;
                    iMax2 = Math.max(iMax2, iB);
                    eVar.b(v0VarA);
                    i36++;
                    i16 = i39;
                    i35 = i38;
                    iArr2 = iArr4;
                    f0Var2 = f0Var3;
                }
                int[] iArr5 = iArr2;
                if (eVar.f31832c == 0) {
                    iMax2 = 0;
                    i37 = 0;
                }
                h hVar = this.f13929b;
                int iQ0 = ((eVar.f31832c - 1) * w0Var.q0(hVar.a())) + i37;
                int iJ = z5.a.j(jN);
                int iH4 = z5.a.h(jN);
                if (iQ0 < iJ) {
                    iQ0 = iJ;
                }
                if (iQ0 <= iH4) {
                    iH4 = iQ0;
                }
                hVar.b(w0Var, iH4, iArr5, iArr);
                int iK2 = z5.a.k(jN);
                int i41 = z5.a.i(jN);
                if (iMax2 < iK2) {
                    iMax2 = iK2;
                }
                if (iMax2 <= i41) {
                    i41 = iMax2;
                }
                return z4.w0.f(w0Var, i41, iH4, new c50.p(eVar, 7));
            }
        }
        return z4.w0.f(w0Var, 0, 0, new cp.i(6));
    }

    @Override // z4.a1
    public final int d(z4.u uVar, List list, int i11) {
        List list2 = (List) CollectionsKt.Q(1, list);
        z4.t tVar = list2 != null ? (z4.t) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.Q(2, list);
        z4.t tVar2 = list3 != null ? (z4.t) CollectionsKt.firstOrNull(list3) : null;
        long jB = z5.b.b(i11, 0, 13);
        r0 r0Var = this.f13933f;
        r0Var.b(tVar, tVar2, jB);
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = kotlin.collections.n0.f26529a;
        }
        return k(list4, i11, uVar.q0(this.f13930c), uVar.q0(this.f13932e), r0Var);
    }

    @Override // z4.a1
    public final int e(z4.u uVar, List list, int i11) {
        List list2 = (List) CollectionsKt.Q(1, list);
        z4.t tVar = list2 != null ? (z4.t) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.Q(2, list);
        z4.t tVar2 = list3 != null ? (z4.t) CollectionsKt.firstOrNull(list3) : null;
        long jB = z5.b.b(i11, 0, 13);
        r0 r0Var = this.f13933f;
        r0Var.b(tVar, tVar2, jB);
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = kotlin.collections.n0.f26529a;
        }
        return k(list4, i11, uVar.q0(this.f13930c), uVar.q0(this.f13932e), r0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.areEqual(this.f13928a, t0Var.f13928a) && Intrinsics.areEqual(this.f13929b, t0Var.f13929b) && z5.f.c(this.f13930c, t0Var.f13930c) && Intrinsics.areEqual(this.f13931d, t0Var.f13931d) && z5.f.c(this.f13932e, t0Var.f13932e) && Intrinsics.areEqual(this.f13933f, t0Var.f13933f);
    }

    @Override // d2.e2
    public final long f(int i11, int i12, int i13, boolean z11) {
        i2 i2Var = h2.f13800a;
        return !z11 ? z5.b.a(i11, i12, 0, i13) : y9.w.r(i11, i12, 0, i13);
    }

    @Override // d2.e2
    public final void g(int i11, int[] iArr, int[] iArr2, z4.w0 w0Var) {
        this.f13928a.c(w0Var, i11, iArr, w0Var.getLayoutDirection(), iArr2);
    }

    @Override // d2.e2
    public final int h(z4.m1 m1Var) {
        return m1Var.e0();
    }

    public final int hashCode() {
        return this.f13933f.hashCode() + r8.k.b(Integer.MAX_VALUE, r8.k.b(Integer.MAX_VALUE, r8.k.a((this.f13931d.hashCode() + r8.k.a((this.f13929b.hashCode() + ((this.f13928a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, this.f13930c, 31)) * 31, this.f13932e, 31), 31), 31);
    }

    @Override // d2.e2
    public final int i(z4.m1 m1Var) {
        return m1Var.d0();
    }

    @Override // d2.e2
    public final z4.v0 j(final z4.m1[] m1VarArr, z4.w0 w0Var, final int[] iArr, int i11, final int i12, final int[] iArr2, final int i13, final int i14, final int i15) {
        final z5.m mVar = z5.m.Ltr;
        return z4.w0.f(w0Var, i11, i12, new Function1() { // from class: d2.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                c cVar;
                z4.l1 l1Var = (z4.l1) obj;
                int[] iArr3 = iArr2;
                int i16 = iArr3 != null ? iArr3[i13] : 0;
                int i17 = i14;
                for (int i18 = i17; i18 < i15; i18++) {
                    z4.m1 m1Var = m1VarArr[i18];
                    m1Var.getClass();
                    Object objG = m1Var.G();
                    g2 g2Var = objG instanceof g2 ? (g2) objG : null;
                    if (g2Var == null || (cVar = g2Var.f13795c) == null) {
                        cVar = this.f13931d;
                    }
                    l1Var.j(m1Var, iArr[i18 - i17], cVar.i(i12, m1Var.d0(), mVar) + i16, 0.0f);
                }
                return Unit.f26487a;
            }
        });
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=");
        sb2.append(this.f13928a);
        sb2.append(", verticalArrangement=");
        sb2.append(this.f13929b);
        sb2.append(", mainAxisSpacing=");
        r8.k.u(this.f13930c, ", crossAxisAlignment=", sb2);
        sb2.append(this.f13931d);
        sb2.append(", crossAxisArrangementSpacing=");
        r8.k.u(this.f13932e, ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=", sb2);
        sb2.append(this.f13933f);
        sb2.append(')');
        return sb2.toString();
    }
}
