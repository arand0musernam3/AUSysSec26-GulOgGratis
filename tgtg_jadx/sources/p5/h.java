package p5;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f34452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f34454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f34455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f34456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f34457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34458g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f34459h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34460i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f34461j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f34462k;
    public int l;

    public h(float f11, int i11, boolean z11, boolean z12, float f12, int i12) {
        this.f34452a = f11;
        this.f34453b = i11;
        this.f34454c = z11;
        this.f34455d = z12;
        this.f34456e = f12;
        this.f34457f = i12;
        if ((0.0f > f12 || f12 > 1.0f) && f12 != -1.0f) {
            s5.a.c("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i11, int i12, int i13, int i14, Paint.FontMetricsInt fontMetricsInt) {
        int i15 = fontMetricsInt.descent;
        int i16 = fontMetricsInt.ascent;
        if (i15 - i16 <= 0) {
            return;
        }
        boolean z11 = i11 == 0;
        boolean z12 = i12 == this.f34453b;
        int i17 = this.f34457f;
        boolean z13 = this.f34455d;
        boolean z14 = this.f34454c;
        if (z11 && z12 && z14 && z13 && i17 != 2) {
            return;
        }
        if (this.f34458g == Integer.MIN_VALUE) {
            int i18 = i15 - i16;
            int iCeil = (int) Math.ceil(this.f34452a);
            int i19 = iCeil - i18;
            if (i17 != 1 || i19 > 0) {
                float fAbs = this.f34456e;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i19 <= 0 ? Math.ceil(i19 * fAbs) : Math.ceil((1.0f - fAbs) * i19));
                int i21 = fontMetricsInt.descent;
                int i22 = iCeil2 + i21;
                this.f34460i = i22;
                int i23 = i22 - iCeil;
                this.f34459h = i23;
                if (i17 == 0 || i19 >= 0) {
                    if (z14) {
                        i23 = fontMetricsInt.ascent;
                    }
                    this.f34458g = i23;
                    if (z13) {
                        i22 = i21;
                    }
                    this.f34461j = i22;
                    this.f34462k = fontMetricsInt.ascent - i23;
                    this.l = i22 - i21;
                } else if (i17 == 2) {
                    int i24 = fontMetricsInt.ascent;
                    this.f34458g = z14 ? Math.max(i24, i23) : Math.min(i24, i23);
                    int i25 = fontMetricsInt.descent;
                    int i26 = this.f34460i;
                    this.f34461j = z13 ? Math.min(i25, i26) : Math.max(i25, i26);
                    this.f34462k = 0;
                    this.l = 0;
                }
            } else {
                int i27 = fontMetricsInt.ascent;
                this.f34459h = i27;
                int i28 = fontMetricsInt.descent;
                this.f34460i = i28;
                this.f34458g = i27;
                this.f34461j = i28;
                this.f34462k = 0;
                this.l = 0;
            }
        }
        fontMetricsInt.ascent = z11 ? this.f34458g : this.f34459h;
        fontMetricsInt.descent = z12 ? this.f34461j : this.f34460i;
    }
}
