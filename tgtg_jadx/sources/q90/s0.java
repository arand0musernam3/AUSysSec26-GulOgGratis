package q90;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f36610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f36611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f36612c;

    public s0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.f36610a = aVar;
        this.f36611b = proxy;
        this.f36612c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.areEqual(s0Var.f36610a, this.f36610a) && Intrinsics.areEqual(s0Var.f36611b, this.f36611b) && Intrinsics.areEqual(s0Var.f36612c, this.f36612c);
    }

    public final int hashCode() {
        return this.f36612c.hashCode() + ((this.f36611b.hashCode() + ((this.f36610a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb2 = new StringBuilder();
        v vVar = this.f36610a.f36408h;
        String str = vVar.f36626d;
        InetSocketAddress inetSocketAddress = this.f36612c;
        InetAddress address = inetSocketAddress.getAddress();
        String strB = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : r90.d.b(hostAddress);
        if (StringsKt.A(str, ':')) {
            sb2.append("[");
            sb2.append(str);
            sb2.append("]");
        } else {
            sb2.append(str);
        }
        if (vVar.f36627e != inetSocketAddress.getPort() || Intrinsics.areEqual(str, strB)) {
            sb2.append(":");
            sb2.append(vVar.f36627e);
        }
        if (!Intrinsics.areEqual(str, strB)) {
            if (Intrinsics.areEqual(this.f36611b, Proxy.NO_PROXY)) {
                sb2.append(" at ");
            } else {
                sb2.append(" via proxy ");
            }
            if (strB == null) {
                sb2.append("<unresolved>");
            } else if (StringsKt.A(strB, ':')) {
                sb2.append("[");
                sb2.append(strB);
                sb2.append("]");
            } else {
                sb2.append(strB);
            }
            sb2.append(":");
            sb2.append(inetSocketAddress.getPort());
        }
        return sb2.toString();
    }
}
