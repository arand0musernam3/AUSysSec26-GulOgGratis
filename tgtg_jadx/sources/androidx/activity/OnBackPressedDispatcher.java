package androidx.activity;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "androidx/activity/b0", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f1700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u70.t f1701b;

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f1700a = runnable;
        this.f1701b = u70.l.b(new aa.e(this, 5));
    }

    public final void a(y yVar) {
        yVar.getClass();
        q9.c.a(c().f1710c, yVar.createNavigationEventHandler$activity(new z(yVar, null)));
    }

    public final void b(y yVar, LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
        yVar.getClass();
        final Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            return;
        }
        x xVarCreateNavigationEventHandler$activity = yVar.createNavigationEventHandler$activity(new z(yVar, lifecycleOwner));
        xVarCreateNavigationEventHandler$activity.h(false);
        q9.c.a(c().f1710c, xVarCreateNavigationEventHandler$activity);
        final d0 d0Var = new d0(xVarCreateNavigationEventHandler$activity, this, lifecycle);
        lifecycle.a(d0Var);
        yVar.addCloseable$activity(new AutoCloseable() { // from class: androidx.activity.a0
            @Override // java.lang.AutoCloseable
            public final void close() {
                lifecycle.d(d0Var);
            }
        });
    }

    public final b0 c() {
        return (b0) this.f1701b.getValue();
    }

    public final void d() {
        c().a();
    }

    public final void e(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        onBackInvokedDispatcher.getClass();
        c().f1710c.c(new q9.m(onBackInvokedDispatcher, 0), 1);
        c().f1710c.c(new q9.m(onBackInvokedDispatcher, 1000000), 0);
    }

    public OnBackPressedDispatcher() {
        this(null);
    }
}
