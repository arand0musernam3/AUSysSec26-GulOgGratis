package nv;

import com.app.tgtg.feature.main.fragments.browse.map.bottomSheet.MapBottomSheet;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.profile.ProfilePageOrders;
import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails;
import ex.i;
import ib.d0;
import ib.g0;
import ib.x;
import j5.b0;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.Sequence;
import n90.h;
import org.bouncycastle.iana.AEADAlgorithm;
import pm.j;
import qb.o;
import rb.f;
import s1.e0;
import s1.r0;
import s1.s;
import z5.e;
import zendesk.ui.android.conversation.file.FileRendering;
import zendesk.ui.android.conversation.file.FileView;
import zendesk.ui.android.conversation.imagerviewer.ImageViewerRendering;
import zendesk.ui.android.conversation.imagerviewer.ImageViewerView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31399a;

    public /* synthetic */ a(e eVar) {
        this.f31399a = 25;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        ha.c cVarV0;
        int i11;
        int i12;
        Integer numValueOf;
        Boolean boolValueOf;
        switch (this.f31399a) {
            case 0:
                s sVar = (s) obj;
                sVar.getClass();
                return s.g(sVar, 1, t1.c.k(300, 0, null, 6));
            case 1:
                ((s) obj).getClass();
                return r0.f(null, 0.0f, 7);
            case 2:
                ((s) obj).getClass();
                return r0.d(t1.c.k(400, 400, null, 4), 2);
            case 3:
                ((s) obj).getClass();
                return r0.e(t1.c.k(400, 0, null, 6), 2);
            case 4:
                Sequence sequence = (Sequence) obj;
                sequence.getClass();
                return sequence.iterator();
            case 5:
                return Boolean.valueOf(obj == null);
            case 6:
                return FileView._init_$lambda$0((FileRendering) obj);
            case 7:
                return ProfilePageOrders.json$lambda$0((h) obj);
            case 8:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 9:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 10:
                char cCharValue = ((Character) obj).charValue();
                return Boolean.valueOf(cCharValue == 'T' || cCharValue == 't');
            case 11:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 12:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 13:
                char cCharValue2 = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= cCharValue2 && cCharValue2 < ':');
            case 14:
                o9.d dVar = (o9.d) obj;
                return new Pair(Reflection.getOrCreateKotlinClass(dVar.getClass()), dVar.getKey());
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new e0(r0.d(t1.c.k(700, 0, null, 6), 2), r0.e(t1.c.k(700, 0, null, 6), 2));
            case 16:
                return new e0(r0.d(t1.c.k(700, 0, null, 6), 2), r0.e(t1.c.k(700, 0, null, 6), 2));
            case 17:
                return ImageViewerView._init_$lambda$3((ImageViewerRendering) obj);
            case 18:
                return Float.valueOf(((Float) obj).floatValue() * 0.2f);
            case 19:
                ((j) obj).getClass();
                return Boolean.TRUE;
            case 20:
                int i13 = MapBottomSheet.f9095y;
                ((BasicItem) obj).getClass();
                return Unit.f26487a;
            case 21:
                ((Boolean) obj).booleanValue();
                int i14 = MapBottomSheet.f9095y;
                return Unit.f26487a;
            case 22:
                ((Boolean) obj).booleanValue();
                int i15 = MapBottomSheet.f9095y;
                return Unit.f26487a;
            case 23:
                BasicItem basicItem = (BasicItem) obj;
                basicItem.getClass();
                return ItemId.m197boximpl(basicItem.getInformation().mo340getItemIdFvU5WIY());
            case 24:
                return LoyaltyCardDetails.json$lambda$0((h) obj);
            case 25:
                obj.getClass();
                throw new ClassCastException();
            case 26:
                ((b0) obj).getClass();
                return Unit.f26487a;
            case 27:
                ha.a aVar = (ha.a) obj;
                aVar.getClass();
                cVarV0 = aVar.v0("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cVarV0.q0()) {
                        arrayList.add(cVarV0.W(0));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            case 28:
                ha.a aVar2 = (ha.a) obj;
                aVar2.getClass();
                cVarV0 = aVar2.v0("DELETE FROM WorkProgress");
                try {
                    cVarV0.q0();
                    cVarV0.close();
                    return Unit.f26487a;
                } finally {
                }
            default:
                ha.a aVar3 = (ha.a) obj;
                aVar3.getClass();
                cVarV0 = aVar3.v0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
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
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarV0.q0()) {
                        String strW = cVarV0.W(iS);
                        int i16 = iS;
                        ArrayList arrayList3 = arrayList2;
                        g0 g0VarD = xz.b.D((int) cVarV0.getLong(iS2));
                        String strW2 = cVarV0.W(iS3);
                        String strW3 = cVarV0.W(iS4);
                        byte[] blob = cVarV0.getBlob(iS5);
                        ib.h hVar = ib.h.f23726b;
                        ib.h hVarT = i.t(blob);
                        ib.h hVarT2 = i.t(cVarV0.getBlob(iS6));
                        long j9 = cVarV0.getLong(iS7);
                        long j11 = cVarV0.getLong(iS8);
                        long j12 = cVarV0.getLong(iS9);
                        int i17 = (int) cVarV0.getLong(iS10);
                        ib.a aVarA = xz.b.A((int) cVarV0.getLong(iS11));
                        long j13 = cVarV0.getLong(iS12);
                        long j14 = cVarV0.getLong(iS13);
                        long j15 = cVarV0.getLong(iS14);
                        int i18 = iS15;
                        long j16 = cVarV0.getLong(i18);
                        int i19 = iS2;
                        int i21 = iS16;
                        int i22 = iS3;
                        boolean z11 = ((int) cVarV0.getLong(i21)) != 0;
                        int i23 = iS17;
                        d0 d0VarC = xz.b.C((int) cVarV0.getLong(i23));
                        int i24 = iS18;
                        int i25 = (int) cVarV0.getLong(i24);
                        int i26 = iS19;
                        int i27 = (int) cVarV0.getLong(i26);
                        int i28 = iS20;
                        long j17 = cVarV0.getLong(i28);
                        int i29 = iS21;
                        int i31 = (int) cVarV0.getLong(i29);
                        int i32 = iS22;
                        int i33 = (int) cVarV0.getLong(i32);
                        int i34 = iS23;
                        String strW4 = cVarV0.isNull(i34) ? null : cVarV0.W(i34);
                        int i35 = iS24;
                        if (cVarV0.isNull(i35)) {
                            i11 = i31;
                            i12 = i32;
                            numValueOf = null;
                        } else {
                            i11 = i31;
                            i12 = i32;
                            numValueOf = Integer.valueOf((int) cVarV0.getLong(i35));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        iS24 = i35;
                        int i36 = iS25;
                        x xVarB = xz.b.B((int) cVarV0.getLong(i36));
                        int i37 = iS26;
                        f fVarM = xz.b.M(cVarV0.getBlob(i37));
                        iS25 = i36;
                        int i38 = iS27;
                        boolean z12 = ((int) cVarV0.getLong(i38)) != 0;
                        iS27 = i38;
                        int i39 = iS28;
                        boolean z13 = ((int) cVarV0.getLong(i39)) != 0;
                        iS28 = i39;
                        int i41 = iS29;
                        boolean z14 = ((int) cVarV0.getLong(i41)) != 0;
                        iS29 = i41;
                        int i42 = iS30;
                        int i43 = iS31;
                        int i44 = iS32;
                        iS31 = i43;
                        int i45 = iS33;
                        o oVar = new o(strW, g0VarD, strW2, strW3, hVarT, hVarT2, j9, j11, j12, new ib.e(fVarM, xVarB, z12, z13, z14, ((int) cVarV0.getLong(i42)) != 0, cVarV0.getLong(i43), cVarV0.getLong(i44), xz.b.l(cVarV0.getBlob(i45))), i17, aVarA, j13, j14, j15, j16, z11, d0VarC, i25, i27, j17, i11, i33, strW4, boolValueOf);
                        iS33 = i45;
                        iS32 = i44;
                        arrayList2 = arrayList3;
                        arrayList2.add(oVar);
                        iS30 = i42;
                        iS = i16;
                        iS2 = i19;
                        iS15 = i18;
                        iS18 = i24;
                        iS19 = i26;
                        iS20 = i28;
                        iS21 = i29;
                        iS22 = i12;
                        iS23 = i34;
                        iS26 = i37;
                        iS3 = i22;
                        iS16 = i21;
                        iS17 = i23;
                        break;
                    }
                    return arrayList2;
                } catch (Throwable th2) {
                    throw th2;
                }
        }
    }

    public /* synthetic */ a(int i11) {
        this.f31399a = i11;
    }
}
