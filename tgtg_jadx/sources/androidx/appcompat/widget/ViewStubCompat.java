package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import com.braze.h2;
import java.lang.ref.WeakReference;
import p.e3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f2126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LayoutInflater f2127d;

    public ViewStubCompat(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f2124a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.C, i11, 0);
        this.f2125b = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f2124a = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            h2.b("ViewStub must have a non-null ViewGroup viewParent");
            return null;
        }
        if (this.f2124a == 0) {
            i4.a.f("ViewStub must have a valid layoutResource");
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f2127d;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f2124a, viewGroup, false);
        int i11 = this.f2125b;
        if (i11 != -1) {
            viewInflate.setId(i11);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f2126c = new WeakReference(viewInflate);
        return viewInflate;
    }

    public int getInflatedId() {
        return this.f2125b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f2127d;
    }

    public int getLayoutResource() {
        return this.f2124a;
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i11) {
        this.f2125b = i11;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f2127d = layoutInflater;
    }

    public void setLayoutResource(int i11) {
        this.f2124a = i11;
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        WeakReference weakReference = this.f2126c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i11);
                return;
            } else {
                h2.b("setVisibility called on un-referenced view");
                return;
            }
        }
        super.setVisibility(i11);
        if (i11 == 0 || i11 == 4) {
            a();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(e3 e3Var) {
    }

    public ViewStubCompat(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
