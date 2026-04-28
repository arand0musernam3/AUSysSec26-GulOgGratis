package zq;

import cg.j;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabprofile.impact.moneysaved.MoneySavedActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.m;
import m3.n;
import m3.s;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MoneySavedActivity f48035b;

    public /* synthetic */ a(MoneySavedActivity moneySavedActivity, int i11) {
        this.f48034a = 2;
        this.f48035b = moneySavedActivity;
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
        int i11 = this.f48034a;
        int i12 = 0;
        MoneySavedActivity moneySavedActivity = this.f48035b;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i13 = MoneySavedActivity.f9312g;
                s sVar = (s) nVar;
                if (sVar.R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    moneySavedActivity.z(sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i14 = MoneySavedActivity.f9312g;
                s sVar2 = (s) nVar2;
                if (sVar2.R(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    String strU = f0.U(sVar2, R.string.money_saved_toolbar_title);
                    long j9 = lv.s.B;
                    long j11 = lv.s.C;
                    boolean zH = sVar2.h(moneySavedActivity);
                    Object objM = sVar2.M();
                    if (zH || objM == m.f29332a) {
                        objM = new b(moneySavedActivity, i12);
                        sVar2.k0(objM);
                    }
                    j.s(strU, null, j11, j9, (Function0) objM, null, null, null, sVar2, 3456, 226);
                } else {
                    sVar2.U();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                int i15 = MoneySavedActivity.f9312g;
                moneySavedActivity.z((n) obj, i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ a(MoneySavedActivity moneySavedActivity, int i11, byte b8) {
        this.f48034a = i11;
        this.f48035b = moneySavedActivity;
    }
}
