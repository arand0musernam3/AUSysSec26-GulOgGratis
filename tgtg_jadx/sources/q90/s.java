package q90;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f36606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f36607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f36608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u70.t f36609d;

    public s(u0 u0Var, l lVar, List list, Function0 function0) {
        u0Var.getClass();
        list.getClass();
        this.f36606a = u0Var;
        this.f36607b = lVar;
        this.f36608c = list;
        this.f36609d = u70.l.b(new oo.z(16, function0));
    }

    public final List a() {
        return (List) this.f36609d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return sVar.f36606a == this.f36606a && Intrinsics.areEqual(sVar.f36607b, this.f36607b) && Intrinsics.areEqual(sVar.a(), a()) && Intrinsics.areEqual(sVar.f36608c, this.f36608c);
    }

    public final int hashCode() {
        return this.f36608c.hashCode() + ((a().hashCode() + ((this.f36607b.hashCode() + ((this.f36606a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                type2.getClass();
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f36606a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f36607b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f36608c;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.o(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                type.getClass();
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
