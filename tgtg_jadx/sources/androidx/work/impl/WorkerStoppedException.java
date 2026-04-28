package androidx.work.impl;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/WorkerStoppedException;", "Ljava/util/concurrent/CancellationException;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WorkerStoppedException extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4158a;

    public WorkerStoppedException(int i11) {
        this.f4158a = i11;
    }
}
