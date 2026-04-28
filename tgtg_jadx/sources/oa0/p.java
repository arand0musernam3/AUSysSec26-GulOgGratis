package oa0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f32362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q90.d0 f32363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f32364c;

    public p(m0 m0Var, q90.d0 d0Var, k kVar) {
        this.f32362a = m0Var;
        this.f32363b = d0Var;
        this.f32364c = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0119, code lost:
    
        throw oa0.u0.m(r28, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:386:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x08fe A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static oa0.p b(oa0.o0 r26, java.lang.Class r27, java.lang.reflect.Method r28) {
        /*
            Method dump skipped, instruction units count: 2845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oa0.p.b(oa0.o0, java.lang.Class, java.lang.reflect.Method):oa0.p");
    }

    public abstract Object a(w wVar, Object[] objArr);
}
