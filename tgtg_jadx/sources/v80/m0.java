package v80;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends a90.s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f42125e = AtomicIntegerFieldUpdater.newUpdater(m0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // a90.s, v80.s1
    public final void i(Object obj) throws DispatchException {
        l(obj);
    }

    @Override // a90.s, v80.s1
    public final void l(Object obj) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f42125e;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 != 1) {
                    com.braze.h2.b("Already resumed");
                    return;
                } else {
                    a90.g.h(f0.C(obj), y70.f.b(this.f1046d));
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
