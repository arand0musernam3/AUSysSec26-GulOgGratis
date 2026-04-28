package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {
    public static final Object a(Lifecycle lifecycle, Lifecycle.State state, Function2 function2, x70.c cVar) {
        if (state == Lifecycle.State.INITIALIZED) {
            i4.a.f("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
            return null;
        }
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            return Unit.f26487a;
        }
        Object objN = v80.f0.n(new w0(lifecycle, state, function2, null), cVar);
        return objN == y70.a.COROUTINE_SUSPENDED ? objN : Unit.f26487a;
    }

    public static final Object b(LifecycleOwner lifecycleOwner, Lifecycle.State state, Function2 function2, x70.c cVar) {
        Object objA = a(lifecycleOwner.getLifecycle(), state, function2, cVar);
        return objA == y70.a.COROUTINE_SUSPENDED ? objA : Unit.f26487a;
    }
}
