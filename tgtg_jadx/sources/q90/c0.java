package q90;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 {
    public int A;
    public int B;
    public long C;
    public ky.o D;
    public t90.e E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m1.a f36428b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public qc.y f36431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f36433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f36434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f36435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f36436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q f36437k;
    public f l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public q f36438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ProxySelector f36439n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q f36440o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SocketFactory f36441p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SSLSocketFactory f36442q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public X509TrustManager f36443r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f36444s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f36445t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ea0.c f36446u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j f36447v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public z20.b f36448w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f36449x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f36450y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f36451z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.firebase.messaging.a0 f36427a = new com.google.firebase.messaging.a0(22);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f36429c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f36430d = new ArrayList();

    public c0() {
        TimeZone timeZone = r90.g.f37815a;
        this.f36431e = new qc.y(4);
        this.f36432f = true;
        this.f36433g = true;
        q qVar = b.f36413n0;
        this.f36434h = qVar;
        this.f36435i = true;
        this.f36436j = true;
        this.f36437k = p.f36581o0;
        this.f36438m = q.f36598a;
        this.f36440o = qVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.f36441p = socketFactory;
        this.f36444s = d0.G;
        this.f36445t = d0.F;
        this.f36446u = ea0.c.f15902a;
        this.f36447v = j.f36516c;
        this.f36450y = 10000;
        this.f36451z = 10000;
        this.A = 10000;
        this.B = 60000;
        this.C = 1024L;
    }

    public final void a(x xVar) {
        xVar.getClass();
        this.f36429c.add(xVar);
    }
}
