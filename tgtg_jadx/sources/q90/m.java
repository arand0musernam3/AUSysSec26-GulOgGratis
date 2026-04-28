package q90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f36546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f36547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f36548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m f36549h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f36551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f36552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f36553d;

    static {
        l lVar = l.f36538r;
        l lVar2 = l.f36539s;
        l lVar3 = l.f36540t;
        l lVar4 = l.l;
        l lVar5 = l.f36534n;
        l lVar6 = l.f36533m;
        l lVar7 = l.f36535o;
        l lVar8 = l.f36537q;
        l lVar9 = l.f36536p;
        List listH = kotlin.collections.d0.h(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9);
        f36546e = listH;
        List listH2 = kotlin.collections.d0.h(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, l.f36531j, l.f36532k, l.f36529h, l.f36530i, l.f36527f, l.f36528g, l.f36526e);
        f36547f = listH2;
        ax.f0 f0Var = new ax.f0();
        l[] lVarArr = (l[]) listH.toArray(new l[0]);
        f0Var.c((l[]) Arrays.copyOf(lVarArr, lVarArr.length));
        u0 u0Var = u0.TLS_1_3;
        u0 u0Var2 = u0.TLS_1_2;
        f0Var.f(u0Var, u0Var2);
        f0Var.f4905b = true;
        f0Var.b();
        ax.f0 f0Var2 = new ax.f0();
        l[] lVarArr2 = (l[]) listH2.toArray(new l[0]);
        f0Var2.c((l[]) Arrays.copyOf(lVarArr2, lVarArr2.length));
        f0Var2.f(u0Var, u0Var2);
        f0Var2.f4905b = true;
        f36548g = f0Var2.b();
        ax.f0 f0Var3 = new ax.f0();
        l[] lVarArr3 = (l[]) listH2.toArray(new l[0]);
        f0Var3.c((l[]) Arrays.copyOf(lVarArr3, lVarArr3.length));
        f0Var3.f(u0Var, u0Var2, u0.TLS_1_1, u0.TLS_1_0);
        f0Var3.f4905b = true;
        f0Var3.b();
        f36549h = new m(false, false, null, null);
    }

    public m(boolean z11, boolean z12, String[] strArr, String[] strArr2) {
        this.f36550a = z11;
        this.f36551b = z12;
        this.f36552c = strArr;
        this.f36553d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z11) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.f36552c;
        if (strArr != null) {
            enabledCipherSuites = r90.e.l(strArr, enabledCipherSuites, l.f36524c);
        }
        String[] strArr2 = this.f36553d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            w70.c cVar = w70.c.f43278a;
            cVar.getClass();
            enabledProtocols = r90.e.l(enabledProtocols2, strArr2, cVar);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        k kVar = l.f36524c;
        byte[] bArr = r90.e.f37811a;
        int length = supportedCipherSuites.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            } else if (kVar.compare(supportedCipherSuites[i11], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i11++;
            }
        }
        if (z11 && i11 != -1) {
            String str = supportedCipherSuites[i11];
            str.getClass();
            enabledCipherSuites.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z12 = this.f36550a;
        if (!z12) {
            i4.a.f("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            i4.a.f("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length);
        if (!z12) {
            i4.a.f("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            i4.a.f("At least one TLS version is required");
            return;
        }
        m mVar = new m(z12, this.f36551b, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (mVar.c() != null) {
            sSLSocket.setEnabledProtocols(mVar.f36553d);
        }
        if (mVar.b() != null) {
            sSLSocket.setEnabledCipherSuites(mVar.f36552c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.f36552c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(l.f36523b.f(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.f36553d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            u0.Companion.getClass();
            arrayList.add(t0.a(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        m mVar = (m) obj;
        boolean z11 = mVar.f36550a;
        boolean z12 = this.f36550a;
        if (z12 != z11) {
            return false;
        }
        if (z12) {
            return Arrays.equals(this.f36552c, mVar.f36552c) && Arrays.equals(this.f36553d, mVar.f36553d) && this.f36551b == mVar.f36551b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f36550a) {
            return 17;
        }
        String[] strArr = this.f36552c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f36553d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f36551b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f36550a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb2 = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb2.append(Objects.toString(b(), "[all enabled]"));
        sb2.append(", tlsVersions=");
        sb2.append(Objects.toString(c(), "[all enabled]"));
        sb2.append(", supportsTlsExtensions=");
        return r8.k.q(sb2, this.f36551b, ')');
    }
}
