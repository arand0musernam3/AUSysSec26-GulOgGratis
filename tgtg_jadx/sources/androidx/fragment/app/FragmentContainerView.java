package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.app.tgtg.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f3105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3106d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        View view;
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        fragmentManager.getClass();
        this.f3103a = new ArrayList();
        this.f3104b = new ArrayList();
        this.f3106d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p8.a.f34555b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment fragmentFindFragmentById = fragmentManager.findFragmentById(id2);
        if (classAttribute != null && fragmentFindFragmentById == null) {
            if (id2 == -1) {
                com.braze.h2.b(w.a0.p("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            Fragment fragmentA = fragmentManager.I().a(context.getClassLoader(), classAttribute);
            fragmentA.getClass();
            fragmentA.mFragmentId = id2;
            fragmentA.mContainerId = id2;
            fragmentA.mTag = string;
            fragmentA.mFragmentManager = fragmentManager;
            fragmentA.mHost = fragmentManager.f3129x;
            fragmentA.onInflate(context, attributeSet, (Bundle) null);
            a aVar = new a(fragmentManager);
            aVar.f3409p = true;
            fragmentA.mContainer = this;
            fragmentA.mInDynamicContainer = true;
            aVar.e(getId(), fragmentA, string, 1);
            if (aVar.f3401g) {
                com.braze.h2.b("This transaction is already being added to the back stack");
                throw null;
            }
            aVar.f3402h = false;
            aVar.f3132r.B(aVar, true);
        }
        for (w1 w1Var : fragmentManager.f3109c.d()) {
            Fragment fragment = w1Var.f3369c;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                w1Var.b();
                w1Var.k();
            }
        }
    }

    public final void a(View view) {
        if (this.f3104b.contains(view)) {
            this.f3103a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(view, i11, layoutParams);
        } else {
            qc.y.j("Views added to a FragmentContainerView must be associated with a Fragment. View ", view, " is not associated with a Fragment.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsetsCompat windowInsetsCompatO;
        windowInsets.getClass();
        WindowInsetsCompat windowInsetsCompatV = WindowInsetsCompat.v(windowInsets);
        windowInsetsCompatV.getClass();
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f3105c;
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.getClass();
            onApplyWindowInsetsListener.getClass();
            windowInsets.getClass();
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            windowInsetsOnApplyWindowInsets.getClass();
            windowInsetsCompatO = WindowInsetsCompat.v(windowInsetsOnApplyWindowInsets);
        } else {
            windowInsetsCompatO = ViewCompat.O(this, windowInsetsCompatV);
        }
        windowInsetsCompatO.getClass();
        if (!windowInsetsCompatO.q()) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                ViewCompat.e(getChildAt(i11), windowInsetsCompatO);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.f3106d) {
            Iterator it = this.f3103a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j9) {
        canvas.getClass();
        view.getClass();
        if (this.f3106d) {
            ArrayList arrayList = this.f3103a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j9);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.f3104b.remove(view);
        if (this.f3103a.remove(view)) {
            this.f3106d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        o0 o0Var;
        FragmentManager supportFragmentManager;
        Fragment fragmentE = FragmentManager.E(this);
        if (fragmentE == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    o0Var = null;
                    break;
                }
                if (context instanceof o0) {
                    o0Var = (o0) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (o0Var == null) {
                a40.d0.q("View ", this, " is not within a subclass of FragmentActivity.");
                return null;
            }
            supportFragmentManager = o0Var.getSupportFragmentManager();
        } else {
            if (!fragmentE.isAdded()) {
                throw new IllegalStateException("The Fragment " + fragmentE + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = fragmentE.getChildFragmentManager();
        }
        return (F) supportFragmentManager.findFragmentById(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i11) {
        View childAt = getChildAt(i11);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i11, int i12) {
        int i13 = i11 + i12;
        for (int i14 = i11; i14 < i13; i14++) {
            View childAt = getChildAt(i14);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i11, i12);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i11, int i12) {
        int i13 = i11 + i12;
        for (int i14 = i11; i14 < i13; i14++) {
            View childAt = getChildAt(i14);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i11, i12);
    }

    public final void setDrawDisappearingViewsLast(boolean z11) {
        this.f3106d = z11;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@Nullable LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@Nullable View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f3105c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.f3104b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context) {
        super(context);
        context.getClass();
        this.f3103a = new ArrayList();
        this.f3104b = new ArrayList();
        this.f3106d = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        String str;
        super(context, attributeSet, i11);
        context.getClass();
        this.f3103a = new ArrayList();
        this.f3104b = new ArrayList();
        this.f3106d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p8.a.f34555b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }
}
