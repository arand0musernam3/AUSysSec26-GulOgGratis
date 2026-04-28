package yi;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import ao.g3;
import b0.z1;
import bg.k0;
import c5.r3;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.item.BasicItemInformation;
import com.app.tgtg.model.remote.item.ItemCategory;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.manufacturer.request.BasketBriefItem;
import com.app.tgtg.model.remote.manufacturer.response.BasketResponse;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d2.z2;
import g3.g7;
import g3.v3;
import g3.w6;
import g3.x5;
import g9.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.b1;
import m3.w1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u001e²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\r\u001a\u0004\u0018\u00010\f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0010\u001a\u0004\u0018\u00010\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0013\u001a\u0004\u0018\u00010\u00128\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0014\u001a\u0004\u0018\u00010\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0019\u001a\u0004\u0018\u00010\u00188\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u00128\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001d\u001a\u0004\u0018\u00010\u00128\nX\u008a\u0084\u0002"}, d2 = {"Lyi/r;", "Lcom/google/android/material/bottomsheet/m;", "Lzi/d;", "<init>", "()V", "y00/d0", "", "loader", "validatingPostalCodeError", "", "Lcom/app/tgtg/model/remote/payment/PaymentMethods;", "paymentOptions", "Lcom/app/tgtg/model/remote/payment/PriceSpecification;", "priceInfo", "Lcom/app/tgtg/model/remote/user/requests/UserAddress;", "validUserAddress", "selectedPaymentOption", "doesVoucherCoverAll", "Lcom/app/tgtg/model/remote/order/response/CreateOrderResponse$CreateOrderState;", "onOrderError", "onParcelOrderError", "showForceAdjustBasketPopup", "validatingPostalCodeSuccess", "onAddressClose", "Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionsLocal;", "deliveryOptionsLocal", "Lcom/app/tgtg/model/remote/ParcelDeliveryOptionId;", "selectedPickupOptionId", "orderState", "parcelOrderState", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckoutOverviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutOverviewFragment.kt\ncom/app/tgtg/feature/checkout/fragments/CheckoutOverviewFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 12 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 13 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1246:1\n172#2,9:1247\n172#2,9:1256\n1128#3,6:1265\n1128#3,6:1271\n1128#3,6:1277\n1128#3,6:1283\n1128#3,3:1296\n1131#3,3:1300\n1128#3,6:1303\n1128#3,3:1316\n1131#3,3:1320\n1128#3,6:1323\n1128#3,6:1329\n1128#3,6:1335\n1128#3,6:1341\n1128#3,6:1368\n1128#3,6:1375\n1128#3,6:1381\n1128#3,6:1387\n1128#3,6:1393\n1128#3,6:1399\n1128#3,6:1405\n1128#3,6:1411\n1128#3,6:1417\n1128#3,6:1423\n1128#3,6:1462\n1128#3,6:1468\n1128#3,6:1474\n1128#3,6:1480\n1128#3,6:1486\n1128#3,6:1492\n1128#3,6:1498\n1128#3,6:1504\n1128#3,6:1514\n1128#3,6:1520\n1128#3,3:1533\n1131#3,3:1537\n1128#3,6:1540\n1128#3,6:1546\n1128#3,6:1552\n1128#3,6:1564\n599#4:1289\n596#4,6:1290\n599#4:1309\n596#4,6:1310\n599#4:1526\n596#4,6:1527\n597#5:1299\n597#5:1319\n597#5:1536\n1#6:1347\n1807#7,3:1348\n1915#7,2:1351\n85#8:1353\n85#8:1354\n85#8:1355\n85#8:1356\n85#8:1357\n85#8:1358\n85#8:1359\n85#8:1360\n85#8:1361\n85#8:1362\n85#8:1363\n85#8:1364\n85#8:1365\n85#8:1366\n85#8:1367\n85#8:1558\n85#8:1559\n75#9:1374\n75#9:1560\n75#9:1563\n70#10:1429\n66#10,10:1430\n77#10:1513\n81#11,6:1440\n88#11,6:1455\n96#11:1512\n391#12,9:1446\n400#12:1461\n401#12,2:1510\n122#13:1561\n122#13:1562\n*S KotlinDebug\n*F\n+ 1 CheckoutOverviewFragment.kt\ncom/app/tgtg/feature/checkout/fragments/CheckoutOverviewFragment\n*L\n132#1:1247,9\n133#1:1256,9\n302#1:1265,6\n304#1:1271,6\n340#1:1277,6\n341#1:1283,6\n349#1:1296,3\n349#1:1300,3\n359#1:1303,6\n370#1:1316,3\n370#1:1320,3\n381#1:1323,6\n388#1:1329,6\n401#1:1335,6\n402#1:1341,6\n449#1:1368,6\n457#1:1375,6\n461#1:1381,6\n462#1:1387,6\n480#1:1393,6\n491#1:1399,6\n498#1:1405,6\n505#1:1411,6\n520#1:1417,6\n529#1:1423,6\n540#1:1462,6\n555#1:1468,6\n542#1:1474,6\n560#1:1480,6\n582#1:1486,6\n589#1:1492,6\n600#1:1498,6\n604#1:1504,6\n623#1:1514,6\n643#1:1520,6\n649#1:1533,3\n649#1:1537,3\n657#1:1540,6\n668#1:1546,6\n682#1:1552,6\n430#1:1564,6\n349#1:1289\n349#1:1290,6\n370#1:1309\n370#1:1310,6\n649#1:1526\n649#1:1527,6\n349#1:1299\n370#1:1319\n649#1:1536\n1212#1:1348,3\n1218#1:1351,2\n448#1:1353\n470#1:1354\n472#1:1355\n474#1:1356\n475#1:1357\n476#1:1358\n477#1:1359\n478#1:1360\n479#1:1361\n519#1:1362\n636#1:1363\n650#1:1364\n651#1:1365\n678#1:1366\n679#1:1367\n338#1:1558\n342#1:1559\n454#1:1374\n421#1:1560\n427#1:1563\n536#1:1429\n536#1:1430,10\n536#1:1513\n536#1:1440,6\n536#1:1455,6\n536#1:1512\n536#1:1446,9\n536#1:1461\n536#1:1510,2\n423#1:1561\n424#1:1562\n*E\n"})
public final class r extends u implements zi.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f46016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f46017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g9.f0 f46018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f46019j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v f46020k;
    public um.h l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public BottomSheetBehavior f46021m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final al.i f46022n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ComposeView f46023o;

    public r() {
        super(0);
        this.f46016g = new n1(Reflection.getOrCreateKotlinClass(cj.q.class), new q(this, 0), new q(this, 2), new q(this, 1));
        this.f46017h = new n1(Reflection.getOrCreateKotlinClass(cj.e0.class), new q(this, 3), new q(this, 5), new q(this, 4));
        this.f46022n = new al.i(this, 7);
    }

    @Override // com.google.android.material.bottomsheet.m, k.z, androidx.fragment.app.y
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.getClass();
        dialogOnCreateDialog.setOnShowListener(new h(this, 0));
        lx.u.u(((com.google.android.material.bottomsheet.l) dialogOnCreateDialog).getOnBackPressedDispatcher(), this, new a(this, 1));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(r3.f7360a);
        this.f46023o = composeView;
        return composeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v28, types: [java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        BasicItemInformation information;
        String strC;
        BasicItemInformation information2;
        Object objM370getStoreId7QsYvu8;
        g3 g3Var;
        Object objC;
        BasicItemInformation information3;
        String strA;
        List list;
        StoreInformation storeInformationM;
        BasicItem basicItem;
        Object objValueOf;
        Object objValueOf2;
        PickupInterval pickupIntervalL;
        StoreInformation storeInformationM2;
        BasicItemInformation information4;
        ItemCategory itemCategory;
        StoreInformation storeInformationM3;
        List list2;
        view.getClass();
        super.onViewCreated(view, bundle);
        if (requireArguments().getBoolean("IS_MULTI_ITEM", false)) {
            v().f8334b0 = true;
            u().f8209a.d(Boolean.TRUE, "IS_MULTI_ITEM");
            aj.c cVar = (aj.c) h0.g.t(requireArguments(), "BASKET_CHECKOUT_DATA", aj.c.class);
            if (cVar != null) {
                v().f8331a.d(cVar, "BASKET_CHECKOUT_DATA");
                u().f8209a.d(cVar, "BASKET_CHECKOUT_DATA");
            }
            BasketResponse basketResponse = (BasketResponse) h0.g.t(requireArguments(), "BASKET_RESPONSE", BasketResponse.class);
            if (basketResponse != null) {
                v().f8342f0 = basketResponse;
                u().f8209a.d(basketResponse, "BASKET_RESPONSE");
            }
        } else {
            u().f8209a.d(Boolean.FALSE, "IS_MULTI_ITEM");
            v().f8334b0 = false;
            BasicItem basicItem2 = (BasicItem) h0.g.t(requireArguments(), "ITEM", BasicItem.class);
            if (basicItem2 != null) {
                v().f8331a.d(basicItem2, "ITEM");
                u().f8209a.d(basicItem2, "ITEM");
            }
        }
        cj.q qVarV = v();
        av.e eVarL = qVarV.l();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        eVarL.e(viewLifecycleOwner, this.f46022n);
        x70.c cVar2 = null;
        v80.f0.B(m1.c(this), null, null, new tm.d(qVarV, this, cVar2, 24), 3);
        v80.f0.B(m1.c(this), null, null, new sf.a(this, cVar2, 18), 3);
        v().X.e(getViewLifecycleOwner(), new dk.b(new p(this, 0), 9));
        u().W.e(getViewLifecycleOwner(), new dk.b(new p(this, 1), 9));
        u().K.e(getViewLifecycleOwner(), new dk.b(new a(this, 0), 9));
        cj.q qVarV2 = v();
        v80.f0.B(m1.d(qVarV2), null, null, new cj.c(qVarV2, cVar2, 2), 3);
        String string = requireArguments().getString("VOUCHER_ID");
        if (string != null) {
            v().N = VoucherId.m299constructorimpl(string);
        }
        if (requireArguments().getBoolean("PRESELECTED_CURRENCY_VOUCHER", false)) {
            v().O = true;
        }
        cj.q qVarV3 = v();
        if (!qVarV3.f8334b0) {
            v80.f0.B(m1.d(qVarV3), null, null, new z1(qVarV3, cVar2, 2), 3);
        } else if (qVarV3.d() != null) {
            v80.f0.B(m1.d(qVarV3), null, null, new z1(qVarV3, cVar2, 1), 3);
        }
        boolean z11 = requireArguments().getBoolean("SHOULD_CANCEL", false);
        boolean z12 = requireArguments().getBoolean("USER_ABORTED", false);
        if (!z11 && !z12) {
            v().j();
        }
        cj.e0 e0VarU = u();
        u70.t tVar = e0VarU.M;
        if (e0VarU.i()) {
            aj.c cVar3 = (aj.c) e0VarU.f8209a.a("BASKET_CHECKOUT_DATA");
            if (cVar3 != null) {
                v80.f0.E(kotlin.coroutines.g.f26549a, new cj.u(e0VarU, cVar3, null));
            } else {
                ((av.e) tVar.getValue()).i(new Pair(new Exception("item null"), Boolean.FALSE));
            }
        } else {
            List listH = kotlin.collections.d0.h(ItemType.MANUFACTURER, ItemType.CATERING);
            BasicItem basicItemE = e0VarU.e();
            if (CollectionsKt.I(listH, basicItemE != null ? basicItemE.getItemType() : null)) {
                BasicItem basicItemE2 = e0VarU.e();
                if (basicItemE2 == null || (information = basicItemE2.getInformation()) == null) {
                    ((av.e) tVar.getValue()).i(new Pair(new Exception("item null"), Boolean.FALSE));
                } else {
                    String strMo340getItemIdFvU5WIY = information.mo340getItemIdFvU5WIY();
                    v80.f0.E(kotlin.coroutines.g.f26549a, new cj.x(e0VarU, null));
                    ItemId.m197boximpl(strMo340getItemIdFvU5WIY);
                }
            }
        }
        cj.q qVarV4 = v();
        g3 g3Var2 = qVarV4.f8333b;
        dv.b bVar = new dv.b();
        dv.a aVar = dv.a.SOURCE;
        Object obj = (String) qVarV4.f8331a.a("FILLER_TYPE");
        if (obj == null) {
            obj = "";
        }
        bVar.a(aVar, obj);
        dv.a aVar2 = dv.a.ITEM_ID;
        if (qVarV4.f8334b0) {
            aj.c cVarD = qVarV4.d();
            if (cVarD == null || (list2 = cVarD.f1494a) == null) {
                strC = kotlin.collections.c0.c("");
            } else {
                strC = new ArrayList(kotlin.collections.e0.o(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    strC.add(((BasketBriefItem) it.next()).getItemId());
                }
            }
        } else {
            BasicItem basicItemF = qVarV4.f();
            String strMo340getItemIdFvU5WIY2 = (basicItemF == null || (information2 = basicItemF.getInformation()) == null) ? null : information2.mo340getItemIdFvU5WIY();
            strC = strMo340getItemIdFvU5WIY2 == null ? "" : strMo340getItemIdFvU5WIY2;
        }
        bVar.a(aVar2, strC);
        dv.a aVar3 = dv.a.STORE_ID;
        BasicItem basicItemF2 = qVarV4.f();
        if (basicItemF2 == null || (storeInformationM3 = mv.d.m(basicItemF2)) == null || (objM370getStoreId7QsYvu8 = storeInformationM3.m370getStoreId7QsYvu8()) == null) {
            objM370getStoreId7QsYvu8 = null;
        }
        if (objM370getStoreId7QsYvu8 == null) {
            objM370getStoreId7QsYvu8 = "";
        }
        bVar.a(aVar3, objM370getStoreId7QsYvu8);
        bVar.a(dv.a.ITEM_TYPE, qVarV4.m());
        dv.a aVar4 = dv.a.ITEM_CATEGORY;
        BasicItem basicItemF3 = qVarV4.f();
        Object objName = (basicItemF3 == null || (information4 = basicItemF3.getInformation()) == null || (itemCategory = information4.getItemCategory()) == null) ? null : itemCategory.name();
        if (objName == null) {
            objName = "";
        }
        bVar.a(aVar4, objName);
        dv.a aVar5 = dv.a.BASKET_ID;
        aj.c cVarD2 = qVarV4.d();
        Object obj2 = cVarD2 != null ? cVarD2.f1496c : null;
        if (obj2 == null) {
            obj2 = "";
        }
        bVar.a(aVar5, obj2);
        dv.a aVar6 = dv.a.IS_LOCAL_HERO;
        BasicItem basicItemF4 = qVarV4.f();
        bVar.a(aVar6, (basicItemF4 == null || (storeInformationM2 = mv.d.m(basicItemF4)) == null) ? null : Boolean.valueOf(storeInformationM2.isLocalHero()));
        if (qVarV4.f() instanceof FlashSalesItem) {
            BasicItem basicItemF5 = qVarV4.f();
            dv.a aVar7 = dv.a.USER_MEAL_DISTANCE_METERS;
            if (basicItemF5 != null) {
                basicItem = basicItemF5;
                objValueOf = Integer.valueOf((int) (basicItemF5.getDistance() * ((double) 1000)));
            } else {
                basicItem = basicItemF5;
                objValueOf = null;
            }
            bVar.a(aVar7, objValueOf);
            dv.a aVar8 = dv.a.MINUTES_LEFT_TO_COLLECT;
            if (basicItem != null) {
                g3Var = g3Var2;
                objValueOf2 = Integer.valueOf((int) (mv.d.n(basicItem) / ((long) 60000)));
            } else {
                g3Var = g3Var2;
                objValueOf2 = null;
            }
            bVar.a(aVar8, objValueOf2);
            bVar.a(dv.a.MINUTES_TO_COLLECT_WHEN_LISTED, basicItem != null ? Integer.valueOf((int) (mv.d.n(basicItem) / ((long) 60000))) : null);
            bVar.a(dv.a.PICKUP_WINDOW_START_SECOND, (basicItem == null || (pickupIntervalL = mv.d.l(basicItem)) == null) ? null : pickupIntervalL.getPickupWindowStartSecond());
        } else {
            g3Var = g3Var2;
        }
        if (!g3Var.n().getUserHasPurchased()) {
            bVar.a(dv.a.FIRST_PURCHASE, Boolean.TRUE);
        }
        bVar.a(dv.a.DAYS_SINCE_LAST_PURCHASE, Integer.valueOf(g3Var.i()));
        dv.a aVar9 = dv.a.LAPSED_REACTIVATION_PURCHASE;
        int i11 = g3Var.i();
        bVar.a(aVar9, Boolean.valueOf(90 <= i11 && i11 < 365));
        bVar.a(dv.a.CHURNED_REACTIVATION_PURCHASE, Boolean.valueOf(g3Var.i() > 364));
        qVarV4.s(cv.i.CORE_PURCHASE_STARTED, bVar);
        cv.i iVar = cv.i.BRAZE_CORE_PURCHASE_STARTED;
        dv.a aVar10 = dv.a.STORE_NAME;
        BasicItem basicItemF6 = qVarV4.f();
        String storeNameAndBranch = (basicItemF6 == null || (storeInformationM = mv.d.m(basicItemF6)) == null) ? null : storeInformationM.getStoreNameAndBranch();
        if (storeNameAndBranch == null) {
            storeNameAndBranch = "";
        }
        Pair pair = new Pair(aVar10, new dv.c(storeNameAndBranch));
        dv.a aVar11 = dv.a.ITEM_ID;
        if (qVarV4.f8334b0) {
            aj.c cVarD3 = qVarV4.d();
            if (cVarD3 == null || (list = cVarD3.f1494a) == null) {
                objC = kotlin.collections.c0.c("");
            } else {
                objC = new ArrayList(kotlin.collections.e0.o(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    objC.add(((BasketBriefItem) it2.next()).getItemId());
                }
            }
        } else {
            BasicItem basicItemF7 = qVarV4.f();
            String strMo340getItemIdFvU5WIY3 = (basicItemF7 == null || (information3 = basicItemF7.getInformation()) == null) ? null : information3.mo340getItemIdFvU5WIY();
            objC = strMo340getItemIdFvU5WIY3 != null ? strMo340getItemIdFvU5WIY3 : "";
        }
        qVarV4.s(iVar, h0.g.E(pair, new Pair(aVar11, new dv.c(objC))));
        if (requireArguments().getBoolean("SHOULD_CANCEL", false)) {
            new Handler(Looper.getMainLooper()).postDelayed(new bg.u(this, requireArguments().getBoolean("SHOW_DIALOG", false), 2), 500L);
            strA = aj.e.CHECKOUT.a();
        } else if (requireArguments().getBoolean("NO_PROVIDER_INSTALLED", false)) {
            final int i12 = 0;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) { // from class: yi.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f46001b;

                {
                    this.f46001b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i13 = i12;
                    r rVar = this.f46001b;
                    switch (i13) {
                        case 0:
                            if (rVar.isAdded() && !rVar.requireActivity().isFinishing()) {
                                rVar.t("no payment provider installed");
                                k0 k0Var = new k0(rVar.requireActivity());
                                k0Var.e(R.string.missing_provider_popup_title);
                                k0Var.a(R.string.missing_provider_popup_description);
                                k0Var.c(android.R.string.ok);
                                k0Var.f6180k = true;
                                View viewRequireView = rVar.requireView();
                                viewRequireView.getClass();
                                k0Var.f6184p = viewRequireView;
                                k0Var.f();
                                break;
                            }
                            break;
                        default:
                            if (rVar.isAdded()) {
                                rVar.z(Integer.valueOf(R.string.order_has_been_canceled_popup_description), R.string.order_has_been_canceled_popup_title);
                                rVar.v().j();
                            }
                            break;
                    }
                }
            }, 100L);
            strA = aj.e.CHECKOUT.a();
        } else if (requireArguments().getBoolean("USER_ABORTED", false)) {
            final int i13 = 1;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) { // from class: yi.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f46001b;

                {
                    this.f46001b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i132 = i13;
                    r rVar = this.f46001b;
                    switch (i132) {
                        case 0:
                            if (rVar.isAdded() && !rVar.requireActivity().isFinishing()) {
                                rVar.t("no payment provider installed");
                                k0 k0Var = new k0(rVar.requireActivity());
                                k0Var.e(R.string.missing_provider_popup_title);
                                k0Var.a(R.string.missing_provider_popup_description);
                                k0Var.c(android.R.string.ok);
                                k0Var.f6180k = true;
                                View viewRequireView = rVar.requireView();
                                viewRequireView.getClass();
                                k0Var.f6184p = viewRequireView;
                                k0Var.f();
                                break;
                            }
                            break;
                        default:
                            if (rVar.isAdded()) {
                                rVar.z(Integer.valueOf(R.string.order_has_been_canceled_popup_description), R.string.order_has_been_canceled_popup_title);
                                rVar.v().j();
                            }
                            break;
                    }
                }
            }, 500L);
            strA = aj.e.CHECKOUT.a();
        } else {
            BasicItem basicItemF8 = v().f();
            ItemType itemType = basicItemF8 != null ? basicItemF8.getItemType() : null;
            strA = (itemType == null ? -1 : l.$EnumSwitchMapping$0[itemType.ordinal()]) == 1 ? aj.e.CHARITY.a() : aj.e.CHECKOUT.a();
        }
        ComposeView composeView = this.f46023o;
        if (composeView != null) {
            composeView.setContent(new u3.d(new c(this, strA, 1, (byte) 0), true, -383063906));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final void s(String str, m3.n nVar, int i11) {
        m3.s sVar;
        b1 b1Var;
        b1 b1Var2;
        int i12;
        Function1 function1;
        m3.s sVar2;
        ?? r12;
        m3.s sVar3;
        b1 b1Var3;
        m3.s sVar4;
        m3.s sVar5 = (m3.s) nVar;
        sVar5.c0(1036553822);
        int i13 = 2;
        int i14 = (sVar5.f(str) ? 4 : 2) | i11 | (sVar5.h(this) ? 32 : 16);
        if (sVar5.R(i14 & 1, (i14 & 19) != 18)) {
            this.f46018i = a.a.I(new t0[0], sVar5);
            Object objM = sVar5.M();
            Object obj = m3.m.f29332a;
            if (objM == obj) {
                objM = new g7();
                sVar5.k0(objM);
            }
            g7 g7Var = (g7) objM;
            Unit unit = Unit.f26487a;
            boolean zH = sVar5.h(this);
            Object objM2 = sVar5.M();
            x70.c cVar = null;
            if (zH || objM2 == obj) {
                objM2 = new tm.d(this, g7Var, cVar, 22);
                sVar5.k0(objM2);
            }
            m3.i.h(unit, (Function2) objM2, sVar5);
            b1 b1VarN = m3.i.n(v().f8345h, sVar5, 0);
            Object objM3 = sVar5.M();
            if (objM3 == obj) {
                objM3 = m3.i.w(Boolean.FALSE);
                sVar5.k0(objM3);
            }
            b1 b1Var4 = (b1) objM3;
            Object objM4 = sVar5.M();
            if (objM4 == obj) {
                objM4 = m3.i.w(Boolean.FALSE);
                sVar5.k0(objM4);
            }
            b1 b1Var5 = (b1) objM4;
            b1 b1VarN2 = m3.i.n(u().f8235z, sVar5, 0);
            if (((Boolean) b1VarN.getValue()).booleanValue()) {
                j4.s.y(-837801216, 0, sVar5, sVar5, false);
            } else {
                sVar5.a0(-837766620);
                sVar5.q(false);
            }
            if (((Boolean) b1Var4.getValue()).booleanValue()) {
                sVar5.a0(-837697397);
                Object objM5 = sVar5.M();
                if (objM5 == obj) {
                    objM5 = m3.i.o(kotlin.coroutines.g.f26549a, sVar5);
                    sVar5.k0(objM5);
                }
                v80.b0 b0Var = (v80.b0) objM5;
                w6 w6VarF = v3.f(6, 2, null, sVar5);
                WeakHashMap weakHashMap = z2.f13983w;
                float fA = d2.c.j(d2.b.e(sVar5).f13988e, sVar5).a();
                cj.q qVarV = v();
                boolean zH2 = sVar5.h(b0Var) | sVar5.f(w6VarF);
                Object objM6 = sVar5.M();
                if (zH2 || objM6 == obj) {
                    objM6 = new go.f(b0Var, w6VarF, b1Var4, 5);
                    sVar5.k0(objM6);
                }
                Function0 function0 = (Function0) objM6;
                b1Var = b1Var4;
                b1Var2 = b1Var5;
                m3.s sVar6 = sVar5;
                i12 = 6;
                function1 = null;
                vi.c.s(w6VarF, qVarV, function0, fA, sVar6, 0);
                sVar6.q(false);
                sVar2 = sVar6;
            } else {
                b1Var = b1Var4;
                b1Var2 = b1Var5;
                i12 = 6;
                m3.s sVar7 = sVar5;
                function1 = null;
                sVar7.a0(-836996828);
                sVar7.q(false);
                sVar2 = sVar7;
            }
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                sVar2.a0(-836910772);
                Object objM7 = sVar2.M();
                if (objM7 == obj) {
                    objM7 = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                    sVar2.k0(objM7);
                }
                v80.b0 b0Var2 = (v80.b0) objM7;
                w6 w6VarF2 = v3.f(i12, 2, function1, sVar2);
                WeakHashMap weakHashMap2 = z2.f13983w;
                float fA2 = d2.c.j(d2.b.e(sVar2).f13988e, sVar2).a();
                cj.e0 e0VarU = u();
                boolean zH3 = sVar2.h(b0Var2) | sVar2.f(w6VarF2);
                Object objM8 = sVar2.M();
                if (zH3 || objM8 == obj) {
                    objM8 = new go.f(b0Var2, w6VarF2, b1Var2, 4);
                    sVar2.k0(objM8);
                }
                Function0 function02 = (Function0) objM8;
                boolean zH4 = sVar2.h(this);
                Object objM9 = sVar2.M();
                if (zH4 || objM9 == obj) {
                    objM9 = new xq.a(i13, this, b1Var2);
                    sVar2.k0(objM9);
                }
                r12 = 0;
                m3.s sVar8 = sVar2;
                wi.a.j(w6VarF2, e0VarU, fA2, function02, (Function1) objM9, u().d(), sVar8, 0);
                m3.s sVar9 = sVar8;
                sVar9.q(false);
                sVar3 = sVar9;
            } else {
                r12 = 0;
                sVar2.a0(-835842140);
                sVar2.q(false);
                sVar3 = sVar2;
            }
            if (((Boolean) b1VarN2.getValue()).booleanValue()) {
                sVar3.a0(-835783240);
                Integer numValueOf = Integer.valueOf(R.string.mnu_checkout_address_postal_error_popup_title);
                Integer numValueOf2 = Integer.valueOf(R.string.catering_checkout_address_country_warning_uk);
                boolean zH5 = sVar3.h(this);
                Object objM10 = sVar3.M();
                if (zH5 || objM10 == obj) {
                    objM10 = new b(this, r12);
                    sVar3.k0(objM10);
                }
                Function0 function03 = (Function0) objM10;
                boolean zH6 = sVar3.h(this);
                Object objM11 = sVar3.M();
                if (zH6 || objM11 == obj) {
                    objM11 = new b(this, 1);
                    sVar3.k0(objM11);
                }
                m3.s sVar10 = sVar3;
                b1Var3 = b1Var2;
                cg.j.i(numValueOf, numValueOf2, null, null, R.string.mnu_checkout_address_postal_error_popup_cta, 0L, function03, null, null, 0L, 0L, (Function0) objM11, null, Integer.valueOf(R.drawable.delegate_wrong_region), sVar10, 0, 0, 6060);
                m3.s sVar11 = sVar10;
                u().m(cv.i.SCREEN_DELIVERY_NOT_AVAILABLE_POPUP);
                sVar11.q(r12);
                sVar4 = sVar11;
            } else {
                b1Var3 = b1Var2;
                sVar3.a0(-835187420);
                sVar3.q(r12);
                sVar4 = sVar3;
            }
            m3.s sVar12 = sVar4;
            x5.a(null, null, null, u3.e.e(-469987496, sVar4, new qk.i(g7Var, i13)), null, 0, i4.v.f23314g, 0L, null, u3.e.e(37870383, sVar4, new y1.d(1, this, str, b1Var, b1Var3)), sVar12, 806882304, 439);
            sVar = sVar12;
        } else {
            m3.s sVar13 = sVar5;
            sVar13.U();
            sVar = sVar13;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c(this, str, i11);
        }
    }

    public final void t(String str) {
        this.f46019j = false;
        v().b();
        v().s(cv.i.DEBUG_CHECKOUT_FAILED, h0.g.E(new Pair(dv.a.CHECKOUT_ERROR_CAUSE, new dv.c(aj.d.ORDER_ABORTED + " :" + str))));
    }

    public final cj.e0 u() {
        return (cj.e0) this.f46017h.getValue();
    }

    public final cj.q v() {
        return (cj.q) this.f46016g.getValue();
    }

    public final void w() {
        g9.l lVarH;
        g9.z zVar;
        g9.f0 f0Var = this.f46018i;
        String str = (f0Var == null || (lVarH = f0Var.f20186b.h()) == null || (zVar = lVarH.f20163b) == null) ? null : zVar.f20258b.f27564f;
        if (Intrinsics.areEqual(str, aj.e.PARCEL_ADDRESS_ENTRY.a()) || Intrinsics.areEqual(str, aj.e.PARCEL_PICKUP_OPTIONS.a())) {
            g9.f0 f0Var2 = this.f46018i;
            if (f0Var2 != null) {
                f0Var2.h();
                return;
            }
            return;
        }
        x();
        t("user backPressed");
        dismiss();
        v vVar = this.f46020k;
        if (vVar != null) {
            vVar.b();
        }
    }

    public final void x() {
        v().X.i(null);
        u().W.i(null);
        BasicItem basicItemF = v().f();
        if ((basicItemF != null ? basicItemF.getItemType() : null) == ItemType.MANUFACTURER) {
            v().s(cv.i.BRAZE_ACTION_DISBAND_PARCEL_CHECKOUT, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (((r13 == null || (r13 = r13.getInformation()) == null) ? null : r13.mo340getItemIdFvU5WIY()) == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yi.r.y(java.lang.String):void");
    }

    public final void z(Integer num, int i11) {
        if (isAdded()) {
            k0 k0Var = new k0(requireActivity());
            k0Var.e(i11);
            k0Var.c(R.string.order_has_been_canceled_popup_btn);
            k0Var.f6180k = true;
            View viewRequireView = requireView();
            viewRequireView.getClass();
            k0Var.f6184p = viewRequireView;
            if (num != null) {
                k0Var.a(num.intValue());
            }
            k0Var.f();
        }
    }
}
