package d6;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14529b;

    public /* synthetic */ v(Object obj, int i11) {
        this.f14528a = i11;
        this.f14529b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f14528a) {
            case 0:
                Function0 function0 = (Function0) this.f14529b;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 1:
                ((g20.b) this.f14529b).c();
                break;
            case 2:
                ((androidx.appcompat.app.a) this.f14529b).a0();
                break;
            case 3:
                ((Runnable) this.f14529b).run();
                break;
            default:
                ((q9.o) this.f14529b).a();
                break;
        }
    }
}
