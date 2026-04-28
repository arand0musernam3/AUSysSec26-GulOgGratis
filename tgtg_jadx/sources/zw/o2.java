package zw;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f48311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f48312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f48313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f48314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f48315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h4.a f48316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h4.a f48317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f48318h;

    public o2(o2 o2Var) {
        this.f48312b = o2Var.f48312b;
        this.f48313c = o2Var.f48313c;
        this.f48314d = new Paint(o2Var.f48314d);
        this.f48315e = new Paint(o2Var.f48315e);
        h4.a aVar = o2Var.f48316f;
        if (aVar != null) {
            this.f48316f = new h4.a(aVar);
        }
        h4.a aVar2 = o2Var.f48317g;
        if (aVar2 != null) {
            this.f48317g = new h4.a(aVar2);
        }
        this.f48318h = o2Var.f48318h;
        try {
            this.f48311a = (h1) o2Var.f48311a.clone();
        } catch (CloneNotSupportedException e5) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e5);
            this.f48311a = h1.a();
        }
    }

    public o2() {
        Paint paint = new Paint();
        this.f48314d = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.f48315e = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.f48311a = h1.a();
    }
}
