package eo;

import androidx.fragment.app.o0;
import com.app.tgtg.feature.main.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import pg.n2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f16201b;

    public /* synthetic */ e(f fVar, int i11) {
        this.f16200a = i11;
        this.f16201b = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16200a) {
            case 0:
                boolean z11 = !ft.c.C();
                ft.c.J(z11);
                f fVar = this.f16201b;
                ((h) fVar.f16204i.getValue()).f16210c.c();
                o0 activity = fVar.getActivity();
                if (activity != null && (activity instanceof MainActivity)) {
                    ((MainActivity) activity).q0(z11, f70.i.MYSTORE_MORE);
                }
                return Unit.f26487a;
            default:
                n2 n2Var = this.f16201b.f16205j;
                n2Var.getClass();
                return n2Var.f35014t;
        }
    }
}
