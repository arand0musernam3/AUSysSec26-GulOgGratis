package com.app.tgtg.feature.main.fragments.delivery.basket.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import bg.k0;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.ManufacturerItemDetailsActivity;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.local.LatestBasketInteraction;
import com.app.tgtg.model.local.LatestInteractionOrigin;
import com.app.tgtg.model.local.payment.ResumePaymentData;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.manufacturer.request.BasketBriefItem;
import com.app.tgtg.model.remote.manufacturer.response.BasketResponse;
import com.app.tgtg.model.remote.manufacturer.response.GetRecommendedManufacturerItemsResponse;
import dn.n;
import dn.o;
import dv.d;
import e.f;
import e70.c;
import en.g;
import f70.i;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.o0;
import kotlin.collections.x0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import mr.e;
import mv.e0;
import pm.m;
import sg.b;
import um.j;
import um.l;
import um.t;
import um.u;
import v80.f0;
import xm.a;
import y80.a2;
import ym.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ParcelBasketActivity extends g implements b, u, z {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9111k = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f9112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f9113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e0 f9114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f9115j;

    public ParcelBasketActivity() {
        super(3);
        this.f9113h = new n1(Reflection.getOrCreateKotlinClass(t.class), new j(this, 1), new j(this, 0), new j(this, 2));
        this.f9115j = new e(this, 10);
    }

    public final t E() {
        return (t) this.f9113h.getValue();
    }

    @Override // um.u
    public final void c() {
        t tVarE = E();
        if (tVarE.f41435k) {
            return;
        }
        tVarE.i(false);
        tVarE.f41435k = true;
        tVarE.j();
    }

    @Override // ym.z
    public final a2 d() {
        return E().f41446w;
    }

    @Override // ym.z
    public final void f() {
        E().k(d.PER_BASKET_LIMIT_REACHED);
        k0 k0Var = new k0(this);
        k0Var.e(R.string.mnu_basket_screen_status_max_popup_title);
        k0Var.a(R.string.mnu_basket_screen_status_max_popup_body);
        k0Var.f6178i = R.drawable.parcel_max_blob;
        k0Var.c(R.string.mnu_basket_screen_status_fee_popup_cta_okay);
        k0Var.f();
    }

    @Override // ym.z
    public final BasketManager g() {
        return E().f41434j;
    }

    @Override // um.u
    public final void h(o oVar) {
        n nVar = oVar.f15034a;
        if (nVar != null) {
            e0 e0Var = this.f9114i;
            if (e0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impressionHelper");
                e0Var = null;
            }
            E().f29971a.f29975c.a(e0.c(e0Var, nVar, cv.g.BASKET_SCREEN, oVar.f15038e, oVar.f15036c, oVar.f15037d));
        }
    }

    @Override // ym.z
    public final void i(String str, int i11, boolean z11) {
        Object value;
        Object value2;
        GetRecommendedManufacturerItemsResponse getRecommendedManufacturerItemsResponseCopy;
        ArrayList arrayList;
        str.getClass();
        t tVarE = E();
        BasketManager basketManager = tVarE.f41434j;
        int quantity = basketManager != null ? basketManager.getQuantity(str) : 0;
        if (quantity != i11 && basketManager != null) {
            basketManager.setQuantity(str, i11, i11 > quantity ? LatestBasketInteraction.ADD : LatestBasketInteraction.REMOVE, LatestInteractionOrigin.SCREEN_BASKET);
        }
        a2 a2Var = tVarE.f41445v;
        do {
            value = a2Var.getValue();
        } while (!a2Var.g(value, x0.h((Map) value, new Pair(ItemId.m197boximpl(str), Integer.valueOf(i11)))));
        if (i11 == 0) {
            BasketManager basketManager2 = E().f41434j;
            x70.c cVar = null;
            if ((basketManager2 != null ? basketManager2.getLatestBasketInteraction() : null) == LatestBasketInteraction.SWIPE_TO_REMOVE) {
                t tVarE2 = E();
                a2 a2Var2 = tVarE2.f41443t;
                do {
                    value2 = a2Var2.getValue();
                    GetRecommendedManufacturerItemsResponse getRecommendedManufacturerItemsResponse = (GetRecommendedManufacturerItemsResponse) value2;
                    if (getRecommendedManufacturerItemsResponse != null) {
                        List<BaseItemMnuV2> recommendedItems = getRecommendedManufacturerItemsResponse.getRecommendedItems();
                        if (recommendedItems != null) {
                            arrayList = new ArrayList();
                            for (Object obj : recommendedItems) {
                                if (!ItemId.m201equalsimpl0(((BaseItemMnuV2) obj).m393getItemIdFvU5WIY(), str)) {
                                    arrayList.add(obj);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        getRecommendedManufacturerItemsResponseCopy = getRecommendedManufacturerItemsResponse.copy(arrayList);
                    } else {
                        getRecommendedManufacturerItemsResponseCopy = null;
                    }
                } while (!a2Var2.g(value2, getRecommendedManufacturerItemsResponseCopy));
                BaseItemMnuV2 baseItemMnuV2 = (BaseItemMnuV2) tVarE2.f41441r.getValue();
                String strM393getItemIdFvU5WIY = baseItemMnuV2 != null ? baseItemMnuV2.m393getItemIdFvU5WIY() : null;
                if (strM393getItemIdFvU5WIY != null ? ItemId.m201equalsimpl0(strM393getItemIdFvU5WIY, str) : false) {
                    f0.B(m1.d(tVarE2), null, null, new l(tVarE2, cVar, 3), 3);
                }
            }
        }
        if (z11) {
            E().j();
        }
    }

    @Override // um.u
    public final void j(String str, i iVar) {
        str.getClass();
        iVar.getClass();
        a aVar = E().f41430f;
        aVar.getClass();
        f70.g gVar = aVar.f44467a;
        mk.c cVar = new mk.c(str, ManufacturerItemDetailsActivity.class);
        cVar.f29986i = iVar;
        gVar.a(cVar.a());
    }

    @Override // um.u
    public final void l(um.g gVar) {
        List<BasketBriefItem> basketItems;
        gVar.getClass();
        x70.c cVar = null;
        if (um.i.$EnumSwitchMapping$0[gVar.ordinal()] == 3) {
            t tVarE = E();
            f0.B(m1.d(tVarE), null, null, new l(tVarE, cVar, 1), 3);
            BasketManager basketManager = E().f41434j;
            if (basketManager == null || (basketItems = basketManager.getBasketItems()) == null || !basketItems.isEmpty()) {
                E().j();
            } else {
                t tVarE2 = E();
                BasketResponse basketResponse = (BasketResponse) tVarE2.f41439p.getValue();
                if (basketResponse != null) {
                    tVarE2.l(basketResponse, true);
                }
                p();
            }
        }
        t tVarE3 = E();
        f0.B(m1.d(tVarE3), null, null, new tm.d(tVarE3, cVar, cVar, 7), 3);
    }

    @Override // sg.b
    public final void m() {
        E().i(true);
    }

    @Override // um.u
    public final void o(String str) {
        str.getClass();
        t tVarE = E();
        f0.B(m1.d(tVarE), null, null, new l(tVarE, null, 0), 3);
        tVarE.j();
    }

    @Override // en.g, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        o30.f0.S(this, false);
        super.onCreate(bundle);
        this.f16141d = this;
        E().C.e(this, new al.c(new sg.c(this, 9), 12));
        c cVar = this.f9112g;
        x70.c cVar2 = null;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        c.b(cVar, this, null, 6);
        getOnBackPressedDispatcher().a(this.f9115j);
        f.a(this, new u3.d(new m(this, 14), true, 1217333414));
        z((ResumePaymentData) f0.E(kotlin.coroutines.g.f26549a, new l(E(), cVar2, 2)));
    }

    @Override // en.g, k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f9115j.remove();
    }

    @Override // en.g, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        if (intent.hasExtra("ITEM_ID")) {
            finish();
            startActivity(intent, mv.a.b(this));
            return;
        }
        E().d(cv.i.DEBUG_ADYEN_REDIRECT_HANDLE_INTENT, h0.g.E(new Pair(dv.a.TYPE, new dv.c(intent.getDataString()))));
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("PaymentFragment");
        yi.f0 f0Var = fragmentFindFragmentByTag instanceof yi.f0 ? (yi.f0) fragmentFindFragmentByTag : null;
        if (f0Var != null) {
            f0Var.E(intent);
        }
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onPause() {
        super.onPause();
        t tVarE = E();
        f0.B(m1.d(tVarE), null, null, new l(tVarE, null, 1), 3);
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        super.onResume();
        a2 a2Var = E().f41445v;
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        a2Var.getClass();
        a2Var.k(null, o0Var);
        if (BasketManager.INSTANCE.isBasketValid(E().f41434j, E().f41433i)) {
            E().B = true;
            E().j();
            return;
        }
        t tVarE = E();
        BasketResponse basketResponse = (BasketResponse) tVarE.f41439p.getValue();
        if (basketResponse != null) {
            tVarE.l(basketResponse, true);
        }
        getOnBackPressedDispatcher().d();
    }

    @Override // um.u
    public final void p() {
        getOnBackPressedDispatcher().d();
    }

    @Override // um.u
    public final void r() {
        List<BasketBriefItem> basketItems;
        E().f41429e.f4432q = 0L;
        t tVarE = E();
        BasketManager basketManager = tVarE.f41434j;
        if (basketManager != null && basketManager.getTotalBasketItems() == 0) {
            tVarE.d(cv.i.BASKET_STATE, h0.g.E(new Pair(dv.a.BASKET_ID, new dv.c(basketManager.m184getBasketIdM00Rnn0(tVarE.f41428d.m().m285getUserId8nKqa5U()))), new Pair(dv.a.CREATED_AT, new dv.c(new Date(basketManager.getCreatedAt()))), new Pair(dv.a.IS_EMPTY, new dv.c(Boolean.valueOf(basketManager.getTotalBasketItems() == 0)))));
        }
        BasketManager basketManager2 = E().f41434j;
        if (basketManager2 == null || (basketItems = basketManager2.getBasketItems()) == null || !basketItems.isEmpty()) {
            E().j();
            return;
        }
        t tVarE2 = E();
        BasketResponse basketResponse = (BasketResponse) tVarE2.f41439p.getValue();
        if (basketResponse != null) {
            tVarE2.l(basketResponse, true);
        }
        p();
    }

    @Override // um.u
    public final void s(um.g gVar) {
        gVar.getClass();
        int i11 = um.i.$EnumSwitchMapping$0[gVar.ordinal()];
        if (i11 == 1) {
            E().k(d.PER_BASKET_LIMIT_REACHED);
        } else if (i11 == 2) {
            E().k(d.DELIVERY_FEE);
        }
        t tVarE = E();
        f0.B(m1.d(tVarE), null, null, new tm.d(tVarE, gVar, null, 7), 3);
    }
}
