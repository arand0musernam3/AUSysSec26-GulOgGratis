package zw;

import android.graphics.Canvas;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l2 extends m2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f48275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q2 f48276h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(q2 q2Var, Path path, float f11) {
        super(q2Var, f11, 0.0f);
        this.f48276h = q2Var;
        this.f48275g = path;
    }

    @Override // zw.m2, ox.h
    public final void M(String str) {
        q2 q2Var = this.f48276h;
        if (q2Var.q0()) {
            o2 o2Var = (o2) q2Var.f48335c;
            if (o2Var.f48312b) {
                ((Canvas) q2Var.f48333a).drawTextOnPath(str, this.f48275g, this.f48285d, this.f48286e, o2Var.f48314d);
            }
            o2 o2Var2 = (o2) q2Var.f48335c;
            if (o2Var2.f48313c) {
                ((Canvas) q2Var.f48333a).drawTextOnPath(str, this.f48275g, this.f48285d, this.f48286e, o2Var2.f48315e);
            }
        }
        this.f48285d = ((o2) q2Var.f48335c).f48314d.measureText(str) + this.f48285d;
    }
}
