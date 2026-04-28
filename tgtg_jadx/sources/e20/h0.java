package e20;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends qa.y {
    @Override // qa.y
    public final void d(qa.h0 h0Var) {
        View view = h0Var.f36674b;
        if (view instanceof TextView) {
            h0Var.f36673a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // qa.y
    public final void i(qa.h0 h0Var) {
        View view = h0Var.f36674b;
        if (view instanceof TextView) {
            h0Var.f36673a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // qa.y
    public final Animator m(ViewGroup viewGroup, qa.h0 h0Var, qa.h0 h0Var2) {
        if (h0Var == null || h0Var2 == null || !(h0Var.f36674b instanceof TextView)) {
            return null;
        }
        View view = h0Var2.f36674b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap map = h0Var.f36673a;
        HashMap map2 = h0Var2.f36673a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new g0(0, textView));
        return valueAnimatorOfFloat;
    }
}
