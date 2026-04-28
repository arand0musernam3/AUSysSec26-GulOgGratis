package androidx.constraintlayout.widget;

import a40.d0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class r extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f2495a;

    public r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public q getConstraintSet() {
        if (this.f2495a == null) {
            this.f2495a = new q();
        }
        q qVar = this.f2495a;
        qVar.getClass();
        int childCount = getChildCount();
        HashMap map = qVar.f2494g;
        map.clear();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            a aVar = (a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (qVar.f2493f && id2 == -1) {
                d0.k("All children of ConstraintLayout must have ids to use ConstraintSet");
                return null;
            }
            if (!map.containsKey(Integer.valueOf(id2))) {
                map.put(Integer.valueOf(id2), new l());
            }
            l lVar = (l) map.get(Integer.valueOf(id2));
            if (lVar != null) {
                if (childAt instanceof c) {
                    c cVar = (c) childAt;
                    m mVar = lVar.f2407e;
                    lVar.d(id2, aVar);
                    if (cVar instanceof Barrier) {
                        mVar.f2429i0 = 1;
                        Barrier barrier = (Barrier) cVar;
                        mVar.f2425g0 = barrier.getType();
                        mVar.f2431j0 = barrier.getReferencedIds();
                        mVar.f2427h0 = barrier.getMargin();
                    }
                }
                lVar.d(id2, aVar);
            }
        }
        return this.f2495a;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    public r(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public r(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class a extends ConstraintLayout.a {
        public final float A0;
        public final float B0;
        public final float C0;
        public final float D0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final float f2496r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f2497s0;
        public final float t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final float f2498u0;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public final float f2499v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final float f2500w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final float f2501x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final float f2502y0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public final float f2503z0;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2496r0 = 1.0f;
            this.f2497s0 = false;
            this.t0 = 0.0f;
            this.f2498u0 = 0.0f;
            this.f2499v0 = 0.0f;
            this.f2500w0 = 0.0f;
            this.f2501x0 = 1.0f;
            this.f2502y0 = 1.0f;
            this.f2503z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.f2511e);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 15) {
                    this.f2496r0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2496r0);
                } else if (index == 28) {
                    this.t0 = typedArrayObtainStyledAttributes.getFloat(index, this.t0);
                    this.f2497s0 = true;
                } else if (index == 23) {
                    this.f2499v0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2499v0);
                } else if (index == 24) {
                    this.f2500w0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2500w0);
                } else if (index == 22) {
                    this.f2498u0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2498u0);
                } else if (index == 20) {
                    this.f2501x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2501x0);
                } else if (index == 21) {
                    this.f2502y0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2502y0);
                } else if (index == 16) {
                    this.f2503z0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2503z0);
                } else if (index == 17) {
                    this.A0 = typedArrayObtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == 18) {
                    this.B0 = typedArrayObtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == 19) {
                    this.C0 = typedArrayObtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == 27) {
                    this.D0 = typedArrayObtainStyledAttributes.getFloat(index, this.D0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public a() {
            super(-2, -2);
            this.f2496r0 = 1.0f;
            this.f2497s0 = false;
            this.t0 = 0.0f;
            this.f2498u0 = 0.0f;
            this.f2499v0 = 0.0f;
            this.f2500w0 = 0.0f;
            this.f2501x0 = 1.0f;
            this.f2502y0 = 1.0f;
            this.f2503z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }
}
