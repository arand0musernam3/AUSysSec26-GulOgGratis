package x70;

import com.braze.h2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements c, z70.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final e f44028b = new e(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f44029c = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "result");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f44030a;

    @Nullable
    private volatile Object result;

    public f(c cVar, y70.a aVar) {
        cVar.getClass();
        this.f44030a = cVar;
        this.result = aVar;
    }

    @Override // z70.d
    public final z70.d getCallerFrame() {
        c cVar = this.f44030a;
        if (cVar instanceof z70.d) {
            return (z70.d) cVar;
        }
        return null;
    }

    @Override // x70.c
    public final CoroutineContext getContext() {
        return this.f44030a.getContext();
    }

    @Override // x70.c
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            y70.a aVar = y70.a.UNDECIDED;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f44029c;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
            if (obj2 != aVar2) {
                h2.b("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f44029c;
            y70.a aVar3 = y70.a.RESUMED;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f44030a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f44030a;
    }
}
