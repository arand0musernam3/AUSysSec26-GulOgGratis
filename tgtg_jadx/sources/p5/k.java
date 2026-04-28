package p5;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f34479b;

    public k(boolean z11, boolean z12) {
        this.f34478a = z11;
        this.f34479b = z12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f34478a);
        textPaint.setStrikeThruText(this.f34479b);
    }
}
