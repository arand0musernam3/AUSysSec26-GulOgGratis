package w4;

import a3.i3;
import kotlin.jvm.internal.Intrinsics;
import q1.o0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z4.z f43106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f43107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f43109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o0 f43111f = new o0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f43112g = new m();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q1.k0 f43113h = new q1.k0(10);

    public c(z4.z zVar) {
        this.f43106a = zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r19, java.util.List r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.c.a(long, java.util.List, boolean):void");
    }

    public final boolean b(i3 i3Var, boolean z11) {
        q1.z zVar = (q1.z) i3Var.f395b;
        z4.z zVar2 = this.f43106a;
        m mVar = this.f43112g;
        boolean zA = mVar.a(zVar, zVar2, i3Var, z11);
        o3.e eVar = mVar.f43153a;
        if (!zA) {
            return false;
        }
        boolean z12 = true;
        this.f43107b = true;
        Object[] objArr = eVar.f31830a;
        int i11 = eVar.f31832c;
        boolean z13 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            z13 = ((l) objArr[i12]).e(i3Var, z11) || z13;
        }
        Object[] objArr2 = eVar.f31830a;
        int i13 = eVar.f31832c;
        boolean z14 = false;
        for (int i14 = 0; i14 < i13; i14++) {
            z14 = ((l) objArr2[i14]).d(i3Var) || z14;
        }
        mVar.b(i3Var);
        if (!z14 && !z13) {
            z12 = false;
        }
        this.f43107b = false;
        if (this.f43110e) {
            this.f43110e = false;
            o0 o0Var = this.f43111f;
            int i15 = o0Var.f35722b;
            for (int i16 = 0; i16 < i15; i16++) {
                d((b4.s) o0Var.b(i16));
            }
            o0Var.j();
        }
        if (this.f43108c) {
            this.f43108c = false;
            c();
        }
        if (this.f43109d) {
            this.f43109d = false;
            mVar.f43153a.g();
        }
        return z12;
    }

    public final void c() {
        if (this.f43107b) {
            this.f43108c = true;
            return;
        }
        m mVar = this.f43112g;
        o3.e eVar = mVar.f43153a;
        Object[] objArr = eVar.f31830a;
        int i11 = eVar.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            ((l) objArr[i12]).c();
        }
        if (this.f43109d) {
            this.f43109d = true;
        } else {
            mVar.f43153a.g();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d(b4.s sVar) {
        if (this.f43107b) {
            this.f43110e = true;
            this.f43111f.g(sVar);
            return;
        }
        m mVar = this.f43112g;
        o0 o0Var = mVar.f43154b;
        o0Var.j();
        o0Var.g(mVar);
        while (o0Var.e()) {
            m mVar2 = (m) o0Var.l(o0Var.f35722b - 1);
            int i11 = 0;
            while (true) {
                o3.e eVar = mVar2.f43153a;
                if (i11 < eVar.f31832c) {
                    l lVar = (l) eVar.f31830a[i11];
                    if (Intrinsics.areEqual(lVar.f43145c, sVar)) {
                        mVar2.f43153a.j(lVar);
                        lVar.c();
                    } else {
                        o0Var.g(lVar);
                        i11++;
                    }
                }
            }
        }
    }
}
