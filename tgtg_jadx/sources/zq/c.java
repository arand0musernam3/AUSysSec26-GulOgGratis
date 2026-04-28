package zq;

import f2.c0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import v80.b0;
import v80.f0;
import vi.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f48039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f48040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f48041d;

    public /* synthetic */ c(b0 b0Var, c0 c0Var, int i11, int i12) {
        this.f48038a = i12;
        this.f48039b = b0Var;
        this.f48040c = c0Var;
        this.f48041d = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f48038a) {
            case 0:
                f0.B(this.f48039b, null, null, new n(this.f48041d, 1, this.f48040c, null), 3);
                break;
            default:
                f0.B(this.f48039b, null, null, new n(this.f48041d, 2, this.f48040c, null), 3);
                break;
        }
        return Unit.f26487a;
    }
}
