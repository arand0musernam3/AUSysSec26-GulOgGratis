package o3;

import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import m3.y0;
import n80.p;
import q1.c1;
import q1.o0;
import q1.t0;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f31820a;

    public /* synthetic */ a(t0 t0Var) {
        this.f31820a = t0Var;
    }

    public static final void a(t0 t0Var, Object obj, Object obj2) {
        int i11 = t0Var.i(obj);
        boolean z11 = i11 < 0;
        Object obj3 = z11 ? null : t0Var.f35754c[i11];
        TypeIntrinsics.isMutableList(obj3);
        if (obj3 != null) {
            if (obj3 instanceof o0) {
                o0 o0Var = (o0) obj3;
                o0Var.g(obj2);
                obj2 = o0Var;
            } else {
                Object[] objArr = c1.f35730a;
                o0 o0Var2 = new o0(2);
                o0Var2.g(obj3);
                o0Var2.g(obj2);
                obj2 = o0Var2;
            }
        }
        if (!z11) {
            t0Var.f35754c[i11] = obj2;
            return;
        }
        int i12 = ~i11;
        t0Var.f35753b[i12] = obj;
        t0Var.f35754c[i12] = obj2;
    }

    public static final Object b(t0 t0Var, y0 y0Var) {
        Object objD = t0Var.d(y0Var);
        if (objD == null) {
            return null;
        }
        if (!(objD instanceof o0)) {
            t0Var.k(y0Var);
            return objD;
        }
        o0 o0Var = (o0) objD;
        if (o0Var.d()) {
            y.h("List is empty.");
            return null;
        }
        int i11 = o0Var.f35722b - 1;
        Object objB = o0Var.b(i11);
        o0Var.l(i11);
        objB.getClass();
        if (o0Var.d()) {
            t0Var.k(y0Var);
        }
        if (o0Var.f35722b == 1) {
            t0Var.m(y0Var, o0Var.a());
        }
        return objB;
    }

    public static final void c(t0 t0Var, y0 y0Var, Function1 function1) {
        Object objD = t0Var.d(y0Var);
        if (objD != null) {
            if (!(objD instanceof o0)) {
                if (((Boolean) function1.invoke(objD)).booleanValue()) {
                    t0Var.k(y0Var);
                    return;
                }
                return;
            }
            o0 o0Var = (o0) objD;
            int i11 = o0Var.f35722b;
            Object[] objArr = o0Var.f35721a;
            int i12 = 0;
            IntRange intRangeJ = p.j(0, i11);
            int i13 = intRangeJ.f26553a;
            int i14 = intRangeJ.f26554b;
            if (i13 <= i14) {
                while (true) {
                    objArr[i13 - i12] = objArr[i13];
                    if (((Boolean) function1.invoke(objArr[i13])).booleanValue()) {
                        i12++;
                    }
                    if (i13 == i14) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            x.m(objArr, i11 - i12, i11, null);
            o0Var.f35722b -= i12;
            if (o0Var.d()) {
                t0Var.k(y0Var);
            }
            if (o0Var.f35722b == 0) {
                t0Var.m(y0Var, o0Var.a());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final q1.o0 d(q1.t0 r14) {
        /*
            boolean r0 = r14.e()
            if (r0 == 0) goto Lc
            q1.o0 r14 = q1.c1.f35731b
            r14.getClass()
            return r14
        Lc:
            q1.o0 r0 = new q1.o0
            r0.<init>()
            java.lang.Object[] r1 = r14.f35754c
            long[] r14 = r14.f35752a
            int r2 = r14.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1c:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L5c
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L36:
            if (r9 >= r7) goto L5a
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L56
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof q1.o0
            if (r11 == 0) goto L50
            q1.o0 r10 = (q1.o0) r10
            r0.i(r10)
            goto L56
        L50:
            r10.getClass()
            r0.g(r10)
        L56:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L36
        L5a:
            if (r7 != r8) goto L61
        L5c:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1c
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.a.d(q1.t0):q1.o0");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Intrinsics.areEqual(this.f31820a, ((a) obj).f31820a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31820a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f31820a + ')';
    }
}
