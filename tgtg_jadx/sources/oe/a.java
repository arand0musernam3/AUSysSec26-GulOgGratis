package oe;

import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f32449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f32450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f32451c;

    public a() {
        this.f32449a = new PointF();
        this.f32450b = new PointF();
        this.f32451c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f32451c;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f32449a;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f32450b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f32449a = pointF;
        this.f32450b = pointF2;
        this.f32451c = pointF3;
    }
}
