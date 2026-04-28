package u6;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f40816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f40817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tr.e f40818c;

    public c(Set set, tr.e eVar) {
        set.getClass();
        this.f40816a = 5;
        this.f40817b = set;
        this.f40818c = eVar;
    }

    public final boolean equals(Object obj) {
        return obj instanceof c;
    }

    public final int hashCode() {
        return Long.hashCode(398591036L);
    }

    public final String toString() {
        Integer num = this.f40816a;
        if (num == null) {
            return "398591036 without alias";
        }
        return "398591036 with alias " + num.intValue();
    }
}
