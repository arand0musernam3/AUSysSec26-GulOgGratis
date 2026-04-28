package i4;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t0 extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a50.c f23302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23303b = 9205357640488583168L;

    @Override // i4.r
    public final void a(float f11, long j9, i0.w wVar) {
        Paint paint = (Paint) wVar.f22746c;
        a50.c cVar = this.f23302a;
        if (cVar == null || !h4.e.a(this.f23303b, j9)) {
            if (h4.e.e(j9)) {
                this.f23302a = null;
                this.f23303b = 9205357640488583168L;
                cVar = null;
            } else {
                cVar = this.f23302a;
                if (cVar == null) {
                    cVar = new a50.c(25, false);
                    this.f23302a = cVar;
                }
                cVar.f822b = b(j9);
                this.f23302a = cVar;
                this.f23303b = j9;
            }
        }
        long jC = g0.c(paint.getColor());
        long j11 = v.f23309b;
        if (!v.c(jC, j11)) {
            wVar.H(j11);
        }
        if (!Intrinsics.areEqual((Shader) wVar.f22747d, cVar != null ? (Shader) cVar.f822b : null)) {
            wVar.L(cVar != null ? (Shader) cVar.f822b : null);
        }
        if (paint.getAlpha() / 255.0f == f11) {
            return;
        }
        wVar.F(f11);
    }

    public abstract Shader b(long j9);
}
