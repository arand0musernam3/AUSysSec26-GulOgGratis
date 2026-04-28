package r40;

import c50.w;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f37614b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            w.l("Null userAgent");
            throw null;
        }
        this.f37613a = str;
        this.f37614b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f37613a.equals(aVar.f37613a) && this.f37614b.equals(aVar.f37614b);
    }

    public final int hashCode() {
        return ((this.f37613a.hashCode() ^ 1000003) * 1000003) ^ this.f37614b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f37613a + ", usedDates=" + this.f37614b + "}";
    }
}
