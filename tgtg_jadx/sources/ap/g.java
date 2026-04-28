package ap;

import androidx.lifecycle.m1;
import bp.v;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import m3.b1;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f4534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f4535c;

    public /* synthetic */ g(n nVar, b1 b1Var, int i11) {
        this.f4533a = i11;
        this.f4534b = nVar;
        this.f4535c = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4533a) {
            case 0:
                boolean zBooleanValue = ((Boolean) this.f4535c.getValue()).booleanValue();
                n nVar = this.f4534b;
                f0.B(m1.d(nVar), null, null, new m(nVar, zBooleanValue, null), 3);
                break;
            case 1:
                n0 n0Var = n0.f26529a;
                String str = (String) this.f4535c.getValue();
                v vVar = v.OVERALL;
                n nVar2 = this.f4534b;
                nVar2.h(n0Var, str, vVar);
                nVar2.e();
                break;
            default:
                String str2 = (String) this.f4535c.getValue();
                n nVar3 = this.f4534b;
                nVar3.f4557a0 = str2;
                nVar3.e();
                break;
        }
        return Unit.f26487a;
    }
}
