package qb;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f36855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36856c;

    public /* synthetic */ q(int i11, long j9, String str) {
        this.f36854a = i11;
        this.f36855b = j9;
        this.f36856c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        ha.c cVarV0;
        switch (this.f36854a) {
            case 0:
                long j9 = this.f36855b;
                String str = this.f36856c;
                ha.a aVar = (ha.a) obj;
                aVar.getClass();
                cVarV0 = aVar.v0("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    cVarV0.j(1, j9);
                    cVarV0.C(2, str);
                    cVarV0.q0();
                    int iE = ox.h.E(aVar);
                    cVarV0.close();
                    return Integer.valueOf(iE);
                } finally {
                }
            default:
                long j11 = this.f36855b;
                String str2 = this.f36856c;
                ha.a aVar2 = (ha.a) obj;
                aVar2.getClass();
                cVarV0 = aVar2.v0("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    cVarV0.j(1, j11);
                    cVarV0.C(2, str2);
                    cVarV0.q0();
                    cVarV0.close();
                    return Unit.f26487a;
                } finally {
                }
        }
    }
}
