package q90;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f36401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SocketFactory f36402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f36403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f36404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f36405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f36406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProxySelector f36407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f36408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f36409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f36410j;

    public a(String str, int i11, q qVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, j jVar, q qVar2, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        qVar.getClass();
        socketFactory.getClass();
        qVar2.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.f36401a = qVar;
        this.f36402b = socketFactory;
        this.f36403c = sSLSocketFactory;
        this.f36404d = hostnameVerifier;
        this.f36405e = jVar;
        this.f36406f = qVar2;
        this.f36407g = proxySelector;
        u uVar = new u();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            uVar.f36615a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                i4.a.f("unexpected scheme: ".concat(str2));
                throw null;
            }
            uVar.f36615a = "https";
        }
        uVar.d(str);
        uVar.f(i11);
        this.f36408h = uVar.b();
        this.f36409i = r90.g.j(list);
        this.f36410j = r90.g.j(list2);
    }

    public final boolean a(a aVar) {
        aVar.getClass();
        return Intrinsics.areEqual(this.f36401a, aVar.f36401a) && Intrinsics.areEqual(this.f36406f, aVar.f36406f) && Intrinsics.areEqual(this.f36409i, aVar.f36409i) && Intrinsics.areEqual(this.f36410j, aVar.f36410j) && Intrinsics.areEqual(this.f36407g, aVar.f36407g) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f36403c, aVar.f36403c) && Intrinsics.areEqual(this.f36404d, aVar.f36404d) && Intrinsics.areEqual(this.f36405e, aVar.f36405e) && this.f36408h.f36627e == aVar.f36408h.f36627e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f36408h, aVar.f36408h) && a(aVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f36405e) + ((Objects.hashCode(this.f36404d) + ((Objects.hashCode(this.f36403c) + ((this.f36407g.hashCode() + e0.f.c(this.f36410j, e0.f.c(this.f36409i, (this.f36406f.hashCode() + ((this.f36401a.hashCode() + l1.b(527, 31, this.f36408h.f36631i)) * 31)) * 31, 31), 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        v vVar = this.f36408h;
        sb2.append(vVar.f36626d);
        sb2.append(':');
        sb2.append(vVar.f36627e);
        sb2.append(", ");
        sb2.append("proxySelector=" + this.f36407g);
        sb2.append('}');
        return sb2.toString();
    }
}
