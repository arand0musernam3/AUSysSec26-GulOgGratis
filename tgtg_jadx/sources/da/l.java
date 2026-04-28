package da;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f14842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f14843e;

    public l(String str, String str2, String str3, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.f14839a = str;
        this.f14840b = str2;
        this.f14841c = str3;
        this.f14842d = list;
        this.f14843e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (Intrinsics.areEqual(this.f14839a, lVar.f14839a) && Intrinsics.areEqual(this.f14840b, lVar.f14840b) && Intrinsics.areEqual(this.f14841c, lVar.f14841c) && Intrinsics.areEqual(this.f14842d, lVar.f14842d)) {
            return Intrinsics.areEqual(this.f14843e, lVar.f14843e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14843e.hashCode() + e0.f.c(this.f14842d, l1.b(l1.b(this.f14839a.hashCode() * 31, 31, this.f14840b), 31, this.f14841c), 31);
    }

    public final String toString() {
        return s.b(s.d("\n            |ForeignKey {\n            |   referenceTable = '" + this.f14839a + "',\n            |   onDelete = '" + this.f14840b + "',\n            |   onUpdate = '" + this.f14841c + "',\n            |   columnNames = {" + o.d(CollectionsKt.k0(this.f14842d)) + "\n            |   referenceColumnNames = {" + o.c(CollectionsKt.k0(this.f14843e)) + "\n            |}\n        "));
    }
}
