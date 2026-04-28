package fn;

import androidx.lifecycle.o0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f17791b;

    public /* synthetic */ a(c cVar, int i11) {
        this.f17790a = i11;
        this.f17791b = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17790a) {
            case 0:
                o0 o0Var = this.f17791b.f17816x;
                Unit unit = Unit.f26487a;
                o0Var.i(unit);
                return unit;
            case 1:
                o0 o0Var2 = this.f17791b.f17816x;
                Unit unit2 = Unit.f26487a;
                o0Var2.i(unit2);
                return unit2;
            case 2:
                o0 o0Var3 = this.f17791b.f17816x;
                Unit unit3 = Unit.f26487a;
                o0Var3.i(unit3);
                return unit3;
            default:
                c cVar = this.f17791b;
                cVar.d().clear();
                cVar.i(true, false);
                return Unit.f26487a;
        }
    }
}
