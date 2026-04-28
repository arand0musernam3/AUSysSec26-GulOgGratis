package c90;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7849b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7850c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7851d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7852e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f7853a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i a(i iVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7850c;
        if (atomicIntegerFieldUpdater.get(this) - f7851d.get(this) == 127) {
            return iVar;
        }
        if (iVar.f7840b) {
            f7852e.incrementAndGet(this);
        }
        int i11 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f7853a;
            if (atomicReferenceArray.get(i11) == null) {
                atomicReferenceArray.lazySet(i11, iVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final i b() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7851d;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 - f7850c.get(this) == 0) {
                return null;
            }
            int i12 = i11 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 + 1) && (iVar = (i) this.f7853a.getAndSet(i12, null)) != null) {
                if (iVar.f7840b) {
                    f7852e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i c(int i11, boolean z11) {
        int i12 = i11 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f7853a;
        i iVar = (i) atomicReferenceArray.get(i12);
        if (iVar != null && iVar.f7840b == z11) {
            while (!atomicReferenceArray.compareAndSet(i12, iVar, null)) {
                if (atomicReferenceArray.get(i12) != iVar) {
                }
            }
            if (z11) {
                f7852e.decrementAndGet(this);
            }
            return iVar;
        }
        return null;
    }
}
