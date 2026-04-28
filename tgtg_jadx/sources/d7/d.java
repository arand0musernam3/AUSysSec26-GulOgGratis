package d7;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import u70.o;
import u70.q;
import v80.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final x70.c<Object> f14563a;

    public d(l lVar) {
        super(false);
        this.f14563a = lVar;
    }

    public final void onError(Throwable th2) {
        if (compareAndSet(false, true)) {
            x70.c<Object> cVar = this.f14563a;
            o oVar = q.f40850b;
            cVar.resumeWith(ba0.g.j(th2));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            x70.c<Object> cVar = this.f14563a;
            o oVar = q.f40850b;
            cVar.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
