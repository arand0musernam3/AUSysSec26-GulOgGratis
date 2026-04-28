package com.app.tgtg.feature.catering.ui;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n1;
import c40.q;
import com.app.tgtg.model.remote.item.CateringItemInformation;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.CateringItem;
import com.google.android.gms.internal.measurement.cg;
import cv.i;
import e70.c;
import en.g;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import pg.n;
import sg.b;
import u70.l;
import u70.t;
import uh.a;
import vh.d;
import vh.e;
import yi.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class CateringItemDetailsActivity extends g implements b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f8972o = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f8973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f8974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f8975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f8976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n f8977k;
    public final n1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f8978m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final mr.e f8979n;

    public CateringItemDetailsActivity() {
        super(2);
        this.l = new n1(Reflection.getOrCreateKotlinClass(uh.g.class), new uh.e(this, 1), new uh.e(this, 0), new uh.e(this, 2));
        this.f8978m = l.b(new a(this, 0));
        this.f8979n = new mr.e(this, 9);
    }

    public final d E() {
        d dVar = this.f8974h;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("detailsFaq");
        return null;
    }

    public final uh.g F() {
        return (uh.g) this.l.getValue();
    }

    public final void G() {
        CateringItemInformation information;
        String strM370getStoreId7QsYvu8;
        StoreInformation storeInformationM;
        CateringItemInformation information2;
        String strM370getStoreId7QsYvu82;
        StoreInformation storeInformationM2;
        CateringItemInformation information3;
        ArrayList arrayList = E().f42332d;
        String strMo340getItemIdFvU5WIY = null;
        if (cg.q(arrayList)) {
            uh.g gVarF = F();
            i iVar = i.TEMP_ACTION_SEE_ITEM_FAQ;
            Pair pair = new Pair(dv.a.SEEN, new dv.c(arrayList));
            dv.a aVar = dv.a.ITEM_ID;
            CateringItem cateringItem = (CateringItem) F().f41159i.d();
            Pair pair2 = new Pair(aVar, new dv.c((cateringItem == null || (information3 = cateringItem.getInformation()) == null) ? null : information3.mo340getItemIdFvU5WIY()));
            dv.a aVar2 = dv.a.STORE_ID;
            CateringItem cateringItem2 = (CateringItem) F().f41159i.d();
            if (cateringItem2 == null || (storeInformationM2 = mv.d.m(cateringItem2)) == null || (strM370getStoreId7QsYvu82 = storeInformationM2.m370getStoreId7QsYvu8()) == null) {
                strM370getStoreId7QsYvu82 = null;
            }
            gVarF.d(iVar, h0.g.E(pair, pair2, new Pair(aVar2, new dv.c(strM370getStoreId7QsYvu82))));
        }
        ArrayList arrayList2 = E().f42331c;
        if (cg.q(arrayList2)) {
            uh.g gVarF2 = F();
            i iVar2 = i.TEMP_ACTION_UNFOLD_ITEM_FAQ;
            Pair pair3 = new Pair(dv.a.UNFOLDED, new dv.c(arrayList2));
            dv.a aVar3 = dv.a.ITEM_ID;
            CateringItem cateringItem3 = (CateringItem) F().f41159i.d();
            Pair pair4 = new Pair(aVar3, new dv.c((cateringItem3 == null || (information2 = cateringItem3.getInformation()) == null) ? null : information2.mo340getItemIdFvU5WIY()));
            dv.a aVar4 = dv.a.STORE_ID;
            CateringItem cateringItem4 = (CateringItem) F().f41159i.d();
            if (cateringItem4 == null || (storeInformationM = mv.d.m(cateringItem4)) == null || (strM370getStoreId7QsYvu8 = storeInformationM.m370getStoreId7QsYvu8()) == null) {
                strM370getStoreId7QsYvu8 = null;
            }
            gVarF2.d(iVar2, h0.g.E(pair3, pair4, new Pair(aVar4, new dv.c(strM370getStoreId7QsYvu8))));
        }
        ArrayList arrayList3 = E().f42333e;
        if (cg.q(arrayList3)) {
            uh.g gVarF3 = F();
            i iVar3 = i.TEMP_ACTION_CLICK_FAQ_LINK;
            Pair pair5 = new Pair(dv.a.CLICKED, new dv.c(arrayList3));
            dv.a aVar5 = dv.a.ITEM_ID;
            CateringItem cateringItem5 = (CateringItem) F().f41159i.d();
            if (cateringItem5 != null && (information = cateringItem5.getInformation()) != null) {
                strMo340getItemIdFvU5WIY = information.mo340getItemIdFvU5WIY();
            }
            gVarF3.d(iVar3, h0.g.E(pair5, new Pair(aVar5, new dv.c(strMo340getItemIdFvU5WIY))));
        }
    }

    @Override // sg.b
    public final void m() {
        n nVar = this.f8977k;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            nVar = null;
        }
        nVar.f35003v.setEnabled(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011a  */
    @Override // en.g, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.feature.catering.ui.CateringItemDetailsActivity.onCreate(android.os.Bundle):void");
    }

    @Override // en.g, k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f8979n.remove();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n nVar = this.f8977k;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            nVar = null;
        }
        nVar.E.setVisibility(8);
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
        F().d(i.DEBUG_ADYEN_REDIRECT_HANDLE_INTENT, h0.g.E(new Pair(dv.a.TYPE, new dv.c(intent.getDataString()))));
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("PaymentFragment");
        f0 f0Var = fragmentFindFragmentByTag instanceof f0 ? (f0) fragmentFindFragmentByTag : null;
        if (f0Var != null) {
            f0Var.E(intent);
        }
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (F().f29972b) {
            mk.a.e(F(), (BasicItem) F().f41159i.d());
        }
    }
}
