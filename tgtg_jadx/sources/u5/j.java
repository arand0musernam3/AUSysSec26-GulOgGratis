package u5;

import android.text.TextPaint;
import m5.b0;
import m5.l;
import m5.u0;
import m5.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f40792a = new k(false);

    public static final boolean a(u0 u0Var) {
        z zVar;
        b0 b0Var = u0Var.f29657c;
        l lVar = (b0Var == null || (zVar = b0Var.f29518b) == null) ? null : new l(zVar.f29675b);
        boolean z11 = false;
        if (lVar != null && lVar.f29574a == 1) {
            z11 = true;
        }
        return !z11;
    }

    public static final void b(TextPaint textPaint, float f11) {
        if (Float.isNaN(f11)) {
            return;
        }
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f11 * 255));
    }
}
