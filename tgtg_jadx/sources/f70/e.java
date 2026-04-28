package f70;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17487b;

    public e(int i11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f17486a = i11;
        this.f17487b = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f17486a == eVar.f17486a && this.f17487b == eVar.f17487b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17487b) + (Integer.hashCode(this.f17486a) * 31);
    }

    public final String toString() {
        return "ShowResToastEvent(resId=" + this.f17486a + ", timestamp=" + this.f17487b + ")";
    }
}
