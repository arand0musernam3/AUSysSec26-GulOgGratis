package rk;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f38067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f38068c;

    public /* synthetic */ h(Function0 function0, b1 b1Var, int i11) {
        this.f38066a = i11;
        this.f38067b = function0;
        this.f38068c = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f38066a) {
            case 0:
                b1 b1Var = this.f38068c;
                if (!((Boolean) b1Var.getValue()).booleanValue()) {
                    b1Var.setValue(Boolean.TRUE);
                    this.f38067b.invoke();
                }
                break;
            case 1:
                this.f38067b.invoke();
                this.f38068c.setValue(Boolean.FALSE);
                break;
            case 2:
                this.f38068c.setValue(Boolean.TRUE);
                this.f38067b.invoke();
                break;
            default:
                this.f38068c.setValue(Boolean.FALSE);
                this.f38067b.invoke();
                break;
        }
        return Unit.f26487a;
    }
}
