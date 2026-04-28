package cp;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f13405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f13406c;

    public /* synthetic */ m(Function0 function0, Function0 function02, int i11) {
        this.f13404a = i11;
        this.f13405b = function0;
        this.f13406c = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f13404a) {
            case 0:
                this.f13405b.invoke();
                this.f13406c.invoke();
                break;
            case 1:
                this.f13405b.invoke();
                this.f13406c.invoke();
                break;
            default:
                this.f13405b.invoke();
                this.f13406c.invoke();
                break;
        }
        return Unit.f26487a;
    }
}
