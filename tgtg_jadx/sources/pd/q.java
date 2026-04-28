package pd;

import kotlin.jvm.internal.Intrinsics;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f34709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fd.k f34710d;

    public q(String str, String str2, p pVar, fd.k kVar) {
        this.f34707a = str;
        this.f34708b = str2;
        this.f34709c = pVar;
        this.f34710d = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f34707a, qVar.f34707a) && Intrinsics.areEqual(this.f34708b, qVar.f34708b) && Intrinsics.areEqual(this.f34709c, qVar.f34709c) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f34710d, qVar.f34710d);
    }

    public final int hashCode() {
        return this.f34710d.f17570a.hashCode() + a0.f(this.f34709c.f34706a, l1.b(this.f34707a.hashCode() * 31, 31, this.f34708b), 961);
    }

    public final String toString() {
        StringBuilder sbT = e0.f.t("NetworkRequest(url=", this.f34707a, ", method=", this.f34708b, ", headers=");
        sbT.append(this.f34709c);
        sbT.append(", body=null, extras=");
        sbT.append(this.f34710d);
        sbT.append(")");
        return sbT.toString();
    }
}
