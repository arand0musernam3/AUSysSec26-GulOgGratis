package gt;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m5.k0;
import m5.t0;
import w2.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20894c;

    public /* synthetic */ u(int i11, String str, int i12) {
        this.f20892a = i12;
        this.f20894c = i11;
        this.f20893b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        ha.c cVarV0;
        qb.f fVar;
        int i11 = this.f20892a;
        int i12 = this.f20894c;
        String str = this.f20893b;
        switch (i11) {
            case 0:
                ha.a aVar = (ha.a) obj;
                aVar.getClass();
                cVarV0 = aVar.v0("UPDATE orders SET calendarEventId = ? WHERE orderId = ?");
                try {
                    cVarV0.j(1, i12);
                    cVarV0.C(2, str);
                    cVarV0.q0();
                    cVarV0.close();
                    return Unit.f26487a;
                } finally {
                }
            case 1:
                ha.a aVar2 = (ha.a) obj;
                aVar2.getClass();
                cVarV0 = aVar2.v0("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    cVarV0.C(1, str);
                    cVarV0.j(2, i12);
                    int iS = p30.b.s(cVarV0, "work_spec_id");
                    int iS2 = p30.b.s(cVarV0, "generation");
                    int iS3 = p30.b.s(cVarV0, "system_id");
                    if (cVarV0.q0()) {
                        fVar = new qb.f(cVarV0.W(iS), (int) cVarV0.getLong(iS2), (int) cVarV0.getLong(iS3));
                        break;
                    } else {
                        fVar = null;
                    }
                    return fVar;
                } finally {
                }
            case 2:
                ha.a aVar3 = (ha.a) obj;
                aVar3.getClass();
                cVarV0 = aVar3.v0("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    cVarV0.C(1, str);
                    cVarV0.j(2, i12);
                    cVarV0.q0();
                    cVarV0.close();
                    return Unit.f26487a;
                } finally {
                }
            case 3:
                ha.a aVar4 = (ha.a) obj;
                aVar4.getClass();
                cVarV0 = aVar4.v0("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    cVarV0.j(1, i12);
                    cVarV0.C(2, str);
                    cVarV0.q0();
                    cVarV0.close();
                    return Unit.f26487a;
                } finally {
                }
            default:
                v2.a aVar5 = (v2.a) obj;
                t0 t0Var = aVar5.f41923e;
                if (t0Var != null) {
                    long j9 = t0Var.f29650a;
                    c0.q(aVar5, (int) (j9 >> 32), (int) (4294967295L & j9), str);
                } else {
                    long j11 = aVar5.f41922d;
                    int i13 = t0.f29649c;
                    c0.q(aVar5, (int) (j11 >> 32), (int) (4294967295L & j11), str);
                }
                long j12 = aVar5.f41922d;
                int i14 = t0.f29649c;
                int i15 = (int) (j12 >> 32);
                int iC = n80.p.c(i12 > 0 ? (i15 + i12) - 1 : (i15 + i12) - str.length(), 0, aVar5.f41920b.length());
                aVar5.f(k0.b(iC, iC));
                return Unit.f26487a;
        }
    }

    public /* synthetic */ u(String str, int i11, int i12) {
        this.f20892a = i12;
        this.f20893b = str;
        this.f20894c = i11;
    }
}
