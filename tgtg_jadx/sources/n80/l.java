package n80;

import kotlin.collections.t0;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f30722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f30724d;

    public l(long j9, long j11, long j12) {
        this.f30721a = j12;
        this.f30722b = j11;
        boolean z11 = false;
        if (j12 <= 0 ? j9 >= j11 : j9 <= j11) {
            z11 = true;
        }
        this.f30723c = z11;
        this.f30724d = z11 ? j9 : j11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30723c;
    }

    @Override // kotlin.collections.t0
    public final long nextLong() {
        long j9 = this.f30724d;
        if (j9 != this.f30722b) {
            this.f30724d = this.f30721a + j9;
            return j9;
        }
        if (this.f30723c) {
            this.f30723c = false;
            return j9;
        }
        i1.c();
        return 0L;
    }
}
