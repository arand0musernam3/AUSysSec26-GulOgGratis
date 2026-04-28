package q1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f35721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35722b;

    public final Object a() {
        if (!d()) {
            return this.f35721a[0];
        }
        qc.y.h("ObjectList is empty.");
        return null;
    }

    public final Object b(int i11) {
        if (i11 >= 0 && i11 < this.f35722b) {
            return this.f35721a[i11];
        }
        f(i11);
        throw null;
    }

    public final int c(Object obj) {
        Object[] objArr = this.f35721a;
        int i11 = 0;
        if (obj == null) {
            int i12 = this.f35722b;
            while (i11 < i12) {
                if (objArr[i11] == null) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        int i13 = this.f35722b;
        while (i11 < i13) {
            if (obj.equals(objArr[i11])) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public final boolean d() {
        return this.f35722b == 0;
    }

    public final boolean e() {
        return this.f35722b != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            int i11 = b1Var.f35722b;
            int i12 = this.f35722b;
            if (i11 == i12) {
                Object[] objArr = this.f35721a;
                Object[] objArr2 = b1Var.f35721a;
                IntRange intRangeJ = n80.p.j(0, i12);
                int i13 = intRangeJ.f26553a;
                int i14 = intRangeJ.f26554b;
                if (i13 > i14) {
                    return true;
                }
                while (Intrinsics.areEqual(objArr[i13], objArr2[i13])) {
                    if (i13 == i14) {
                        return true;
                    }
                    i13++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i11) {
        StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "Index ", " must be in 0..");
        sbK.append(this.f35722b - 1);
        throw new IndexOutOfBoundsException(sbK.toString());
    }

    public final int hashCode() {
        Object[] objArr = this.f35721a;
        int i11 = this.f35722b;
        int iHashCode = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[i12];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        androidx.fragment.app.r rVar = new androidx.fragment.app.r(this, 28);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f35721a;
        int i11 = this.f35722b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sb2.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i12];
            if (i12 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i12 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) rVar.invoke(obj));
            i12++;
        }
        return sb2.toString();
    }
}
