package oo;

import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static final void a(i4.h hVar, long j9, float f11, float f12, float f13) {
        hVar.getClass();
        float f14 = 2 * f11;
        Path path = hVar.f23258a;
        if (hVar.f23259b == null) {
            hVar.f23259b = new RectF();
        }
        RectF rectF = hVar.f23259b;
        rectF.getClass();
        rectF.set(0.0f, 0.0f, f14, f14);
        RectF rectF2 = hVar.f23259b;
        rectF2.getClass();
        path.arcTo(rectF2, 180.0f, 90.0f, false);
        int i11 = (int) (j9 >> 32);
        hVar.e(Float.intBitsToFloat(i11) - f14, 0.0f);
        float fIntBitsToFloat = Float.intBitsToFloat(i11) - f14;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i11);
        if (hVar.f23259b == null) {
            hVar.f23259b = new RectF();
        }
        RectF rectF3 = hVar.f23259b;
        rectF3.getClass();
        rectF3.set(fIntBitsToFloat, 0.0f, fIntBitsToFloat2, f14);
        RectF rectF4 = hVar.f23259b;
        rectF4.getClass();
        path.arcTo(rectF4, -90.0f, 90.0f, false);
        int i12 = (int) (j9 & 4294967295L);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i11))) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat(i12) - f13) - f12)) & 4294967295L);
        float f15 = f12 * 1.5f;
        float fIntBitsToFloat3 = Float.intBitsToFloat(i11) - f15;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i12) - f13)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i11);
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits((Float.intBitsToFloat(i12) - f13) + f12)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat4) << 32);
        int i13 = (int) (jFloatToRawIntBits >> 32);
        int i14 = (int) (jFloatToRawIntBits & 4294967295L);
        hVar.e(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14));
        path.cubicTo(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14), Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)), Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L)));
        hVar.e(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12) - f14);
        float fIntBitsToFloat5 = Float.intBitsToFloat(i11) - f14;
        float fIntBitsToFloat6 = Float.intBitsToFloat(i12) - f14;
        float fIntBitsToFloat7 = Float.intBitsToFloat(i11);
        float fIntBitsToFloat8 = Float.intBitsToFloat(i12);
        if (hVar.f23259b == null) {
            hVar.f23259b = new RectF();
        }
        RectF rectF5 = hVar.f23259b;
        rectF5.getClass();
        rectF5.set(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8);
        RectF rectF6 = hVar.f23259b;
        rectF6.getClass();
        path.arcTo(rectF6, 0.0f, 90.0f, false);
        hVar.e(f14 + 0.0f, Float.intBitsToFloat(i12));
        float fIntBitsToFloat9 = Float.intBitsToFloat(i12) - f14;
        float fIntBitsToFloat10 = Float.intBitsToFloat(i12);
        if (hVar.f23259b == null) {
            hVar.f23259b = new RectF();
        }
        RectF rectF7 = hVar.f23259b;
        rectF7.getClass();
        rectF7.set(0.0f, fIntBitsToFloat9, f14, fIntBitsToFloat10);
        RectF rectF8 = hVar.f23259b;
        rectF8.getClass();
        path.arcTo(rectF8, 90.0f, 90.0f, false);
        long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat(i12) - f13) - f12)) & 4294967295L);
        long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(f15 + 0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i12) - f13)) & 4294967295L);
        long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat(i12) - f13) + f12)) & 4294967295L);
        int i15 = (int) (jFloatToRawIntBits6 >> 32);
        int i16 = (int) (jFloatToRawIntBits6 & 4294967295L);
        hVar.e(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16));
        path.cubicTo(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16), Float.intBitsToFloat((int) (jFloatToRawIntBits5 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits5 & 4294967295L)), Float.intBitsToFloat((int) (jFloatToRawIntBits4 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits4 & 4294967295L)));
        hVar.e(0.0f, 0.0f - f14);
        path.close();
    }

    public static l2.d b(z5.c cVar, float f11) {
        cVar.getClass();
        Ref.FloatRef floatRef = new Ref.FloatRef();
        Ref.FloatRef floatRef2 = new Ref.FloatRef();
        Ref.FloatRef floatRef3 = new Ref.FloatRef();
        floatRef.element = cVar.c0(12);
        floatRef2.element = cVar.c0(32) * 1.0f;
        floatRef3.element = cVar.c0(16) * 1.0f;
        return new l2.d(new d(floatRef3, floatRef, f11, floatRef2, 0));
    }
}
