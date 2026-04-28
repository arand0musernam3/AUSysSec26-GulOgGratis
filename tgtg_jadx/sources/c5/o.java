package c5;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f7305b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(y yVar, int i11) {
        super(1);
        this.f7304a = i11;
        this.f7305b = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7304a) {
            case 0:
                int i11 = ((s4.a) obj).f38836a;
                y yVar = this.f7305b;
                boolean zRequestFocusFromTouch = true;
                if (i11 == 1) {
                    zRequestFocusFromTouch = yVar.isInTouchMode();
                } else if (i11 != 2) {
                    zRequestFocusFromTouch = false;
                } else if (yVar.isInTouchMode()) {
                    zRequestFocusFromTouch = yVar.requestFocusFromTouch();
                }
                return Boolean.valueOf(zRequestFocusFromTouch);
            case 1:
                ((g4.p) this.f7305b.getFocusOwner()).i(((g4.f) obj).f19936a, false);
                return Unit.f26487a;
            case 2:
                Function0 function0 = (Function0) obj;
                y yVar2 = this.f7305b;
                yVar2.getUncaughtExceptionHandler$ui();
                Handler handler = yVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = yVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new b4.b(1, function0));
                    }
                }
                return Unit.f26487a;
            default:
                y yVar3 = this.f7305b;
                return new x0(yVar3, yVar3.getTextInputService(), (v80.b0) obj);
        }
    }
}
