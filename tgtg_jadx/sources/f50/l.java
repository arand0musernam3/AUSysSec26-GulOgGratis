package f50;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements y80.j, FunctionAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f17359a;

    public l(AtomicReference atomicReference) {
        this.f17359a = atomicReference;
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        this.f17359a.set((h) obj);
        Unit unit = Unit.f26487a;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return unit;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof y80.j) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final u70.f getFunctionDelegate() {
        return new AdaptedFunctionReference(2, this.f17359a, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
