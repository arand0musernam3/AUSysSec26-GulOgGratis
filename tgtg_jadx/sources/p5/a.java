package p5;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f34446b;

    public /* synthetic */ a(float f11, int i11) {
        this.f34445a = i11;
        this.f34446b = f11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f34445a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f34446b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f34446b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f34445a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f34446b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f34446b);
                break;
        }
    }
}
