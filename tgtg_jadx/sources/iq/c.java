package iq;

import android.graphics.BlurMaskFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import i0.w;
import i4.g0;
import i4.i;
import i4.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24094a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f24095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f24096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f24097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f24098e;

    public /* synthetic */ c(float f11, float f12, long j9, float f13) {
        this.f24095b = f11;
        this.f24096c = f12;
        this.f24097d = j9;
        this.f24098e = f13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f24094a;
        float f11 = this.f24098e;
        float f12 = this.f24096c;
        float f13 = this.f24095b;
        switch (i11) {
            case 0:
                k4.d dVar = (k4.d) obj;
                dVar.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) / 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.d() >> 32)));
                dVar.H(this.f24097d, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (jFloatToRawIntBits2 << 32), dVar.c0(f13), (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : new i(new DashPathEffect(new float[]{dVar.c0(f12), dVar.c0(f11)}, 0.0f)));
                break;
            default:
                k4.d dVar2 = (k4.d) obj;
                dVar2.getClass();
                t tVarI = dVar2.g0().i();
                w wVarG = g0.g();
                Paint paint = (Paint) wVarG.f22746c;
                float fC0 = dVar2.c0(f13);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar2.d() >> 32)) + fC0;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & dVar2.d())) + fC0;
                if (!z5.f.c(f12, 0)) {
                    paint.setMaskFilter(new BlurMaskFilter(dVar2.c0(f12), BlurMaskFilter.Blur.NORMAL));
                }
                paint.setColor(g0.C(this.f24097d));
                tVarI.j(0.0f, 0.0f, fIntBitsToFloat2, fIntBitsToFloat3, dVar2.c0(f11), dVar2.c0(f11), wVarG);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ c(long j9, float f11, float f12, float f13) {
        this.f24097d = j9;
        this.f24095b = f11;
        this.f24096c = f12;
        this.f24098e = f13;
    }
}
