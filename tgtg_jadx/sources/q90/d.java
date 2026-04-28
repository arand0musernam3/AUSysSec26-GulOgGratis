package q90;

import com.google.android.gms.internal.measurement.ib;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f36452k;
    public static final String l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f36453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f36454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f36456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f36458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f36459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f36460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f36461i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f36462j;

    static {
        aa0.e eVar = aa0.e.f1191a;
        aa0.e.f1191a.getClass();
        f36452k = "OkHttp-Sent-Millis";
        aa0.e.f1191a.getClass();
        l = "OkHttp-Received-Millis";
    }

    public d(ia0.j0 j0Var) throws IOException {
        v vVarB;
        u0 u0VarA;
        j0Var.getClass();
        try {
            ia0.d0 d0Var = new ia0.d0(j0Var);
            String strD = d0Var.D(LongCompanionObject.MAX_VALUE);
            try {
                u uVar = new u();
                uVar.e(null, strD);
                vVarB = uVar.b();
            } catch (IllegalArgumentException unused) {
                vVarB = null;
            }
            if (vVarB == null) {
                IOException iOException = new IOException("Cache corruption for ".concat(strD));
                aa0.e eVar = aa0.e.f1191a;
                aa0.e.f1191a.i(5, "cache corruption", iOException);
                throw iOException;
            }
            this.f36453a = vVarB;
            this.f36455c = d0Var.D(LongCompanionObject.MAX_VALUE);
            ax.g0 g0Var = new ax.g0(3);
            int iN = ox.h.N(d0Var);
            for (int i11 = 0; i11 < iN; i11++) {
                g0Var.d(d0Var.D(LongCompanionObject.MAX_VALUE));
            }
            this.f36454b = g0Var.g();
            a3.j jVarD = ex.i.D(d0Var.D(LongCompanionObject.MAX_VALUE));
            this.f36456d = (f0) jVarD.f399c;
            this.f36457e = jVarD.f398b;
            this.f36458f = (String) jVarD.f400d;
            ax.g0 g0Var2 = new ax.g0(3);
            int iN2 = ox.h.N(d0Var);
            for (int i12 = 0; i12 < iN2; i12++) {
                g0Var2.d(d0Var.D(LongCompanionObject.MAX_VALUE));
            }
            String str = f36452k;
            String strH = g0Var2.h(str);
            String str2 = l;
            String strH2 = g0Var2.h(str2);
            g0Var2.i(str);
            g0Var2.i(str2);
            this.f36461i = strH != null ? Long.parseLong(strH) : 0L;
            this.f36462j = strH2 != null ? Long.parseLong(strH2) : 0L;
            this.f36459g = g0Var2.g();
            if (this.f36453a.f()) {
                String strD2 = d0Var.D(LongCompanionObject.MAX_VALUE);
                if (strD2.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strD2 + '\"');
                }
                l lVarF = l.f36523b.f(d0Var.D(LongCompanionObject.MAX_VALUE));
                List listA = a(d0Var);
                List listA2 = a(d0Var);
                if (d0Var.a()) {
                    u0VarA = u0.SSL_3_0;
                } else {
                    t0 t0Var = u0.Companion;
                    String strD3 = d0Var.D(LongCompanionObject.MAX_VALUE);
                    t0Var.getClass();
                    u0VarA = t0.a(strD3);
                }
                u0VarA.getClass();
                listA.getClass();
                listA2.getClass();
                this.f36460h = new s(u0VarA, lVarF, r90.g.j(listA2), new cw.a(r90.g.j(listA), 6));
            } else {
                this.f36460h = null;
            }
            j0Var.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                u00.d.p(j0Var, th2);
                throw th3;
            }
        }
    }

    public static List a(ia0.d0 d0Var) throws IOException {
        int iN = ox.h.N(d0Var);
        if (iN == -1) {
            return kotlin.collections.n0.f26529a;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iN);
            for (int i11 = 0; i11 < iN; i11++) {
                String strD = d0Var.D(LongCompanionObject.MAX_VALUE);
                ia0.g gVar = new ia0.g();
                ia0.j jVar = ia0.j.f23646d;
                ia0.j jVarM = r40.d.m(strD);
                if (jVarM == null) {
                    throw new IOException("Corrupt certificate in cache entry");
                }
                gVar.y0(jVarM);
                arrayList.add(certificateFactory.generateCertificate(new ib(gVar, 2)));
            }
            return arrayList;
        } catch (CertificateException e5) {
            i4.a.k(e5.getMessage());
            return null;
        }
    }

    public static void b(ia0.c0 c0Var, List list) throws IOException {
        try {
            c0Var.s0(list.size());
            c0Var.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                ia0.j jVar = ia0.j.f23646d;
                encoded.getClass();
                c0Var.M(r40.d.u(encoded).a());
                c0Var.writeByte(10);
            }
        } catch (CertificateEncodingException e5) {
            i4.a.k(e5.getMessage());
        }
    }

    public final void c(c40.q qVar) {
        v vVar = this.f36453a;
        s sVar = this.f36460h;
        t tVar = this.f36459g;
        t tVar2 = this.f36454b;
        ia0.c0 c0Var = new ia0.c0(qVar.g(0));
        try {
            c0Var.M(vVar.f36631i);
            c0Var.writeByte(10);
            c0Var.M(this.f36455c);
            c0Var.writeByte(10);
            c0Var.s0(tVar2.size());
            c0Var.writeByte(10);
            int size = tVar2.size();
            for (int i11 = 0; i11 < size; i11++) {
                c0Var.M(tVar2.d(i11));
                c0Var.M(": ");
                c0Var.M(tVar2.g(i11));
                c0Var.writeByte(10);
            }
            f0 f0Var = this.f36456d;
            int i12 = this.f36457e;
            String str = this.f36458f;
            f0Var.getClass();
            str.getClass();
            StringBuilder sb2 = new StringBuilder();
            if (f0Var == f0.HTTP_1_0) {
                sb2.append("HTTP/1.0");
            } else {
                sb2.append("HTTP/1.1");
            }
            sb2.append(' ');
            sb2.append(i12);
            sb2.append(' ');
            sb2.append(str);
            c0Var.M(sb2.toString());
            c0Var.writeByte(10);
            c0Var.s0(tVar.size() + 2);
            c0Var.writeByte(10);
            int size2 = tVar.size();
            for (int i13 = 0; i13 < size2; i13++) {
                c0Var.M(tVar.d(i13));
                c0Var.M(": ");
                c0Var.M(tVar.g(i13));
                c0Var.writeByte(10);
            }
            c0Var.M(f36452k);
            c0Var.M(": ");
            c0Var.s0(this.f36461i);
            c0Var.writeByte(10);
            c0Var.M(l);
            c0Var.M(": ");
            c0Var.s0(this.f36462j);
            c0Var.writeByte(10);
            if (vVar.f()) {
                c0Var.writeByte(10);
                sVar.getClass();
                c0Var.M(sVar.f36607b.f36541a);
                c0Var.writeByte(10);
                b(c0Var, sVar.a());
                b(c0Var, sVar.f36608c);
                c0Var.M(sVar.f36606a.a());
                c0Var.writeByte(10);
            }
            c0Var.close();
        } finally {
        }
    }

    public d(p0 p0Var) {
        t tVarG;
        g0 g0Var = p0Var.f36582a;
        this.f36453a = g0Var.f36505a;
        p0 p0Var2 = p0Var.f36590i;
        p0Var2.getClass();
        t tVar = p0Var2.f36582a.f36507c;
        t tVar2 = p0Var.f36587f;
        Set setV = ox.h.V(tVar2);
        if (setV.isEmpty()) {
            tVarG = t.f36613b;
        } else {
            ax.g0 g0Var2 = new ax.g0(3);
            int size = tVar.size();
            for (int i11 = 0; i11 < size; i11++) {
                String strD = tVar.d(i11);
                if (setV.contains(strD)) {
                    g0Var2.c(strD, tVar.g(i11));
                }
            }
            tVarG = g0Var2.g();
        }
        this.f36454b = tVarG;
        this.f36455c = g0Var.f36506b;
        this.f36456d = p0Var.f36583b;
        this.f36457e = p0Var.f36585d;
        this.f36458f = p0Var.f36584c;
        this.f36459g = tVar2;
        this.f36460h = p0Var.f36586e;
        this.f36461i = p0Var.l;
        this.f36462j = p0Var.f36593m;
    }
}
