package oe;

import android.graphics.PointF;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f32452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f32453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f32454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f32455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f32457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f32458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f32459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f32460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f32461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f32462k;
    public PointF l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PointF f32463m;

    public final int hashCode() {
        int iOrdinal = ((this.f32455d.ordinal() + (((int) (l1.b(this.f32452a.hashCode() * 31, 31, this.f32453b) + this.f32454c)) * 31)) * 31) + this.f32456e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f32457f);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f32459h;
    }
}
