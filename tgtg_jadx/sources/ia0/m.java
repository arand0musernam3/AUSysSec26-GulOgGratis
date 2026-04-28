package ia0;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f23661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f23662b;

    static {
        w wVar;
        try {
            Class.forName("java.nio.file.Files");
            wVar = new x();
        } catch (ClassNotFoundException unused) {
            wVar = new w();
        }
        f23661a = wVar;
        String str = a0.f23602b;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        f23662b = n20.f.s(property);
        ClassLoader classLoader = ja0.j.class.getClassLoader();
        classLoader.getClass();
        new ja0.j(classLoader);
    }

    public abstract List A(a0 a0Var);

    public final a40.x B(a0 a0Var) throws FileNotFoundException {
        a0Var.getClass();
        a40.x xVarG = G(a0Var);
        if (xVarG != null) {
            return xVarG;
        }
        i4.a.e(a0Var, "no such file: ");
        return null;
    }

    public abstract a40.x G(a0 a0Var);

    public abstract v H(a0 a0Var);

    public abstract h0 I(a0 a0Var, boolean z11);

    public abstract j0 J(a0 a0Var);

    public abstract h0 a(a0 a0Var);

    public abstract void e(a0 a0Var, a0 a0Var2);

    public final void g(a0 a0Var) {
        kotlin.collections.t tVar = new kotlin.collections.t();
        while (a0Var != null && !u(a0Var)) {
            tVar.addFirst(a0Var);
            a0Var = a0Var.d();
        }
        Iterator<E> it = tVar.iterator();
        while (it.hasNext()) {
            p((a0) it.next());
        }
    }

    public abstract void p(a0 a0Var);

    public abstract void r(a0 a0Var);

    public final void t(a0 a0Var) {
        a0Var.getClass();
        r(a0Var);
    }

    public final boolean u(a0 a0Var) {
        a0Var.getClass();
        return G(a0Var) != null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
