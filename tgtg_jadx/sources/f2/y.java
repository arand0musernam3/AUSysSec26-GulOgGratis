package f2;

import android.widget.LinearLayout;
import com.app.tgtg.model.remote.StoreId;
import com.app.tgtg.model.remote.item.response.ItemType;
import h2.w0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zendesk.messaging.android.internal.conversationscreen.delegates.AdapterDelegatesHelper;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17233b;

    public /* synthetic */ y(int i11, gt.n nVar) {
        this.f17232a = 1;
        this.f17233b = i11;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        ha.c cVarV0;
        int i11;
        String strW;
        int i12;
        int i13;
        cv.g gVar;
        String strW2;
        int i14;
        int i15;
        ItemType itemType;
        int i16;
        int i17;
        Integer numValueOf;
        int i18 = this.f17232a;
        int i19 = this.f17233b;
        switch (i18) {
            case 0:
                w0 w0Var = (w0) obj;
                z3.g gVarC = z3.v.c();
                z3.v.f(gVarC, z3.v.d(gVarC), gVarC != null ? gVarC.e() : null);
                int i21 = w0Var.f21241a;
                if (i21 == -1) {
                    i21 = 2;
                }
                for (int i22 = 0; i22 < i21; i22++) {
                    w0Var.a(i19 + i22);
                }
                return Unit.f26487a;
            case 1:
                ha.a aVar = (ha.a) obj;
                aVar.getClass();
                cVarV0 = aVar.v0("SELECT * FROM impressions LIMIT ?");
                try {
                    cVarV0.j(1, i19);
                    int iS = p30.b.s(cVarV0, "sessionId");
                    int iS2 = p30.b.s(cVarV0, "timeStampUtc");
                    int iS3 = p30.b.s(cVarV0, "timeStampLocal");
                    int iS4 = p30.b.s(cVarV0, "itemId");
                    int iS5 = p30.b.s(cVarV0, "contextType");
                    int iS6 = p30.b.s(cVarV0, "itemStock");
                    int iS7 = p30.b.s(cVarV0, "discoverBucketId");
                    int iS8 = p30.b.s(cVarV0, "itemPositionHorizontal");
                    int iS9 = p30.b.s(cVarV0, "itemPositionVertical");
                    int iS10 = p30.b.s(cVarV0, "coverPictureId");
                    int iS11 = p30.b.s(cVarV0, "logoPictureId");
                    int iS12 = p30.b.s(cVarV0, "deeplinkId");
                    int iS13 = p30.b.s(cVarV0, "platform");
                    int iS14 = p30.b.s(cVarV0, "version");
                    int iS15 = p30.b.s(cVarV0, "storeId");
                    int iS16 = p30.b.s(cVarV0, "itemType");
                    int iS17 = p30.b.s(cVarV0, "storeName");
                    int iS18 = p30.b.s(cVarV0, "id");
                    ArrayList arrayList = new ArrayList();
                    while (cVarV0.q0()) {
                        String strW3 = cVarV0.W(iS);
                        String strW4 = cVarV0.W(iS2);
                        String strW5 = cVarV0.W(iS3);
                        String strE = l50.a.E(cVarV0.W(iS4));
                        if (cVarV0.isNull(iS5)) {
                            i11 = iS;
                            strW = null;
                        } else {
                            i11 = iS;
                            strW = cVarV0.W(iS5);
                        }
                        if (strW == null) {
                            i12 = iS2;
                            i13 = iS3;
                            gVar = null;
                        } else {
                            i12 = iS2;
                            cv.g[] gVarArrValues = cv.g.values();
                            i13 = iS3;
                            int length = gVarArrValues.length;
                            int i23 = 0;
                            while (true) {
                                if (i23 < length) {
                                    gVar = gVarArrValues[i23];
                                    int i24 = i23;
                                    int i25 = length;
                                    if (!kotlin.text.y.k(gVar.name(), strW, true)) {
                                        i23 = i24 + 1;
                                        length = i25;
                                    }
                                } else {
                                    gVar = cv.g.DISCOVER;
                                }
                            }
                        }
                        if (gVar == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.app.tgtg.services.analytics.ImpressionContextType', but it was NULL.");
                        }
                        int i26 = iS4;
                        int i27 = (int) cVarV0.getLong(iS6);
                        String strW6 = cVarV0.isNull(iS7) ? null : cVarV0.W(iS7);
                        Integer numValueOf2 = cVarV0.isNull(iS8) ? null : Integer.valueOf((int) cVarV0.getLong(iS8));
                        Integer numValueOf3 = cVarV0.isNull(iS9) ? null : Integer.valueOf((int) cVarV0.getLong(iS9));
                        String strW7 = cVarV0.isNull(iS10) ? null : cVarV0.W(iS10);
                        String strW8 = cVarV0.isNull(iS11) ? null : cVarV0.W(iS11);
                        String strW9 = cVarV0.isNull(iS12) ? null : cVarV0.W(iS12);
                        String strW10 = cVarV0.isNull(iS13) ? null : cVarV0.W(iS13);
                        int i28 = iS14;
                        String strW11 = cVarV0.isNull(i28) ? null : cVarV0.W(i28);
                        int i29 = iS15;
                        String strW12 = cVarV0.isNull(i29) ? null : cVarV0.W(i29);
                        String strM270constructorimpl = strW12 == null ? null : StoreId.m270constructorimpl(strW12);
                        int i31 = iS16;
                        if (cVarV0.isNull(i31)) {
                            iS16 = i31;
                            strW2 = null;
                        } else {
                            iS16 = i31;
                            strW2 = cVarV0.W(i31);
                        }
                        if (strW2 == null) {
                            i14 = i27;
                            i15 = i28;
                            itemType = null;
                        } else {
                            i14 = i27;
                            ItemType[] itemTypeArrValues = ItemType.values();
                            i15 = i28;
                            int length2 = itemTypeArrValues.length;
                            int i32 = 0;
                            while (true) {
                                if (i32 < length2) {
                                    itemType = itemTypeArrValues[i32];
                                    int i33 = i32;
                                    if (!Intrinsics.areEqual(itemType.name(), strW2)) {
                                        i32 = i33 + 1;
                                    }
                                } else {
                                    itemType = null;
                                }
                            }
                            if (itemType == null) {
                                itemType = ItemType.UNKNOWN;
                            }
                        }
                        cv.e eVar = new cv.e(strW3, strW4, strW5, strE, gVar, i14, strW6, numValueOf2, numValueOf3, strW7, strW8, strW9, strW10, strW11, strM270constructorimpl, itemType, cVarV0.isNull(iS17) ? null : cVarV0.W(iS17));
                        int i34 = iS18;
                        eVar.f13452r = cVarV0.getLong(i34);
                        arrayList.add(eVar);
                        iS4 = i26;
                        iS14 = i15;
                        iS15 = i29;
                        iS = i11;
                        iS3 = i13;
                        iS18 = i34;
                        iS2 = i12;
                    }
                    cVarV0.close();
                    return arrayList;
                } finally {
                    cVarV0.close();
                }
            case 2:
                return AdapterDelegatesHelper.adjustDirectionAndWidth$lambda$7(i19, (LinearLayout.LayoutParams) obj);
            case 3:
                ((Integer) obj).getClass();
                return Integer.valueOf(i19 * 50);
            case 4:
                ha.a aVar2 = (ha.a) obj;
                aVar2.getClass();
                cVarV0 = aVar2.v0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    cVarV0.j(1, i19);
                    int iS19 = p30.b.s(cVarV0, "id");
                    int iS20 = p30.b.s(cVarV0, "state");
                    int iS21 = p30.b.s(cVarV0, "worker_class_name");
                    int iS22 = p30.b.s(cVarV0, "input_merger_class_name");
                    int iS23 = p30.b.s(cVarV0, "input");
                    int iS24 = p30.b.s(cVarV0, "output");
                    int iS25 = p30.b.s(cVarV0, "initial_delay");
                    int iS26 = p30.b.s(cVarV0, "interval_duration");
                    int iS27 = p30.b.s(cVarV0, "flex_duration");
                    int iS28 = p30.b.s(cVarV0, "run_attempt_count");
                    int iS29 = p30.b.s(cVarV0, "backoff_policy");
                    int iS30 = p30.b.s(cVarV0, "backoff_delay_duration");
                    int iS31 = p30.b.s(cVarV0, "last_enqueue_time");
                    int iS32 = p30.b.s(cVarV0, "minimum_retention_duration");
                    int iS33 = p30.b.s(cVarV0, "schedule_requested_at");
                    int iS34 = p30.b.s(cVarV0, "run_in_foreground");
                    int iS35 = p30.b.s(cVarV0, "out_of_quota_policy");
                    int iS36 = p30.b.s(cVarV0, "period_count");
                    int iS37 = p30.b.s(cVarV0, "generation");
                    int iS38 = p30.b.s(cVarV0, "next_schedule_time_override");
                    int iS39 = p30.b.s(cVarV0, "next_schedule_time_override_generation");
                    int iS40 = p30.b.s(cVarV0, "stop_reason");
                    int iS41 = p30.b.s(cVarV0, "trace_tag");
                    int iS42 = p30.b.s(cVarV0, "backoff_on_system_interruptions");
                    int iS43 = p30.b.s(cVarV0, "required_network_type");
                    int iS44 = p30.b.s(cVarV0, "required_network_request");
                    int iS45 = p30.b.s(cVarV0, "requires_charging");
                    int iS46 = p30.b.s(cVarV0, "requires_device_idle");
                    int iS47 = p30.b.s(cVarV0, "requires_battery_not_low");
                    int iS48 = p30.b.s(cVarV0, "requires_storage_not_low");
                    int iS49 = p30.b.s(cVarV0, "trigger_content_update_delay");
                    int iS50 = p30.b.s(cVarV0, "trigger_max_content_delay");
                    int iS51 = p30.b.s(cVarV0, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarV0.q0()) {
                        String strW13 = cVarV0.W(iS19);
                        int i35 = iS19;
                        ArrayList arrayList3 = arrayList2;
                        ib.g0 g0VarD = xz.b.D((int) cVarV0.getLong(iS20));
                        String strW14 = cVarV0.W(iS21);
                        String strW15 = cVarV0.W(iS22);
                        byte[] blob = cVarV0.getBlob(iS23);
                        ib.h hVar = ib.h.f23726b;
                        ib.h hVarT = ex.i.t(blob);
                        ib.h hVarT2 = ex.i.t(cVarV0.getBlob(iS24));
                        long j9 = cVarV0.getLong(iS25);
                        long j11 = cVarV0.getLong(iS26);
                        long j12 = cVarV0.getLong(iS27);
                        int i36 = (int) cVarV0.getLong(iS28);
                        ib.a aVarA = xz.b.A((int) cVarV0.getLong(iS29));
                        long j13 = cVarV0.getLong(iS30);
                        long j14 = cVarV0.getLong(iS31);
                        long j15 = cVarV0.getLong(iS32);
                        int i37 = iS33;
                        long j16 = cVarV0.getLong(i37);
                        int i38 = iS20;
                        int i39 = iS34;
                        int i41 = iS32;
                        boolean z11 = ((int) cVarV0.getLong(i39)) != 0;
                        int i42 = iS35;
                        ib.d0 d0VarC = xz.b.C((int) cVarV0.getLong(i42));
                        int i43 = iS36;
                        int i44 = (int) cVarV0.getLong(i43);
                        int i45 = iS37;
                        int i46 = (int) cVarV0.getLong(i45);
                        int i47 = iS38;
                        long j17 = cVarV0.getLong(i47);
                        int i48 = iS39;
                        int i49 = (int) cVarV0.getLong(i48);
                        int i51 = iS40;
                        int i52 = (int) cVarV0.getLong(i51);
                        int i53 = iS41;
                        String strW16 = cVarV0.isNull(i53) ? null : cVarV0.W(i53);
                        int i54 = iS42;
                        if (cVarV0.isNull(i54)) {
                            i16 = i53;
                            i17 = i51;
                            numValueOf = null;
                        } else {
                            i16 = i53;
                            i17 = i51;
                            numValueOf = Integer.valueOf((int) cVarV0.getLong(i54));
                        }
                        Boolean boolValueOf = numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null;
                        int i55 = iS43;
                        ib.x xVarB = xz.b.B((int) cVarV0.getLong(i55));
                        int i56 = iS44;
                        rb.f fVarM = xz.b.M(cVarV0.getBlob(i56));
                        int i57 = iS45;
                        boolean z12 = ((int) cVarV0.getLong(i57)) != 0;
                        int i58 = iS46;
                        boolean z13 = ((int) cVarV0.getLong(i58)) != 0;
                        int i59 = iS47;
                        boolean z14 = ((int) cVarV0.getLong(i59)) != 0;
                        int i61 = iS48;
                        int i62 = iS49;
                        int i63 = iS50;
                        iS49 = i62;
                        int i64 = iS51;
                        qb.o oVar = new qb.o(strW13, g0VarD, strW14, strW15, hVarT, hVarT2, j9, j11, j12, new ib.e(fVarM, xVarB, z12, z13, z14, ((int) cVarV0.getLong(i61)) != 0, cVarV0.getLong(i62), cVarV0.getLong(i63), xz.b.l(cVarV0.getBlob(i64))), i36, aVarA, j13, j14, j15, j16, z11, d0VarC, i44, i46, j17, i49, i52, strW16, boolValueOf);
                        iS51 = i64;
                        iS50 = i63;
                        arrayList2 = arrayList3;
                        arrayList2.add(oVar);
                        iS20 = i38;
                        iS33 = i37;
                        iS43 = i55;
                        iS45 = i57;
                        iS47 = i59;
                        iS48 = i61;
                        iS46 = i58;
                        iS32 = i41;
                        iS34 = i39;
                        iS35 = i42;
                        iS36 = i43;
                        iS37 = i45;
                        iS38 = i47;
                        iS39 = i48;
                        iS40 = i17;
                        iS41 = i16;
                        iS42 = i54;
                        iS44 = i56;
                        iS19 = i35;
                        break;
                    }
                    cVarV0.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    throw th2;
                }
            case 5:
                return fd.o.c(b0.z.s(((td.i) obj).f39996a, i19));
            default:
                return fd.o.c(b0.z.s(((td.i) obj).f39996a, i19));
        }
    }

    public /* synthetic */ y(int i11, int i12) {
        this.f17232a = i12;
        this.f17233b = i11;
    }

    public /* synthetic */ y(c0 c0Var, int i11) {
        this.f17232a = 0;
        this.f17233b = i11;
    }
}
