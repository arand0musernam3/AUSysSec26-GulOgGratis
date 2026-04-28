package h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b4.s {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k5.d f21068o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e f21069p;

    public d(e eVar) {
        this.f21069p = eVar;
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
    public final void L0() {
        ek.a aVar = new ek.a(23, this, this.f21069p);
        b5.m0 m0VarG = b5.m.g(this);
        int i11 = m0VarG.f5866b;
        k5.b rectManager = ((c5.y) b5.p0.a(m0VarG)).getRectManager();
        k5.e eVar = rectManager.f25959b;
        eVar.getClass();
        q1.g0 g0Var = eVar.f25983a;
        k5.d dVar = new k5.d(eVar, i11, this, aVar);
        Object objB = g0Var.b(i11);
        if (objB == null) {
            g0Var.i(i11, dVar);
            objB = dVar;
        }
        k5.d dVar2 = (k5.d) objB;
        if (dVar2 != dVar) {
            while (true) {
                k5.d dVar3 = dVar2.f25978d;
                if (dVar3 == null) {
                    break;
                } else {
                    dVar2 = dVar3;
                }
            }
            dVar2.f25978d = dVar;
        }
        if (b5.m.g(getNode()).f5872h) {
            rectManager.f25958a.t(i11, true);
        }
        rectManager.f25961d = true;
        rectManager.j();
        this.f21068o = dVar;
    }

    @Override // b4.s
    public final void onAttach() {
        e eVar = this.f21069p;
        eVar.f21082b = this;
        if (eVar.f21083c != null) {
            L0();
        }
    }

    @Override // b4.s
    public final void onDetach() {
        e eVar = this.f21069p;
        if (eVar.f21082b == this) {
            eVar.f21082b = null;
        }
        k5.d dVar = this.f21068o;
        if (dVar != null) {
            dVar.b();
        }
        this.f21068o = null;
    }
}
