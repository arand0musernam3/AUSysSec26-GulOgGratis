package p80;

import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f34576e = new r(4611686018427387903L, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f34578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f34579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f34580d;

    static {
        new r(LongCompanionObject.MAX_VALUE, false);
    }

    public r(long j9, boolean z11) {
        this.f34577a = j9;
        this.f34578b = z11;
        long j11 = 10;
        this.f34579c = j9 / j11;
        this.f34580d = j9 % j11;
    }
}
