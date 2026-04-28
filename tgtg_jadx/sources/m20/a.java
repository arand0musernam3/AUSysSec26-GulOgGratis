package m20;

import android.graphics.Paint;
import android.graphics.Path;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import x6.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f29163i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f29164j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f29165k = new int[4];
    public static final float[] l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f29166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f29167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f29168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f29172g = new Path();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f29173h;

    public a() {
        Paint paint = new Paint();
        this.f29173h = paint;
        this.f29166a = new Paint();
        a(RoundCornerImageView.DEFAULT_STROKE_COLOR);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f29167b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f29168c = new Paint(paint2);
    }

    public final void a(int i11) {
        this.f29169d = c.e(i11, 68);
        this.f29170e = c.e(i11, 20);
        this.f29171f = c.e(i11, 0);
        this.f29166a.setColor(this.f29169d);
    }
}
