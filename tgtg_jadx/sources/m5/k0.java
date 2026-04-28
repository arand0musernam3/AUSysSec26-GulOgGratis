package m5;

import c5.x1;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import m2.p1;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ub.a f29569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ub.a f29570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ub.a f29571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ub.a f29572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ub.a f29573e;

    static {
        int i11 = 28;
        f29569a = new ub.a(i11, new c0(28), new d0(10));
        f29570b = new ub.a(i11, new c0(29), new d0(11));
        f29571c = new ub.a(i11, new j0(0, (byte) 0), new d0(12));
        f29572d = new ub.a(i11, new j0(1, (byte) 0), new d0(13));
        f29573e = new ub.a(i11, new j0(2, (byte) 0), new d0(14));
    }

    public static b a(String str, u0 u0Var, long j9, z5.c cVar, q5.h hVar, kotlin.collections.n0 n0Var, int i11, int i12) {
        if ((i12 & 32) != 0) {
            n0Var = kotlin.collections.n0.f26529a;
        }
        return new b(new u5.d(str, u0Var, n0Var, kotlin.collections.n0.f26529a, hVar, cVar), i11, 1, j9);
    }

    public static final long b(int i11, int i12) {
        if (i11 < 0 || i12 < 0) {
            s5.a.a("start and end cannot be negative. [start: " + i11 + ", end: " + i12 + ']');
        }
        long j9 = (((long) i12) & 4294967295L) | (((long) i11) << 32);
        int i13 = t0.f29649c;
        return j9;
    }

    public static final String c(String str, t5.b bVar) {
        Locale locale = bVar.f39794a;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb2.append((Object) (Character.isLowerCase(cCharAt) ? CharsKt.c(cCharAt, locale) : String.valueOf(cCharAt)));
        sb2.append(str.substring(1));
        return sb2.toString();
    }

    public static final long d(int i11, long j9) {
        int i12 = t0.f29649c;
        int i13 = (int) (j9 >> 32);
        int i14 = i13 < 0 ? 0 : i13;
        if (i14 > i11) {
            i14 = i11;
        }
        int i15 = (int) (4294967295L & j9);
        int i16 = i15 >= 0 ? i15 : 0;
        if (i16 <= i11) {
            i11 = i16;
        }
        return (i14 == i13 && i11 == i15) ? j9 : b(i14, i11);
    }

    public static final int e(int i11, List list) {
        int i12;
        int i13 = ((t) CollectionsKt.W(list)).f29643c;
        if (i11 > ((t) CollectionsKt.W(list)).f29643c) {
            s5.a.a("Index " + i11 + " should be less or equal than last line's end " + i13);
        }
        int size = list.size() - 1;
        int i14 = 0;
        while (true) {
            if (i14 > size) {
                i12 = -(i14 + 1);
                break;
            }
            i12 = (i14 + size) >>> 1;
            t tVar = (t) list.get(i12);
            byte b8 = tVar.f29642b > i11 ? (byte) 1 : tVar.f29643c <= i11 ? (byte) -1 : (byte) 0;
            if (b8 >= 0) {
                if (b8 <= 0) {
                    break;
                }
                size = i12 - 1;
            } else {
                i14 = i12 + 1;
            }
        }
        if (i12 >= 0 && i12 < list.size()) {
            return i12;
        }
        StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(i12, "Found paragraph index ", " should be in range [0, ");
        sbK.append(list.size());
        sbK.append(").\nDebug info: index=");
        sbK.append(i11);
        sbK.append(", paragraphs=[");
        sbK.append(b6.b.a(list, null, new p1(8), 31));
        sbK.append(']');
        s5.a.a(sbK.toString());
        return i12;
    }

    public static final int f(int i11, List list) {
        int size = list.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            t tVar = (t) list.get(i13);
            byte b8 = tVar.f29644d > i11 ? (byte) 1 : tVar.f29645e <= i11 ? (byte) -1 : (byte) 0;
            if (b8 < 0) {
                i12 = i13 + 1;
            } else {
                if (b8 <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static final int g(ArrayList arrayList, float f11) {
        if (f11 <= 0.0f) {
            return 0;
        }
        if (f11 >= ((t) CollectionsKt.W(arrayList)).f29647g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            t tVar = (t) arrayList.get(i12);
            byte b8 = tVar.f29646f > f11 ? (byte) 1 : tVar.f29647g <= f11 ? (byte) -1 : (byte) 0;
            if (b8 < 0) {
                i11 = i12 + 1;
            } else {
                if (b8 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final void h(ArrayList arrayList, long j9, Function1 function1) {
        int size = arrayList.size();
        for (int iE = e(t0.g(j9), arrayList); iE < size; iE++) {
            t tVar = (t) arrayList.get(iE);
            if (tVar.f29642b >= t0.f(j9)) {
                return;
            }
            if (tVar.f29642b != tVar.f29643c) {
                function1.invoke(tVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(i4.t r10, m5.q0 r11) {
        /*
            m5.r r0 = r11.f29618b
            boolean r1 = r11.d()
            m5.p0 r2 = r11.f29617a
            if (r1 == 0) goto L13
            int r1 = r2.f29608f
            r3 = 3
            if (r1 != r3) goto L10
            goto L13
        L10:
            r1 = 1
        L11:
            r7 = r1
            goto L15
        L13:
            r1 = 0
            goto L11
        L15:
            if (r7 == 0) goto L40
            long r3 = r11.f29619c
            r11 = 32
            long r5 = r3 >> r11
            int r1 = (int) r5
            float r1 = (float) r1
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r3 = (int) r3
            float r3 = (float) r3
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r8 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r3)
            long r3 = (long) r1
            long r8 = r8 << r11
            long r3 = r3 & r5
            long r3 = r3 | r8
            r5 = 0
            h4.c r11 = na0.a.S(r5, r3)
            r10.e()
            i4.t.a(r10, r11)
        L40:
            m5.u0 r11 = r2.f29604b
            m5.l0 r11 = r11.f29655a
            x5.l r1 = r11.f29586m
            x5.o r2 = r11.f29575a
            if (r1 != 0) goto L4c
            x5.l r1 = x5.l.f43853b
        L4c:
            r5 = r1
            i4.u0 r1 = r11.f29587n
            if (r1 != 0) goto L53
            i4.u0 r1 = i4.u0.f23305d
        L53:
            r4 = r1
            k4.e r11 = r11.f29589p
            if (r11 != 0) goto L5a
            k4.g r11 = k4.g.f25943a
        L5a:
            r6 = r11
            r11 = r2
            i4.r r2 = r11.c()     // Catch: java.lang.Throwable -> L95
            x5.n r1 = x5.n.f43858a
            if (r2 == 0) goto L7e
            if (r11 == r1) goto L71
            float r11 = r11.a()     // Catch: java.lang.Throwable -> L6d
        L6a:
            r1 = r10
            r3 = r11
            goto L74
        L6d:
            r0 = move-exception
            r11 = r0
            r1 = r10
            goto L98
        L71:
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L6a
        L74:
            m5.r.j(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L7a
            r10 = r1
            r1 = r10
            goto L8d
        L7a:
            r0 = move-exception
            r10 = r1
        L7c:
            r11 = r0
            goto L98
        L7e:
            if (r11 == r1) goto L87
            long r1 = r11.b()     // Catch: java.lang.Throwable -> L6d
        L84:
            r2 = r1
            r1 = r10
            goto L8a
        L87:
            long r1 = i4.v.f23309b     // Catch: java.lang.Throwable -> L95
            goto L84
        L8a:
            m5.r.i(r0, r1, r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L93
        L8d:
            if (r7 == 0) goto L92
            r1.o()
        L92:
            return
        L93:
            r0 = move-exception
            goto L7c
        L95:
            r0 = move-exception
            r1 = r10
            goto L7c
        L98:
            if (r7 == 0) goto L9d
            r1.o()
        L9d:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.k0.i(i4.t, m5.q0):void");
    }

    public static final s0 j(m3.n nVar) {
        m3.s sVar = (m3.s) nVar;
        q5.h hVar = (q5.h) sVar.j(x1.f7419k);
        z5.c cVar = (z5.c) sVar.j(x1.f7416h);
        z5.m mVar = (z5.m) sVar.j(x1.f7421n);
        boolean zF = sVar.f(hVar) | sVar.f(cVar) | sVar.d(mVar.ordinal()) | sVar.d(8);
        Object objM = sVar.M();
        if (zF || objM == m3.m.f29332a) {
            objM = new s0(hVar, cVar, mVar, 8);
            sVar.k0(objM);
        }
        return (s0) objM;
    }

    public static final u0 k(u0 u0Var, z5.m mVar) {
        l0 l0Var = u0Var.f29655a;
        x5.o oVar = m0.f29596d;
        x5.o oVar2 = l0Var.f29575a;
        oVar2.getClass();
        if (Intrinsics.areEqual(oVar2, x5.n.f43858a)) {
            oVar2 = m0.f29596d;
        }
        x5.o oVar3 = oVar2;
        long j9 = l0Var.f29576b;
        z5.p[] pVarArr = z5.o.f47288b;
        if ((j9 & 1095216660480L) == 0) {
            j9 = m0.f29593a;
        }
        long j11 = j9;
        q5.r rVar = l0Var.f29577c;
        if (rVar == null) {
            rVar = q5.r.f36043h;
        }
        q5.r rVar2 = rVar;
        q5.n nVar = l0Var.f29578d;
        q5.n nVar2 = new q5.n(nVar != null ? nVar.f36034a : 0);
        q5.o oVar4 = l0Var.f29579e;
        q5.o oVar5 = new q5.o(oVar4 != null ? oVar4.f36035a : Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        q5.i iVar = l0Var.f29580f;
        if (iVar == null) {
            iVar = q5.i.f36017a;
        }
        q5.i iVar2 = iVar;
        String str = l0Var.f29581g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j12 = l0Var.f29582h;
        if ((j12 & 1095216660480L) == 0) {
            j12 = m0.f29594b;
        }
        long j13 = j12;
        x5.a aVar = l0Var.f29583i;
        float f11 = aVar != null ? aVar.f43835a : 0.0f;
        x5.a aVar2 = new x5.a(Float.isNaN(f11) ? 0.0f : f11);
        x5.p pVar = l0Var.f29584j;
        if (pVar == null) {
            pVar = x5.p.f43859c;
        }
        x5.p pVar2 = pVar;
        t5.c cVarK = l0Var.f29585k;
        if (cVarK == null) {
            t5.c cVar = t5.c.f39795c;
            cVarK = t5.d.f39798a.k();
        }
        t5.c cVar2 = cVarK;
        long j14 = l0Var.l;
        if (j14 == 16) {
            j14 = m0.f29595c;
        }
        long j15 = j14;
        x5.l lVar = l0Var.f29586m;
        if (lVar == null) {
            lVar = x5.l.f43853b;
        }
        x5.l lVar2 = lVar;
        i4.u0 u0Var2 = l0Var.f29587n;
        if (u0Var2 == null) {
            u0Var2 = i4.u0.f23305d;
        }
        i4.u0 u0Var3 = u0Var2;
        a0 a0Var = l0Var.f29588o;
        k4.e eVar = l0Var.f29589p;
        if (eVar == null) {
            eVar = k4.g.f25943a;
        }
        l0 l0Var2 = new l0(oVar3, j11, rVar2, nVar2, oVar5, iVar2, str2, j13, aVar2, pVar2, cVar2, j15, lVar2, u0Var3, a0Var, eVar);
        w wVar = u0Var.f29656b;
        int i11 = x.f29669b;
        int i12 = wVar.f29658a;
        int i13 = 5;
        if (i12 == 0) {
            i12 = 5;
        }
        int i14 = wVar.f29659b;
        if (i14 == 3) {
            int i15 = v0.$EnumSwitchMapping$0[mVar.ordinal()];
            if (i15 == 1) {
                i13 = 4;
            } else if (i15 != 2) {
                e40.a.f();
                return null;
            }
            i14 = i13;
        } else if (i14 == 0) {
            int i16 = v0.$EnumSwitchMapping$0[mVar.ordinal()];
            if (i16 == 1) {
                i14 = 1;
            } else {
                if (i16 != 2) {
                    e40.a.f();
                    return null;
                }
                i14 = 2;
            }
        }
        long j16 = wVar.f29660c;
        if ((j16 & 1095216660480L) == 0) {
            j16 = x.f29668a;
        }
        x5.q qVar = wVar.f29661d;
        if (qVar == null) {
            qVar = x5.q.f43862c;
        }
        z zVar = wVar.f29662e;
        x5.i iVar3 = wVar.f29663f;
        int i17 = wVar.f29664g;
        if (i17 == 0) {
            i17 = x5.e.f43840b;
        }
        int i18 = wVar.f29665h;
        if (i18 == 0) {
            i18 = 1;
        }
        x5.s sVar = wVar.f29666i;
        if (sVar == null) {
            sVar = x5.s.f43866c;
        }
        return new u0(l0Var2, new w(i12, i14, j16, qVar, zVar, iVar3, i17, i18, sVar), u0Var.f29657c);
    }

    public static final String l(long j9, CharSequence charSequence) {
        return charSequence.subSequence(t0.g(j9), t0.f(j9)).toString();
    }
}
