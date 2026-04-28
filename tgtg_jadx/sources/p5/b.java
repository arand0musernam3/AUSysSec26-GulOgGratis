package p5;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f34448b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f34447a = i11;
        this.f34448b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f34447a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f34448b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f34448b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f34447a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f34448b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f34448b);
                break;
        }
    }
}
