package pq;

import f70.h;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f35611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35612c;

    public g(String str, List list) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        str.getClass();
        this.f35610a = str;
        this.f35611b = list;
        this.f35612c = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f35610a, gVar.f35610a) && Intrinsics.areEqual(this.f35611b, gVar.f35611b) && this.f35612c == gVar.f35612c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f35612c) + ((this.f35611b.hashCode() + (this.f35610a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShareInvite(shortLink=");
        sb2.append(this.f35610a);
        sb2.append(", emailComponents=");
        sb2.append(this.f35611b);
        sb2.append(", timestamp=");
        return a0.j(this.f35612c, ")", sb2);
    }
}
