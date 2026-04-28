package cg;

import a3.k1;
import a3.l1;
import a3.m1;
import android.graphics.DashPathEffect;
import g3.l3;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f7999b;

    public /* synthetic */ k(long j9, int i11) {
        this.f7998a = i11;
        this.f7999b = j9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        ha.c cVarV0;
        v80.l lVar;
        Object pVar;
        int i11;
        int i12;
        Integer numValueOf;
        int i13 = this.f7998a;
        long j9 = this.f7999b;
        switch (i13) {
            case 0:
                k4.d dVar = (k4.d) obj;
                dVar.getClass();
                i4.h hVarA = i4.l.a();
                hVarA.e(Float.intBitsToFloat((int) (dVar.d() >> 32)), Float.intBitsToFloat((int) (dVar.d() & 4294967295L)));
                k4.d.r0(dVar, hVarA, this.f7999b, 0.0f, new k4.h(dVar.c0(2), 0.0f, 0, 0, new i4.i(new DashPathEffect(new float[]{15.0f, 15.0f}, 0.0f)), 14), 52);
                return Unit.f26487a;
            case 1:
                ha.a aVar = (ha.a) obj;
                aVar.getClass();
                cVarV0 = aVar.v0("DELETE FROM viewed_recipes WHERE viewed_at < ?");
                try {
                    cVarV0.j(1, j9);
                    cVarV0.q0();
                    cVarV0.close();
                    return Unit.f26487a;
                } finally {
                    cVarV0.close();
                }
            case 2:
                return com.braze.requests.framework.b.b(j9, (com.braze.requests.framework.h) obj);
            case 3:
                return com.braze.requests.framework.g.b(j9, (com.braze.requests.framework.b) obj);
            case 4:
                f4.c cVar = (f4.c) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.f17292a.d() >> 32)) / 2.0f;
                return cVar.b(new l3(fIntBitsToFloat, bx.k.r(cVar, fIntBitsToFloat), new i4.o(j9, 5), 4));
            case 5:
                ((j5.b0) obj).b(m1.f480c, new l1(m2.t0.Cursor, this.f7999b, k1.Middle, true));
                return Unit.f26487a;
            case 6:
                m3.d dVar2 = (m3.d) obj;
                Function1 function1 = dVar2.f29259b;
                if (function1 != null && (lVar = dVar2.f29258a) != null) {
                    try {
                        u70.o oVar = u70.q.f40850b;
                        pVar = function1.invoke(Long.valueOf(j9));
                    } catch (Throwable th2) {
                        u70.o oVar2 = u70.q.f40850b;
                        pVar = new u70.p(th2);
                    }
                    lVar.resumeWith(pVar);
                    break;
                }
                return Unit.f26487a;
            case 7:
                ha.a aVar2 = (ha.a) obj;
                aVar2.getClass();
                cVarV0 = aVar2.v0("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    cVarV0.j(1, j9);
                    int iS = p30.b.s(cVarV0, "id");
                    int iS2 = p30.b.s(cVarV0, "state");
                    int iS3 = p30.b.s(cVarV0, "worker_class_name");
                    int iS4 = p30.b.s(cVarV0, "input_merger_class_name");
                    int iS5 = p30.b.s(cVarV0, "input");
                    int iS6 = p30.b.s(cVarV0, "output");
                    int iS7 = p30.b.s(cVarV0, "initial_delay");
                    int iS8 = p30.b.s(cVarV0, "interval_duration");
                    int iS9 = p30.b.s(cVarV0, "flex_duration");
                    int iS10 = p30.b.s(cVarV0, "run_attempt_count");
                    int iS11 = p30.b.s(cVarV0, "backoff_policy");
                    int iS12 = p30.b.s(cVarV0, "backoff_delay_duration");
                    int iS13 = p30.b.s(cVarV0, "last_enqueue_time");
                    int iS14 = p30.b.s(cVarV0, "minimum_retention_duration");
                    int iS15 = p30.b.s(cVarV0, "schedule_requested_at");
                    int iS16 = p30.b.s(cVarV0, "run_in_foreground");
                    int iS17 = p30.b.s(cVarV0, "out_of_quota_policy");
                    int iS18 = p30.b.s(cVarV0, "period_count");
                    int iS19 = p30.b.s(cVarV0, "generation");
                    int iS20 = p30.b.s(cVarV0, "next_schedule_time_override");
                    int iS21 = p30.b.s(cVarV0, "next_schedule_time_override_generation");
                    int iS22 = p30.b.s(cVarV0, "stop_reason");
                    int iS23 = p30.b.s(cVarV0, "trace_tag");
                    int iS24 = p30.b.s(cVarV0, "backoff_on_system_interruptions");
                    int iS25 = p30.b.s(cVarV0, "required_network_type");
                    int iS26 = p30.b.s(cVarV0, "required_network_request");
                    int iS27 = p30.b.s(cVarV0, "requires_charging");
                    int iS28 = p30.b.s(cVarV0, "requires_device_idle");
                    int iS29 = p30.b.s(cVarV0, "requires_battery_not_low");
                    int iS30 = p30.b.s(cVarV0, "requires_storage_not_low");
                    int iS31 = p30.b.s(cVarV0, "trigger_content_update_delay");
                    int iS32 = p30.b.s(cVarV0, "trigger_max_content_delay");
                    int iS33 = p30.b.s(cVarV0, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (cVarV0.q0()) {
                        String strW = cVarV0.W(iS);
                        int i14 = iS;
                        ArrayList arrayList2 = arrayList;
                        ib.g0 g0VarD = xz.b.D((int) cVarV0.getLong(iS2));
                        String strW2 = cVarV0.W(iS3);
                        String strW3 = cVarV0.W(iS4);
                        byte[] blob = cVarV0.getBlob(iS5);
                        ib.h hVar = ib.h.f23726b;
                        ib.h hVarT = ex.i.t(blob);
                        ib.h hVarT2 = ex.i.t(cVarV0.getBlob(iS6));
                        long j11 = cVarV0.getLong(iS7);
                        long j12 = cVarV0.getLong(iS8);
                        long j13 = cVarV0.getLong(iS9);
                        int i15 = (int) cVarV0.getLong(iS10);
                        ib.a aVarA = xz.b.A((int) cVarV0.getLong(iS11));
                        long j14 = cVarV0.getLong(iS12);
                        long j15 = cVarV0.getLong(iS13);
                        long j16 = cVarV0.getLong(iS14);
                        int i16 = iS15;
                        long j17 = cVarV0.getLong(i16);
                        int i17 = iS13;
                        int i18 = iS16;
                        int i19 = iS14;
                        boolean z11 = ((int) cVarV0.getLong(i18)) != 0;
                        int i21 = iS17;
                        int i22 = iS2;
                        ib.d0 d0VarC = xz.b.C((int) cVarV0.getLong(i21));
                        int i23 = iS18;
                        int i24 = (int) cVarV0.getLong(i23);
                        int i25 = iS19;
                        int i26 = (int) cVarV0.getLong(i25);
                        long j18 = cVarV0.getLong(iS20);
                        int i27 = iS21;
                        int i28 = (int) cVarV0.getLong(i27);
                        int i29 = iS22;
                        int i31 = (int) cVarV0.getLong(i29);
                        int i32 = iS23;
                        String strW4 = cVarV0.isNull(i32) ? null : cVarV0.W(i32);
                        int i33 = iS24;
                        if (cVarV0.isNull(i33)) {
                            i11 = i28;
                            i12 = i29;
                            numValueOf = null;
                        } else {
                            i11 = i28;
                            i12 = i29;
                            numValueOf = Integer.valueOf((int) cVarV0.getLong(i33));
                        }
                        Boolean boolValueOf = numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null;
                        iS24 = i33;
                        int i34 = iS25;
                        ib.x xVarB = xz.b.B((int) cVarV0.getLong(i34));
                        int i35 = iS26;
                        rb.f fVarM = xz.b.M(cVarV0.getBlob(i35));
                        iS25 = i34;
                        int i36 = iS27;
                        boolean z12 = ((int) cVarV0.getLong(i36)) != 0;
                        iS27 = i36;
                        int i37 = iS28;
                        boolean z13 = ((int) cVarV0.getLong(i37)) != 0;
                        iS28 = i37;
                        int i38 = iS29;
                        boolean z14 = ((int) cVarV0.getLong(i38)) != 0;
                        iS29 = i38;
                        int i39 = iS30;
                        int i41 = iS31;
                        int i42 = iS32;
                        iS31 = i41;
                        int i43 = iS33;
                        qb.o oVar3 = new qb.o(strW, g0VarD, strW2, strW3, hVarT, hVarT2, j11, j12, j13, new ib.e(fVarM, xVarB, z12, z13, z14, ((int) cVarV0.getLong(i39)) != 0, cVarV0.getLong(i41), cVarV0.getLong(i42), xz.b.l(cVarV0.getBlob(i43))), i15, aVarA, j14, j15, j16, j17, z11, d0VarC, i24, i26, j18, i11, i31, strW4, boolValueOf);
                        iS33 = i43;
                        iS32 = i42;
                        arrayList = arrayList2;
                        arrayList.add(oVar3);
                        iS13 = i17;
                        iS15 = i16;
                        iS2 = i22;
                        iS17 = i21;
                        iS19 = i25;
                        iS21 = i27;
                        iS22 = i12;
                        iS23 = i32;
                        iS26 = i35;
                        iS30 = i39;
                        iS14 = i19;
                        iS16 = i18;
                        iS = i14;
                        iS18 = i23;
                        break;
                    }
                    return arrayList;
                } catch (Throwable th3) {
                    throw th3;
                }
            case 8:
                ((h8.a) obj).f(r40.h.f37622b, Long.valueOf(j9));
                return null;
            default:
                return Long.valueOf(j9);
        }
    }
}
