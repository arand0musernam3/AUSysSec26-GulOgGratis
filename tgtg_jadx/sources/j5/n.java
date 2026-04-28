package j5;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import q1.d0;
import q1.g1;
import q1.t0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements b0, Iterable, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f24682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d0 f24683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24685d;

    public n() {
        long[] jArr = g1.f35760a;
        this.f24682a = new t0();
    }

    @Override // j5.b0
    public final void b(a0 a0Var, Object obj) {
        boolean z11 = obj instanceof a;
        t0 t0Var = this.f24682a;
        if (z11 && t0Var.b(a0Var)) {
            Object objD = t0Var.d(a0Var);
            objD.getClass();
            a aVar = (a) objD;
            a aVar2 = (a) obj;
            String str = aVar2.f24609a;
            if (str == null) {
                str = aVar.f24609a;
            }
            u70.f fVar = aVar2.f24610b;
            if (fVar == null) {
                fVar = aVar.f24610b;
            }
            t0Var.m(a0Var, new a(str, fVar));
        } else {
            t0Var.m(a0Var, obj);
        }
        a0Var.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j5.n d() {
        /*
            r18 = this;
            r0 = r18
            j5.n r1 = new j5.n
            r1.<init>()
            boolean r2 = r0.f24684c
            r1.f24684c = r2
            boolean r2 = r0.f24685d
            r1.f24685d = r2
            q1.t0 r2 = r1.f24682a
            r2.getClass()
            q1.t0 r3 = r0.f24682a
            r3.getClass()
            java.lang.Object[] r4 = r3.f35753b
            java.lang.Object[] r5 = r3.f35754c
            long[] r3 = r3.f35752a
            int r6 = r3.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L60
            r7 = 0
            r8 = r7
        L26:
            r9 = r3[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L5b
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r7
        L40:
            if (r13 >= r11) goto L59
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L55
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r4[r14]
            r14 = r5[r14]
            r2.m(r15, r14)
        L55:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L40
        L59:
            if (r11 != r12) goto L60
        L5b:
            if (r8 == r6) goto L60
            int r8 = r8 + 1
            goto L26
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.n.d():j5.n");
    }

    public final Object e(a0 a0Var) {
        Object objD = this.f24682a.d(a0Var);
        if (objD != null) {
            return objD;
        }
        a40.d0.q("Key not present: ", a0Var, " - consider getOrElse or getOrNull");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f24682a, nVar.f24682a) && this.f24684c == nVar.f24684c && this.f24685d == nVar.f24685d;
    }

    public final void g(n nVar) {
        t0 t0Var = nVar.f24682a;
        Object[] objArr = t0Var.f35753b;
        Object[] objArr2 = t0Var.f35754c;
        long[] jArr = t0Var.f35752a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j9 = jArr[i11];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j9) < 128) {
                        int i14 = (i11 << 3) + i13;
                        Object obj = objArr[i14];
                        Object obj2 = objArr2[i14];
                        a0 a0Var = (a0) obj;
                        t0 t0Var2 = this.f24682a;
                        Object objD = t0Var2.d(a0Var);
                        a0Var.getClass();
                        Object objInvoke = a0Var.f24612b.invoke(objD, obj2);
                        if (objInvoke != null) {
                            t0Var2.m(a0Var, objInvoke);
                        }
                    }
                    j9 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24685d) + r8.k.e(this.f24682a.hashCode() * 31, 31, this.f24684c);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        d0 d0Var = this.f24683b;
        if (d0Var == null) {
            t0 t0Var = this.f24682a;
            t0Var.getClass();
            d0 d0Var2 = new d0(t0Var);
            this.f24683b = d0Var2;
            d0Var = d0Var2;
        }
        return ((q1.g) d0Var.entrySet()).iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.f24684c
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.f24685d
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            q1.t0 r4 = r0.f24682a
            java.lang.Object[] r5 = r4.f35753b
            java.lang.Object[] r6 = r4.f35754c
            long[] r4 = r4.f35752a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L4b:
            if (r14 >= r12) goto L76
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L72
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            r8 = r16
            j5.a0 r8 = (j5.a0) r8
            r1.append(r2)
            java.lang.String r2 = r8.f24611a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L72:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4b
        L76:
            if (r12 != r13) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L31
        L7d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = c5.d2.i(r0)
            r2.append(r3)
            java.lang.String r3 = "{ "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " }"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.n.toString():java.lang.String");
    }
}
