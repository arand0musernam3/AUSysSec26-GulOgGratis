package ep;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraManager;
import c5.f3;
import c5.z1;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.notificationsettings.ui.NotificationSettingsActivity;
import com.app.tgtg.model.remote.brief.BriefItemInfo;
import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.brief.BriefStoreInfo;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.StoreLocation;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderType;
import f0.h0;
import f0.u0;
import f0.v0;
import g3.d2;
import g3.d7;
import g3.q3;
import g3.w6;
import g3.x6;
import h2.l1;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.reflect.KClass;
import m3.b1;
import m3.i0;
import m3.w1;
import mv.r0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.json.JSONArray;
import org.json.JSONObject;
import v80.f0;
import y80.a2;
import zendesk.messaging.android.internal.conversationscreen.delegates.FileMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.model.MessageLogEntry;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16299c;

    public /* synthetic */ l(g9.o oVar, g9.l lVar, boolean z11) {
        this.f16297a = 14;
        this.f16298b = oVar;
        this.f16299c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String strName;
        LatLngInfo latLngInfo;
        LatLngInfo latLngInfo2;
        int i11 = 0;
        upperCase = null;
        String upperCase = null;
        switch (this.f16297a) {
            case 0:
                d0 d0Var = (d0) this.f16298b;
                ((b1) this.f16299c).setValue(Boolean.FALSE);
                d0Var.f16244d.f20780a.a(new f70.j());
                return Unit.f26487a;
            case 1:
                ((c50.p) this.f16298b).invoke((f0.a) this.f16299c);
                return Unit.f26487a;
            case 2:
                ((CameraManager) this.f16298b).unregisterAvailabilityCallback((h0) this.f16299c);
                return Unit.f26487a;
            case 3:
                ((v0) this.f16298b).f16928c.unregisterAvailabilityCallback((u0) this.f16299c);
                return Unit.f26487a;
            case 4:
                ((CameraManager) this.f16298b).unregisterAvailabilityCallback((u0) this.f16299c);
                return Unit.f26487a;
            case 5:
                SharedPreferences sharedPreferences = ((Context) this.f16298b).getSharedPreferences((String) this.f16299c, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            case 6:
                return kotlin.collections.c0.c(new Pair((kd.h) this.f16298b, (KClass) this.f16299c));
            case 7:
                fi.i iVar = (fi.i) this.f16298b;
                Function0 function0 = (Function0) this.f16299c;
                cv.i iVar2 = cv.i.CHARITY_LOGIN_GO_BACK_WINDOW;
                dv.a aVar = dv.a.CHARITY_LOGIN_SECTION;
                dv.d dVar = dv.d.PROVIDE_CHARITY_ID;
                iVar.b(iVar2, h0.g.E(new Pair(aVar, new dv.c(dVar != null ? dVar.a() : 0))));
                function0.invoke();
                return Unit.f26487a;
            case 8:
                fi.i iVar3 = (fi.i) this.f16298b;
                b1 b1Var = (b1) this.f16299c;
                iVar3.b(cv.i.CHARITY_LOGIN_NO_CHARITY_ID, null);
                b1Var.setValue(Boolean.TRUE);
                return Unit.f26487a;
            case 9:
                i0 i0Var = (i0) this.f16298b;
                g2.b0 b0Var = (g2.b0) this.f16299c;
                g2.i iVar4 = (g2.i) i0Var.getValue();
                return new g2.k(b0Var, iVar4, new a3.j((IntRange) b0Var.f18129d.f17228f.getValue(), iVar4));
            case 10:
                bg.b bVar = (bg.b) this.f16298b;
                f3 f3Var = (f3) this.f16299c;
                bVar.invoke();
                if (Intrinsics.areEqual("PrimaryNotEditable", "PrimaryEditable") && f3Var != null) {
                    ((z1) f3Var).b();
                }
                return Boolean.TRUE;
            case 11:
                w6 w6Var = (w6) this.f16298b;
                v80.b0 b0Var2 = (v80.b0) this.f16299c;
                if (((Boolean) w6Var.f19705d.invoke(x6.PartiallyExpanded)).booleanValue()) {
                    f0.B(b0Var2, null, null, new q3(w6Var, , 7), 3);
                }
                return Boolean.TRUE;
            case 12:
                d7 d7Var = (d7) this.f16298b;
                d2 d2Var = (d2) this.f16299c;
                if (!Intrinsics.areEqual(d7Var, d2Var.f18441a)) {
                    kotlin.collections.i0.v(d2Var.f18442b, new c50.p(d7Var, 29));
                    w1 w1Var = d2Var.f18443c;
                    if (w1Var != null) {
                        w1Var.b();
                    }
                }
                return Unit.f26487a;
            case 13:
                Context context = (Context) this.f16298b;
                g8.a aVar2 = (g8.a) this.f16299c;
                context.getClass();
                return v0.n.B(context, aVar2.f20086a);
            case 14:
                g9.o oVar = (g9.o) this.f16298b;
                g9.l lVar = (g9.l) this.f16299c;
                lVar.getClass();
                synchronized (oVar.f20176a) {
                    try {
                        a2 a2Var = oVar.f20177b;
                        Iterable iterable = (Iterable) a2Var.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : iterable) {
                            if (Intrinsics.areEqual((g9.l) obj, lVar)) {
                                a2Var.getClass();
                                a2Var.k(null, arrayList);
                            } else {
                                arrayList.add(obj);
                            }
                        }
                        a2Var.getClass();
                        a2Var.k(null, arrayList);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                Context context2 = (Context) this.f16298b;
                fn.c cVar = (fn.c) this.f16299c;
                if (r0.e(context2) != null) {
                    cVar.g();
                }
                return Unit.f26487a;
            case 16:
                CharityOrderActivity charityOrderActivity = (CharityOrderActivity) this.f16298b;
                Order order = (Order) this.f16299c;
                int i12 = CharityOrderActivity.f9162o;
                go.v vVarQ = charityOrderActivity.C();
                StoreLocation pickupLocation = order.getPickupLocation();
                double longitude = 0.0d;
                double latitude = (pickupLocation == null || (latLngInfo2 = pickupLocation.getLatLngInfo()) == null) ? 0.0d : latLngInfo2.getLatitude();
                StoreLocation pickupLocation2 = order.getPickupLocation();
                if (pickupLocation2 != null && (latLngInfo = pickupLocation2.getLatLngInfo()) != null) {
                    longitude = latLngInfo.getLongitude();
                }
                vVarQ.B.f26484a.a(new f70.m(latitude, longitude));
                go.v vVarQ2 = charityOrderActivity.C();
                cv.i iVar5 = cv.i.ACTION_FIND_STORE;
                Pair pair = new Pair(dv.a.METHOD, new dv.c("Find_Store_Button"));
                dv.a aVar3 = dv.a.ITEM_TYPE;
                OrderType orderType = order.getOrderType();
                if (orderType != null && (strName = orderType.name()) != null) {
                    upperCase = strName.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                }
                vVarQ2.l(iVar5, h0.g.E(pair, new Pair(aVar3, new dv.c(upperCase)), new Pair(dv.a.VERSION, new dv.c("v1"))));
                return Unit.f26487a;
            case 17:
                CharityOrderActivity charityOrderActivity2 = (CharityOrderActivity) this.f16298b;
                go.a aVar4 = (go.a) this.f16299c;
                int i13 = CharityOrderActivity.f9162o;
                charityOrderActivity2.C().l(cv.i.ACTION_REMIND_ME_BUTTON, null);
                aVar4.f20702e.setValue(Boolean.TRUE);
                return Unit.f26487a;
            case 18:
                gq.b bVar2 = (gq.b) this.f16298b;
                Function0 function02 = (Function0) this.f16299c;
                cv.b bVar3 = bVar2.f20787a;
                cv.i iVar6 = cv.i.ACTION_ANSWER_REWARDS_NOT_REDEEMED_SURVEY;
                dv.a aVar5 = dv.a.ANSWERS;
                Iterable iterable2 = (Iterable) bVar2.f20790d.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : iterable2) {
                    int i14 = i11 + 1;
                    if (i11 < 0) {
                        kotlin.collections.d0.n();
                        throw null;
                    }
                    String str = ((Boolean) obj2).booleanValue() ? i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? "Other" : "Didn't like experience" : "Didn't understand" : "Didn't  know" : "Window too short" : "Minimum purchase too high" : "Discount wasn't attractive" : null;
                    if (str != null) {
                        arrayList2.add(str);
                    }
                    i11 = i14;
                }
                bVar3.c(iVar6, h0.g.E(new Pair(aVar5, new dv.c(arrayList2)), new Pair(dv.a.FREE_TEXT_ANSWER, new dv.c((String) bVar2.f20793g.getValue()))));
                function02.invoke();
                return Unit.f26487a;
            case 19:
                gq.d dVar2 = (gq.d) this.f16298b;
                Function0 function03 = (Function0) this.f16299c;
                dVar2.f20797b.c(cv.i.ACTION_ANSWER_REWARDS_REDEEMED_SURVEY, h0.g.E(new Pair(dv.a.ANSWER, new dv.c((Integer) dVar2.f20801f.getValue())), new Pair(dv.a.FREE_TEXT_ANSWER, new dv.c((String) dVar2.f20799d.getValue()))));
                function03.invoke();
                return Unit.f26487a;
            case 20:
                y3.e eVar = (y3.e) this.f16298b;
                y3.b bVar4 = (y3.b) this.f16299c;
                o0 o0Var = o0.f26530a;
                o0Var.getClass();
                return new l1(eVar, o0Var, bVar4);
            case 21:
                return FileMessageContainerAdapterDelegate.ViewHolder.createFileUploadCell$lambda$9$lambda$8$lambda$7((MessageLogEntry.FileMessageContainer) this.f16298b, (Function1) this.f16299c);
            case 22:
                jj.c cVar2 = (jj.c) this.f16298b;
                Function0 function04 = (Function0) this.f16299c;
                cVar2.f25290a.f20523c.i(gj.m.f20505a);
                function04.invoke();
                return Unit.f26487a;
            case 23:
                MainActivity mainActivity = (MainActivity) this.f16298b;
                List list = (List) this.f16299c;
                boolean z11 = MainActivity.f9078v;
                hm.v vVarG0 = mainActivity.g0();
                BriefOrder briefOrder = (BriefOrder) list.get(0);
                briefOrder.getClass();
                cv.b bVar5 = vVarG0.f22155h;
                BriefStoreInfo briefStoreInfo = briefOrder.getBriefStoreInfo();
                String storeDisplayName = briefStoreInfo != null ? briefStoreInfo.getStoreDisplayName() : null;
                BriefItemInfo briefItemInfo = briefOrder.getBriefItemInfo();
                bVar5.e("Magic Bag", null, null, storeDisplayName, briefItemInfo != null ? briefItemInfo.m314getItemIdRWxzYZM() : null);
                return Unit.f26487a;
            case 24:
                BasicItem basicItem = (BasicItem) this.f16298b;
                MainActivity mainActivity2 = (MainActivity) this.f16299c;
                boolean z12 = MainActivity.f9078v;
                if (basicItem != null) {
                    hm.v vVarG02 = mainActivity2.g0();
                    f70.i iVar7 = f70.i.STORE_CANCELLED_POPUP;
                    iVar7.getClass();
                    vVarG02.f22163q.a(basicItem, iVar7);
                    hm.v vVarG03 = mainActivity2.g0();
                    cv.i iVar8 = cv.i.ACTION_CLICK_RECOMMENDED_ITEM;
                    dv.a aVar6 = dv.a.SCREEN;
                    dv.d dVar3 = dv.d.SCREEN_CANCELLATION_INFO;
                    Pair pair2 = new Pair(aVar6, new dv.c(dVar3 != null ? dVar3.a() : null));
                    Pair pair3 = new Pair(dv.a.ITEM_ID, new dv.c(basicItem.getInformation().mo340getItemIdFvU5WIY()));
                    dv.a aVar7 = dv.a.TYPE;
                    dv.d dVar4 = dv.d.STORE_CANCELLATION;
                    vVarG03.d(iVar8, h0.g.E(pair2, pair3, new Pair(aVar7, new dv.c(dVar4 != null ? dVar4.a() : null))));
                }
                return Unit.f26487a;
            case 25:
                hq.c cVar3 = (hq.c) this.f16298b;
                nq.d dVar5 = (nq.d) this.f16299c;
                int i15 = hq.c.f22343r;
                cVar3.d((DiscoverBucket) dVar5);
                return Unit.f26487a;
            case 26:
                Ref.BooleanRef booleanRef = (Ref.BooleanRef) this.f16298b;
                NotificationSettingsActivity notificationSettingsActivity = (NotificationSettingsActivity) this.f16299c;
                int i16 = NotificationSettingsActivity.f9422k;
                booleanRef.element = mv.d.o(notificationSettingsActivity);
                return Unit.f26487a;
            case 27:
                return com.braze.requests.e.a((com.braze.requests.e) this.f16298b, (JSONArray) this.f16299c);
            case 28:
                return com.braze.requests.e.a((com.braze.requests.e) this.f16298b, (com.braze.models.response.m) this.f16299c);
            default:
                return com.braze.requests.e.a((com.braze.requests.e) this.f16298b, (JSONObject) this.f16299c);
        }
    }

    public /* synthetic */ l(int i11, Object obj, Object obj2) {
        this.f16297a = i11;
        this.f16298b = obj;
        this.f16299c = obj2;
    }
}
