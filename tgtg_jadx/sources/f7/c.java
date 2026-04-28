package f7;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f17460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f17461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17463d;

    public c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i11).setHyphenationFrequency(i12).setTextDirection(textDirectionHeuristic).build();
        }
        this.f17460a = textPaint;
        this.f17461b = textDirectionHeuristic;
        this.f17462c = i11;
        this.f17463d = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        int i11 = cVar.f17462c;
        TextPaint textPaint = cVar.f17460a;
        if (this.f17462c != i11 || this.f17463d != cVar.f17463d) {
            return false;
        }
        TextPaint textPaint2 = this.f17460a;
        if (textPaint2.getTextSize() != textPaint.getTextSize() || textPaint2.getTextScaleX() != textPaint.getTextScaleX() || textPaint2.getTextSkewX() != textPaint.getTextSkewX() || textPaint2.getLetterSpacing() != textPaint.getLetterSpacing() || !TextUtils.equals(textPaint2.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) || textPaint2.getFlags() != textPaint.getFlags() || !textPaint2.getTextLocales().equals(textPaint.getTextLocales())) {
            return false;
        }
        if (textPaint2.getTypeface() == null) {
            if (textPaint.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint2.getTypeface().equals(textPaint.getTypeface())) {
            return false;
        }
        return this.f17461b == cVar.f17461b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f17460a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f17461b, Integer.valueOf(this.f17462c), Integer.valueOf(this.f17463d));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f17460a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb2.append(", textLocale=" + textPaint.getTextLocales());
        sb2.append(", typeface=" + textPaint.getTypeface());
        sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb2.append(", textDir=" + this.f17461b);
        sb2.append(", breakStrategy=" + this.f17462c);
        sb2.append(", hyphenationFrequency=" + this.f17463d);
        sb2.append("}");
        return sb2.toString();
    }

    public c(PrecomputedText.Params params) {
        this.f17460a = params.getTextPaint();
        this.f17461b = params.getTextDirection();
        this.f17462c = params.getBreakStrategy();
        this.f17463d = params.getHyphenationFrequency();
    }
}
