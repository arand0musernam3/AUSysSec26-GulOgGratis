package b0;

import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import com.app.tgtg.feature.orderview.manufacture.ManufacturerOrderActivity;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import g3.z5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5042j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5043k;
    public /* synthetic */ int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f5044m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b1 b1Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f5042j = 1;
        this.f5044m = b1Var;
        this.l = i11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f5042j) {
            case 0:
                return new a1((v80.j0) this.f5044m, this.l, cVar, 0);
            case 1:
                return new a1((b1) this.f5044m, cVar, this.l);
            case 2:
                return new a1((z5) this.f5044m, this.l, cVar, 2);
            case 3:
                return new a1((CharityOrderActivity) this.f5044m, this.l, cVar, 3);
            case 4:
                return new a1((h2.k1) this.f5044m, this.l, cVar, 4);
            case 5:
                return new a1((ih.i) this.f5044m, this.l, cVar, 5);
            case 6:
                return new a1((ManufacturerOrderActivity) this.f5044m, this.l, cVar, 6);
            case 7:
                return new a1((lo.m) this.f5044m, this.l, cVar, 7);
            case 8:
                return new a1((SurpriseBagOrderActivity) this.f5044m, this.l, cVar, 8);
            case 9:
                return new a1((pi.m) this.f5044m, this.l, cVar, 9);
            default:
                a1 a1Var = new a1((w2.v0) this.f5044m, cVar);
                a1Var.l = ((Number) obj).intValue();
                return a1Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5042j) {
            case 0:
                return ((a1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((a1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 2:
                return ((a1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 3:
                return ((a1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 4:
                return ((a1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 5:
                return ((a1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 6:
                return ((a1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 7:
                return ((a1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 8:
                return ((a1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 9:
                return ((a1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((a1) create(Integer.valueOf(((Number) obj).intValue()), (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x024a, code lost:
    
        if (kotlin.Unit.f26487a == r1) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0286, code lost:
    
        if (r2 == r1) goto L111;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023c  */
    /* JADX WARN: Type inference failed for: r9v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r9v10 */
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
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r77) {
        /*
            Method dump skipped, instruction units count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.a1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(Object obj, int i11, x70.c cVar, int i12) {
        super(2, cVar);
        this.f5042j = i12;
        this.f5044m = obj;
        this.l = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(w2.v0 v0Var, x70.c cVar) {
        super(2, cVar);
        this.f5042j = 10;
        this.f5044m = v0Var;
    }
}
