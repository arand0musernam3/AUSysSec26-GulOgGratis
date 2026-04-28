package z1;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f46392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46393c;

    public a0(List list, float[] fArr) {
        this.f46391a = list;
        this.f46392b = fArr;
        if (list.size() != fArr.length) {
            c2.a.a("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + kotlin.collections.y.Q(fArr));
        }
        this.f46393c = fArr.length;
    }

    public final Object a(float f11) {
        float[] fArr = this.f46392b;
        int length = fArr.length;
        float f12 = Float.POSITIVE_INFINITY;
        int i11 = 0;
        int i12 = -1;
        int i13 = 0;
        while (i11 < length) {
            int i14 = i13 + 1;
            float fAbs = Math.abs(f11 - fArr[i11]);
            if (fAbs <= f12) {
                i12 = i13;
                f12 = fAbs;
            }
            i11++;
            i13 = i14;
        }
        if (i12 == -1) {
            return null;
        }
        return this.f46391a.get(i12);
    }

    public final Object b(float f11, boolean z11) {
        float[] fArr = this.f46392b;
        int length = fArr.length;
        int i11 = 0;
        int i12 = -1;
        float f12 = Float.POSITIVE_INFINITY;
        int i13 = 0;
        while (i11 < length) {
            float f13 = fArr[i11];
            int i14 = i13 + 1;
            float f14 = z11 ? f13 - f11 : f11 - f13;
            if (f14 < 0.0f) {
                f14 = Float.POSITIVE_INFINITY;
            }
            if (f14 <= f12) {
                i12 = i13;
                f12 = f14;
            }
            i11++;
            i13 = i14;
        }
        if (i12 == -1) {
            return null;
        }
        return this.f46391a.get(i12);
    }

    public final boolean c(Object obj) {
        return this.f46391a.indexOf(obj) != -1;
    }

    public final float d() {
        float[] fArr = this.f46392b;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMax = fArr[0];
        int i11 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMax = Math.max(fMax, fArr[i11]);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return fMax;
    }

    public final float e() {
        float[] fArr = this.f46392b;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMin = fArr[0];
        int i11 = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMin = Math.min(fMin, fArr[i11]);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return fMin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.areEqual(this.f46391a, a0Var.f46391a) && Arrays.equals(this.f46392b, a0Var.f46392b) && this.f46393c == a0Var.f46393c;
    }

    public final float f(Object obj) {
        int iIndexOf = this.f46391a.indexOf(obj);
        if (iIndexOf < 0) {
            return Float.NaN;
        }
        float[] fArr = this.f46392b;
        if (iIndexOf < fArr.length) {
            return fArr[iIndexOf];
        }
        return Float.NaN;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f46392b) + (this.f46391a.hashCode() * 31)) * 31) + this.f46393c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DraggableAnchors(anchors={"
            r0.<init>(r1)
            r1 = 0
        L8:
            int r2 = r6.f46393c
            if (r1 >= r2) goto L41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.List r4 = r6.f46391a
            java.lang.Object r4 = kotlin.collections.CollectionsKt.Q(r1, r4)
            r3.append(r4)
            r4 = 61
            r3.append(r4)
            if (r1 < 0) goto L29
            float[] r4 = r6.f46392b
            int r5 = r4.length
            if (r1 >= r5) goto L29
            r4 = r4[r1]
            goto L2b
        L29:
            r4 = 2143289344(0x7fc00000, float:NaN)
        L2b:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L3e
            java.lang.String r2 = ", "
            r0.append(r2)
        L3e:
            int r1 = r1 + 1
            goto L8
        L41:
            java.lang.String r1 = "})"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.a0.toString():java.lang.String");
    }
}
