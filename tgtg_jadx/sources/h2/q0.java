package h2;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import z4.z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements z4.w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f21210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f21211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f21212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q1.g0 f21213d;

    public q0(j0 j0Var, z1 z1Var) {
        this.f21210a = j0Var;
        this.f21211b = z1Var;
        this.f21212c = (k0) j0Var.f21143b.invoke();
        q1.p.a();
        this.f21213d = new q1.g0();
    }

    @Override // z5.c
    public final long I(float f11) {
        return this.f21211b.I(f11);
    }

    @Override // z5.c
    public final float O(int i11) {
        return this.f21211b.O(i11);
    }

    @Override // z5.c
    public final float R(float f11) {
        return this.f21211b.R(f11);
    }

    @Override // z5.c
    public final float X() {
        return this.f21211b.X();
    }

    @Override // z4.u
    public final boolean Z() {
        return this.f21211b.Z();
    }

    @Override // z5.c
    public final float a() {
        return this.f21211b.a();
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
    public final List b(int i11) {
        q1.g0 g0Var = this.f21213d;
        List list = (List) g0Var.b(i11);
        if (list != null) {
            return list;
        }
        k0 k0Var = this.f21212c;
        Object objB = k0Var.b(i11);
        List listI = this.f21211b.i(objB, this.f21210a.a(i11, objB, k0Var.c(i11)));
        g0Var.i(i11, listI);
        return listI;
    }

    @Override // z5.c
    public final float c0(float f11) {
        return this.f21211b.c0(f11);
    }

    @Override // z4.u
    public final z5.m getLayoutDirection() {
        return this.f21211b.getLayoutDirection();
    }

    @Override // z5.c
    public final int j0(long j9) {
        return this.f21211b.j0(j9);
    }

    @Override // z5.c
    public final long l(float f11) {
        return this.f21211b.l(f11);
    }

    @Override // z5.c
    public final long m(long j9) {
        return this.f21211b.m(j9);
    }

    @Override // z4.w0
    public final z4.v0 m0(int i11, int i12, Map map, Function1 function1, Function1 function12) {
        return this.f21211b.m0(i11, i12, map, function1, function12);
    }

    @Override // z5.c
    public final int q0(float f11) {
        return this.f21211b.q0(f11);
    }

    @Override // z4.w0
    public final z4.v0 r(int i11, int i12, Map map, Function1 function1) {
        return this.f21211b.r(i11, i12, map, function1);
    }

    @Override // z5.c
    public final float t(long j9) {
        return this.f21211b.t(j9);
    }

    @Override // z5.c
    public final long x0(long j9) {
        return this.f21211b.x0(j9);
    }

    @Override // z5.c
    public final float z0(long j9) {
        return this.f21211b.z0(j9);
    }
}
