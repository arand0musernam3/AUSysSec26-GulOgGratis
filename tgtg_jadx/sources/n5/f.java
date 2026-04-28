package n5;

import android.os.Build;
import android.text.BoringLayout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import o30.e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f30515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f30516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f30518d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f30519e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f30520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f30521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f30522h;

    public f(CharSequence charSequence, TextPaint textPaint, int i11) {
        this.f30515a = charSequence;
        this.f30516b = textPaint;
        this.f30517c = i11;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f30521g) {
            TextDirectionHeuristic textDirectionHeuristicB = j.b(this.f30517c);
            int i11 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f30515a;
            TextPaint textPaint = this.f30516b;
            this.f30520f = i11 >= 33 ? a70.a.l(charSequence, textPaint, textDirectionHeuristicB) : !textDirectionHeuristicB.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.f30521g = true;
        }
        return this.f30520f;
    }

    public final CharSequence b() {
        CharSequence charSequence = this.f30522h;
        if (charSequence != null) {
            charSequence.getClass();
            return charSequence;
        }
        CharSequence charSequence2 = this.f30515a;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (e0.z(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence2);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence2 = spannableString;
                    }
                }
            }
        }
        this.f30522h = charSequence2;
        return charSequence2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float c() {
        /*
            r6 = this;
            float r0 = r6.f30518d
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb
            float r0 = r6.f30518d
            return r0
        Lb:
            android.text.BoringLayout$Metrics r0 = r6.a()
            if (r0 == 0) goto L14
            int r0 = r0.width
            goto L15
        L14:
            r0 = -1
        L15:
            float r0 = (float) r0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            android.text.TextPaint r3 = r6.f30516b
            if (r2 >= 0) goto L34
            java.lang.CharSequence r0 = r6.b()
            int r0 = r0.length()
            java.lang.CharSequence r2 = r6.b()
            r4 = 0
            float r0 = android.text.Layout.getDesiredWidth(r2, r4, r0, r3)
            double r4 = (double) r0
            double r4 = java.lang.Math.ceil(r4)
            float r0 = (float) r4
        L34:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L39
            goto L5d
        L39:
            java.lang.CharSequence r2 = r6.f30515a
            boolean r4 = r2 instanceof android.text.Spanned
            if (r4 == 0) goto L51
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<p5.f> r4 = p5.f.class
            boolean r4 = o30.e0.z(r2, r4)
            if (r4 != 0) goto L5a
            java.lang.Class<p5.e> r4 = p5.e.class
            boolean r2 = o30.e0.z(r2, r4)
            if (r2 != 0) goto L5a
        L51:
            float r2 = r3.getLetterSpacing()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L5a
            goto L5d
        L5a:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L5d:
            r6.f30518d = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.f.c():float");
    }
}
