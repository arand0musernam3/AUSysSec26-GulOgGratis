package x70;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f44025b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext[] f44026a;

    public b(CoroutineContext[] coroutineContextArr) {
        this.f44026a = coroutineContextArr;
    }

    private final Object readResolve() {
        CoroutineContext coroutineContextPlus = g.f26549a;
        for (CoroutineContext coroutineContext : this.f44026a) {
            coroutineContextPlus = coroutineContextPlus.plus(coroutineContext);
        }
        return coroutineContextPlus;
    }
}
