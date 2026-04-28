package mv;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends TypefaceSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f30188a;

    public h(Typeface typeface) {
        super("");
        this.f30188a = typeface;
    }

    public static void a(TextPaint textPaint, Typeface typeface) {
        Typeface typeface2 = textPaint.getTypeface();
        int style = (typeface2 != null ? typeface2.getStyle() : 0) & (~typeface.getStyle());
        if ((style & 1) != 0) {
            textPaint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            textPaint.setTextSkewX(-0.25f);
        }
        textPaint.setTypeface(typeface);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        a(textPaint, this.f30188a);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.getClass();
        a(textPaint, this.f30188a);
    }
}
