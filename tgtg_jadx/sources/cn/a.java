package cn;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f2.c0 f8468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f8469f;

    public a(List list, String str, int i11, boolean z11, f2.c0 c0Var, List list2) {
        list.getClass();
        str.getClass();
        c0Var.getClass();
        list2.getClass();
        this.f8464a = list;
        this.f8465b = str;
        this.f8466c = i11;
        this.f8467d = z11;
        this.f8468e = c0Var;
        this.f8469f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f8464a, aVar.f8464a) && Intrinsics.areEqual(this.f8465b, aVar.f8465b) && this.f8466c == aVar.f8466c && this.f8467d == aVar.f8467d && Intrinsics.areEqual(this.f8468e, aVar.f8468e) && Intrinsics.areEqual(this.f8469f, aVar.f8469f);
    }

    public final int hashCode() {
        return this.f8469f.hashCode() + ((this.f8468e.hashCode() + r8.k.e(r8.k.b(this.f8466c, l1.b(this.f8464a.hashCode() * 31, 31, this.f8465b), 31), 31, this.f8467d)) * 31);
    }

    public final String toString() {
        return "CarouselDataMule(categoryList=" + this.f8464a + ", selectedId=" + this.f8465b + ", oldIndex=" + this.f8466c + ", isNewCategory=" + this.f8467d + ", lazyListState=" + this.f8468e + ", hasNavigationImpressionList=" + this.f8469f + ")";
    }
}
