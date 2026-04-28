package h2;

import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f21027b;

    public long a() {
        return this.f21026a ? LongCompanionObject.MAX_VALUE : Math.max(0L, this.f21027b - System.nanoTime());
    }
}
