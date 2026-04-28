package qc;

import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z20.b f36896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ia0.i f36898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function0 f36899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ia0.a0 f36900e;

    public d0(ia0.i iVar, Function0 function0, z20.b bVar) {
        this.f36896a = bVar;
        this.f36898c = iVar;
        this.f36899d = function0;
    }

    @Override // qc.b0
    public final synchronized ia0.a0 a() {
        if (this.f36897b) {
            throw new IllegalStateException("closed");
        }
        ia0.a0 a0Var = this.f36900e;
        if (a0Var != null) {
            return a0Var;
        }
        Function0 function0 = this.f36899d;
        function0.getClass();
        File file = (File) function0.invoke();
        if (!file.isDirectory()) {
            throw new IllegalStateException("cacheDirectory must be a directory.");
        }
        String str = ia0.a0.f23602b;
        ia0.a0 a0VarT = n20.f.t(File.createTempFile("tmp", null, file));
        ia0.c0 c0Var = new ia0.c0(ia0.m.f23661a.I(a0VarT, false));
        try {
            ia0.i iVar = this.f36898c;
            iVar.getClass();
            c0Var.b0(iVar);
            try {
                c0Var.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                c0Var.close();
            } catch (Throwable th4) {
                u70.e.a(th, th4);
            }
        }
        if (th != null) {
            throw th;
        }
        this.f36898c = null;
        this.f36900e = a0VarT;
        this.f36899d = null;
        return a0VarT;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f36897b = true;
            ia0.i iVar = this.f36898c;
            if (iVar != null) {
                ed.k.a(iVar);
            }
            ia0.a0 a0Var = this.f36900e;
            if (a0Var != null) {
                ia0.w wVar = ia0.m.f23661a;
                wVar.getClass();
                wVar.r(a0Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // qc.b0
    public final z20.b e() {
        return this.f36896a;
    }

    @Override // qc.b0
    public final synchronized ia0.a0 h0() {
        if (this.f36897b) {
            throw new IllegalStateException("closed");
        }
        return this.f36900e;
    }

    @Override // qc.b0
    public final synchronized ia0.i p0() {
        if (this.f36897b) {
            throw new IllegalStateException("closed");
        }
        ia0.i iVar = this.f36898c;
        if (iVar != null) {
            return iVar;
        }
        ia0.w wVar = ia0.m.f23661a;
        ia0.a0 a0Var = this.f36900e;
        a0Var.getClass();
        ia0.d0 d0Var = new ia0.d0(wVar.J(a0Var));
        this.f36898c = d0Var;
        return d0Var;
    }
}
