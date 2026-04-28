package rb;

import androidx.work.impl.WorkDatabase;
import qb.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sb.a f37853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb.f f37854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f37855c;

    static {
        ib.w.f("WMFgUpdater");
    }

    public o(WorkDatabase workDatabase, jb.f fVar, sb.a aVar) {
        this.f37854b = fVar;
        this.f37853a = aVar;
        this.f37855c = workDatabase.x();
    }
}
