package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b20.a;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import s6.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class ExpandableBehavior extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12729a = 0;

    public ExpandableBehavior() {
    }

    @Override // s6.b
    public abstract boolean f(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s6.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (a) view2;
        boolean z11 = ((FloatingActionButton) obj).f12474o.f5568b;
        int i11 = this.f12729a;
        if (z11) {
            if (i11 != 0 && i11 != 2) {
                return false;
            }
        } else if (i11 != 1) {
            return false;
        }
        this.f12729a = z11 ? 1 : 2;
        w((View) obj, view, z11, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s6.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i11) {
        a aVar;
        if (!view.isLaidOut()) {
            ArrayList arrayListK = coordinatorLayout.k(view);
            int size = arrayListK.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = (View) arrayListK.get(i12);
                if (f(view, view2)) {
                    aVar = (a) view2;
                    break;
                }
                i12++;
            }
            if (aVar != null) {
                boolean z11 = ((FloatingActionButton) aVar).f12474o.f5568b;
                int i13 = this.f12729a;
                if (!z11 ? i13 == 1 : !(i13 != 0 && i13 != 2)) {
                    int i14 = z11 ? 1 : 2;
                    this.f12729a = i14;
                    view.getViewTreeObserver().addOnPreDrawListener(new y20.a(this, view, i14, aVar));
                }
            }
        }
        return false;
    }

    public abstract void w(View view, View view2, boolean z11, boolean z12);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
