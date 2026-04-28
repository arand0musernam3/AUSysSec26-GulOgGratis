package x5;

import java.util.ArrayList;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f43853b = new l(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f43854c = new l(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f43855d = new l(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43856a;

    public l(int i11) {
        this.f43856a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f43856a == ((l) obj).f43856a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f43856a;
    }

    public final String toString() {
        int i11 = this.f43856a;
        if (i11 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i11 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i11 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return l1.f(new StringBuilder("TextDecoration["), b6.b.a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
