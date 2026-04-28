package m3;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 implements b1, v80.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f29446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f29447b;

    public t1(b1 b1Var, CoroutineContext coroutineContext) {
        this.f29446a = b1Var;
        this.f29447b = coroutineContext;
    }

    @Override // m3.b1
    public final Object component1() {
        return this.f29446a.component1();
    }

    @Override // m3.b1
    public final Function1 component2() {
        return this.f29446a.component2();
    }

    @Override // v80.b0
    public final CoroutineContext getCoroutineContext() {
        return this.f29447b;
    }

    @Override // m3.c3
    public final Object getValue() {
        return this.f29446a.getValue();
    }

    @Override // m3.b1
    public final void setValue(Object obj) {
        this.f29446a.setValue(obj);
    }
}
