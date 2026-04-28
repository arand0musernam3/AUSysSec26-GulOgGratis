package e90;

import a90.t;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f15893e;

    public k(long j9, k kVar, int i11) {
        super(j9, kVar, i11);
        this.f15893e = new AtomicReferenceArray(j.f15892f);
    }

    @Override // a90.t
    public final int g() {
        return j.f15892f;
    }

    @Override // a90.t
    public final void h(int i11, CoroutineContext coroutineContext) {
        this.f15893e.set(i11, j.f15891e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f1048c + ", hashCode=" + hashCode() + ']';
    }
}
