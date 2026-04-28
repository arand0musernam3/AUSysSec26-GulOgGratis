package ti;

import g3.g7;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import v80.b0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f40237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g7 f40238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f40239d;

    public /* synthetic */ l(b0 b0Var, g7 g7Var, String str, int i11) {
        this.f40236a = i11;
        this.f40237b = b0Var;
        this.f40238c = g7Var;
        this.f40239d = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f40236a) {
            case 0:
                f0.B(this.f40237b, null, null, new k(this.f40238c, this.f40239d, null, 0), 3);
                break;
            default:
                f0.B(this.f40237b, null, null, new k(this.f40238c, this.f40239d, null, 1), 3);
                break;
        }
        return Unit.f26487a;
    }
}
