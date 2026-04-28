package p5;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f34475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34477d;

    public j(int i11, float f11, float f12, float f13) {
        this.f34474a = i11;
        this.f34475b = f11;
        this.f34476c = f12;
        this.f34477d = f13;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f34477d, this.f34475b, this.f34476c, this.f34474a);
    }
}
