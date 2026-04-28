package xn;

import com.app.tgtg.feature.main.MainActivity;
import com.google.firebase.messaging.a0;
import hm.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import pg.u1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f44469b;

    public /* synthetic */ b(a0 a0Var, int i11) {
        this.f44468a = i11;
        this.f44469b = a0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f44468a) {
            case 0:
                ((v) this.f44469b.f12780c).b();
                break;
            case 1:
                ((v) this.f44469b.f12780c).b();
                break;
            case 2:
                a0 a0Var = this.f44469b;
                ((MainActivity) a0Var.f12782e).f9083j.d((u1) a0Var.f12781d);
                break;
            case 3:
                a0 a0Var2 = this.f44469b;
                ((MainActivity) a0Var2.f12782e).f9083j.d((u1) a0Var2.f12781d);
                break;
            default:
                a0 a0Var3 = this.f44469b;
                ((MainActivity) a0Var3.f12782e).f9083j.d((u1) a0Var3.f12781d);
                break;
        }
        return Unit.f26487a;
    }
}
