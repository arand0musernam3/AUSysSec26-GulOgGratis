package k10;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import java.util.ArrayList;
import q1.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f25738a = new k1(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f25739b = new k1(0);

    public static e a(Context context, TypedArray typedArray, int i11) {
        int resourceId;
        if (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static e b(Context context, int i11) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i11);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return c(arrayList);
        } catch (Exception e5) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i11), e5);
            return null;
        }
    }

    public static e c(ArrayList arrayList) {
        e eVar = new e();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Animator animator = (Animator) arrayList.get(i11);
            if (!(animator instanceof ObjectAnimator)) {
                j4.d.o(animator, "Animator must be an ObjectAnimator: ");
                return null;
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            eVar.h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            f fVar = new f();
            fVar.f25743d = 0;
            fVar.f25744e = 1;
            fVar.f25740a = startDelay;
            fVar.f25741b = duration;
            fVar.f25742c = interpolator;
            fVar.f25743d = objectAnimator.getRepeatCount();
            fVar.f25744e = objectAnimator.getRepeatMode();
            eVar.f25738a.put(propertyName, fVar);
        }
        return eVar;
    }

    public final ObjectAnimator d(String str, Object obj, Property property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, e(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        f(str).a(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public final PropertyValuesHolder[] e(String str) {
        if (!g(str)) {
            i4.a.h();
            return null;
        }
        PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) this.f25739b.get(str);
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i11 = 0; i11 < propertyValuesHolderArr.length; i11++) {
            propertyValuesHolderArr2[i11] = propertyValuesHolderArr[i11].clone();
        }
        return propertyValuesHolderArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f25738a.equals(((e) obj).f25738a);
        }
        return false;
    }

    public final f f(String str) {
        k1 k1Var = this.f25738a;
        if (k1Var.get(str) != null) {
            return (f) k1Var.get(str);
        }
        i4.a.h();
        return null;
    }

    public final boolean g(String str) {
        return this.f25739b.get(str) != null;
    }

    public final void h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f25739b.put(str, propertyValuesHolderArr);
    }

    public final int hashCode() {
        return this.f25738a.hashCode();
    }

    public final String toString() {
        return "\n" + e.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f25738a + "}\n";
    }
}
