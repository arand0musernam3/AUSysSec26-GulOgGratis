package oa;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f32224a = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f32225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f32226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f32227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f32228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f32229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f32230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f32231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f32232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f32233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f32234k;
    public float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f32235m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f32236n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Path f32237o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f32238p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f32239q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f32240r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f32241s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f32242t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f32243u;

    public b() {
        Paint paint = new Paint();
        this.f32225b = paint;
        Paint paint2 = new Paint();
        this.f32226c = paint2;
        Paint paint3 = new Paint();
        this.f32227d = paint3;
        this.f32228e = 0.0f;
        this.f32229f = 0.0f;
        this.f32230g = 0.0f;
        this.f32231h = 5.0f;
        this.f32238p = 1.0f;
        this.f32242t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i11) {
        this.f32233j = i11;
        this.f32243u = this.f32232i[i11];
    }
}
