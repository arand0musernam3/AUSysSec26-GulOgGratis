package oa0;

import androidx.lifecycle.n1;
import com.braze.h2;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f32390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f32391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f32392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q90.d0 f32393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f32394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f32395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u90.n f32396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Throwable f32397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f32398i;

    public w(m0 m0Var, Object obj, Object[] objArr, q90.d0 d0Var, k kVar) {
        this.f32390a = m0Var;
        this.f32391b = obj;
        this.f32392c = objArr;
        this.f32393d = d0Var;
        this.f32394e = kVar;
    }

    public final u90.n a() {
        q90.u uVar;
        q90.v vVarB;
        m0 m0Var = this.f32390a;
        u0[] u0VarArr = (u0[]) m0Var.l;
        Object[] objArr = this.f32392c;
        int length = objArr.length;
        if (length != u0VarArr.length) {
            i4.a.f(r8.k.i(u0VarArr.length, ")", org.bouncycastle.jcajce.provider.asymmetric.a.k(length, "Argument count (", ") doesn't match expected count (")));
            return null;
        }
        k0 k0Var = new k0((String) m0Var.f32345h, (q90.v) m0Var.f32344g, (String) m0Var.f32346i, (q90.t) m0Var.f32347j, (q90.z) m0Var.f32348k, m0Var.f32338a, m0Var.f32339b, m0Var.f32340c);
        if (m0Var.f32341d) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i11 = 0; i11 < length; i11++) {
            arrayList.add(objArr[i11]);
            u0VarArr[i11].a(k0Var, objArr[i11]);
        }
        q90.u uVar2 = k0Var.f32302d;
        if (uVar2 != null) {
            vVarB = uVar2.b();
        } else {
            String str = k0Var.f32301c;
            q90.v vVar = k0Var.f32300b;
            vVar.getClass();
            str.getClass();
            try {
                uVar = new q90.u();
                uVar.e(vVar, str);
            } catch (IllegalArgumentException unused) {
                uVar = null;
            }
            vVarB = uVar != null ? uVar.b() : null;
            if (vVarB == null) {
                StringBuilder sb2 = new StringBuilder("Malformed URL. Base: ");
                sb2.append(vVar);
                i1.m(sb2, ", Relative: ", k0Var.f32301c);
                return null;
            }
        }
        q90.n0 j0Var = k0Var.f32309k;
        if (j0Var == null) {
            oz.m mVar = k0Var.f32308j;
            if (mVar != null) {
                j0Var = new q90.r((ArrayList) mVar.f33836b, (ArrayList) mVar.f33837c);
            } else {
                j30.g gVar = k0Var.f32307i;
                if (gVar != null) {
                    ArrayList arrayList2 = (ArrayList) gVar.f24504d;
                    if (arrayList2.isEmpty()) {
                        h2.b("Multipart body must have at least one part.");
                        return null;
                    }
                    j0Var = new q90.b0((ia0.j) gVar.f24502b, (q90.z) gVar.f24503c, r90.g.j(arrayList2));
                } else if (k0Var.f32306h) {
                    j0Var = q90.n0.create((q90.z) null, new byte[0]);
                }
            }
        }
        q90.z zVar = k0Var.f32305g;
        ax.g0 g0Var = k0Var.f32304f;
        if (zVar != null) {
            if (j0Var != null) {
                j0Var = new j0(j0Var, zVar);
            } else {
                g0Var.c("Content-Type", zVar.f36635a);
            }
        }
        n1 n1Var = k0Var.f32303e;
        n1Var.getClass();
        n1Var.f3499a = vVarB;
        n1Var.f3501c = g0Var.g().e();
        n1Var.w(k0Var.f32299a, j0Var);
        n1Var.B(q.class, new q((Class) m0Var.f32342e, this.f32391b, (Method) m0Var.f32343f, arrayList));
        q90.g0 g0Var2 = new q90.g0(n1Var);
        q90.d0 d0Var = this.f32393d;
        d0Var.getClass();
        return new u90.n(d0Var, g0Var2, false);
    }

    public final q90.h b() throws IOException {
        u90.n nVar = this.f32396g;
        if (nVar != null) {
            return nVar;
        }
        Throwable th2 = this.f32397h;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            u90.n nVarA = a();
            this.f32396g = nVarA;
            return nVarA;
        } catch (IOException | Error | RuntimeException e5) {
            u0.r(e5);
            this.f32397h = e5;
            throw e5;
        }
    }

    public final n0 c(q90.p0 p0Var) throws IOException {
        q90.r0 r0Var = p0Var.f36588g;
        q90.o0 o0VarG = p0Var.g();
        o0VarG.f36573g = new v(r0Var.g(), r0Var.e());
        q90.p0 p0VarA = o0VarG.a();
        int i11 = p0VarA.f36585d;
        if (i11 < 200 || i11 >= 300) {
            try {
                ia0.g gVar = new ia0.g();
                r0Var.p0().j0(gVar);
                q90.z zVarG = r0Var.g();
                long jE = r0Var.e();
                q90.q0 q0Var = q90.r0.f36605a;
                q90.q0 q0Var2 = new q90.q0(zVarG, jE, gVar);
                if (p0VarA.f36597q) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new n0(p0VarA, null, q0Var2);
            } finally {
                r0Var.close();
            }
        }
        if (i11 == 204 || i11 == 205) {
            r0Var.close();
            return n0.a(null, p0VarA);
        }
        u uVar = new u(r0Var);
        try {
            return n0.a(this.f32394e.f(uVar), p0VarA);
        } catch (RuntimeException e5) {
            IOException iOException = uVar.f32384d;
            if (iOException == null) {
                throw e5;
            }
            throw iOException;
        }
    }

    @Override // oa0.d
    public final void cancel() {
        u90.n nVar;
        this.f32395f = true;
        synchronized (this) {
            nVar = this.f32396g;
        }
        if (nVar != null) {
            nVar.cancel();
        }
    }

    public final Object clone() {
        return new w(this.f32390a, this.f32391b, this.f32392c, this.f32393d, this.f32394e);
    }

    @Override // oa0.d
    public final n0 e() {
        q90.h hVarB;
        synchronized (this) {
            if (this.f32398i) {
                throw new IllegalStateException("Already executed.");
            }
            this.f32398i = true;
            hVarB = b();
        }
        if (this.f32395f) {
            ((u90.n) hVarB).cancel();
        }
        return c(((u90.n) hVarB).f());
    }

    @Override // oa0.d
    public final void g(g gVar) {
        u90.n nVar;
        Throwable th2;
        synchronized (this) {
            try {
                if (this.f32398i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f32398i = true;
                nVar = this.f32396g;
                th2 = this.f32397h;
                if (nVar == null && th2 == null) {
                    try {
                        u90.n nVarA = a();
                        this.f32396g = nVarA;
                        nVar = nVarA;
                    } catch (Throwable th3) {
                        th2 = th3;
                        u0.r(th2);
                        this.f32397h = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            gVar.p(this, th2);
            return;
        }
        if (this.f32395f) {
            nVar.cancel();
        }
        nVar.d(new k8.d(this, gVar, 28));
    }

    @Override // oa0.d
    public final boolean p() {
        boolean z11 = true;
        if (this.f32395f) {
            return true;
        }
        synchronized (this) {
            try {
                u90.n nVar = this.f32396g;
                if (nVar == null || !nVar.f40938q) {
                    z11 = false;
                }
            } finally {
            }
        }
        return z11;
    }

    @Override // oa0.d
    public final synchronized q90.g0 r() {
        try {
        } catch (IOException e5) {
            throw new RuntimeException("Unable to create request.", e5);
        }
        return ((u90.n) b()).f40924b;
    }

    @Override // oa0.d
    /* JADX INFO: renamed from: clone */
    public final d mo987clone() {
        return new w(this.f32390a, this.f32391b, this.f32392c, this.f32393d, this.f32394e);
    }
}
