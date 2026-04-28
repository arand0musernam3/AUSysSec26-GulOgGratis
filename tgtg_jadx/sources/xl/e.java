package xl;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f44447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f44448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f44449d;

    public /* synthetic */ e(Function2 function2, b1 b1Var, b1 b1Var2, int i11) {
        this.f44446a = i11;
        this.f44447b = function2;
        this.f44448c = b1Var;
        this.f44449d = b1Var2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f44446a) {
            case 0:
                this.f44448c.setValue(Boolean.FALSE);
                b1 b1Var = this.f44449d;
                this.f44447b.invoke(((Pair) b1Var.getValue()).f26485a, ((Pair) b1Var.getValue()).f26486b);
                break;
            default:
                Boolean bool = (Boolean) this.f44448c.getValue();
                bool.booleanValue();
                this.f44447b.invoke(bool, (List) this.f44449d.getValue());
                break;
        }
        return Unit.f26487a;
    }
}
