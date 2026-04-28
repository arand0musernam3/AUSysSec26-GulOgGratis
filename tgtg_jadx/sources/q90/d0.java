package q90;

import com.braze.h2;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 {
    public static final List F = r90.g.k(new f0[]{f0.HTTP_2, f0.HTTP_1_1});
    public static final List G = r90.g.k(new m[]{m.f36548g, m.f36549h});
    public final int A;
    public final long B;
    public final ky.o C;
    public final t90.e D;
    public final m1.a E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.firebase.messaging.a0 f36463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f36464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f36465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qc.y f36466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f36467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f36468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f36469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f36470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f36471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q f36472j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f36473k;
    public final q l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ProxySelector f36474m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q f36475n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SocketFactory f36476o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SSLSocketFactory f36477p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final X509TrustManager f36478q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f36479r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f36480s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ea0.c f36481t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j f36482u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final z20.b f36483v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f36484w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f36485x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f36486y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f36487z;

    public d0(c0 c0Var) throws NoSuchAlgorithmException, KeyStoreException {
        this.f36463a = c0Var.f36427a;
        this.f36464b = r90.g.j(c0Var.f36429c);
        this.f36465c = r90.g.j(c0Var.f36430d);
        this.f36466d = c0Var.f36431e;
        this.f36467e = c0Var.f36432f;
        this.f36468f = c0Var.f36433g;
        this.f36469g = c0Var.f36434h;
        this.f36470h = c0Var.f36435i;
        this.f36471i = c0Var.f36436j;
        this.f36472j = c0Var.f36437k;
        this.f36473k = c0Var.l;
        this.l = c0Var.f36438m;
        ProxySelector proxySelector = c0Var.f36439n;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = ca0.a.f7854a;
        }
        this.f36474m = proxySelector;
        this.f36475n = c0Var.f36440o;
        this.f36476o = c0Var.f36441p;
        List list = c0Var.f36444s;
        this.f36479r = list;
        this.f36480s = c0Var.f36445t;
        this.f36481t = c0Var.f36446u;
        this.f36484w = c0Var.f36449x;
        this.f36485x = c0Var.f36450y;
        this.f36486y = c0Var.f36451z;
        this.f36487z = c0Var.A;
        this.A = c0Var.B;
        this.B = c0Var.C;
        ky.o oVar = c0Var.D;
        this.C = oVar == null ? new ky.o(25) : oVar;
        t90.e eVar = c0Var.E;
        this.D = eVar == null ? t90.e.l : eVar;
        m1.a aVar = c0Var.f36428b;
        if (aVar == null) {
            aVar = new m1.a(13);
            c0Var.f36428b = aVar;
        }
        this.E = aVar;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((m) it.next()).f36550a) {
                    SSLSocketFactory sSLSocketFactory = c0Var.f36442q;
                    if (sSLSocketFactory == null) {
                        aa0.e eVar2 = aa0.e.f1191a;
                        aa0.e.f1191a.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        trustManagers.getClass();
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                                this.f36478q = x509TrustManager;
                                aa0.e eVar3 = aa0.e.f1191a;
                                eVar3.getClass();
                                try {
                                    SSLContext sSLContextK = eVar3.k();
                                    sSLContextK.init(null, new TrustManager[]{x509TrustManager}, null);
                                    SSLSocketFactory socketFactory = sSLContextK.getSocketFactory();
                                    socketFactory.getClass();
                                    this.f36477p = socketFactory;
                                    z20.b bVarC = aa0.e.f1191a.c(x509TrustManager);
                                    this.f36483v = bVarC;
                                    j jVar = c0Var.f36447v;
                                    jVar.getClass();
                                    this.f36482u = Intrinsics.areEqual(jVar.f36518b, bVarC) ? jVar : new j(jVar.f36517a, bVarC);
                                } catch (GeneralSecurityException e5) {
                                    throw new AssertionError("No System TLS: " + e5, e5);
                                }
                            }
                        }
                        String string = Arrays.toString(trustManagers);
                        string.getClass();
                        e40.a.g("Unexpected default trust managers: ".concat(string));
                        throw null;
                    }
                    this.f36477p = sSLSocketFactory;
                    z20.b bVar = c0Var.f36448w;
                    bVar.getClass();
                    this.f36483v = bVar;
                    X509TrustManager x509TrustManager2 = c0Var.f36443r;
                    x509TrustManager2.getClass();
                    this.f36478q = x509TrustManager2;
                    j jVar2 = c0Var.f36447v;
                    jVar2.getClass();
                    this.f36482u = Intrinsics.areEqual(jVar2.f36518b, bVar) ? jVar2 : new j(jVar2.f36517a, bVar);
                }
            }
            this.f36477p = null;
            this.f36483v = null;
            this.f36478q = null;
            this.f36482u = j.f36516c;
        } else {
            this.f36477p = null;
            this.f36483v = null;
            this.f36478q = null;
            this.f36482u = j.f36516c;
        }
        X509TrustManager x509TrustManager3 = this.f36478q;
        z20.b bVar2 = this.f36483v;
        SSLSocketFactory sSLSocketFactory2 = this.f36477p;
        List list2 = this.f36465c;
        List list3 = this.f36464b;
        list3.getClass();
        if (list3.contains(null)) {
            org.bouncycastle.jce.provider.a.s(list3, "Null interceptor: ");
            throw null;
        }
        list2.getClass();
        if (list2.contains(null)) {
            org.bouncycastle.jce.provider.a.s(list2, "Null network interceptor: ");
            throw null;
        }
        List list4 = this.f36479r;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((m) it2.next()).f36550a) {
                    if (sSLSocketFactory2 == null) {
                        h2.b("sslSocketFactory == null");
                        throw null;
                    }
                    if (bVar2 == null) {
                        h2.b("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManager3 != null) {
                        return;
                    }
                    h2.b("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            h2.b("Check failed.");
            throw null;
        }
        if (bVar2 != null) {
            h2.b("Check failed.");
            throw null;
        }
        if (x509TrustManager3 != null) {
            h2.b("Check failed.");
            throw null;
        }
        if (Intrinsics.areEqual(this.f36482u, j.f36516c)) {
            return;
        }
        h2.b("Check failed.");
        throw null;
    }

    public d0() {
        this(new c0());
    }
}
