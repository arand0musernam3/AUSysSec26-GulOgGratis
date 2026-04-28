package qa;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.app.tgtg.R;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class f extends y {
    public static final String[] H = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final c20.d I = new c20.d(12, "topLeft", PointF.class);
    public static final c20.d J = new c20.d(13, "bottomRight", PointF.class);
    public static final c20.d K = new c20.d(14, "bottomRight", PointF.class);
    public static final c20.d L = new c20.d(15, "topLeft", PointF.class);
    public static final c20.d M = new c20.d(16, "position", PointF.class);
    public static final n N = new n();
    public boolean G;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f36720b);
        boolean z11 = w6.a.e((XmlResourceParser) attributeSet, "resizeClip") ? typedArrayObtainStyledAttributes.getBoolean(0, false) : false;
        typedArrayObtainStyledAttributes.recycle();
        this.G = z11;
    }

    public final void S(h0 h0Var) {
        View view = h0Var.f36674b;
        HashMap map = h0Var.f36673a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
        if (this.G) {
            map.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // qa.y
    public final void d(h0 h0Var) {
        S(h0Var);
    }

    @Override // qa.y
    public final void i(h0 h0Var) {
        Rect rect;
        S(h0Var);
        if (!this.G || (rect = (Rect) h0Var.f36674b.getTag(R.id.transition_clip)) == null) {
            return;
        }
        h0Var.f36673a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qa.y
    public final Animator m(ViewGroup viewGroup, h0 h0Var, h0 h0Var2) {
        int i11;
        int i12;
        int i13;
        ObjectAnimator objectAnimatorOfObject;
        int i14;
        Rect rect;
        Animator animator;
        Animator animatorOfObject;
        Animator animator2;
        if (h0Var == null) {
            return null;
        }
        HashMap map = h0Var.f36673a;
        if (h0Var2 == null) {
            return null;
        }
        HashMap map2 = h0Var2.f36673a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = h0Var2.f36674b;
        Rect rect2 = (Rect) map.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) map2.get("android:changeBounds:bounds");
        int i15 = rect2.left;
        int i16 = rect3.left;
        int i17 = rect2.top;
        int i18 = rect3.top;
        int i19 = rect2.right;
        int i21 = rect3.right;
        int i22 = rect2.bottom;
        int i23 = rect3.bottom;
        int i24 = i19 - i15;
        int i25 = i22 - i17;
        int i26 = i21 - i16;
        int i27 = i23 - i18;
        Rect rect4 = (Rect) map.get("android:changeBounds:clip");
        Rect rect5 = (Rect) map2.get("android:changeBounds:clip");
        if ((i24 == 0 || i25 == 0) && (i26 == 0 || i27 == 0)) {
            i11 = 0;
        } else {
            i11 = (i15 == i16 && i17 == i18) ? 0 : 1;
            if (i19 != i21 || i22 != i23) {
                i11++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i11++;
        }
        int i28 = i11;
        if (i28 <= 0) {
            return null;
        }
        boolean z11 = this.G;
        c20.d dVar = M;
        if (z11) {
            k0.a(view, i15, i17, i15 + Math.max(i24, i26), i17 + Math.max(i25, i27));
            if (i15 == i16 && i17 == i18) {
                i12 = i22;
                i13 = i16;
                objectAnimatorOfObject = null;
            } else {
                i12 = i22;
                i13 = i16;
                this.f36772y.getClass();
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, dVar, (TypeConverter) null, ky.p.q(i15, i17, i16, i18));
            }
            boolean z12 = rect4 == null;
            if (z12) {
                i14 = 0;
                rect = new Rect(0, 0, i24, i25);
            } else {
                i14 = 0;
                rect = rect4;
            }
            int i29 = rect5 == null ? 1 : i14;
            Rect rect6 = i29 != 0 ? new Rect(i14, i14, i26, i27) : rect5;
            if (rect.equals(rect6)) {
                animator = null;
            } else {
                view.setClipBounds(rect);
                Animator animatorOfObject2 = ObjectAnimator.ofObject(view, "clipBounds", N, rect, rect6);
                c cVar = new c(view, rect, z12, rect6, i29, i15, i17, i19, i12, i13, i18, i21, i23);
                animatorOfObject2.addListener(cVar);
                a(cVar);
                animator = animatorOfObject2;
            }
            boolean z13 = g0.f36672a;
            animator2 = animator;
            if (objectAnimatorOfObject == null) {
                animatorOfObject = animator2;
            } else if (animator == null) {
                animatorOfObject = objectAnimatorOfObject;
            } else {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfObject, animator);
                animatorOfObject = animatorSet;
            }
        } else {
            k0.a(view, i15, i17, i19, i22);
            if (i28 == 2) {
                if (i24 == i26 && i25 == i27) {
                    this.f36772y.getClass();
                    animatorOfObject = ObjectAnimator.ofObject(view, dVar, (TypeConverter) null, ky.p.q(i15, i17, i16, i18));
                } else {
                    e eVar = new e(view);
                    this.f36772y.getClass();
                    ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(eVar, I, (TypeConverter) null, ky.p.q(i15, i17, i16, i18));
                    this.f36772y.getClass();
                    ObjectAnimator objectAnimatorOfObject3 = ObjectAnimator.ofObject(eVar, J, (TypeConverter) null, ky.p.q(i19, i22, i21, i23));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(objectAnimatorOfObject2, objectAnimatorOfObject3);
                    animatorSet2.addListener(new b(eVar));
                    animator2 = animatorSet2;
                    animatorOfObject = animator2;
                }
            } else if (i15 == i16 && i17 == i18) {
                this.f36772y.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, K, (TypeConverter) null, ky.p.q(i19, i22, i21, i23));
            } else {
                this.f36772y.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, L, (TypeConverter) null, ky.p.q(i15, i17, i16, i18));
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            s.g(viewGroup4, true);
            t().a(new d(viewGroup4));
        }
        return animatorOfObject;
    }

    @Override // qa.y
    public final String[] v() {
        return H;
    }
}
