package s1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Lambda implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z3.r f38577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f38579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u3.d f38580d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(z3.r rVar, Object obj, s sVar, u3.d dVar) {
        super(3);
        this.f38577a = rVar;
        this.f38578b = obj;
        this.f38579c = sVar;
        this.f38580d = dVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z zVar = (z) obj;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? ((m3.s) nVar).f(zVar) : ((m3.s) nVar).h(zVar) ? 4 : 2;
        }
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            z3.r rVar = this.f38577a;
            boolean zF = sVar.f(rVar);
            Object obj4 = this.f38578b;
            boolean zH = zF | sVar.h(obj4);
            s sVar2 = this.f38579c;
            boolean zH2 = zH | sVar.h(sVar2);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zH2 || objM == fVar) {
                objM = new c6.f(rVar, obj4, sVar2, 2);
                sVar.k0(objM);
            }
            m3.i.d(zVar, (Function1) objM, sVar);
            q1.t0 t0Var = sVar2.f38677e;
            zVar.getClass();
            t0Var.m(obj4, ((a0) zVar).f38523a);
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new l();
                sVar.k0(objM2);
            }
            this.f38580d.invoke((l) objM2, obj4, sVar, 0);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }
}
