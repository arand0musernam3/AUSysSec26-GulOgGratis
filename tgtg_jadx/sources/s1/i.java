package s1;

import c5.x1;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import t1.m1;
import t1.q1;
import t1.t1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f38613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f38614b = 0;

    static {
        long j9 = Integer.MIN_VALUE;
        f38613a = (j9 & 4294967295L) | (j9 << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.Object r18, b4.t r19, kotlin.jvm.functions.Function1 r20, b4.f r21, java.lang.String r22, kotlin.jvm.functions.Function1 r23, u3.d r24, m3.n r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.i.a(java.lang.Object, b4.t, kotlin.jvm.functions.Function1, b4.f, java.lang.String, kotlin.jvm.functions.Function1, u3.d, m3.n, int, int):void");
    }

    public static final void b(q1 q1Var, b4.t tVar, Function1 function1, b4.f fVar, Function1 function12, u3.d dVar, m3.n nVar, int i11) {
        Function1 function13;
        m3.s sVar;
        z3.r rVar;
        m1 m1VarB;
        m3.s sVar2;
        boolean z11;
        q1 q1Var2 = q1Var;
        m3.s sVar3 = (m3.s) nVar;
        sVar3.c0(511725103);
        int i12 = (i11 & 6) == 0 ? (sVar3.f(q1Var2) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar3.f(tVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar3.h(function1) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar3.f(fVar) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar3.h(function12) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        u3.d dVar2 = dVar;
        if ((196608 & i11) == 0) {
            i12 |= sVar3.h(dVar2) ? 131072 : 65536;
        }
        if (sVar3.R(i12 & 1, (74899 & i12) != 74898)) {
            z5.m mVar = (z5.m) sVar3.j(x1.f7421n);
            int i13 = i12 & 14;
            boolean z12 = i13 == 4;
            Object objM = sVar3.M();
            m3.f fVar2 = m3.m.f29332a;
            if (z12 || objM == fVar2) {
                objM = new s(q1Var2, fVar, mVar);
                sVar3.k0(objM);
            }
            s sVar4 = (s) objM;
            boolean z13 = i13 == 4;
            Object objM2 = sVar3.M();
            Object obj = objM2;
            if (z13 || objM2 == fVar2) {
                Object[] objArr = {q1Var2.f39537a.j()};
                z3.r rVar2 = new z3.r();
                rVar2.addAll(kotlin.collections.y.T(objArr));
                sVar3.k0(rVar2);
                obj = rVar2;
            }
            z3.r rVar3 = (z3.r) obj;
            boolean z14 = i13 == 4;
            Object objM3 = sVar3.M();
            if (z14 || objM3 == fVar2) {
                long[] jArr = q1.g1.f35760a;
                objM3 = new q1.t0();
                sVar3.k0(objM3);
            }
            q1.t0 t0Var = (q1.t0) objM3;
            h2.s0 s0Var = q1Var2.f39537a;
            m3.k1 k1Var = q1Var2.f39540d;
            if (!rVar3.contains(s0Var.j())) {
                rVar3.clear();
                rVar3.add(s0Var.j());
            }
            if (Intrinsics.areEqual(s0Var.j(), k1Var.getValue())) {
                if (rVar3.size() != 1 || !Intrinsics.areEqual(rVar3.get(0), s0Var.j())) {
                    rVar3.clear();
                    rVar3.add(s0Var.j());
                }
                if (t0Var.f35756e != 1 || t0Var.b(s0Var.j())) {
                    t0Var.g();
                }
                sVar4.f38674b = fVar;
                sVar4.f38675c = mVar;
            }
            if (!Intrinsics.areEqual(s0Var.j(), k1Var.getValue()) && !rVar3.contains(k1Var.getValue())) {
                ListIterator listIterator = rVar3.listIterator();
                int i14 = 0;
                while (true) {
                    v70.b bVar = (v70.b) listIterator;
                    ListIterator listIterator2 = listIterator;
                    if (!bVar.hasNext()) {
                        i14 = -1;
                        break;
                    } else {
                        if (Intrinsics.areEqual(function12.invoke(bVar.next()), function12.invoke(k1Var.getValue()))) {
                            break;
                        }
                        i14++;
                        listIterator = listIterator2;
                    }
                }
                if (i14 == -1) {
                    rVar3.add(k1Var.getValue());
                } else {
                    rVar3.set(i14, k1Var.getValue());
                }
            }
            if (t0Var.b(k1Var.getValue()) && t0Var.b(s0Var.j())) {
                sVar3.a0(1925931827);
                sVar3.q(false);
                function13 = function1;
            } else {
                sVar3.a0(1966410449);
                t0Var.g();
                int size = rVar3.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj2 = rVar3.get(i15);
                    s sVar5 = sVar4;
                    sVar4 = sVar5;
                    t0Var.m(obj2, u3.e.e(-23915175, sVar3, new dp.p(q1Var2, obj2, function1, sVar5, rVar3, dVar2, 1)));
                    i15++;
                    q1Var2 = q1Var;
                    dVar2 = dVar;
                }
                function13 = function1;
                sVar3.q(false);
            }
            boolean zF = sVar3.f(q1Var.f()) | sVar3.f(sVar4);
            Object objM4 = sVar3.M();
            if (zF || objM4 == fVar2) {
                objM4 = (e0) function13.invoke(sVar4);
                sVar3.k0(objM4);
            }
            e0 e0Var = (e0) objM4;
            q1 q1Var3 = sVar4.f38673a;
            boolean zF2 = sVar3.f(sVar4);
            Object objM5 = sVar3.M();
            if (zF2 || objM5 == fVar2) {
                objM5 = m3.i.w(Boolean.FALSE);
                sVar3.k0(objM5);
            }
            m3.b1 b1Var = (m3.b1) objM5;
            m3.b1 b1VarB = m3.i.B(e0Var.f38575d, sVar3);
            if (Intrinsics.areEqual(q1Var3.f39537a.j(), q1Var3.f39540d.getValue())) {
                b1Var.setValue(Boolean.FALSE);
            } else if (b1VarB.getValue() != null) {
                b1Var.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            b4.t tVar2 = b4.q.f5711a;
            if (zBooleanValue) {
                sVar3.a0(1353077497);
                rVar = rVar3;
                m3.s sVar6 = sVar3;
                m1VarB = t1.b(sVar4.f38673a, t1.c.f39395q, null, sVar6, 0, 2);
                boolean zF3 = sVar6.f(m1VarB);
                Object objM6 = sVar6.M();
                if (zF3 || objM6 == fVar2) {
                    objM6 = f4.g.c(tVar2);
                    sVar6.k0(objM6);
                }
                tVar2 = (b4.t) objM6;
                sVar6.q(false);
                sVar2 = sVar6;
            } else {
                m3.s sVar7 = sVar3;
                rVar = rVar3;
                sVar7.a0(1353343539);
                sVar7.q(false);
                m1VarB = null;
                sVar4.f38678f = null;
                sVar2 = sVar7;
            }
            b4.t tVarThen = tVar.then(tVar2.then(new n(m1VarB, b1VarB, sVar4)));
            Object objM7 = sVar2.M();
            if (objM7 == fVar2) {
                objM7 = new k(sVar4);
                sVar2.k0(objM7);
            }
            k kVar = (k) objM7;
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(tVarThen, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(kVar, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            sVar2.a0(-860173498);
            int size2 = rVar.size();
            for (int i16 = 0; i16 < size2; i16++) {
                Object obj3 = rVar.get(i16);
                sVar2.Y(-2026002954, function12.invoke(obj3));
                Function2 function2 = (Function2) t0Var.d(obj3);
                if (function2 == null) {
                    sVar2.a0(1618454323);
                    z11 = false;
                } else {
                    z11 = false;
                    sVar2.a0(-2026001778);
                    function2.invoke(sVar2, 0);
                }
                sVar2.q(z11);
                sVar2.q(z11);
            }
            sVar2.q(false);
            sVar2.q(true);
            sVar = sVar2;
        } else {
            function13 = function1;
            m3.s sVar8 = sVar3;
            sVar8.U();
            sVar = sVar8;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g(q1Var, tVar, function13, fVar, function12, dVar, i11);
        }
    }
}
