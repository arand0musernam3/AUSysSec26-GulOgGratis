package com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails;

import a3.f1;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.lifecycle.z;
import com.app.tgtg.R;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.ManufacturerItemInformation;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.ManufacturerItem;
import com.app.tgtg.model.remote.manufacturer.request.BasketBriefItem;
import com.app.tgtg.model.remote.manufacturer.response.ItemDetailsFaqItem;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerInformation;
import com.google.android.gms.internal.measurement.cg;
import com.google.firebase.messaging.a0;
import cv.i;
import d2.x;
import dv.a;
import e70.c;
import en.e;
import en.f;
import en.g;
import en.j;
import en.k;
import en.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d0;
import kotlin.collections.x0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import mv.d;
import mv.e0;
import mv.r0;
import pg.a2;
import pg.i2;
import pg.k2;
import sg.b;
import u70.l;
import u70.t;
import yi.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class ManufacturerItemDetailsActivity extends g implements b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f9137q = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e0 f9138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f9139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f9140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public en.b f9141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f9142k;
    public a0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a2 f9143m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n1 f9144n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f9145o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final androidx.activity.e0 f9146p;

    public ManufacturerItemDetailsActivity() {
        super(0);
        this.f9144n = new n1(Reflection.getOrCreateKotlinClass(o.class), new k(1, this), new k(0, this), new k(2, this));
        this.f9145o = l.b(new cw.b(this, 7));
        this.f9146p = new androidx.activity.e0(this, 9);
    }

    public final en.b E() {
        en.b bVar = this.f9141j;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bottomButtons");
        return null;
    }

    public final e F() {
        e eVar = this.f9140i;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("detailsFaq");
        return null;
    }

    public final o G() {
        return (o) this.f9144n.getValue();
    }

    public final void H() {
        ManufacturerItemInformation information;
        String strM370getStoreId7QsYvu8;
        StoreInformation storeInformationM;
        ManufacturerItemInformation information2;
        String strM370getStoreId7QsYvu82;
        StoreInformation storeInformationM2;
        ManufacturerItemInformation information3;
        ArrayList arrayList = F().f16129d;
        String strMo340getItemIdFvU5WIY = null;
        if (cg.q(arrayList)) {
            o oVarG = G();
            i iVar = i.TEMP_ACTION_SEE_ITEM_FAQ;
            Pair pair = new Pair(a.SEEN, new dv.c(arrayList));
            a aVar = a.ITEM_ID;
            ManufacturerItem manufacturerItem = (ManufacturerItem) G().f16177m.d();
            Pair pair2 = new Pair(aVar, new dv.c((manufacturerItem == null || (information3 = manufacturerItem.getInformation()) == null) ? null : information3.mo340getItemIdFvU5WIY()));
            a aVar2 = a.STORE_ID;
            ManufacturerItem manufacturerItem2 = (ManufacturerItem) G().f16177m.d();
            if (manufacturerItem2 == null || (storeInformationM2 = d.m(manufacturerItem2)) == null || (strM370getStoreId7QsYvu82 = storeInformationM2.m370getStoreId7QsYvu8()) == null) {
                strM370getStoreId7QsYvu82 = null;
            }
            oVarG.d(iVar, h0.g.E(pair, pair2, new Pair(aVar2, new dv.c(strM370getStoreId7QsYvu82))));
        }
        ArrayList arrayList2 = F().f16128c;
        if (cg.q(arrayList2)) {
            o oVarG2 = G();
            i iVar2 = i.TEMP_ACTION_UNFOLD_ITEM_FAQ;
            Pair pair3 = new Pair(a.UNFOLDED, new dv.c(arrayList2));
            a aVar3 = a.ITEM_ID;
            ManufacturerItem manufacturerItem3 = (ManufacturerItem) G().f16177m.d();
            Pair pair4 = new Pair(aVar3, new dv.c((manufacturerItem3 == null || (information2 = manufacturerItem3.getInformation()) == null) ? null : information2.mo340getItemIdFvU5WIY()));
            a aVar4 = a.STORE_ID;
            ManufacturerItem manufacturerItem4 = (ManufacturerItem) G().f16177m.d();
            if (manufacturerItem4 == null || (storeInformationM = d.m(manufacturerItem4)) == null || (strM370getStoreId7QsYvu8 = storeInformationM.m370getStoreId7QsYvu8()) == null) {
                strM370getStoreId7QsYvu8 = null;
            }
            oVarG2.d(iVar2, h0.g.E(pair3, pair4, new Pair(aVar4, new dv.c(strM370getStoreId7QsYvu8))));
        }
        ArrayList arrayList3 = F().f16130e;
        if (cg.q(arrayList3)) {
            o oVarG3 = G();
            i iVar3 = i.TEMP_ACTION_CLICK_FAQ_LINK;
            Pair pair5 = new Pair(a.CLICKED, new dv.c(arrayList3));
            a aVar5 = a.ITEM_ID;
            ManufacturerItem manufacturerItem5 = (ManufacturerItem) G().f16177m.d();
            if (manufacturerItem5 != null && (information = manufacturerItem5.getInformation()) != null) {
                strMo340getItemIdFvU5WIY = information.mo340getItemIdFvU5WIY();
            }
            oVarG3.d(iVar3, h0.g.E(pair5, new Pair(aVar5, new dv.c(strMo340getItemIdFvU5WIY))));
        }
    }

    public final void I(ManufacturerItem manufacturerItem, boolean z11) {
        a2 a2Var = this.f9143m;
        if (a2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            a2Var = null;
        }
        k2 k2Var = a2Var.H;
        ManufacturerInformation manufacturerInformation = manufacturerItem.getInformation().getManufacturerInformation();
        if ((manufacturerInformation != null ? manufacturerInformation.getBottleDeposit() : null) == null) {
            ManufacturerInformation manufacturerInformation2 = manufacturerItem.getInformation().getManufacturerInformation();
            if (manufacturerInformation2 != null && manufacturerInformation2.isFreeDelivery()) {
                k2Var.f34952q.setVisibility(0);
                k2Var.l.setVisibility(0);
                return;
            } else {
                if (z11) {
                    return;
                }
                k2Var.E.setVisibility(8);
                return;
            }
        }
        ImageView imageView = k2Var.f34940d;
        TextView textView = k2Var.f34956u;
        TextView textView2 = k2Var.f34955t;
        TextView textView3 = k2Var.f34941e;
        imageView.setVisibility(0);
        textView3.setVisibility(0);
        textView3.setText(r0.f(this, d.m(manufacturerItem).getStoreLocation().getAddress().getPickupCountry().getIsoCode()));
        if (z11) {
            textView2.setVisibility(0);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = getResources().getString(R.string.mnu_bottle_deposit_excl);
            string.getClass();
            textView2.setText(String.format(string, Arrays.copyOf(new Object[]{d.i(manufacturerItem.getInformation().getManufacturerInformation().getBottleDeposit(), 1)}, 1)));
            return;
        }
        textView.setVisibility(0);
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String string2 = getResources().getString(R.string.mnu_bottle_deposit_excl);
        string2.getClass();
        textView.setText(String.format(string2, Arrays.copyOf(new Object[]{d.i(manufacturerItem.getInformation().getManufacturerInformation().getBottleDeposit(), 1)}, 1)));
    }

    public final void J(int i11, Integer num, int i12) {
        G().f(i11, num, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v9, types: [pg.a2] */
    public final void K() {
        ViewGroup viewGroup;
        ManufacturerItem manufacturerItem = (ManufacturerItem) G().f16177m.d();
        if (manufacturerItem == null) {
            return;
        }
        e eVarF = F();
        ManufacturerInformation manufacturerInformation = manufacturerItem.getInformation().getManufacturerInformation();
        ViewGroup viewGroup2 = null;
        List<ItemDetailsFaqItem> faqList = manufacturerInformation != null ? manufacturerInformation.getFaqList() : null;
        z zVarC = m1.c(this);
        int iIntValue = ((Number) this.f9145o.getValue()).intValue();
        eVarF.getClass();
        eVarF.f16134i = iIntValue;
        int i11 = 0;
        eVarF.f16136k = new en.d(eVarF, faqList, zVarC, i11);
        eVarF.f16135j = new en.c(eVarF, faqList, zVarC, i11);
        a2 a2Var = this.f9143m;
        if (a2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            a2Var = null;
        }
        k2 k2Var = a2Var.H;
        MotionLayout motionLayout = a2Var.I;
        k2Var.f34947k.setVisibility(0);
        a2Var.H.f34947k.setText(getResources().getString(R.string.mnu_item_details_faq_title));
        motionLayout.getClass();
        motionLayout.getViewTreeObserver().addOnGlobalLayoutListener(new j(motionLayout, this, manufacturerItem, i11));
        en.d dVar = F().f16136k;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preCollapseListener");
            dVar = null;
        }
        motionLayout.setTransitionListener(dVar);
        ViewTreeObserver viewTreeObserver = motionLayout.getViewTreeObserver();
        en.c cVar = F().f16135j;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("postCollapseListener");
            cVar = null;
        }
        viewTreeObserver.addOnScrollChangedListener(cVar);
        e eVarF2 = F();
        LayoutInflater layoutInflater = getLayoutInflater();
        layoutInflater.getClass();
        f1 f1Var = new f1(this, 26);
        ArrayList arrayList = eVarF2.f16127b;
        a2 a2Var2 = eVarF2.f16126a;
        ManufacturerInformation manufacturerInformation2 = manufacturerItem.getInformation().getManufacturerInformation();
        List<ItemDetailsFaqItem> faqList2 = manufacturerInformation2 != null ? manufacturerInformation2.getFaqList() : null;
        if (faqList2 == null || faqList2.isEmpty()) {
            viewGroup = null;
            a2Var2.H.f34947k.setVisibility(8);
        } else {
            a2Var2.H.f34946j.removeAllViews();
            List<ItemDetailsFaqItem> faqList3 = manufacturerItem.getInformation().getManufacturerInformation().getFaqList();
            if (faqList3 != null) {
                int i12 = 0;
                for (Object obj : faqList3) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        ?? r19 = viewGroup2;
                        d0.n();
                        throw r19;
                    }
                    ItemDetailsFaqItem itemDetailsFaqItem = (ItemDetailsFaqItem) obj;
                    int i14 = i2.B;
                    DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
                    i2 i2Var = (i2) a8.k.Z(layoutInflater, R.layout.mnu_faq_item, viewGroup2, false, viewGroup2);
                    i2Var.getClass();
                    arrayList.add(i2Var);
                    bs.b bVar = new bs.b(27, f1Var, itemDetailsFaqItem);
                    ((i2) arrayList.get(i12)).f34913x.setText(itemDetailsFaqItem.getQuestion());
                    LinearLayout linearLayout = ((i2) arrayList.get(i12)).A;
                    linearLayout.getClass();
                    d.x(linearLayout, new x(itemDetailsFaqItem, eVarF2, i12, this, bVar, 1));
                    eVarF2.c(i12, this);
                    a2Var2.H.f34946j.addView(((i2) arrayList.get(i12)).f986f);
                    i12 = i13;
                    viewGroup2 = viewGroup2;
                }
            }
            viewGroup = viewGroup2;
        }
        if (manufacturerItem.getInformation().isEdible()) {
            jg.c cVar2 = jg.c.DK;
            boolean zAreEqual = Intrinsics.areEqual(cVar2.toString(), d.m(manufacturerItem).getStoreLocation().getAddress().getPickupCountry().getIsoCode());
            a2 a2Var3 = this.f9143m;
            ?? r22 = a2Var3;
            if (a2Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                r22 = viewGroup;
            }
            String country = Locale.getDefault().getCountry();
            country.getClass();
            Drawable drawable = Intrinsics.areEqual(country, jg.c.BE.toString()) ? getDrawable(R.drawable.see_smell_taste_be) : Intrinsics.areEqual(country, cVar2.toString()) ? getDrawable(R.drawable.see_smell_taste_dk) : Intrinsics.areEqual(country, jg.c.FR.toString()) ? getDrawable(R.drawable.see_smell_taste_fr) : Intrinsics.areEqual(country, jg.c.IT.toString()) ? getDrawable(R.drawable.see_smell_taste_it) : Intrinsics.areEqual(country, jg.c.NL.toString()) ? getDrawable(R.drawable.see_smell_taste_nl) : (Intrinsics.areEqual(country, jg.c.DE.toString()) || Intrinsics.areEqual(country, jg.c.AT.toString())) ? getDrawable(R.drawable.see_smell_taste_de) : Intrinsics.areEqual(country, jg.c.ES.toString()) ? getDrawable(R.drawable.see_smell_taste_es) : Intrinsics.areEqual(country, jg.c.PT.toString()) ? getDrawable(R.drawable.see_smell_taste_pt) : Intrinsics.areEqual(country, jg.c.PL.toString()) ? getDrawable(R.drawable.see_smell_taste_pl) : getDrawable(R.drawable.see_smell_taste_gb);
            ManufacturerInformation manufacturerInformation3 = manufacturerItem.getInformation().getManufacturerInformation();
            if (Intrinsics.areEqual("PETFOOD", manufacturerInformation3 != null ? manufacturerInformation3.getParcelType() : viewGroup)) {
                if (!Intrinsics.areEqual(cVar2.toString(), d.m(manufacturerItem).getStoreLocation().getAddress().getPickupCountry().getIsoCode())) {
                    r22.H.f34948m.setVisibility(8);
                }
            } else if (drawable != null) {
                r22.H.f34948m.setVisibility(0);
                r22.H.f34960y.setImageDrawable(drawable);
            }
            if (zAreEqual) {
                k2 k2Var2 = r22.H;
                k2Var2.f34948m.setVisibility(0);
                ImageView imageView = k2Var2.f34961z;
                imageView.setVisibility(0);
                String str = Intrinsics.areEqual(Locale.getDefault().getCountry(), cVar2.toString()) ? "Kontrol rapport" : "Inspection Report";
                imageView.setImageResource(2131231608);
                d.x(imageView, new ek.a(2, this, str));
            }
        }
    }

    @Override // sg.b
    public final void m() {
        a2 a2Var = this.f9143m;
        if (a2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            a2Var = null;
        }
        a2Var.f34775x.setEnabled(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013b  */
    @Override // en.g, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.ManufacturerItemDetailsActivity.onCreate(android.os.Bundle):void");
    }

    @Override // en.g, k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f9146p.remove();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a2 a2Var = this.f9143m;
        if (a2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            a2Var = null;
        }
        a2Var.G.setVisibility(8);
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
        G().d(i.DEBUG_ADYEN_REDIRECT_HANDLE_INTENT, h0.g.E(new Pair(a.TYPE, new dv.c(intent.getDataString()))));
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("PaymentFragment");
        f0 f0Var = fragmentFindFragmentByTag instanceof f0 ? (f0) fragmentFindFragmentByTag : null;
        if (f0Var != null) {
            f0Var.E(intent);
        }
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        List<BasketBriefItem> basketItems;
        Object value;
        super.onResume();
        o oVarG = G();
        BasketManager basketManagerRestoreBasketManager = new BasketManager(null, null, 0L, 0L, 0, null, null, 127, null).restoreBasketManager(oVarG.f16173h, oVarG.g());
        oVarG.f16175j = basketManagerRestoreBasketManager;
        if (basketManagerRestoreBasketManager != null && (basketItems = basketManagerRestoreBasketManager.getBasketItems()) != null) {
            for (BasketBriefItem basketBriefItem : basketItems) {
                y80.a2 a2Var = oVarG.f16186v;
                do {
                    value = a2Var.getValue();
                } while (!a2Var.g(value, x0.h((Map) value, new Pair(ItemId.m197boximpl(ItemId.m198constructorimpl(basketBriefItem.getItemId())), Integer.valueOf(basketBriefItem.getItemCount())))));
            }
        }
        if (G().f29972b) {
            mk.a.e(G(), (BasicItem) G().f16177m.d());
        }
    }
}
