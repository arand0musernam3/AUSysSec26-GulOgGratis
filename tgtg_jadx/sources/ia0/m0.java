package ia0;

import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a0 f23663f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f23664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f23665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f23666e;

    static {
        String str = a0.f23602b;
        f23663f = n20.f.s(ExpiryDateInput.SEPARATOR);
    }

    public m0(a0 a0Var, m mVar, LinkedHashMap linkedHashMap) {
        mVar.getClass();
        this.f23664c = a0Var;
        this.f23665d = mVar;
        this.f23666e = linkedHashMap;
    }

    @Override // ia0.m
    public final List A(a0 a0Var) throws IOException {
        a0Var.getClass();
        a0 a0Var2 = f23663f;
        a0Var2.getClass();
        ja0.l lVar = (ja0.l) this.f23666e.get(ja0.c.b(a0Var2, a0Var, true));
        if (lVar == null) {
            i4.a.l(a0Var, "not a directory: ");
            return null;
        }
        List listR0 = CollectionsKt.r0(lVar.f24832q);
        listR0.getClass();
        return listR0;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0127  */
    @Override // ia0.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a40.x G(ia0.a0 r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ia0.m0.G(ia0.a0):a40.x");
    }

    @Override // ia0.m
    public final v H(a0 a0Var) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // ia0.m
    public final h0 I(a0 a0Var, boolean z11) throws IOException {
        a0Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // ia0.m
    public final j0 J(a0 a0Var) throws Throwable {
        d0 d0Var;
        Throwable th2;
        a0Var.getClass();
        a0 a0Var2 = f23663f;
        a0Var2.getClass();
        ja0.l lVar = (ja0.l) this.f23666e.get(ja0.c.b(a0Var2, a0Var, true));
        if (lVar == null) {
            i4.a.e(a0Var, "no such file: ");
            return null;
        }
        long j9 = lVar.f24822f;
        v vVarH = this.f23665d.H(this.f23664c);
        try {
            d0Var = new d0(vVarH.a(lVar.f24824h));
            try {
                vVarH.close();
                th2 = null;
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Throwable th4) {
            if (vVarH != null) {
                try {
                    vVarH.close();
                } catch (Throwable th5) {
                    u70.e.a(th4, th5);
                }
            }
            d0Var = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        d0Var.getClass();
        ja0.o.f(d0Var, null);
        if (lVar.f24823g == 0) {
            return new ja0.i(d0Var, j9, true);
        }
        return new ja0.i(new t(new d0(new ja0.i(d0Var, lVar.f24821e, true)), new Inflater(true)), j9, false);
    }

    @Override // ia0.m
    public final h0 a(a0 a0Var) throws IOException {
        a0Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // ia0.m
    public final void e(a0 a0Var, a0 a0Var2) throws IOException {
        a0Var.getClass();
        a0Var2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // ia0.m
    public final void p(a0 a0Var) throws IOException {
        a0Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // ia0.m
    public final void r(a0 a0Var) throws IOException {
        a0Var.getClass();
        throw new IOException("zip file systems are read-only");
    }
}
