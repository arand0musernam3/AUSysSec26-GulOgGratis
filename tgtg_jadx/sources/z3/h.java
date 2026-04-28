package z3;

import androidx.compose.runtime.snapshots.SnapshotApplyConflictException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f47010b;

    public h(c cVar) {
        this.f47010b = cVar;
    }

    @Override // z3.v
    public final void b() throws SnapshotApplyConflictException {
        this.f47010b.c();
        throw new SnapshotApplyConflictException();
    }
}
