package v80;

import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f42109b;

    public /* synthetic */ i(Object obj, int i11) {
        this.f42108a = i11;
        this.f42109b = obj;
    }

    @Override // v80.j
    public final void b(Throwable th2) {
        switch (this.f42108a) {
            case 0:
                ((ScheduledFuture) this.f42109b).cancel(false);
                break;
            case 1:
                ((Function1) this.f42109b).invoke(th2);
                break;
            default:
                ((r0) this.f42109b).a();
                break;
        }
    }

    public final String toString() {
        switch (this.f42108a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f42109b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) this.f42109b).getClass().getSimpleName() + '@' + f0.s(this) + ']';
            default:
                return "DisposeOnCancel[" + ((r0) this.f42109b) + ']';
        }
    }
}
