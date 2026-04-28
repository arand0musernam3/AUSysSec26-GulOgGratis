package da;

import a60.r;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f14849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f14850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f14851d;

    public n(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        map.getClass();
        abstractSet.getClass();
        this.f14848a = str;
        this.f14849b = map;
        this.f14850c = abstractSet;
        this.f14851d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!Intrinsics.areEqual(this.f14848a, nVar.f14848a) || !Intrinsics.areEqual(this.f14849b, nVar.f14849b) || !Intrinsics.areEqual(this.f14850c, nVar.f14850c)) {
            return false;
        }
        Set set2 = this.f14851d;
        if (set2 == null || (set = nVar.f14851d) == null) {
            return true;
        }
        return Intrinsics.areEqual(set2, set);
    }

    public final int hashCode() {
        return this.f14850c.hashCode() + a0.f(this.f14849b, this.f14848a.hashCode() * 31, 31);
    }

    public final String toString() {
        Collection collectionL0;
        StringBuilder sb2 = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb2.append(this.f14848a);
        sb2.append("',\n            |    columns = {");
        sb2.append(o.b(CollectionsKt.l0(this.f14849b.values(), new r(4))));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(o.b(this.f14850c));
        sb2.append("\n            |    indices = {");
        Set set = this.f14851d;
        if (set == null || (collectionL0 = CollectionsKt.l0(set, new r(5))) == null) {
            collectionL0 = n0.f26529a;
        }
        sb2.append(o.b(collectionL0));
        sb2.append("\n            |}\n        ");
        return s.d(sb2.toString());
    }
}
