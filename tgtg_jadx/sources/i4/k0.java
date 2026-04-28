package i4;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f23266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23268e;

    public k0(List list, long j9, long j11) {
        this.f23266c = list;
        this.f23267d = j9;
        this.f23268e = j11;
    }

    @Override // i4.t0
    public final Shader b(long j9) {
        long j11 = this.f23267d;
        int i11 = (int) (j11 >> 32);
        if (Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
            i11 = (int) (j9 >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i11);
        int i12 = (int) (j11 & 4294967295L);
        if (Float.intBitsToFloat(i12) == Float.POSITIVE_INFINITY) {
            i12 = (int) (j9 & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i12);
        long j12 = this.f23268e;
        int i13 = (int) (j12 >> 32);
        if (Float.intBitsToFloat(i13) == Float.POSITIVE_INFINITY) {
            i13 = (int) (j9 >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i13);
        int i14 = (int) (j12 & 4294967295L);
        if (Float.intBitsToFloat(i14) == Float.POSITIVE_INFINITY) {
            i14 = (int) (j9 & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i14);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List list = this.f23266c;
        m.a(list);
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i15 = 0; i15 < size; i15++) {
            iArr[i15] = g0.C(((v) list.get(i15)).f23317a);
        }
        return new LinearGradient(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, iArr, (float[]) null, g0.B(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Intrinsics.areEqual(this.f23266c, k0Var.f23266c) && Intrinsics.areEqual((Object) null, (Object) null) && h4.b.b(this.f23267d, k0Var.f23267d) && h4.b.b(this.f23268e, k0Var.f23268e);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + e0.f.b(e0.f.b(this.f23266c.hashCode() * 961, 31, this.f23267d), 31, this.f23268e);
    }

    public final String toString() {
        String str;
        long j9 = this.f23267d;
        String str2 = "";
        if (((((j9 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) h4.b.h(j9)) + ", ";
        } else {
            str = "";
        }
        long j11 = this.f23268e;
        if (((((j11 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) h4.b.h(j11)) + ", ";
        }
        return "LinearGradient(colors=" + this.f23266c + ", stops=null, " + str + str2 + "tileMode=Clamp)";
    }
}
