package p80;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f34565c = new l(-31557014167219200L, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f34566d = new l(31556889864403199L, 999999999);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34568b;

    public l(long j9, int i11) {
        this.f34567a = j9;
        this.f34568b = i11;
        if (-31557014167219200L > j9 || j9 >= 31556889864403200L) {
            i4.a.f("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int i11 = n.f34569a;
        q qVar = new q();
        qVar.f34574a = this.f34567a;
        qVar.f34575b = this.f34568b;
        return qVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        lVar.getClass();
        int iCompare = Intrinsics.compare(this.f34567a, lVar.f34567a);
        return iCompare != 0 ? iCompare : Intrinsics.compare(this.f34568b, lVar.f34568b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f34567a == lVar.f34567a && this.f34568b == lVar.f34568b;
    }

    public final int hashCode() {
        return (this.f34568b * 51) + Long.hashCode(this.f34567a);
    }

    public final String toString() {
        long j9;
        int[] iArr;
        StringBuilder sb2 = new StringBuilder();
        long j11 = this.f34567a;
        long j12 = j11 / 86400;
        long j13 = 0;
        if ((j11 ^ 86400) < 0 && j12 * 86400 != j11) {
            j12--;
        }
        long j14 = j11 % 86400;
        int i11 = (int) (j14 + (86400 & (((j14 ^ 86400) & ((-j14) | j14)) >> 63)));
        long j15 = (j12 + ((long) 719528)) - ((long) 60);
        if (j15 < 0) {
            long j16 = 146097;
            long j17 = ((j15 + 1) / j16) - 1;
            j9 = 0;
            j13 = ((long) 400) * j17;
            j15 += (-j17) * j16;
        } else {
            j9 = 0;
        }
        long j18 = 400;
        long j19 = ((j18 * j15) + ((long) 591)) / ((long) 146097);
        long j21 = 365;
        long j22 = 4;
        long j23 = 100;
        long j24 = j15 - ((j19 / j18) + (((j19 / j22) + (j21 * j19)) - (j19 / j23)));
        if (j24 < j9) {
            j19--;
            j24 = j15 - ((j19 / j18) + (((j19 / j22) + (j21 * j19)) - (j19 / j23)));
        }
        int i12 = (int) j24;
        int i13 = ((i12 * 5) + 2) / 153;
        int i14 = ((i13 + 2) % 12) + 1;
        int i15 = (i12 - (((i13 * 306) + 5) / 10)) + 1;
        int i16 = (int) (j19 + j13 + ((long) (i13 / 10)));
        int i17 = i11 / 3600;
        int i18 = i11 - (i17 * 3600);
        int i19 = i18 / 60;
        int i21 = i18 - (i19 * 60);
        int i22 = 0;
        if (Math.abs(i16) < 1000) {
            StringBuilder sb3 = new StringBuilder();
            if (i16 >= 0) {
                sb3.append(i16 + 10000);
                sb3.deleteCharAt(0).getClass();
            } else {
                sb3.append(i16 - 10000);
                sb3.deleteCharAt(1).getClass();
            }
            sb2.append((CharSequence) sb3);
        } else {
            if (i16 >= 10000) {
                sb2.append('+');
            }
            sb2.append(i16);
        }
        sb2.append('-');
        o.b(sb2, sb2, i14);
        sb2.append('-');
        o.b(sb2, sb2, i15);
        sb2.append('T');
        o.b(sb2, sb2, i17);
        sb2.append(':');
        o.b(sb2, sb2, i19);
        sb2.append(':');
        o.b(sb2, sb2, i21);
        int i23 = this.f34568b;
        if (i23 != 0) {
            sb2.append('.');
            while (true) {
                int i24 = i22 + 1;
                iArr = o.f34570a;
                if (i23 % iArr[i24] != 0) {
                    break;
                }
                i22 = i24;
            }
            int i25 = i22 - (i22 % 3);
            String strValueOf = String.valueOf((i23 / iArr[i25]) + iArr[9 - i25]);
            strValueOf.getClass();
            sb2.append(strValueOf.substring(1));
        }
        sb2.append(Matrix.MATRIX_TYPE_ZERO);
        return sb2.toString();
    }
}
