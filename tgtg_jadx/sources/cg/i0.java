package cg;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m2.a2;
import m2.j2;
import m2.y1;
import m3.b1;
import m3.w1;
import z1.h2;
import z4.l1;
import z4.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7992d;

    public /* synthetic */ i0(int i11, Object obj, Object obj2, int i12) {
        this.f7989a = i12;
        this.f7990b = i11;
        this.f7991c = obj;
        this.f7992d = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        m3.w wVar;
        m3.w wVar2;
        int i11;
        int i12 = this.f7989a;
        int i13 = 2;
        int i14 = 0;
        final int i15 = this.f7990b;
        Object obj2 = this.f7992d;
        Object obj3 = this.f7991c;
        switch (i12) {
            case 0:
                b1 b1Var = (b1) obj3;
                b1 b1Var2 = (b1) obj2;
                m5.q0 q0Var = (m5.q0) obj;
                q0Var.getClass();
                if (!((Boolean) b1Var.getValue()).booleanValue()) {
                    b1Var2.setValue(Boolean.valueOf(q0Var.f29618b.f29628f > i15));
                    b1Var.setValue(Boolean.TRUE);
                }
                break;
            case 1:
                hp.g gVar = (hp.g) obj3;
                final Function1 function1 = (Function1) obj2;
                f2.l lVar = (f2.l) obj;
                lVar.getClass();
                int i16 = 3;
                f2.l.q(lVar, null, lp.d.f28023g, 3);
                f2.l.q(lVar, null, new u3.d(new lp.h(1, gVar), true, -596846167), 3);
                f2.l.t(lVar, new u3.d(new i80.o() { // from class: lp.j
                    @Override // i80.o
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        ((Integer) obj5).intValue();
                        m3.n nVar = (m3.n) obj6;
                        int iIntValue = ((Integer) obj7).intValue();
                        ((f2.d) obj4).getClass();
                        m3.s sVar = (m3.s) nVar;
                        if (sVar.R(iIntValue & 1, (iIntValue & 129) != 128)) {
                            r.c(i15, 0, function1, sVar);
                        } else {
                            sVar.U();
                        }
                        return Unit.f26487a;
                    }
                }, true, 401079220));
                if (i15 == 0) {
                    List list2 = gVar.f22281g;
                    if (list2 != null) {
                        f2.l.q(lVar, null, lp.d.f28025i, 3);
                        f2.l.s(lVar, list2.size(), null, new u3.d(new lp.e(list2, i13), true, -1988113182), 6);
                    }
                } else if (i15 == 1 && (list = gVar.f22282h) != null) {
                    f2.l.s(lVar, list.size(), null, new u3.d(new lp.e(list, i16), true, 102824695), 6);
                }
                f2.l.q(lVar, null, lp.d.f28024h, 3);
                break;
            case 2:
                j2 j2Var = (j2) obj3;
                m1 m1Var = (m1) obj2;
                l1 l1Var = (l1) obj;
                int i17 = j2Var.f28918b;
                y1 y1Var = j2Var.f28917a;
                r5.e0 e0Var = j2Var.f28919c;
                a2 a2Var = (a2) j2Var.f28920d.invoke();
                y1Var.a(h2.Vertical, m2.g0.o(l1Var, i17, e0Var, a2Var != null ? a2Var.f28762a : null, false, m1Var.f47183a), i15, m1Var.f47184b);
                l1.o(l1Var, m1Var, 0, Math.round(-y1Var.f29139a.h()));
                break;
            case 3:
                w1 w1Var = (w1) obj3;
                q1.n0 n0Var = (q1.n0) obj2;
                m3.w wVar3 = (m3.w) obj;
                if (w1Var.f29477e == i15 && Intrinsics.areEqual(n0Var, w1Var.f29478f) && (wVar3 instanceof m3.a0)) {
                    long[] jArr = n0Var.f35868a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i18 = 0;
                        while (true) {
                            long j9 = jArr[i18];
                            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i19 = 8;
                                int i21 = 8 - ((~(i18 - length)) >>> 31);
                                int i22 = i14;
                                while (i22 < i21) {
                                    if ((255 & j9) < 128) {
                                        int i23 = (i18 << 3) + i22;
                                        Object obj4 = n0Var.f35869b[i23];
                                        boolean z11 = n0Var.f35870c[i23] != i15;
                                        if (z11) {
                                            i11 = i19;
                                            m3.a0 a0Var = (m3.a0) wVar3;
                                            q1.t0 t0Var = a0Var.f29181g;
                                            v0.n.E(t0Var, obj4, w1Var);
                                            wVar2 = wVar3;
                                            if (obj4 instanceof m3.i0) {
                                                m3.i0 i0Var = (m3.i0) obj4;
                                                if (!t0Var.b(i0Var)) {
                                                    v0.n.F(a0Var.f29184j, i0Var);
                                                }
                                                q1.t0 t0Var2 = w1Var.f29479g;
                                                if (t0Var2 != null) {
                                                    t0Var2.k(obj4);
                                                }
                                            }
                                        } else {
                                            wVar2 = wVar3;
                                            i11 = i19;
                                        }
                                        if (z11) {
                                            n0Var.f(i23);
                                        }
                                    } else {
                                        wVar2 = wVar3;
                                        i11 = i19;
                                    }
                                    j9 >>= i11;
                                    i22++;
                                    i19 = i11;
                                    wVar3 = wVar2;
                                }
                                wVar = wVar3;
                                if (i21 == i19) {
                                }
                            } else {
                                wVar = wVar3;
                            }
                            if (i18 != length) {
                                i18++;
                                wVar3 = wVar;
                                i14 = 0;
                            }
                        }
                    }
                }
                break;
            case 4:
                v1.w1 w1Var2 = (v1.w1) obj3;
                m1 m1Var2 = (m1) obj2;
                l1 l1Var2 = (l1) obj;
                int iH = w1Var2.f41866o.f41888a.h();
                if (iH < 0) {
                    iH = 0;
                }
                if (iH <= i15) {
                    i15 = iH;
                }
                int i24 = -i15;
                boolean z12 = w1Var2.f41867p;
                int i25 = z12 ? 0 : i24;
                if (!z12) {
                    i24 = 0;
                }
                l1Var2.f47177a = true;
                l1.p(l1Var2, m1Var2, i25, i24);
                l1Var2.f47177a = false;
                break;
            default:
                String str = (String) obj3;
                List list3 = (List) obj2;
                v2.a aVar = (v2.a) obj;
                m5.t0 t0Var3 = aVar.f41923e;
                if (t0Var3 != null) {
                    long j11 = t0Var3.f29650a;
                    int i26 = (int) (j11 >> 32);
                    w2.c0.q(aVar, i26, (int) (4294967295L & j11), str);
                    if (str.length() > 0) {
                        aVar.d(list3, i26, str.length() + i26);
                    }
                } else {
                    long j12 = aVar.f41922d;
                    int i27 = m5.t0.f29649c;
                    int i28 = (int) (j12 >> 32);
                    w2.c0.q(aVar, i28, (int) (4294967295L & j12), str);
                    if (str.length() > 0) {
                        aVar.d(list3, i28, str.length() + i28);
                    }
                }
                long j13 = aVar.f41922d;
                int i29 = m5.t0.f29649c;
                int i31 = (int) (j13 >> 32);
                int iC = n80.p.c(i15 > 0 ? (i31 + i15) - 1 : (i31 + i15) - str.length(), 0, aVar.f41920b.length());
                aVar.f(m5.k0.b(iC, iC));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ i0(Object obj, int i11, Object obj2, int i12) {
        this.f7989a = i12;
        this.f7991c = obj;
        this.f7990b = i11;
        this.f7992d = obj2;
    }

    public /* synthetic */ i0(Object obj, Object obj2, int i11, int i12) {
        this.f7989a = i12;
        this.f7991c = obj;
        this.f7992d = obj2;
        this.f7990b = i11;
    }
}
