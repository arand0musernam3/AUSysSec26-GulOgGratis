package ks;

import com.app.tgtg.feature.tabprofile.manageaccount.paymentoptions.PaymentOptionsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26653a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentOptionsActivity f26654b;

    public /* synthetic */ a(PaymentOptionsActivity paymentOptionsActivity) {
        this.f26654b = paymentOptionsActivity;
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
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f26653a;
        PaymentOptionsActivity paymentOptionsActivity = this.f26654b;
        n nVar = (n) obj;
        Integer num = (Integer) obj2;
        switch (i11) {
            case 0:
                int iIntValue = num.intValue();
                int i12 = PaymentOptionsActivity.f9428g;
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    paymentOptionsActivity.z(sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            default:
                num.getClass();
                int i13 = PaymentOptionsActivity.f9428g;
                paymentOptionsActivity.z(nVar, i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ a(PaymentOptionsActivity paymentOptionsActivity, int i11) {
        this.f26654b = paymentOptionsActivity;
    }
}
