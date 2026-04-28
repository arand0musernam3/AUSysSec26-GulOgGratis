package dp;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f15049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f6.n f15050c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(b1 b1Var, f6.n nVar, int i11) {
        super(0);
        this.f15048a = i11;
        this.f15049b = b1Var;
        this.f15050c = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15048a) {
            case 0:
                this.f15049b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                this.f15050c.f17413d = true;
                break;
            case 1:
                this.f15049b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                this.f15050c.f17413d = true;
                break;
            case 2:
                this.f15049b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                this.f15050c.f17413d = true;
                break;
            case 3:
                this.f15049b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                this.f15050c.f17413d = true;
                break;
            default:
                this.f15049b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                this.f15050c.f17413d = true;
                break;
        }
        return Unit.f26487a;
    }
}
