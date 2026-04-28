package h2;

import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.feature.postpurchase.PostPurchaseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f21060j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21061k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f21060j = i11;
        this.l = obj;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f21060j) {
            case 0:
                return new b1((dn.k) this.l, cVar, 0);
            case 1:
                return new b1((hi.e) this.l, cVar, 1);
            case 2:
                return new b1((ho.j) this.l, cVar, 2);
            case 3:
                return new b1((hr.n) this.l, cVar, 3);
            case 4:
                return new b1((i0.n) this.l, cVar, 4);
            case 5:
                return new b1((ih.i) this.l, cVar, 5);
            case 6:
                return new b1((j0.a) this.l, cVar, 6);
            case 7:
                return new b1((ji.h) this.l, cVar, 7);
            case 8:
                return new b1((k40.b) this.l, cVar, 8);
            case 9:
                return new b1((ks.h) this.l, cVar, 9);
            case 10:
                return new b1((m0.h1) this.l, cVar, 10);
            case 11:
                return new b1((lm.i) this.l, cVar, 11);
            case 12:
                return new b1((m3.h1) this.l, cVar, 12);
            case 13:
                return new b1((w2.q) this.l, cVar, 13);
            case 14:
                return new b1((m2.g1) this.l, cVar, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new b1((ye.b) this.l, cVar, 15);
            case 16:
                return new b1((ng.d) this.l, cVar, 16);
            case 17:
                return new b1((nn.a) this.l, cVar, 17);
            case 18:
                return new b1((no.j) this.l, cVar, 18);
            case 19:
                return new b1((SurpriseBagOrderActivity) this.l, cVar, 19);
            case 20:
                return new b1((ns.g) this.l, cVar, 20);
            case 21:
                return new b1((of.l) this.l, cVar, 21);
            case 22:
                return new b1((oh.c) this.l, cVar, 22);
            case 23:
                return new b1((oj.a) this.l, cVar, 23);
            case 24:
                return new b1((com.google.firebase.messaging.a0) this.l, cVar, 24);
            case 25:
                return new b1((q5.c) this.l, cVar, 25);
            case 26:
                return new b1((qf.a) this.l, cVar, 26);
            case 27:
                return new b1((qj.i) this.l, cVar, 27);
            case 28:
                return new b1((PostPurchaseActivity) this.l, cVar, 28);
            default:
                return new b1((rf.g) this.l, cVar, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f21060j) {
        }
        return ((b1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x0545  */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.Map] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:223:0x0543 -> B:226:0x0547). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 2390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.b1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
