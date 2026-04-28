package ia0;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f23667c;

    public n(m mVar) {
        mVar.getClass();
        this.f23667c = mVar;
    }

    @Override // ia0.m
    public final List A(a0 a0Var) {
        a0Var.getClass();
        List<a0> listA = this.f23667c.A(a0Var);
        ArrayList arrayList = new ArrayList();
        for (a0 a0Var2 : listA) {
            a0Var2.getClass();
            arrayList.add(a0Var2);
        }
        kotlin.collections.h0.q(arrayList);
        return arrayList;
    }

    @Override // ia0.m
    public final a40.x G(a0 a0Var) {
        a0Var.getClass();
        a40.x xVarG = this.f23667c.G(a0Var);
        if (xVarG == null) {
            return null;
        }
        a0 a0Var2 = (a0) xVarG.f806d;
        if (a0Var2 == null) {
            return xVarG;
        }
        boolean z11 = xVarG.f804b;
        boolean z12 = xVarG.f805c;
        Long l = (Long) xVarG.f807e;
        Long l7 = (Long) xVarG.f808f;
        Long l11 = (Long) xVarG.f809g;
        Long l12 = (Long) xVarG.f810h;
        Map map = (Map) xVarG.f811i;
        map.getClass();
        return new a40.x(z11, z12, a0Var2, l, l7, l11, l12, map);
    }

    @Override // ia0.m
    public final v H(a0 a0Var) {
        return this.f23667c.H(a0Var);
    }

    @Override // ia0.m
    public h0 I(a0 a0Var, boolean z11) {
        a0Var.getClass();
        return this.f23667c.I(a0Var, z11);
    }

    @Override // ia0.m
    public final j0 J(a0 a0Var) {
        a0Var.getClass();
        return this.f23667c.J(a0Var);
    }

    @Override // ia0.m
    public final h0 a(a0 a0Var) {
        a0Var.getClass();
        return this.f23667c.a(a0Var);
    }

    @Override // ia0.m, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23667c.close();
    }

    @Override // ia0.m
    public final void e(a0 a0Var, a0 a0Var2) {
        a0Var.getClass();
        a0Var2.getClass();
        this.f23667c.e(a0Var, a0Var2);
    }

    @Override // ia0.m
    public final void p(a0 a0Var) {
        a0Var.getClass();
        this.f23667c.p(a0Var);
    }

    @Override // ia0.m
    public final void r(a0 a0Var) {
        a0Var.getClass();
        this.f23667c.r(a0Var);
    }

    public final String toString() {
        return Reflection.getOrCreateKotlinClass(getClass()).getSimpleName() + '(' + this.f23667c + ')';
    }
}
