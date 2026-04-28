package q1;

import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f35831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35832b;

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            int i11 = uVar.f35832b;
            int i12 = this.f35832b;
            if (i11 == i12) {
                long[] jArr = this.f35831a;
                long[] jArr2 = uVar.f35831a;
                IntRange intRangeJ = n80.p.j(0, i12);
                int i13 = intRangeJ.f26553a;
                int i14 = intRangeJ.f26554b;
                if (i13 > i14) {
                    return true;
                }
                while (jArr[i13] == jArr2[i13]) {
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
        long[] jArr = this.f35831a;
        int i11 = this.f35832b;
        int iHashCode = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode += Long.hashCode(jArr[i12]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        long[] jArr = this.f35831a;
        int i11 = this.f35832b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sb2.append((CharSequence) "]");
                break;
            }
            long j9 = jArr[i12];
            if (i12 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i12 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(j9);
            i12++;
        }
        return sb2.toString();
    }
}
