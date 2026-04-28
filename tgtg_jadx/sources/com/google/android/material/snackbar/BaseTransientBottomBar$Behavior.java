package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.firebase.messaging.a0;
import jb.b;
import q20.e;
import q20.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f12604i;

    public BaseTransientBottomBar$Behavior() {
        b bVar = new b();
        this.f12280f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f12281g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f12279e = 0;
        this.f12604i = bVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, s6.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        b bVar = this.f12604i;
        bVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                a0.K().U((e) bVar.f24851a);
            }
        } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            a0.K().S((e) bVar.f24851a);
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean w(View view) {
        this.f12604i.getClass();
        return view instanceof f;
    }
}
