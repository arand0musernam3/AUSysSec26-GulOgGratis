package m90;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.Uri;
import c5.f3;
import com.app.tgtg.feature.main.fragments.browse.map.bottomSheet.MapBottomSheet;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherExperienceActivity;
import com.app.tgtg.model.remote.invitation.Invitation;
import com.app.tgtg.model.remote.invitation.InvitationFromDeeplinkResponse;
import com.app.tgtg.model.remote.order.Changes;
import com.app.tgtg.model.remote.order.UpdateNotificationType;
import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureType;
import com.app.tgtg.model.remote.profile.response.ProfileVoucherTooltip;
import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import com.app.tgtg.model.remote.user.response.charity.CharityDayScheduleStore;
import com.braze.support.BrazeImageUtils;
import com.braze.support.IntentUtils;
import com.braze.support.WebContentUtils;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KProperty;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.JsonDecodingException;
import m3.c3;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29893c;

    public /* synthetic */ z(int i11, Object obj, Object obj2) {
        this.f29891a = i11;
        this.f29893c = obj;
        this.f29892b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Invitation invitation;
        String[] strArrNames;
        ?? M338getRelatedEntityIdreIZeYA = 0;
        M338getRelatedEntityIdreIZeYA = 0;
        switch (this.f29891a) {
            case 0:
                i90.a aVar = (i90.a) this.f29893c;
                String str = (String) this.f29892b;
                y yVar = (y) aVar.f23583c;
                if (yVar == null) {
                    Enum[] enumArr = (Enum[]) aVar.f23582b;
                    yVar = new y(str, enumArr.length);
                    for (Enum r02 : enumArr) {
                        yVar.j(r02.name(), false);
                    }
                }
                return yVar;
            case 1:
                return ox.h.o((String) this.f29892b, k90.j.f26242m, new SerialDescriptor[0], new z0((i90.a) this.f29893c, z ? 1 : 0));
            case 2:
                m2.c2 c2Var = (m2.c2) this.f29893c;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f29892b;
                synchronized (mb.h.f29915b) {
                    LinkedHashMap linkedHashMap = mb.h.f29916c;
                    linkedHashMap.remove(c2Var);
                    if (linkedHashMap.isEmpty()) {
                        ib.w.d().a(mb.i.f29920a, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(mb.h.f29914a);
                        mb.h.f29919f = null;
                        mb.h.f29917d = null;
                        mb.h.f29918e = false;
                    }
                    break;
                }
                return Unit.f26487a;
            case 3:
                hr.i iVar = (hr.i) this.f29893c;
                Function1 function1 = (Function1) this.f29892b;
                mv.u uVar = iVar.f22439k;
                uVar.getClass();
                if (uVar.a(mv.k.APPTRK_RLX_VOUCHER_EXPERIENCE) != null) {
                    function1.invoke(hr.f.VOUCHER_EXPERIENCE);
                } else {
                    function1.invoke(hr.f.VOUCHERS);
                }
                v80.f0.B(androidx.lifecycle.m1.d(iVar), null, null, new hr.g(iVar, M338getRelatedEntityIdreIZeYA, 2), 3);
                return Unit.f26487a;
            case 4:
                return BrazeImageUtils.getRemoteBitmap$lambda$20((URL) this.f29893c, (BitmapFactory.Options) this.f29892b);
            case 5:
                return BrazeImageUtils.getRemoteBitmap$lambda$21((String) this.f29892b, (Exception) this.f29893c);
            case 6:
                return BrazeImageUtils.getLocalBitmap$lambda$13((Uri) this.f29893c, (BitmapFactory.Options) this.f29892b);
            case 7:
                return IntentUtils.addComponentAndSendBroadcast$lambda$2$lambda$1((ComponentName) this.f29893c, (Intent) this.f29892b);
            case 8:
                return WebContentUtils.unpackZipIntoDirectory$lambda$11((File) this.f29893c, (String) this.f29892b);
            case 9:
                nb.b bVar = (nb.b) this.f29893c;
                nb.a aVar2 = (nb.a) this.f29892b;
                ob.e eVar = bVar.f30799a;
                eVar.getClass();
                synchronized (eVar.f32415c) {
                    if (eVar.f32416d.remove(aVar2) && eVar.f32416d.isEmpty()) {
                        eVar.d();
                    }
                    break;
                }
                return Unit.f26487a;
            case 10:
                f3 f3Var = (f3) this.f29893c;
                g4.l lVar = (g4.l) this.f29892b;
                if (f3Var != null) {
                    ((c5.z1) f3Var).a();
                }
                ((g4.p) lVar).b(true);
                return Unit.f26487a;
            case 11:
                ni.e eVar2 = (ni.e) this.f29893c;
                ((m3.b1) this.f29892b).setValue(Boolean.FALSE);
                eVar2.f30878d.f44310a.a(f70.k.f17493a);
                return Unit.f26487a;
            case 12:
                mn.l lVar2 = (mn.l) this.f29893c;
                ProfileFeatureType featureType = ((ProfileFeature) this.f29892b).getFeatureType();
                featureType.getClass();
                v80.f0.B(androidx.lifecycle.m1.d(lVar2), null, null, new mn.g(lVar2, featureType, M338getRelatedEntityIdreIZeYA, z ? 1 : 0), 3);
                return Unit.f26487a;
            case 13:
                v80.f0.B((v80.b0) this.f29893c, null, null, new cg.q0((m3.b1) this.f29892b, M338getRelatedEntityIdreIZeYA, 4), 3);
                return Unit.f26487a;
            case 14:
                ProfileVoucherTooltip profileVoucherTooltip = (ProfileVoucherTooltip) this.f29893c;
                m3.b1 b1Var = (m3.b1) this.f29892b;
                profileVoucherTooltip.setShowNewVoucherTooltip(false);
                b1Var.setValue(Boolean.FALSE);
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                Changes changes = (Changes) this.f29893c;
                Function0 function0 = (Function0) this.f29892b;
                if (changes.getType() == UpdateNotificationType.INVENTORY_CHANGED) {
                    function0.invoke();
                }
                return Unit.f26487a;
            case 16:
                ((Function1) this.f29893c).invoke((Changes) this.f29892b);
                return Unit.f26487a;
            case 17:
                SurpriseBagOrderActivity surpriseBagOrderActivity = (SurpriseBagOrderActivity) this.f29893c;
                c3 c3Var = (c3) this.f29892b;
                int i11 = SurpriseBagOrderActivity.f9178y;
                surpriseBagOrderActivity.getOnBackPressedDispatcher().d();
                no.m0 m0VarM = surpriseBagOrderActivity.C();
                cv.i iVar2 = cv.i.ACTION_INVITATION_DECLINED;
                dv.a aVar3 = dv.a.ORDER_ID;
                InvitationFromDeeplinkResponse invitationFromDeeplinkResponse = (InvitationFromDeeplinkResponse) c3Var.getValue();
                if (invitationFromDeeplinkResponse != null && (invitation = invitationFromDeeplinkResponse.getInvitation()) != null) {
                    M338getRelatedEntityIdreIZeYA = invitation.m338getRelatedEntityIdreIZeYA();
                }
                m0VarM.l(iVar2, h0.g.E(new Pair(aVar3, new dv.c(M338getRelatedEntityIdreIZeYA))));
                return Unit.f26487a;
            case 18:
                return com.braze.support.delegates.a.a(this.f29893c, (KProperty) this.f29892b);
            case 19:
                SerialDescriptor serialDescriptor = (SerialDescriptor) this.f29893c;
                n90.c cVar = (n90.c) this.f29892b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                n90.j jVar = cVar.f30749a;
                o90.k.o(serialDescriptor, cVar);
                int iE = serialDescriptor.e();
                for (int i12 = 0; i12 < iE; i12++) {
                    List listG = serialDescriptor.g(i12);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listG) {
                        if (obj instanceof n90.x) {
                            arrayList.add(obj);
                        }
                    }
                    n90.x xVar = (n90.x) CollectionsKt.j0(arrayList);
                    if (xVar != null && (strArrNames = xVar.names()) != null) {
                        for (String str2 : strArrNames) {
                            String str3 = Intrinsics.areEqual(serialDescriptor.getKind(), k90.i.f26239j) ? "enum value" : "property";
                            if (linkedHashMap2.containsKey(str2)) {
                                throw new JsonDecodingException("The suggested name '" + str2 + "' for " + str3 + ' ' + serialDescriptor.f(i12) + " is already one of the names for " + str3 + ' ' + serialDescriptor.f(((Number) kotlin.collections.x0.c(str2, linkedHashMap2)).intValue()) + " in " + serialDescriptor);
                            }
                            linkedHashMap2.put(str2, Integer.valueOf(i12));
                        }
                    }
                }
                if (!linkedHashMap2.isEmpty()) {
                    return linkedHashMap2;
                }
                kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
                o0Var.getClass();
                return o0Var;
            case 20:
                Function1 function12 = (Function1) this.f29893c;
                SpecialReward specialReward = (SpecialReward) this.f29892b;
                if (function12 != null) {
                    function12.invoke(specialReward);
                }
                return Unit.f26487a;
            case 21:
                return com.braze.triggers.actions.g.a((com.braze.triggers.actions.g) this.f29893c, (com.braze.triggers.events.b) this.f29892b);
            case 22:
                pi.m mVar = (pi.m) this.f29893c;
                CharityDayScheduleStore charityDayScheduleStore = (CharityDayScheduleStore) this.f29892b;
                mVar.f35399b.f44310a.a(new f70.m(charityDayScheduleStore.getLatitude(), charityDayScheduleStore.getLongitude()));
                cv.i iVar3 = cv.i.ACTION_FIND_STORE;
                dv.b bVarE = h0.g.E(new Pair(dv.a.ITEM_TYPE, new dv.c("CHARITY")), new Pair(dv.a.VERSION, new dv.c("v1")), new Pair(dv.a.METHOD, new dv.c("Donation_Planned_Find_Store")));
                iVar3.getClass();
                mVar.f35401d.c(iVar3, bVarE);
                return Unit.f26487a;
            case 23:
                MapBottomSheet mapBottomSheet = (MapBottomSheet) this.f29893c;
                m3.b1 b1Var2 = (m3.b1) this.f29892b;
                int i13 = MapBottomSheet.f9095y;
                b1Var2.setValue(Boolean.TRUE);
                mapBottomSheet.f9101o.invoke();
                return Unit.f26487a;
            case 24:
                v80.b0 b0Var = (v80.b0) this.f29893c;
                com.google.firebase.messaging.a0 a0Var = (com.google.firebase.messaging.a0) this.f29892b;
                int i14 = MapBottomSheet.f9095y;
                v80.f0.B(b0Var, null, null, new h2.b1(a0Var, M338getRelatedEntityIdreIZeYA, 24), 3);
                return Unit.f26487a;
            case 25:
                return qc.a0.b((qc.a0) this.f29893c, (Ref.BooleanRef) this.f29892b);
            case 26:
                VoucherActivity voucherActivity = (VoucherActivity) this.f29893c;
                m3.b1 b1Var3 = (m3.b1) this.f29892b;
                int i15 = VoucherActivity.f9440h;
                ss.l1 l1Var = (ss.l1) b1Var3.getValue();
                if ((l1Var instanceof ss.g1) || (l1Var instanceof ss.k1)) {
                    Boolean bool = (Boolean) voucherActivity.b0().f37263a.a("IS_ONBOARDING");
                    if (bool != null ? bool.booleanValue() : false) {
                        voucherActivity.c0();
                    } else {
                        voucherActivity.finish();
                    }
                } else {
                    voucherActivity.b0().f37265c.B();
                }
                return Unit.f26487a;
            case 27:
                VoucherExperienceActivity voucherExperienceActivity = (VoucherExperienceActivity) this.f29893c;
                m3.b1 b1Var4 = (m3.b1) this.f29892b;
                int i16 = VoucherExperienceActivity.f9443h;
                ss.e1 e1Var = (ss.e1) b1Var4.getValue();
                if ((e1Var instanceof ss.z0) || (e1Var instanceof ss.d1)) {
                    Boolean bool2 = (Boolean) voucherExperienceActivity.D().f37258a.a("IS_ONBOARDING");
                    if (bool2 != null ? bool2.booleanValue() : false) {
                        voucherExperienceActivity.E();
                    } else {
                        voucherExperienceActivity.finish();
                    }
                } else if (e1Var instanceof ss.c1) {
                    ss.e1 e1Var2 = (ss.e1) b1Var4.getValue();
                    e1Var2.getClass();
                    if (((ss.c1) e1Var2).f39147d) {
                        voucherExperienceActivity.D().f37259b.f39256d.i(new ts.v(false));
                    } else {
                        voucherExperienceActivity.D().f37260c.B();
                    }
                } else {
                    voucherExperienceActivity.D().f37260c.B();
                }
                return Unit.f26487a;
            case 28:
                return com.braze.communication.dust.i.a((Ref.ObjectRef) this.f29893c, (Ref.ObjectRef) this.f29892b);
            default:
                return com.braze.triggers.managers.a.a((com.braze.triggers.actions.a) this.f29893c, (String) this.f29892b);
        }
    }

    public /* synthetic */ z(Object obj, int i11, String str) {
        this.f29891a = i11;
        this.f29892b = str;
        this.f29893c = obj;
    }
}
