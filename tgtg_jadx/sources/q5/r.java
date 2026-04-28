package q5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f36037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f36038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f36039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f36040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f36041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f36042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r f36043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r f36044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final r f36045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final r f36046k;
    public static final r l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final r f36047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List f36048n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36049a;

    static {
        r rVar = new r(100);
        r rVar2 = new r(200);
        r rVar3 = new r(300);
        r rVar4 = new r(400);
        f36037b = rVar4;
        r rVar5 = new r(500);
        f36038c = rVar5;
        r rVar6 = new r(600);
        f36039d = rVar6;
        r rVar7 = new r(700);
        r rVar8 = new r(800);
        r rVar9 = new r(900);
        f36040e = rVar;
        f36041f = rVar2;
        f36042g = rVar3;
        f36043h = rVar4;
        f36044i = rVar5;
        f36045j = rVar6;
        f36046k = rVar7;
        l = rVar8;
        f36047m = rVar9;
        f36048n = kotlin.collections.d0.h(rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9);
    }

    public r(int i11) {
        this.f36049a = i11;
        boolean z11 = false;
        if (1 <= i11 && i11 < 1001) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        s5.a.a("Font weight can be in range [1, 1000]. Current value: " + i11);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(r rVar) {
        return Intrinsics.compare(this.f36049a, rVar.f36049a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f36049a == ((r) obj).f36049a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f36049a;
    }

    public final String toString() {
        return r8.k.o(new StringBuilder("FontWeight(weight="), this.f36049a, ')');
    }
}
