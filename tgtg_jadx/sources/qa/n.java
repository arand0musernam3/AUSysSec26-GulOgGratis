package qa;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements TypeEvaluator {
    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f11, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        return new Rect(rect.left + ((int) ((rect2.left - r0) * f11)), rect.top + ((int) ((rect2.top - r1) * f11)), rect.right + ((int) ((rect2.right - r2) * f11)), rect.bottom + ((int) ((rect2.bottom - r6) * f11)));
    }
}
