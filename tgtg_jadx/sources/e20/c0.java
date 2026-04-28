package e20;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f15627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f15628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15630d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15637k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public mp.a f15638m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Layout.Alignment f15631e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15632f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f15633g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f15634h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15635i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15636j = true;
    public TextUtils.TruncateAt l = null;

    public c0(CharSequence charSequence, TextPaint textPaint, int i11) {
        this.f15627a = charSequence;
        this.f15628b = textPaint;
        this.f15629c = i11;
        this.f15630d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f15627a == null) {
            this.f15627a = "";
        }
        int iMax = Math.max(0, this.f15629c);
        CharSequence charSequenceEllipsize = this.f15627a;
        int i11 = this.f15632f;
        TextPaint textPaint = this.f15628b;
        if (i11 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f15630d);
        this.f15630d = iMin;
        if (this.f15637k && this.f15632f == 1) {
            this.f15631e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f15631e);
        builderObtain.setIncludePad(this.f15636j);
        builderObtain.setTextDirection(this.f15637k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f15632f);
        float f11 = this.f15633g;
        if (f11 != 0.0f || this.f15634h != 1.0f) {
            builderObtain.setLineSpacing(f11, this.f15634h);
        }
        if (this.f15632f > 1) {
            builderObtain.setHyphenationFrequency(this.f15635i);
        }
        mp.a aVar = this.f15638m;
        if (aVar != null) {
            builderObtain.setBreakStrategy(((TextInputLayout) aVar.f30061b).f12677u.getBreakStrategy());
        }
        return builderObtain.build();
    }
}
