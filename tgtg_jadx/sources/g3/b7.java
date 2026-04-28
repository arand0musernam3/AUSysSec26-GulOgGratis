package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b7 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d7 f18373b;

    public /* synthetic */ b7(d7 d7Var, int i11) {
        this.f18372a = i11;
        this.f18373b = d7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f18372a;
        d7 d7Var = this.f18373b;
        switch (i11) {
            case 0:
                d7Var.a();
                return Boolean.TRUE;
            default:
                v80.l lVar = d7Var.f18462b;
                if (lVar.g()) {
                    u70.o oVar = u70.q.f40850b;
                    lVar.resumeWith(m7.ActionPerformed);
                }
                return Unit.f26487a;
        }
    }
}
