package d6;

import a3.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f14434b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d0 d0Var, int i11) {
        super(1);
        this.f14433a = i11;
        this.f14434b = d0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f14433a) {
            case 0:
                d0 d0Var = this.f14434b;
                d0Var.show();
                return new v0(d0Var, 2);
            default:
                d0 d0Var2 = this.f14434b;
                if (d0Var2.f14448b.f14427a) {
                    d0Var2.f14447a.invoke();
                }
                return Unit.f26487a;
        }
    }
}
