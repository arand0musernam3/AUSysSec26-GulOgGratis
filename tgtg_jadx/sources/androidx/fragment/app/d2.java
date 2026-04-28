package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f2 f3174e;

    public d2(f2 f2Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f3174e = f2Var;
        this.f3170a = obj;
        this.f3171b = arrayList;
        this.f3172c = obj2;
        this.f3173d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        f2 f2Var = this.f3174e;
        Object obj = this.f3170a;
        if (obj != null) {
            f2Var.A(obj, this.f3171b, null);
        }
        Object obj2 = this.f3172c;
        if (obj2 != null) {
            f2Var.A(obj2, this.f3173d, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
