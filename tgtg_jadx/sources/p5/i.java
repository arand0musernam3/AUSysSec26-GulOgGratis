package p5;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import b0.a0;
import kotlin.jvm.internal.Intrinsics;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f34463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f34467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f34468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f34469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Paint.FontMetricsInt f34470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f34472j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f34473k;

    public i(float f11, int i11, float f12, int i12, z5.c cVar, int i13) {
        float fZ0 = i11 == 0 ? cVar.z0(a0.F(f11, 4294967296L)) : 0.0f;
        float fZ02 = i12 == 0 ? cVar.z0(a0.F(f12, 4294967296L)) : 0.0f;
        this.f34463a = f11;
        this.f34464b = i11;
        this.f34465c = f12;
        this.f34466d = i12;
        this.f34467e = fZ0;
        this.f34468f = fZ02;
        this.f34469g = i13;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f34470h;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fontMetrics");
        return null;
    }

    public final int b() {
        if (!this.f34473k) {
            s5.a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.f34472j;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        float f11;
        float f12;
        this.f34473k = true;
        float textSize = paint.getTextSize();
        this.f34470h = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            s5.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        int i13 = this.f34464b;
        if (i13 == 0) {
            f11 = this.f34467e;
        } else {
            if (i13 != 1) {
                s5.a.b("Unsupported unit.");
                y.m();
                return 0;
            }
            f11 = this.f34463a * textSize;
        }
        this.f34471i = (int) Math.ceil(f11);
        int i14 = this.f34466d;
        if (i14 == 0) {
            f12 = this.f34468f;
        } else {
            if (i14 != 1) {
                s5.a.b("Unsupported unit.");
                y.m();
                return 0;
            }
            f12 = this.f34465c * textSize;
        }
        this.f34472j = (int) Math.ceil(f12);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.f34469g) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                    }
                    break;
                case 1:
                case 4:
                    if (b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = b() + fontMetricsInt.ascent;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int iB = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iB;
                        fontMetricsInt.descent = b() + iB;
                    }
                    break;
                default:
                    s5.a.a("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.f34473k) {
            s5.a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.f34471i;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, Paint paint) {
    }
}
