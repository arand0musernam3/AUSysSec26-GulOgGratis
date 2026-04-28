package at;

import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends p30.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f4760j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b() {
        super(2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f4760j = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f4760j == ((b) obj).f4760j;
    }

    @Override // p30.b
    public final int hashCode() {
        return Long.hashCode(this.f4760j);
    }

    @Override // p30.b
    public final String toString() {
        return l1.e("GoBack(timestamp=", this.f4760j, ")");
    }
}
