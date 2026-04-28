package q1;

import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f35789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35790b;

    public final int a(int i11) {
        if (i11 >= 0 && i11 < this.f35790b) {
            return this.f35789a[i11];
        }
        org.bouncycastle.jce.provider.a.v("Index must be between 0 and size");
        return 0;
    }

    public final int b() {
        int i11 = this.f35790b;
        if (i11 != 0) {
            return this.f35789a[i11 - 1];
        }
        qc.y.h("IntList is empty.");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            int i11 = mVar.f35790b;
            int i12 = this.f35790b;
            if (i11 == i12) {
                int[] iArr = this.f35789a;
                int[] iArr2 = mVar.f35789a;
                IntRange intRangeJ = n80.p.j(0, i12);
                int i13 = intRangeJ.f26553a;
                int i14 = intRangeJ.f26554b;
                if (i13 > i14) {
                    return true;
                }
                while (iArr[i13] == iArr2[i13]) {
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

    public final int hashCode() {
        int[] iArr = this.f35789a;
        int i11 = this.f35790b;
        int iHashCode = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode += Integer.hashCode(iArr[i12]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f35789a;
        int i11 = this.f35790b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sb2.append((CharSequence) "]");
                break;
            }
            int i13 = iArr[i12];
            if (i12 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i12 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(i13);
            i12++;
        }
        return sb2.toString();
    }
}
