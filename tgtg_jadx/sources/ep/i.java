package ep;

import androidx.lifecycle.m1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f16291b;

    public /* synthetic */ i(d0 d0Var, int i11) {
        this.f16290a = i11;
        this.f16291b = d0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16290a) {
            case 0:
                this.f16291b.r(cv.i.ACTION_DELETE_PHOTO, null);
                break;
            default:
                d0 d0Var = this.f16291b;
                f0.B(m1.d(d0Var), null, null, new u(d0Var, null, 1), 3);
                break;
        }
        return Unit.f26487a;
    }
}
