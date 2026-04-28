package c5;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q3 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f7352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f7353b;

    public q3(a aVar, Ref.ObjectRef objectRef) {
        this.f7352a = aVar;
        this.f7353b = objectRef;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, b5.r1] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        a aVar = this.f7352a;
        LifecycleOwner lifecycleOwnerA = androidx.lifecycle.m1.a(aVar);
        if (lifecycleOwnerA != null) {
            this.f7353b.element = t3.a(aVar, lifecycleOwnerA.getLifecycle());
            aVar.removeOnAttachStateChangeListener(this);
            return;
        }
        y4.a.c("View tree for " + aVar + " has no ViewTreeLifecycleOwner");
        qc.y.m();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
