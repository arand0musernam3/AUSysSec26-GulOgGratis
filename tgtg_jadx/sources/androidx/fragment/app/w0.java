package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentManager f3366a;

    public w0(FragmentManager fragmentManager) {
        this.f3366a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        w1 w1VarH;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        FragmentManager fragmentManager = this.f3366a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, fragmentManager);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p8.a.f34554a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = Fragment.class.isAssignableFrom(t0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment fragmentFindFragmentById = resourceId != -1 ? fragmentManager.findFragmentById(resourceId) : null;
                    if (fragmentFindFragmentById == null && string != null) {
                        fragmentFindFragmentById = fragmentManager.findFragmentByTag(string);
                    }
                    if (fragmentFindFragmentById == null && id2 != -1) {
                        fragmentFindFragmentById = fragmentManager.findFragmentById(id2);
                    }
                    if (fragmentFindFragmentById == null) {
                        fragmentFindFragmentById = fragmentManager.I().a(context.getClassLoader(), attributeValue);
                        fragmentFindFragmentById.mFromLayout = true;
                        fragmentFindFragmentById.mFragmentId = resourceId != 0 ? resourceId : id2;
                        fragmentFindFragmentById.mContainerId = id2;
                        fragmentFindFragmentById.mTag = string;
                        fragmentFindFragmentById.mInLayout = true;
                        fragmentFindFragmentById.mFragmentManager = fragmentManager;
                        u0 u0Var = fragmentManager.f3129x;
                        fragmentFindFragmentById.mHost = u0Var;
                        fragmentFindFragmentById.onInflate((Context) u0Var.f3357b, attributeSet, fragmentFindFragmentById.mSavedFragmentState);
                        w1VarH = fragmentManager.a(fragmentFindFragmentById);
                        if (FragmentManager.L(2)) {
                            Log.v("FragmentManager", "Fragment " + fragmentFindFragmentById + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (fragmentFindFragmentById.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        fragmentFindFragmentById.mInLayout = true;
                        fragmentFindFragmentById.mFragmentManager = fragmentManager;
                        u0 u0Var2 = fragmentManager.f3129x;
                        fragmentFindFragmentById.mHost = u0Var2;
                        fragmentFindFragmentById.onInflate((Context) u0Var2.f3357b, attributeSet, fragmentFindFragmentById.mSavedFragmentState);
                        w1VarH = fragmentManager.h(fragmentFindFragmentById);
                        if (FragmentManager.L(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + fragmentFindFragmentById + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    q8.b bVar = q8.c.f36354a;
                    FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragmentFindFragmentById, "Attempting to use <fragment> tag to add fragment " + fragmentFindFragmentById + " to container " + viewGroup);
                    q8.c.c(fragmentTagUsageViolation);
                    q8.b bVarA = q8.c.a(fragmentFindFragmentById);
                    if (bVarA.f36352a.contains(q8.a.DETECT_FRAGMENT_TAG_USAGE) && q8.c.e(bVarA, fragmentFindFragmentById.getClass(), FragmentTagUsageViolation.class)) {
                        q8.c.b(bVarA, fragmentTagUsageViolation);
                    }
                    fragmentFindFragmentById.mContainer = viewGroup;
                    w1VarH.k();
                    w1VarH.j();
                    View view2 = fragmentFindFragmentById.mView;
                    if (view2 == null) {
                        com.braze.h2.b(w.a0.p("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragmentFindFragmentById.mView.getTag() == null) {
                        fragmentFindFragmentById.mView.setTag(string);
                    }
                    fragmentFindFragmentById.mView.addOnAttachStateChangeListener(new v0(this, w1VarH));
                    return fragmentFindFragmentById.mView;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
