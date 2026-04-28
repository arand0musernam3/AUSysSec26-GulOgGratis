package zw;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k2 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f48267a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f48268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f48269c;

    public k2(mv.b0 b0Var) {
        if (b0Var == null) {
            return;
        }
        b0Var.o(this);
    }

    @Override // zw.r0
    public final void a(float f11, float f12, float f13, float f14) {
        this.f48267a.quadTo(f11, f12, f13, f14);
        this.f48268b = f13;
        this.f48269c = f14;
    }

    @Override // zw.r0
    public final void b(float f11, float f12) {
        this.f48267a.moveTo(f11, f12);
        this.f48268b = f11;
        this.f48269c = f12;
    }

    @Override // zw.r0
    public final void c(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f48267a.cubicTo(f11, f12, f13, f14, f15, f16);
        this.f48268b = f15;
        this.f48269c = f16;
    }

    @Override // zw.r0
    public final void close() {
        this.f48267a.close();
    }

    @Override // zw.r0
    public final void d(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
        q2.h(this.f48268b, this.f48269c, f11, f12, f13, z11, z12, f14, f15, this);
        this.f48268b = f14;
        this.f48269c = f15;
    }

    @Override // zw.r0
    public final void e(float f11, float f12) {
        this.f48267a.lineTo(f11, f12);
        this.f48268b = f11;
        this.f48269c = f12;
    }
}
