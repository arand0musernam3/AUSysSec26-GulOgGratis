package w5;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import h4.e;
import i4.t0;
import m3.i;
import m3.i0;
import m3.k1;
import u5.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f43220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f43221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f43222c = i.w(new e(9205357640488583168L));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f43223d = i.q(new rv.a(this, 24));

    public b(t0 t0Var, float f11) {
        this.f43220a = t0Var;
        this.f43221b = f11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        j.b(textPaint, this.f43221b);
        textPaint.setShader((Shader) this.f43223d.getValue());
    }
}
