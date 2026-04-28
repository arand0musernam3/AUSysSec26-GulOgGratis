package h2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l4.b f21249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f21250c;

    public /* synthetic */ z(l4.b bVar, b0 b0Var, int i11) {
        this.f21248a = i11;
        this.f21249b = bVar;
        this.f21250c = b0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        t1.b bVar = (t1.b) obj;
        switch (this.f21248a) {
            case 0:
                this.f21249b.e(((Number) bVar.d()).floatValue());
                this.f21250c.f21045c.invoke();
                break;
            default:
                this.f21249b.e(((Number) bVar.d()).floatValue());
                this.f21250c.f21045c.invoke();
                break;
        }
        return Unit.f26487a;
    }
}
