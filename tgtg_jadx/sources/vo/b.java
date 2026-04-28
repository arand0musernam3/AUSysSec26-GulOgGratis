package vo;

import ba0.g;
import com.app.tgtg.feature.postpurchase.phone.AddPhoneNumberFragment;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qc.y;
import v80.b0;
import y80.g1;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f42497j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f42498k;
    public final /* synthetic */ AddPhoneNumberFragment l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(AddPhoneNumberFragment addPhoneNumberFragment, x70.c cVar, int i11) {
        super(2, cVar);
        this.f42497j = i11;
        this.l = addPhoneNumberFragment;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f42497j) {
            case 0:
                return new b(this.l, cVar, 0);
            default:
                return new b(this.l, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f42497j) {
        }
        return ((b) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f42497j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f42498k;
                if (i11 == 0) {
                    g.M(obj);
                    AddPhoneNumberFragment addPhoneNumberFragment = this.l;
                    g1 g1Var = ((e) addPhoneNumberFragment.f9218g.getValue()).f42504d;
                    a aVar2 = new a(addPhoneNumberFragment, 0);
                    this.f42498k = 1;
                    if (g1Var.f45482a.collect(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g.M(obj);
                }
                y.m();
                return null;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f42498k;
                if (i12 == 0) {
                    g.M(obj);
                    AddPhoneNumberFragment addPhoneNumberFragment2 = this.l;
                    g1 g1Var2 = ((e) addPhoneNumberFragment2.f9218g.getValue()).f42506f;
                    a aVar4 = new a(addPhoneNumberFragment2, 1);
                    this.f42498k = 1;
                    if (g1Var2.f45482a.collect(aVar4, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g.M(obj);
                }
                y.m();
                return null;
        }
    }
}
