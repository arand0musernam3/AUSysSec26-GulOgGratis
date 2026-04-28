package i4;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f23278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f23280e;

    public q0(List list, long j9, float f11) {
        this.f23278c = list;
        this.f23279d = j9;
        this.f23280e = f11;
    }

    @Override // i4.t0
    public final Shader b(long j9) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j11 = this.f23279d;
        if ((9223372034707292159L & j11) == 9205357640488583168L) {
            long jV = o00.h0.v(j9);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jV >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jV & 4294967295L));
        } else {
            int i11 = (int) (j11 >> 32);
            if (Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
                i11 = (int) (j9 >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i11);
            int i12 = (int) (j11 & 4294967295L);
            if (Float.intBitsToFloat(i12) == Float.POSITIVE_INFINITY) {
                i12 = (int) (j9 & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i12);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        float fC = this.f23280e;
        if (fC == Float.POSITIVE_INFINITY) {
            fC = h4.e.c(j9) / 2;
        }
        float f11 = fC;
        List list = this.f23278c;
        m.a(list);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i13 = 0; i13 < size; i13++) {
            iArr[i13] = g0.C(((v) list.get(i13)).f23317a);
        }
        return new RadialGradient(fIntBitsToFloat3, fIntBitsToFloat4, f11, iArr, (float[]) null, g0.B(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.areEqual(this.f23278c, q0Var.f23278c) && Intrinsics.areEqual((Object) null, (Object) null) && h4.b.b(this.f23279d, q0Var.f23279d) && this.f23280e == q0Var.f23280e;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + r8.k.a(e0.f.b(this.f23278c.hashCode() * 961, 31, this.f23279d), this.f23280e, 31);
    }

    public final String toString() {
        String str;
        long j9 = this.f23279d;
        String str2 = "";
        if ((9223372034707292159L & j9) != 9205357640488583168L) {
            str = "center=" + ((Object) h4.b.h(j9)) + ", ";
        } else {
            str = "";
        }
        float f11 = this.f23280e;
        if ((Float.floatToRawIntBits(f11) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f11 + ", ";
        }
        return "RadialGradient(colors=" + this.f23278c + ", stops=null, " + str + str2 + "tileMode=Clamp)";
    }
}
