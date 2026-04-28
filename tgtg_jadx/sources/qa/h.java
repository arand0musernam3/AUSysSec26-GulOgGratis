package qa;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class h extends q0 {
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f36722d);
        W(w6.a.d(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, this.G));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float Y(h0 h0Var, float f11) {
        Float f12;
        return (h0Var == null || (f12 = (Float) h0Var.f36673a.get("android:fade:transitionAlpha")) == null) ? f11 : f12.floatValue();
    }

    @Override // qa.q0
    public final ObjectAnimator U(ViewGroup viewGroup, View view, h0 h0Var, h0 h0Var2) {
        k0.f36692a.getClass();
        return X(view, Y(h0Var, 0.0f), 1.0f);
    }

    @Override // qa.q0
    public final ObjectAnimator V(ViewGroup viewGroup, View view, h0 h0Var, h0 h0Var2) {
        l0 l0Var = k0.f36692a;
        l0Var.getClass();
        ObjectAnimator objectAnimatorX = X(view, Y(h0Var, 1.0f), 0.0f);
        if (objectAnimatorX == null) {
            l0Var.f(view, Y(h0Var2, 1.0f));
        }
        return objectAnimatorX;
    }

    public final ObjectAnimator X(View view, float f11, float f12) {
        if (f11 == f12) {
            return null;
        }
        k0.f36692a.f(view, f11);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, k0.f36693b, f12);
        g gVar = new g(view);
        objectAnimatorOfFloat.addListener(gVar);
        t().a(gVar);
        return objectAnimatorOfFloat;
    }

    @Override // qa.y
    public final void i(h0 h0Var) {
        q0.S(h0Var);
        View view = h0Var.f36674b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(k0.f36692a.d(view)) : Float.valueOf(0.0f);
        }
        h0Var.f36673a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // qa.y
    public final boolean y() {
        return true;
    }

    public h(int i11) {
        W(i11);
    }
}
