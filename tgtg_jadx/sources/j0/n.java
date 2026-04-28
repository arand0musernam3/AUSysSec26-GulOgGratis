package j0;

import e0.i1;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24301a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.collections.t f24302b = new kotlin.collections.t();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24303c;

    public final void a(i1 i1Var) {
        i1Var.getClass();
        synchronized (this.f24301a) {
            try {
                if (this.f24303c) {
                    return;
                }
                Iterator it = this.f24302b.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f24301a) {
            if (this.f24303c) {
                return;
            }
            this.f24303c = true;
            Iterator<E> it = this.f24302b.iterator();
            if (it.hasNext()) {
                throw e0.f.e(it);
            }
            this.f24302b.clear();
        }
    }
}
