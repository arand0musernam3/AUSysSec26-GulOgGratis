package f6;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f17409b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i11) {
        super(1);
        this.f17408a = i11;
        this.f17409b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17408a) {
            case 0:
                Function0 function0 = (Function0) obj;
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    function0.invoke();
                } else {
                    n nVar = this.f17409b;
                    Handler handler = nVar.f17411b;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                        nVar.f17411b = handler;
                    }
                    handler.post(new b4.b(5, function0));
                }
                break;
            default:
                this.f17409b.f17413d = true;
                break;
        }
        return Unit.f26487a;
    }
}
