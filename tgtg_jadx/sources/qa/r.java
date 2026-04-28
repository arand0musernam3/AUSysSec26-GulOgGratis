package qa;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class r extends q0 {
    public static final DecelerateInterpolator J = new DecelerateInterpolator();
    public static final AccelerateInterpolator K = new AccelerateInterpolator();
    public static final p L = new p(0);
    public static final p M = new p(1);
    public static final q N = new q(0);
    public static final p O = new p(2);
    public static final p P = new p(3);
    public static final q Q = new q(1);
    public s I;

    public r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I = Q;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f36723e);
        int iD = w6.a.d(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        X(iD);
    }

    @Override // qa.q0
    public final ObjectAnimator U(ViewGroup viewGroup, View view, h0 h0Var, h0 h0Var2) {
        if (h0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) h0Var2.f36673a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return s.a(view, h0Var2, iArr[0], iArr[1], this.I.b(view, viewGroup), this.I.c(view, viewGroup), translationX, translationY, J, this);
    }

    @Override // qa.q0
    public final ObjectAnimator V(ViewGroup viewGroup, View view, h0 h0Var, h0 h0Var2) {
        if (h0Var == null) {
            return null;
        }
        int[] iArr = (int[]) h0Var.f36673a.get("android:slide:screenPosition");
        return s.a(view, h0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.I.b(view, viewGroup), this.I.c(view, viewGroup), K, this);
    }

    public final void X(int i11) {
        if (i11 == 3) {
            this.I = L;
        } else if (i11 == 5) {
            this.I = O;
        } else if (i11 == 48) {
            this.I = N;
        } else if (i11 == 80) {
            this.I = Q;
        } else if (i11 == 8388611) {
            this.I = M;
        } else {
            if (i11 != 8388613) {
                i4.a.f("Invalid slide direction");
                return;
            }
            this.I = P;
        }
        o oVar = new o();
        oVar.f36705a = i11;
        this.f36770w = oVar;
    }

    @Override // qa.q0, qa.y
    public final void d(h0 h0Var) {
        q0.S(h0Var);
        int[] iArr = new int[2];
        h0Var.f36674b.getLocationOnScreen(iArr);
        h0Var.f36673a.put("android:slide:screenPosition", iArr);
    }

    @Override // qa.y
    public final void i(h0 h0Var) {
        q0.S(h0Var);
        int[] iArr = new int[2];
        h0Var.f36674b.getLocationOnScreen(iArr);
        h0Var.f36673a.put("android:slide:screenPosition", iArr);
    }

    @Override // qa.y
    public final boolean y() {
        return true;
    }
}
