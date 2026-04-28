package i4;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f23269a;

    public /* synthetic */ l0(float[] fArr) {
        this.f23269a = fArr;
    }

    public static float[] a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final long b(long j9, float[] fArr) {
        if (fArr.length < 16) {
            return j9;
        }
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[7];
        float f17 = fArr[12];
        float f18 = fArr[13];
        float f19 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        float f20 = 1 / (((f16 * fIntBitsToFloat2) + (f13 * fIntBitsToFloat)) + f19);
        if ((Float.floatToRawIntBits(f20) & Integer.MAX_VALUE) >= 2139095040) {
            f20 = 0.0f;
        }
        return (((long) Float.floatToRawIntBits((((f14 * fIntBitsToFloat2) + (f11 * fIntBitsToFloat)) + f17) * f20)) << 32) | (((long) Float.floatToRawIntBits(((f15 * fIntBitsToFloat2) + (f12 * fIntBitsToFloat) + f18) * f20)) & 4294967295L);
    }

    public static final void c(float[] fArr, h4.a aVar) {
        if (fArr.length < 16) {
            return;
        }
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[7];
        float f17 = fArr[12];
        float f18 = fArr[13];
        float f19 = fArr[15];
        float f20 = aVar.f21374b;
        float f21 = aVar.f21375c;
        float f22 = aVar.f21376d;
        float f23 = aVar.f21377e;
        float f24 = f13 * f20;
        float f25 = f16 * f21;
        float f26 = 1.0f / ((f24 + f25) + f19);
        if ((Float.floatToRawIntBits(f26) & Integer.MAX_VALUE) >= 2139095040) {
            f26 = 0.0f;
        }
        float f27 = f11 * f20;
        float f28 = f14 * f21;
        float f29 = (f27 + f28 + f17) * f26;
        float f31 = f20 * f12;
        float f32 = f21 * f15;
        float f33 = (f31 + f32 + f18) * f26;
        float f34 = f16 * f23;
        float f35 = 1.0f / ((f24 + f34) + f19);
        if ((Float.floatToRawIntBits(f35) & Integer.MAX_VALUE) >= 2139095040) {
            f35 = 0.0f;
        }
        float f36 = f14 * f23;
        float f37 = (f27 + f36 + f17) * f35;
        float f38 = f15 * f23;
        float f39 = (f31 + f38 + f18) * f35;
        float f40 = f13 * f22;
        float f41 = 1.0f / ((f25 + f40) + f19);
        if ((Float.floatToRawIntBits(f41) & Integer.MAX_VALUE) >= 2139095040) {
            f41 = 0.0f;
        }
        float f42 = f11 * f22;
        float f43 = (f42 + f28 + f17) * f41;
        float f44 = f22 * f12;
        float f45 = (f32 + f44 + f18) * f41;
        float f46 = 1.0f / ((f40 + f34) + f19);
        float f47 = (Float.floatToRawIntBits(f46) & Integer.MAX_VALUE) < 2139095040 ? f46 : 0.0f;
        float f48 = (f42 + f36 + f17) * f47;
        float f49 = (f44 + f38 + f18) * f47;
        aVar.f21374b = Math.min(f29, Math.min(f37, Math.min(f43, f48)));
        aVar.f21375c = Math.min(f33, Math.min(f39, Math.min(f45, f49)));
        aVar.f21376d = Math.max(f29, Math.max(f37, Math.max(f43, f48)));
        aVar.f21377e = Math.max(f33, Math.max(f39, Math.max(f45, f49)));
    }

    public static final void d(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void e(float f11, float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        double d3 = ((double) f11) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d3);
        float fCos = (float) Math.cos(d3);
        float f12 = fArr[0];
        float f13 = fArr[4];
        float f14 = (fSin * f13) + (fCos * f12);
        float f15 = -fSin;
        float f16 = (f13 * fCos) + (f12 * f15);
        float f17 = fArr[1];
        float f18 = fArr[5];
        float f19 = (fSin * f18) + (fCos * f17);
        float f20 = (f18 * fCos) + (f17 * f15);
        float f21 = fArr[2];
        float f22 = fArr[6];
        float f23 = (fSin * f22) + (fCos * f21);
        float f24 = (f22 * fCos) + (f21 * f15);
        float f25 = fArr[3];
        float f26 = fArr[7];
        float f27 = (fSin * f26) + (fCos * f25);
        fArr[0] = f14;
        fArr[1] = f19;
        fArr[2] = f23;
        fArr[3] = f27;
        fArr[4] = f16;
        fArr[5] = f20;
        fArr[6] = f24;
        fArr[7] = (fCos * f26) + (f15 * f25);
    }

    public static final void f(float[] fArr, float f11, float f12) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = fArr[0] * f11;
        fArr[1] = fArr[1] * f11;
        fArr[2] = fArr[2] * f11;
        fArr[3] = fArr[3] * f11;
        fArr[4] = fArr[4] * f12;
        fArr[5] = fArr[5] * f12;
        fArr[6] = fArr[6] * f12;
        fArr[7] = fArr[7] * f12;
        fArr[8] = fArr[8] * 1.0f;
        fArr[9] = fArr[9] * 1.0f;
        fArr[10] = fArr[10] * 1.0f;
        fArr[11] = fArr[11] * 1.0f;
    }

    public static final void g(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f11 = fArr[0];
            float f12 = fArr2[0];
            float f13 = fArr[1];
            float f14 = fArr2[4];
            float f15 = fArr[2];
            float f16 = fArr2[8];
            float f17 = f15 * f16;
            float f18 = fArr[3];
            float f19 = fArr2[12];
            float f20 = f18 * f19;
            float f21 = f20 + f17 + (f13 * f14) + (f11 * f12);
            float f22 = fArr2[1];
            float f23 = fArr2[5];
            float f24 = fArr2[9];
            float f25 = f15 * f24;
            float f26 = fArr2[13];
            float f27 = f18 * f26;
            float f28 = f27 + f25 + (f13 * f23) + (f11 * f22);
            float f29 = fArr2[2];
            float f31 = fArr2[6];
            float f32 = fArr2[10];
            float f33 = f15 * f32;
            float f34 = fArr2[14];
            float f35 = f18 * f34;
            float f36 = f35 + f33 + (f13 * f31) + (f11 * f29);
            float f37 = fArr2[3];
            float f38 = fArr2[7];
            float f39 = fArr2[11];
            float f40 = f15 * f39;
            float f41 = fArr2[15];
            float f42 = f18 * f41;
            float f43 = f42 + f40 + (f13 * f38) + (f11 * f37);
            float f44 = fArr[4];
            float f45 = fArr[5];
            float f46 = fArr[6];
            float f47 = (f46 * f16) + (f45 * f14) + (f44 * f12);
            float f48 = fArr[7];
            float f49 = (f48 * f19) + f47;
            float f51 = (f48 * f26) + (f46 * f24) + (f45 * f23) + (f44 * f22);
            float f52 = (f48 * f34) + (f46 * f32) + (f45 * f31) + (f44 * f29);
            float f53 = f46 * f39;
            float f54 = f48 * f41;
            float f55 = f54 + f53 + (f45 * f38) + (f44 * f37);
            float f56 = fArr[8];
            float f57 = fArr[9];
            float f58 = fArr[10];
            float f59 = (f58 * f16) + (f57 * f14) + (f56 * f12);
            float f61 = fArr[11];
            float f62 = (f61 * f19) + f59;
            float f63 = (f61 * f26) + (f58 * f24) + (f57 * f23) + (f56 * f22);
            float f64 = (f61 * f34) + (f58 * f32) + (f57 * f31) + (f56 * f29);
            float f65 = f58 * f39;
            float f66 = f61 * f41;
            float f67 = f66 + f65 + (f57 * f38) + (f56 * f37);
            float f68 = fArr[12];
            float f69 = fArr[13];
            float f71 = (f14 * f69) + (f12 * f68);
            float f72 = fArr[14];
            float f73 = (f16 * f72) + f71;
            float f74 = fArr[15];
            float f75 = (f19 * f74) + f73;
            float f76 = f24 * f72;
            float f77 = f26 * f74;
            float f78 = f77 + f76 + (f23 * f69) + (f22 * f68);
            float f79 = f32 * f72;
            float f81 = f34 * f74;
            float f82 = f81 + f79 + (f31 * f69) + (f29 * f68);
            float f83 = f72 * f39;
            float f84 = f74 * f41;
            fArr[0] = f21;
            fArr[1] = f28;
            fArr[2] = f36;
            fArr[3] = f43;
            fArr[4] = f49;
            fArr[5] = f51;
            fArr[6] = f52;
            fArr[7] = f55;
            fArr[8] = f62;
            fArr[9] = f63;
            fArr[10] = f64;
            fArr[11] = f67;
            fArr[12] = f75;
            fArr[13] = f78;
            fArr[14] = f82;
            fArr[15] = f84 + f83 + (f69 * f38) + (f68 * f37);
        }
    }

    public static final void h(float[] fArr, float f11, float f12) {
        if (fArr.length < 16) {
            return;
        }
        float f13 = (fArr[8] * 0.0f) + (fArr[4] * f12) + (fArr[0] * f11) + fArr[12];
        float f14 = (fArr[9] * 0.0f) + (fArr[5] * f12) + (fArr[1] * f11) + fArr[13];
        float f15 = (fArr[10] * 0.0f) + (fArr[6] * f12) + (fArr[2] * f11) + fArr[14];
        float f16 = (fArr[11] * 0.0f) + (fArr[7] * f12) + (fArr[3] * f11) + fArr[15];
        fArr[12] = f13;
        fArr[13] = f14;
        fArr[14] = f15;
        fArr[15] = f16;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l0) {
            return Intrinsics.areEqual(this.f23269a, ((l0) obj).f23269a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f23269a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |");
        float[] fArr = this.f23269a;
        sb2.append(fArr[0]);
        sb2.append(' ');
        sb2.append(fArr[1]);
        sb2.append(' ');
        sb2.append(fArr[2]);
        sb2.append(' ');
        sb2.append(fArr[3]);
        sb2.append("|\n            |");
        sb2.append(fArr[4]);
        sb2.append(' ');
        sb2.append(fArr[5]);
        sb2.append(' ');
        sb2.append(fArr[6]);
        sb2.append(' ');
        sb2.append(fArr[7]);
        sb2.append("|\n            |");
        sb2.append(fArr[8]);
        sb2.append(' ');
        sb2.append(fArr[9]);
        sb2.append(' ');
        sb2.append(fArr[10]);
        sb2.append(' ');
        sb2.append(fArr[11]);
        sb2.append("|\n            |");
        sb2.append(fArr[12]);
        sb2.append(' ');
        sb2.append(fArr[13]);
        sb2.append(' ');
        sb2.append(fArr[14]);
        sb2.append(' ');
        sb2.append(fArr[15]);
        sb2.append("|\n        ");
        return kotlin.text.s.c(sb2.toString());
    }
}
