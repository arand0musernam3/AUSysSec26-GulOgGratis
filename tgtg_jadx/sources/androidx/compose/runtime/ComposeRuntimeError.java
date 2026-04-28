package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/ComposeRuntimeError;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComposeRuntimeError extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2251a;

    public ComposeRuntimeError(String str) {
        this.f2251a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f2251a;
    }
}
