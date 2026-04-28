package i4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.DisplayMetrics;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import com.braze.h2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static s0 f23253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f23254b = new r0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f23255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f23256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f23257e;

    public static final RectF A(h4.c cVar) {
        return new RectF(cVar.f21380a, cVar.f21381b, cVar.f21382c, cVar.f21383d);
    }

    public static final Shader.TileMode B(int i11) {
        return i11 == 0 ? Shader.TileMode.CLAMP : i11 == 1 ? Shader.TileMode.REPEAT : i11 == 2 ? Shader.TileMode.MIRROR : i11 == 3 ? Build.VERSION.SDK_INT >= 31 ? y0.a() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    public static final int C(long j9) {
        float[] fArr = j4.e.f24536a;
        long jA = v.a(j9, j4.e.f24540e) >>> 32;
        u70.b0 b0Var = u70.c0.f40833b;
        return (int) jA;
    }

    public static final Bitmap.Config D(int i11) {
        return i11 == 0 ? Bitmap.Config.ARGB_8888 : i11 == 1 ? Bitmap.Config.ALPHA_8 : i11 == 2 ? Bitmap.Config.RGB_565 : i11 == 3 ? Bitmap.Config.RGBA_F16 : i11 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final h4.c E(Rect rect) {
        return new h4.c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final h4.c F(RectF rectF) {
        return new h4.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final int G(float f11, float[] fArr, int i11) {
        float f12 = f11 >= 0.0f ? f11 : 0.0f;
        if (f12 > 1.0f) {
            f12 = 1.0f;
        }
        if (Math.abs(f12 - f11) > 1.05E-6f) {
            f12 = Float.NaN;
        }
        fArr[i11] = f12;
        return !Float.isNaN(f12) ? 1 : 0;
    }

    public static final c a(f fVar) {
        Canvas canvas = d.f23233a;
        c cVar = new c();
        cVar.f23230a = new Canvas(j(fVar));
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long b(float r21, float r22, float r23, float r24, j4.c r25) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.g0.b(float, float, float, float, j4.c):long");
    }

    public static final long c(int i11) {
        long j9 = i11;
        u70.b0 b0Var = u70.c0.f40833b;
        long j11 = j9 << 32;
        int i12 = v.f23316i;
        return j11;
    }

    public static final long d(long j9) {
        long j11 = j9 << 32;
        u70.b0 b0Var = u70.c0.f40833b;
        int i11 = v.f23316i;
        return j11;
    }

    public static long e(int i11, int i12, int i13) {
        return c(((i11 & 255) << 16) | RoundCornerImageView.DEFAULT_STROKE_COLOR | ((i12 & 255) << 8) | (i13 & 255));
    }

    public static f f(int i11, int i12, int i13) {
        ColorSpace colorSpace;
        ColorSpace rgb;
        j4.r rVar = j4.e.f24540e;
        D(i13);
        Bitmap.Config configD = D(i13);
        if (Intrinsics.areEqual(rVar, rVar)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (Intrinsics.areEqual(rVar, j4.e.f24551q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (Intrinsics.areEqual(rVar, j4.e.f24552r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (Intrinsics.areEqual(rVar, j4.e.f24549o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (Intrinsics.areEqual(rVar, j4.e.f24545j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (Intrinsics.areEqual(rVar, j4.e.f24544i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (Intrinsics.areEqual(rVar, j4.e.f24554t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (Intrinsics.areEqual(rVar, j4.e.f24553s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (Intrinsics.areEqual(rVar, j4.e.f24546k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (Intrinsics.areEqual(rVar, j4.e.l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (Intrinsics.areEqual(rVar, j4.e.f24542g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (Intrinsics.areEqual(rVar, j4.e.f24543h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (Intrinsics.areEqual(rVar, j4.e.f24541f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (Intrinsics.areEqual(rVar, j4.e.f24547m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (Intrinsics.areEqual(rVar, j4.e.f24550p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!Intrinsics.areEqual(rVar, j4.e.f24548n)) {
                if (Build.VERSION.SDK_INT >= 34 && (rgb = a0.a(rVar)) != null) {
                    rgb = rgb;
                } else if (rVar != null) {
                    String str = rVar.f24532a;
                    float[] fArrA = rVar.f24587d.a();
                    j4.t tVar = rVar.f24590g;
                    ColorSpace.Rgb.TransferParameters transferParameters = tVar != null ? new ColorSpace.Rgb.TransferParameters(tVar.f24601b, tVar.f24602c, tVar.f24603d, tVar.f24604e, tVar.f24605f, tVar.f24606g, tVar.f24600a) : null;
                    if (transferParameters != null) {
                        ColorSpace rgb2 = new ColorSpace.Rgb(str, rVar.f24591h, fArrA, transferParameters);
                        rgb = rgb2;
                    } else {
                        float[] fArr = rVar.f24591h;
                        final j4.q qVar = rVar.l;
                        final int i14 = 0;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: i4.z
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d3) {
                                switch (i14) {
                                }
                                return ((Number) qVar.invoke(Double.valueOf(d3))).doubleValue();
                            }
                        };
                        final j4.q qVar2 = rVar.f24597o;
                        final int i15 = 1;
                        rgb = new ColorSpace.Rgb(str, fArr, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: i4.z
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d3) {
                                switch (i15) {
                                }
                                return ((Number) qVar2.invoke(Double.valueOf(d3))).doubleValue();
                            }
                        }, rVar.f24588e, rVar.f24589f);
                    }
                } else {
                    colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new f(Bitmap.createBitmap((DisplayMetrics) null, i11, i12, configD, true, rgb));
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        rgb = colorSpace;
        return new f(Bitmap.createBitmap((DisplayMetrics) null, i11, i12, configD, true, rgb));
    }

    public static final i0.w g() {
        return new i0.w(new Paint(7));
    }

    public static final long h(float f11, float f12) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f12)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
        int i11 = z0.f23336c;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long i(float r17, float r18, float r19, float r20, j4.c r21) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.g0.i(float, float, float, float, j4.c):long");
    }

    public static final Bitmap j(f fVar) {
        if (fVar instanceof f) {
            return fVar.f23242a;
        }
        h2.a("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static final long k(long j9, long j11) {
        float f11;
        float f12;
        long jA = v.a(j9, v.f(j11));
        float fD = v.d(j11);
        float fD2 = v.d(jA);
        float f13 = 1.0f - fD2;
        float f14 = (fD * f13) + fD2;
        float fH = v.h(jA);
        float fH2 = v.h(j11);
        float f15 = 0.0f;
        if (f14 == 0.0f) {
            f11 = 0.0f;
        } else {
            f11 = (((fH2 * fD) * f13) + (fH * fD2)) / f14;
        }
        float fG = v.g(jA);
        float fG2 = v.g(j11);
        if (f14 == 0.0f) {
            f12 = 0.0f;
        } else {
            f12 = (((fG2 * fD) * f13) + (fG * fD2)) / f14;
        }
        float fE = v.e(jA);
        float fE2 = v.e(j11);
        if (f14 != 0.0f) {
            f15 = (((fE2 * fD) * f13) + (fE * fD2)) / f14;
        }
        return i(f11, f12, f15, f14, v.f(j11));
    }

    public static float[] l() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    }

    public static void m(k4.d dVar, g0 g0Var, long j9) {
        if (g0Var instanceof n0) {
            h4.c cVar = ((n0) g0Var).f23271f;
            float f11 = cVar.f21380a;
            dVar.D0(j9, (((long) Float.floatToRawIntBits(cVar.f21381b)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32), y(cVar), 1.0f, 3);
            return;
        }
        boolean z11 = g0Var instanceof o0;
        k4.g gVar = k4.g.f25943a;
        if (!z11) {
            if (g0Var instanceof m0) {
                dVar.i0(((m0) g0Var).f23270f, j9, 1.0f, gVar);
                return;
            } else {
                e40.a.f();
                return;
            }
        }
        o0 o0Var = (o0) g0Var;
        h hVar = o0Var.f23275g;
        if (hVar != null) {
            dVar.i0(hVar, j9, 1.0f, gVar);
            return;
        }
        h4.d dVar2 = o0Var.f23274f;
        float f12 = dVar2.f21385b;
        float f13 = dVar2.f21384a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar2.f21391h >> 32));
        dVar.W(j9, (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L), (((long) Float.floatToRawIntBits(dVar2.f21386c - f13)) << 32) | (((long) Float.floatToRawIntBits(dVar2.f21387d - f12)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), gVar);
    }

    public static void n(Canvas canvas, boolean z11) {
        Method method;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            b.a(canvas, z11);
            return;
        }
        if (!f23257e) {
            try {
                if (i11 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f23255c = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f23256d = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f23255c = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f23256d = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f23255c;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f23256d;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f23257e = true;
        }
        if (z11) {
            try {
                Method method4 = f23255c;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z11 || (method = f23256d) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final b4.t p(b4.t tVar, Function1 function1) {
        return tVar.then(new p(function1));
    }

    public static b4.t q(b4.t tVar, float f11, float f12, float f13, float f14, v0 v0Var, int i11) {
        float f15 = (i11 & 1) != 0 ? 1.0f : f11;
        float f16 = (i11 & 2) != 0 ? 1.0f : f12;
        float f17 = (i11 & 4) != 0 ? 1.0f : f13;
        float f18 = (i11 & 32) != 0 ? 0.0f : f14;
        long j9 = z0.f23335b;
        v0 v0Var2 = (i11 & NewHope.SENDB_BYTES) != 0 ? f23254b : v0Var;
        long j11 = h0.f23262a;
        return tVar.then(new f0(f15, f16, f17, f18, 0.0f, j9, v0Var2, false, j11, j11));
    }

    public static b4.t r(b4.t tVar, float f11, float f12, float f13, float f14, long j9, v0 v0Var, int i11) {
        float f15 = (i11 & 1) != 0 ? 1.0f : f11;
        float f16 = (i11 & 2) != 0 ? 1.0f : f12;
        float f17 = (i11 & 4) != 0 ? 1.0f : f13;
        float f18 = (i11 & 256) != 0 ? 0.0f : f14;
        long j11 = (i11 & 1024) != 0 ? z0.f23335b : j9;
        v0 v0Var2 = (i11 & NewHope.SENDB_BYTES) != 0 ? f23254b : v0Var;
        boolean z11 = (i11 & 4096) == 0;
        long j12 = h0.f23262a;
        return tVar.then(new f0(f15, f16, f17, 0.0f, f18, j11, v0Var2, z11, j12, j12));
    }

    public static final boolean s(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final long t(long j9, long j11, float f11) {
        j4.m mVar = j4.e.f24558x;
        long jA = v.a(j9, mVar);
        long jA2 = v.a(j11, mVar);
        float fD = v.d(jA);
        float fH = v.h(jA);
        float fG = v.g(jA);
        float fE = v.e(jA);
        float fD2 = v.d(jA2);
        float fH2 = v.h(jA2);
        float fG2 = v.g(jA2);
        float fE2 = v.e(jA2);
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        return v.a(i(ba0.g.C(fH, fH2, f11), ba0.g.C(fG, fG2, f11), ba0.g.C(fE, fE2, f11), ba0.g.C(fD, fD2, f11), mVar), v.f(j11));
    }

    public static final float u(long j9) {
        j4.c cVarF = v.f(j9);
        if (!j4.b.a(cVarF.f24533b, j4.b.f24527a)) {
            j0.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) j4.b.b(cVarF.f24533b)));
        }
        j4.n nVar = ((j4.r) cVarF).f24598p;
        double dA = nVar.a(v.h(j9));
        float fA = (float) ((nVar.a(v.e(j9)) * 0.0722d) + (nVar.a(v.g(j9)) * 0.7152d) + (dA * 0.2126d));
        if (fA < 0.0f) {
            fA = 0.0f;
        }
        if (fA > 1.0f) {
            return 1.0f;
        }
        return fA;
    }

    public static final void v(Matrix matrix, float[] fArr) {
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[2];
        float f14 = fArr[3];
        float f15 = fArr[4];
        float f16 = fArr[5];
        float f17 = fArr[6];
        float f18 = fArr[7];
        float f19 = fArr[8];
        float f20 = fArr[12];
        float f21 = fArr[13];
        float f22 = fArr[15];
        fArr[0] = f11;
        fArr[1] = f15;
        fArr[2] = f20;
        fArr[3] = f12;
        fArr[4] = f16;
        fArr[5] = f21;
        fArr[6] = f14;
        fArr[7] = f18;
        fArr[8] = f22;
        matrix.setValues(fArr);
        fArr[0] = f11;
        fArr[1] = f12;
        fArr[2] = f13;
        fArr[3] = f14;
        fArr[4] = f15;
        fArr[5] = f16;
        fArr[6] = f17;
        fArr[7] = f18;
        fArr[8] = f19;
    }

    public static final void w(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[2];
        float f14 = fArr[3];
        float f15 = fArr[4];
        float f16 = fArr[5];
        float f17 = fArr[6];
        float f18 = fArr[7];
        float f19 = fArr[8];
        fArr[0] = f11;
        fArr[1] = f14;
        fArr[2] = 0.0f;
        fArr[3] = f17;
        fArr[4] = f12;
        fArr[5] = f15;
        fArr[6] = 0.0f;
        fArr[7] = f18;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f13;
        fArr[13] = f16;
        fArr[14] = 0.0f;
        fArr[15] = f19;
    }

    public static final void x(float f11, float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f12 = 1 - f11;
        float f13 = 0.213f * f12;
        float f14 = 0.715f * f12;
        float f15 = f12 * 0.072f;
        fArr[0] = f13 + f11;
        fArr[1] = f14;
        fArr[2] = f15;
        fArr[5] = f13;
        fArr[6] = f14 + f11;
        fArr[7] = f15;
        fArr[10] = f13;
        fArr[11] = f14;
        fArr[12] = f15 + f11;
    }

    public static final long y(h4.c cVar) {
        float f11 = cVar.f21382c - cVar.f21380a;
        return (((long) Float.floatToRawIntBits(cVar.f21383d - cVar.f21381b)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    public static final Rect z(z5.k kVar) {
        return new Rect(kVar.f47282a, kVar.f47283b, kVar.f47284c, kVar.f47285d);
    }

    public abstract h4.c o();
}
