package g3;

import android.graphics.DashPathEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f18871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f18872c;

    public /* synthetic */ j1(float f11, long j9) {
        this.f18870a = 2;
        this.f18872c = j9;
        this.f18871b = f11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f18870a;
        float f11 = this.f18871b;
        switch (i11) {
            case 0:
                k4.d dVar = (k4.d) obj;
                float fC0 = dVar.c0(f11);
                float f12 = 2;
                dVar.H(this.f18872c, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(dVar.c0(f11) / f12)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(dVar.c0(f11) / f12)) & 4294967295L), fC0, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
                break;
            case 1:
                k4.d dVar2 = (k4.d) obj;
                float fC02 = dVar2.c0(f11);
                float f13 = 2;
                dVar2.H(this.f18872c, (((long) Float.floatToRawIntBits(dVar2.c0(f11) / f13)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(dVar2.c0(f11) / f13)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar2.d() & 4294967295L)))) & 4294967295L), fC02, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
                break;
            default:
                k4.d dVar3 = (k4.d) obj;
                dVar3.getClass();
                i4.h hVarA = i4.l.a();
                hVarA.e(Float.intBitsToFloat((int) (dVar3.d() >> 32)), Float.intBitsToFloat((int) (4294967295L & dVar3.d())));
                k4.d.r0(dVar3, hVarA, this.f18872c, 0.0f, new k4.h(dVar3.c0(f11), 0.0f, 0, 0, new i4.i(new DashPathEffect(new float[]{15.0f, 15.0f}, 0.0f)), 14), 52);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ j1(float f11, int i11, long j9) {
        this.f18870a = i11;
        this.f18871b = f11;
        this.f18872c = j9;
    }
}
