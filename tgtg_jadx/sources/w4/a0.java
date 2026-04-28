package w4;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f43098b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(b0 b0Var, int i11) {
        super(1);
        this.f43097a = i11;
        this.f43098b = b0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f43097a) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                Function1 function1 = this.f43098b.f43102a;
                if (function1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("onTouchEvent");
                    function1 = null;
                }
                function1.invoke(motionEvent);
                break;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                Function1 function12 = this.f43098b.f43102a;
                if (function12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("onTouchEvent");
                    function12 = null;
                }
                function12.invoke(motionEvent2);
                break;
        }
        return Unit.f26487a;
    }
}
