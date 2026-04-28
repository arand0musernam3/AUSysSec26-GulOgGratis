package o80;

import h7.b1;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.markers.KMappedMarker;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends k implements Iterator, x70.c, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f32126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f32127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x70.c f32128d;

    @Override // o80.k
    public final y70.a a(Object obj, x70.c cVar) {
        this.f32126b = obj;
        this.f32125a = 3;
        this.f32128d = cVar;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        cVar.getClass();
        return aVar;
    }

    @Override // o80.k
    public final Object b(Iterator it, b1 b1Var) {
        if (!it.hasNext()) {
            return Unit.f26487a;
        }
        this.f32127c = it;
        this.f32125a = 2;
        this.f32128d = b1Var;
        return y70.a.COROUTINE_SUSPENDED;
    }

    public final RuntimeException d() {
        int i11 = this.f32125a;
        if (i11 == 4) {
            return new NoSuchElementException();
        }
        if (i11 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f32125a);
    }

    @Override // x70.c
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f26549a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i11 = this.f32125a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2 || i11 == 3) {
                        return true;
                    }
                    if (i11 == 4) {
                        return false;
                    }
                    throw d();
                }
                Iterator it = this.f32127c;
                it.getClass();
                if (it.hasNext()) {
                    this.f32125a = 2;
                    return true;
                }
                this.f32127c = null;
            }
            this.f32125a = 5;
            x70.c cVar = this.f32128d;
            cVar.getClass();
            this.f32128d = null;
            Unit unit = Unit.f26487a;
            u70.o oVar = u70.q.f40850b;
            cVar.resumeWith(unit);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i11 = this.f32125a;
        if (i11 == 0 || i11 == 1) {
            if (hasNext()) {
                return next();
            }
            i1.c();
            return null;
        }
        if (i11 == 2) {
            this.f32125a = 1;
            Iterator it = this.f32127c;
            it.getClass();
            return it.next();
        }
        if (i11 != 3) {
            throw d();
        }
        this.f32125a = 0;
        Object obj = this.f32126b;
        this.f32126b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // x70.c
    public final void resumeWith(Object obj) {
        ba0.g.M(obj);
        this.f32125a = 4;
    }
}
