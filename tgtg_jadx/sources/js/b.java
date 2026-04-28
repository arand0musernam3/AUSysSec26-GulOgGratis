package js;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f25391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f25392c;

    public /* synthetic */ b(Function0 function0, b1 b1Var, int i11) {
        this.f25390a = i11;
        this.f25391b = function0;
        this.f25392c = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f25390a) {
            case 0:
                this.f25392c.setValue(Boolean.FALSE);
                this.f25391b.invoke();
                break;
            case 1:
                this.f25392c.setValue(Boolean.FALSE);
                this.f25391b.invoke();
                break;
            case 2:
                this.f25391b.invoke();
                this.f25392c.setValue(Boolean.TRUE);
                break;
            case 3:
                this.f25392c.setValue(Boolean.FALSE);
                this.f25391b.invoke();
                break;
            case 4:
                this.f25392c.setValue(Boolean.TRUE);
                this.f25391b.invoke();
                break;
            default:
                this.f25391b.invoke();
                this.f25392c.setValue(Boolean.FALSE);
                break;
        }
        return Unit.f26487a;
    }
}
