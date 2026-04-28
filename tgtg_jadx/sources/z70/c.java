package z70;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.l;
import v80.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends a {

    @Nullable
    private final CoroutineContext _context;

    @Nullable
    private transient x70.c<Object> intercepted;

    public c(x70.c cVar) {
        this(cVar != null ? cVar.getContext() : null, cVar);
    }

    @Override // x70.c
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        coroutineContext.getClass();
        return coroutineContext;
    }

    @NotNull
    public final x70.c<Object> intercepted() {
        x70.c<Object> cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) getContext().get(kotlin.coroutines.d.f26548k0);
        x70.c<Object> fVar = dVar != null ? new a90.f((x) dVar, this) : this;
        this.intercepted = fVar;
        return fVar;
    }

    @Override // z70.a
    public void releaseIntercepted() {
        x70.c<Object> cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            CoroutineContext.Element element = getContext().get(kotlin.coroutines.d.f26548k0);
            element.getClass();
            ((x) ((kotlin.coroutines.d) element)).getClass();
            a90.f fVar = (a90.f) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a90.f.f1017h;
            while (atomicReferenceFieldUpdater.get(fVar) == a90.g.f1023b) {
            }
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            l lVar = obj instanceof l ? (l) obj : null;
            if (lVar != null) {
                lVar.p();
            }
        }
        this.intercepted = b.f47346a;
    }

    public c(CoroutineContext coroutineContext, x70.c cVar) {
        super(cVar);
        this._context = coroutineContext;
    }
}
