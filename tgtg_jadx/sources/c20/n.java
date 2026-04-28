package c20;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6993b;

    public n() {
        this.f6992a = 0;
        this.f6993b = new FloatEvaluator();
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f11, Object obj, Object obj2) {
        switch (this.f6992a) {
            case 0:
                float fFloatValue = ((FloatEvaluator) this.f6993b).evaluate(f11, (Number) obj, (Number) obj2).floatValue();
                if (fFloatValue < 0.1f) {
                    fFloatValue = 0.0f;
                }
                return Float.valueOf(fFloatValue);
            default:
                Rect rect = (Rect) obj;
                Rect rect2 = (Rect) obj2;
                int i11 = rect.left + ((int) ((rect2.left - r0) * f11));
                int i12 = rect.top + ((int) ((rect2.top - r1) * f11));
                int i13 = rect.right + ((int) ((rect2.right - r2) * f11));
                int i14 = rect.bottom + ((int) ((rect2.bottom - r6) * f11));
                Rect rect3 = (Rect) this.f6993b;
                rect3.set(i11, i12, i13, i14);
                return rect3;
        }
    }

    public n(Rect rect) {
        this.f6992a = 1;
        this.f6993b = rect;
    }
}
