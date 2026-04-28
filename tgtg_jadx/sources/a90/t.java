package a90;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import v80.z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t extends c implements z1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1047d = AtomicIntegerFieldUpdater.newUpdater(t.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1048c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public t(long j9, t tVar, int i11) {
        super(tVar);
        this.f1048c = j9;
        this.cleanedAndPointers$volatile = i11 << 16;
    }

    @Override // a90.c
    public final boolean d() {
        return f1047d.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return f1047d.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i11, CoroutineContext coroutineContext);

    public final void i() {
        if (f1047d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f1047d;
            i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 65536 + i11));
        return true;
    }
}
