package v80;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x extends kotlin.coroutines.a implements kotlin.coroutines.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f42171a = new w(kotlin.coroutines.d.f26548k0, new t1.w1(15));

    public x() {
        super(kotlin.coroutines.d.f26548k0);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        CoroutineContext.Element element;
        fVar.getClass();
        if (fVar instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) fVar;
            kotlin.coroutines.f key = getKey();
            key.getClass();
            if ((key == bVar || bVar.f26545b == key) && (element = (CoroutineContext.Element) bVar.f26544a.invoke(this)) != null) {
                return element;
            }
        } else if (kotlin.coroutines.d.f26548k0 == fVar) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        fVar.getClass();
        if (fVar instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) fVar;
            kotlin.coroutines.f key = getKey();
            key.getClass();
            if ((key == bVar || bVar.f26545b == key) && ((CoroutineContext.Element) bVar.f26544a.invoke(this)) != null) {
                return kotlin.coroutines.g.f26549a;
            }
        } else if (kotlin.coroutines.d.f26548k0 == fVar) {
            return kotlin.coroutines.g.f26549a;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + f0.s(this);
    }

    public abstract void u0(CoroutineContext coroutineContext, Runnable runnable);

    public void x0(CoroutineContext coroutineContext, Runnable runnable) {
        a90.g.i(this, coroutineContext, runnable);
    }

    public boolean y0(CoroutineContext coroutineContext) {
        return !(this instanceof k2);
    }

    public x z0(int i11) {
        a90.g.c(i11);
        return new a90.h(this, i11);
    }
}
