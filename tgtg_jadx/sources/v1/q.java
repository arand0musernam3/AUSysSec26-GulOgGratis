package v1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41822a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v80.b0 f41823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f41824c;

    public /* synthetic */ q(u uVar, v80.b0 b0Var) {
        this.f41824c = uVar;
        this.f41823b = b0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f41822a) {
            case 0:
                u uVar = this.f41824c;
                if (((Boolean) uVar.f41847b.getValue()).booleanValue()) {
                    v80.f0.B(this.f41823b, null, null, new a3.y(uVar, (x70.c) null, 28), 3);
                }
                return Unit.f26487a;
            default:
                v80.f0.B(this.f41823b, null, null, new ii.b(this.f41824c, null, 1), 3);
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ q(v80.b0 b0Var, u uVar) {
        this.f41823b = b0Var;
        this.f41824c = uVar;
    }
}
