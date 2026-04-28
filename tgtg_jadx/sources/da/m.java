package da;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import kotlin.text.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f14847d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public m(String str, boolean z11, List list, List list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.f14844a = str;
        this.f14845b = z11;
        this.f14846c = list;
        this.f14847d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                list2.add("ASC");
            }
        }
        this.f14847d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            String str = mVar.f14844a;
            if (this.f14845b == mVar.f14845b && Intrinsics.areEqual(this.f14846c, mVar.f14846c) && Intrinsics.areEqual(this.f14847d, mVar.f14847d)) {
                String str2 = this.f14844a;
                return y.p(str2, "index_", false) ? y.p(str, "index_", false) : Intrinsics.areEqual(str2, str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f14844a;
        return this.f14847d.hashCode() + e0.f.c(this.f14846c, (((y.p(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f14845b ? 1 : 0)) * 31, 31);
    }

    public final String toString() {
        return s.b(s.d("\n            |Index {\n            |   name = '" + this.f14844a + "',\n            |   unique = '" + this.f14845b + "',\n            |   columns = {" + o.d(this.f14846c) + "\n            |   orders = {" + o.c(this.f14847d) + "\n            |}\n        "));
    }
}
