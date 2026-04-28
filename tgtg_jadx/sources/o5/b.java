package o5;

import android.text.TextPaint;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f31989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextPaint f31990d;

    public b(CharSequence charSequence, TextPaint textPaint) {
        this.f31989c = charSequence;
        this.f31990d = textPaint;
    }

    @Override // y9.w
    public final int C(int i11) {
        CharSequence charSequence = this.f31989c;
        return this.f31990d.getTextRunCursor(charSequence, 0, charSequence.length(), false, i11, 0);
    }

    @Override // y9.w
    public final int F(int i11) {
        CharSequence charSequence = this.f31989c;
        return this.f31990d.getTextRunCursor(charSequence, 0, charSequence.length(), false, i11, 2);
    }
}
