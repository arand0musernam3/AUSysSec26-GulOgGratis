package f70;

import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17469a = System.currentTimeMillis();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f17469a == ((a) obj).f17469a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17469a);
    }

    public final String toString() {
        return l1.e("GoBackEvent(timestamp=", this.f17469a, ")");
    }
}
