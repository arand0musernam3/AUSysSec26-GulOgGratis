package ab;

import java.math.BigInteger;
import kotlin.text.StringsKt;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f1214f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f1219e = u70.l.b(new aa.e(this, 2));

    static {
        new l(0, 0, 0, "");
        f1214f = new l(0, 1, 0, "");
        new l(1, 0, 0, "");
    }

    public l(int i11, int i12, int i13, String str) {
        this.f1215a = i11;
        this.f1216b = i12;
        this.f1217c = i13;
        this.f1218d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        lVar.getClass();
        Object value = this.f1219e.getValue();
        value.getClass();
        Object value2 = lVar.f1219e.getValue();
        value2.getClass();
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f1215a == lVar.f1215a && this.f1216b == lVar.f1216b && this.f1217c == lVar.f1217c;
    }

    public final int hashCode() {
        return ((((527 + this.f1215a) * 31) + this.f1216b) * 31) + this.f1217c;
    }

    public final String toString() {
        String str = this.f1218d;
        String strK = !StringsKt.H(str) ? e0.f.k("-", str) : "";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1215a);
        sb2.append('.');
        sb2.append(this.f1216b);
        sb2.append('.');
        return r8.k.i(this.f1217c, strK, sb2);
    }
}
