package bb;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import r40.d;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f6098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f6099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f6100e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6102b;

    static {
        d dVar = new d();
        List listH = d0.h(0, 600, 840);
        f6098c = listH;
        ArrayList arrayListD0 = CollectionsKt.d0(d0.h(1200, 1600), listH);
        List listH2 = d0.h(0, 480, 900);
        f6099d = listH2;
        f6100e = listH2;
        d.b(dVar, listH, listH2);
        d.b(dVar, arrayListD0, listH2);
    }

    public a(int i11, int i12) {
        this.f6101a = i11;
        this.f6102b = i12;
        if (i11 < 0) {
            i4.a.i(a0.l("Expected minWidthDp to be at least 0, minWidthDp: ", i11, '.'));
            throw null;
        }
        if (i12 >= 0) {
            return;
        }
        i4.a.i(a0.l("Expected minHeightDp to be at least 0, minHeightDp: ", i12, '.'));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6101a == aVar.f6101a && this.f6102b == aVar.f6102b;
    }

    public final int hashCode() {
        return (this.f6101a * 31) + this.f6102b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WindowSizeClass(minWidthDp=");
        sb2.append(this.f6101a);
        sb2.append(", minHeightDp=");
        return k.o(sb2, this.f6102b, ')');
    }
}
