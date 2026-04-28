package yi;

import androidx.fragment.app.o0;
import com.app.tgtg.model.local.payment.AdyenActionComponents;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f46033b;

    public /* synthetic */ w(f0 f0Var, int i11) {
        this.f46032a = i11;
        this.f46033b = f0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f46032a) {
            case 0:
                o0 o0VarRequireActivity = this.f46033b.requireActivity();
                o0VarRequireActivity.getClass();
                return new AdyenActionComponents(o0VarRequireActivity);
            default:
                mv.a0 a0Var = new mv.a0();
                mv.z zVar = mv.z.DISCOVER;
                zVar.getClass();
                a0Var.f30138a = zVar;
                a0Var.f30144g = true;
                o0 o0VarRequireActivity2 = this.f46033b.requireActivity();
                o0VarRequireActivity2.getClass();
                a0Var.c(o0VarRequireActivity2);
                return Unit.f26487a;
        }
    }
}
