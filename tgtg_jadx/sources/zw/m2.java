package zw;

import android.graphics.Canvas;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class m2 extends ox.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f48285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f48286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q2 f48287f;

    public m2(q2 q2Var, float f11, float f12) {
        this.f48287f = q2Var;
        this.f48285d = f11;
        this.f48286e = f12;
    }

    @Override // ox.h
    public void M(String str) {
        q2 q2Var = this.f48287f;
        Canvas canvas = (Canvas) q2Var.f48333a;
        if (q2Var.q0()) {
            o2 o2Var = (o2) q2Var.f48335c;
            if (o2Var.f48312b) {
                canvas.drawText(str, this.f48285d, this.f48286e, o2Var.f48314d);
            }
            o2 o2Var2 = (o2) q2Var.f48335c;
            if (o2Var2.f48313c) {
                canvas.drawText(str, this.f48285d, this.f48286e, o2Var2.f48315e);
            }
        }
        this.f48285d = ((o2) q2Var.f48335c).f48314d.measureText(str) + this.f48285d;
    }
}
