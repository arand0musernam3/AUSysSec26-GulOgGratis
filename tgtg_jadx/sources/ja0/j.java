package ja0;

import a40.x;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import ia0.a0;
import ia0.h0;
import ia0.j0;
import ia0.v;
import ia0.w;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.i0;
import kotlin.text.StringsKt;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends ia0.m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a0 f24812f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ClassLoader f24813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ia0.m f24814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f24815e;

    static {
        String str = a0.f23602b;
        f24812f = n20.f.s(ExpiryDateInput.SEPARATOR);
    }

    public j(ClassLoader classLoader) {
        classLoader.getClass();
        w wVar = ia0.m.f23661a;
        wVar.getClass();
        this.f24813c = classLoader;
        this.f24814d = wVar;
        this.f24815e = u70.l.b(new hi.d(this, 24));
    }

    @Override // ia0.m
    public final List A(a0 a0Var) throws FileNotFoundException {
        a0Var.getClass();
        a0 a0Var2 = f24812f;
        a0Var2.getClass();
        String strS = c.b(a0Var2, a0Var, true).e(a0Var2).f23603a.s();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z11 = false;
        for (Pair pair : (List) this.f24815e.getValue()) {
            ia0.m mVar = (ia0.m) pair.f26485a;
            a0 a0Var3 = (a0) pair.f26486b;
            try {
                List listA = mVar.A(a0Var3.f(strS));
                ArrayList<a0> arrayList = new ArrayList();
                for (Object obj : listA) {
                    if (n20.f.l((a0) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(e0.o(arrayList, 10));
                for (a0 a0Var4 : arrayList) {
                    a0Var4.getClass();
                    String strReplace = StringsKt.N(a0Var4.f23603a.s(), a0Var3.f23603a.s()).replace('\\', '/');
                    strReplace.getClass();
                    arrayList2.add(a0Var2.f(strReplace));
                }
                i0.s(arrayList2, linkedHashSet);
                z11 = true;
            } catch (IOException unused) {
            }
        }
        if (z11) {
            return CollectionsKt.r0(linkedHashSet);
        }
        i4.a.e(a0Var, "file not found: ");
        return null;
    }

    @Override // ia0.m
    public final x G(a0 a0Var) {
        a0Var.getClass();
        if (!n20.f.l(a0Var)) {
            return null;
        }
        a0 a0Var2 = f24812f;
        a0Var2.getClass();
        String strS = c.b(a0Var2, a0Var, true).e(a0Var2).f23603a.s();
        for (Pair pair : (List) this.f24815e.getValue()) {
            x xVarG = ((ia0.m) pair.f26485a).G(((a0) pair.f26486b).f(strS));
            if (xVarG != null) {
                return xVarG;
            }
        }
        return null;
    }

    @Override // ia0.m
    public final v H(a0 a0Var) throws FileNotFoundException {
        if (!n20.f.l(a0Var)) {
            i4.a.e(a0Var, "file not found: ");
            return null;
        }
        a0 a0Var2 = f24812f;
        a0Var2.getClass();
        String strS = c.b(a0Var2, a0Var, true).e(a0Var2).f23603a.s();
        for (Pair pair : (List) this.f24815e.getValue()) {
            try {
                return ((ia0.m) pair.f26485a).H(((a0) pair.f26486b).f(strS));
            } catch (FileNotFoundException unused) {
            }
        }
        i4.a.e(a0Var, "file not found: ");
        return null;
    }

    @Override // ia0.m
    public final h0 I(a0 a0Var, boolean z11) throws IOException {
        a0Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // ia0.m
    public final j0 J(a0 a0Var) throws IOException {
        a0Var.getClass();
        if (!n20.f.l(a0Var)) {
            i4.a.e(a0Var, "file not found: ");
            return null;
        }
        a0 a0Var2 = f24812f;
        a0Var2.getClass();
        URL resource = this.f24813c.getResource(c.b(a0Var2, a0Var, false).e(a0Var2).f23603a.s());
        if (resource == null) {
            i4.a.e(a0Var, "file not found: ");
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        inputStream.getClass();
        return ia0.b.g(inputStream);
    }

    @Override // ia0.m
    public final h0 a(a0 a0Var) throws IOException {
        a0Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // ia0.m
    public final void e(a0 a0Var, a0 a0Var2) throws IOException {
        a0Var.getClass();
        a0Var2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // ia0.m
    public final void p(a0 a0Var) throws IOException {
        a0Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // ia0.m
    public final void r(a0 a0Var) throws IOException {
        a0Var.getClass();
        throw new IOException(this + " is read-only");
    }
}
