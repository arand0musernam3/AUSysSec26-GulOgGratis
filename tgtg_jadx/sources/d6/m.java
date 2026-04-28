package d6;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f14509b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(g0 g0Var, int i11) {
        super(1);
        this.f14508a = i11;
        this.f14509b = g0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f14508a) {
            case 0:
                z4.z zVarK = ((z4.z) obj).K();
                zVarK.getClass();
                this.f14509b.l(zVarK);
                break;
            case 1:
                z5.l lVar = new z5.l(((z5.l) obj).f47286a);
                g0 g0Var = this.f14509b;
                g0Var.m961setPopupContentSizefhxjrPA(lVar);
                g0Var.m();
                break;
            default:
                Function0 function0 = (Function0) obj;
                g0 g0Var2 = this.f14509b;
                Handler handler = g0Var2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = g0Var2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new b4.b(4, function0));
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
