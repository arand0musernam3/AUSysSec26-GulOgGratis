package com.app.tgtg.feature.main.fragments.browse.map.bottomSheet;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c;
import androidx.lifecycle.p;
import androidx.lifecycle.s1;
import b4.q;
import c5.a;
import c5.x1;
import cn.w;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.BasicItemInformation;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.braze.h2;
import com.google.firebase.messaging.a0;
import d40.t1;
import eg.k;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import m2.c2;
import m3.b1;
import m3.d3;
import m3.f;
import m3.i;
import m3.k1;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import m90.z;
import o30.e0;
import om.o;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pm.j;
import pm.t;
import pm.y;
import s1.r0;
import s1.y0;
import sm.b;
import tm.e;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class MapBottomSheet extends a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f9095y = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f9096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k1 f9097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k1 f9098k;
    public Function1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Function1 f9099m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Function1 f9100n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Function0 f9101o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9102p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9103q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Function1 f9104r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Function1 f9105s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Function0 f9106t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Function0 f9107u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k1 f9108v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Function0 f9109w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f9110x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapBottomSheet(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.f9096i = i.w(null);
        this.f9097j = i.w(null);
        this.f9098k = i.w(null);
        this.l = t.f35539c;
        this.f9099m = t.f35538b;
        this.f9100n = new nv.a(20);
        this.f9101o = new p9.a(7);
        this.f9104r = new nv.a(21);
        this.f9105s = new nv.a(22);
        this.f9106t = new p9.a(8);
        this.f9107u = new p9.a(9);
        this.f9108v = i.w(b.DEFAULT);
        this.f9109w = new p9.a(10);
        Rect rectC = d70.b.c();
        float fFloatValue = Integer.valueOf(rectC.right).floatValue();
        u70.t tVar = d70.b.f14569a;
        Object value = tVar.getValue();
        value.getClass();
        float f11 = fFloatValue / ((DisplayMetrics) value).density;
        float fFloatValue2 = Integer.valueOf(rectC.bottom).floatValue();
        Object value2 = tVar.getValue();
        value2.getClass();
        this.f9110x = 96 / new RectF(0.0f, 0.0f, f11, fFloatValue2 / ((DisplayMetrics) value2).density).height();
    }

    @Override // c5.a
    public final void a(n nVar, int i11) {
        e eVar;
        Object cVar;
        MapBottomSheet mapBottomSheet = this;
        s sVar = (s) nVar;
        sVar.c0(193209121);
        int i12 = (sVar.h(mapBottomSheet) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            s1 s1VarA = z8.a.a(sVar);
            if (s1VarA == null) {
                h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            e eVar2 = (e) t1.K(Reflection.getOrCreateKotlinClass(e.class), s1VarA, e0.r(s1VarA, sVar), s1VarA instanceof p ? ((p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar);
            j.Hidden.e(Float.valueOf(mapBottomSheet.f9110x));
            j jVarE = eVar2.e();
            if (jVarE == null) {
                jVarE = j.HalfExpanded;
            }
            Object objM = sVar.M();
            f fVar = m.f29332a;
            if (objM == fVar) {
                objM = i.w(jVarE);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = i.w(Boolean.FALSE);
                sVar.k0(objM2);
            }
            b1 b1Var2 = (b1) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = i.w(Boolean.FALSE);
                sVar.k0(objM3);
            }
            b1 b1Var3 = (b1) objM3;
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = i.w(Boolean.FALSE);
                sVar.k0(objM4);
            }
            b1 b1Var4 = (b1) objM4;
            j jVar = (j) b1Var.getValue();
            boolean zH = sVar.h(mapBottomSheet);
            Object objM5 = sVar.M();
            if (zH || objM5 == fVar) {
                objM5 = new pm.n(mapBottomSheet, 1);
                sVar.k0(objM5);
            }
            Function1 function1 = (Function1) objM5;
            boolean zH2 = sVar.h(mapBottomSheet);
            Object objM6 = sVar.M();
            if (zH2 || objM6 == fVar) {
                objM6 = new c2(13, mapBottomSheet, b1Var3);
                sVar.k0(objM6);
            }
            Function1 function12 = (Function1) objM6;
            jVar.getClass();
            t1.b1 b1Var5 = pm.b.f35490a;
            Object objM7 = sVar.M();
            if (objM7 == fVar) {
                objM7 = new nv.a(19);
                sVar.k0(objM7);
            }
            Function1 function13 = (Function1) objM7;
            Object objM8 = sVar.M();
            if (objM8 == fVar) {
                objM8 = new p9.a(6);
                sVar.k0(objM8);
            }
            sVar.Y(-192460130, jVar);
            a0 a0Var = new a0(jVar, (Function0) objM8, function1, function12, b1Var5, s1.k1.a(sVar), function13);
            sVar.q(false);
            Object objM9 = sVar.M();
            if (objM9 == fVar) {
                objM9 = i.o(g.f26549a, sVar);
                sVar.k0(objM9);
            }
            b0 b0Var = (b0) objM9;
            boolean zH3 = sVar.h(b0Var) | sVar.f(a0Var);
            Object objM10 = sVar.M();
            if (zH3 || objM10 == fVar) {
                objM10 = new z(24, b0Var, a0Var);
                sVar.k0(objM10);
            }
            mapBottomSheet.f9106t = (Function0) objM10;
            boolean zH4 = sVar.h(b0Var) | sVar.h(mapBottomSheet) | sVar.f(a0Var) | sVar.h(eVar2);
            Object objM11 = sVar.M();
            if (zH4 || objM11 == fVar) {
                eVar = eVar2;
                cVar = new c(19, b0Var, this, a0Var, eVar);
                mapBottomSheet = this;
                a0Var = a0Var;
                sVar.k0(cVar);
            } else {
                cVar = objM11;
                eVar = eVar2;
            }
            mapBottomSheet.f9107u = (Function0) cVar;
            Boolean bool = (Boolean) b1Var2.getValue();
            bool.getClass();
            boolean zH5 = sVar.h(eVar) | sVar.f(a0Var);
            Object objM12 = sVar.M();
            if (zH5 || objM12 == fVar) {
                e eVar3 = eVar;
                nk.j jVar2 = new nk.j(eVar3, a0Var, b1Var2, null, 12);
                sVar.k0(jVar2);
                objM12 = jVar2;
            }
            i.h(bool, (Function2) objM12, sVar);
            d3 d3Var = x1.f7416h;
            i.a(b3.i.t(((z5.c) sVar.j(d3Var)).a(), 1.0f, d3Var), u3.e.e(261486177, sVar, new bn.z(mapBottomSheet, eVar, a0Var, b1Var4, b1Var3, b1Var2, 4)), sVar, 56);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new pm.m(mapBottomSheet, i11, 0);
        }
    }

    public final float getCollapsedSheetFractionValue() {
        return this.f9110x;
    }

    @NotNull
    public final b getCurrentLocationButtonState() {
        return (b) this.f9108v.getValue();
    }

    @NotNull
    public final Function0<Unit> getHideBottomSheet() {
        return this.f9106t;
    }

    @Nullable
    public final Long getListScrollToTopRequestId() {
        return (Long) this.f9097j.getValue();
    }

    @Nullable
    public final o getMarkerType() {
        return (o) this.f9098k.getValue();
    }

    @NotNull
    public final Function0<Unit> getOnCurrentLocationButtonClicked() {
        return this.f9109w;
    }

    @NotNull
    public final Function1<BasicItem, Unit> getOnFavoriteClicked() {
        return this.f9100n;
    }

    @NotNull
    public final Function1<ItemId, Unit> getOnFlashSalesItemCardClicked() {
        return this.f9099m;
    }

    @NotNull
    public final Function1<Boolean, Unit> getOnFullyExpanded() {
        return this.f9104r;
    }

    @NotNull
    public final Function1<ItemId, Unit> getOnItemCardClicked() {
        return this.l;
    }

    @NotNull
    public final Function0<Unit> getOnListButtonClicked() {
        return this.f9101o;
    }

    @NotNull
    public final Function1<Boolean, Unit> getOnSheetReachedTheTopView() {
        return this.f9105s;
    }

    @Nullable
    public final y getSheetData() {
        return (y) this.f9096i.getValue();
    }

    @NotNull
    public final Function0<Unit> getShowBottomSheet() {
        return this.f9107u;
    }

    public final int getTopOffset() {
        return this.f9102p;
    }

    public final int getTopViewHeightDp() {
        return this.f9103q;
    }

    public final void i(List list, boolean z11, boolean z12, Function0 function0, Function1 function1, Function1 function12, Function1 function13, n nVar, int i11) {
        w1 w1VarS;
        pm.o oVar;
        BasicItemInformation information;
        s sVar = (s) nVar;
        sVar.c0(1154048947);
        int i12 = i11 | (sVar.h(list) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.g(z12) ? 256 : 128) | (sVar.h(function0) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(function1) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.h(function12) ? 131072 : 65536) | (sVar.h(function13) ? 1048576 : 524288) | (sVar.h(this) ? 8388608 : 4194304);
        if (!sVar.R(i12 & 1, (4793491 & i12) != 4793490)) {
            sVar.U();
        } else {
            if (list.isEmpty()) {
                w1VarS = sVar.s();
                if (w1VarS != null) {
                    oVar = new pm.o(this, list, z11, z12, function0, function1, function12, function13, i11, 0);
                    w1VarS.f29476d = oVar;
                }
                return;
            }
            BasicItem basicItem = (BasicItem) CollectionsKt.firstOrNull(list);
            String strMo340getItemIdFvU5WIY = (basicItem == null || (information = basicItem.getInformation()) == null) ? null : information.mo340getItemIdFvU5WIY();
            if (strMo340getItemIdFvU5WIY != null) {
                sVar.a0(-940510204);
                sVar.Y(939492710, ItemId.m197boximpl(strMo340getItemIdFvU5WIY));
                Object objM = sVar.M();
                f fVar = m.f29332a;
                if (objM == fVar) {
                    objM = i.w(Boolean.FALSE);
                    sVar.k0(objM);
                }
                b1 b1Var = (b1) objM;
                Unit unit = Unit.f26487a;
                Object objM2 = sVar.M();
                if (objM2 == fVar) {
                    objM2 = new co.j(b1Var, null, 4);
                    sVar.k0(objM2);
                }
                i.h(unit, (Function2) objM2, sVar);
                s1.y.d(((Boolean) b1Var.getValue()).booleanValue(), null, r0.d(t1.c.k(600, 0, null, 6), 2), y0.f38731b, null, u3.e.e(908416806, sVar, new cg.b(function0, z11, list, this, z12, function1, function13, function12)), sVar, 196992, 18);
                sVar.q(false);
                sVar.q(false);
            } else {
                sVar.a0(-939054289);
                sVar.q(false);
            }
        }
        w1VarS = sVar.s();
        if (w1VarS != null) {
            oVar = new pm.o(this, list, z11, z12, function0, function1, function12, function13, i11, 1);
            w1VarS.f29476d = oVar;
        }
    }

    public final void j(BasicItem basicItem, boolean z11, Function1 function1, Function1 function12, Function1 function13, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1973770855);
        int i12 = i11 | (sVar.h(basicItem) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(function1) ? 256 : 128) | (sVar.h(function12) ? 2048 : 1024) | (sVar.h(function13) ? 16384 : 8192);
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            float f11 = lv.t.f28251e;
            float f12 = lv.t.f28253g;
            float f13 = lv.t.f28252f;
            b4.t tVarC = d2.c.C(q.f5711a, f13, f11, f13, f12);
            boolean z12 = ((i12 & 896) == 256) | ((57344 & i12) == 16384);
            Object objM = sVar.M();
            f fVar = m.f29332a;
            if (z12 || objM == fVar) {
                objM = new pm.p(function13, function1, 0);
                sVar.k0(objM);
            }
            Function1 function14 = (Function1) objM;
            boolean zH = sVar.h(basicItem) | ((i12 & 7168) == 2048);
            Object objM2 = sVar.M();
            if (zH || objM2 == fVar) {
                objM2 = new k(function12, basicItem, 2);
                sVar.k0(objM2);
            }
            t1.m(tVarC, basicItem, false, false, false, z11, function14, (Function0) objM2, null, sVar, ((i12 << 3) & 112) | MLKEMEngine.KyberPolyBytes | ((i12 << 12) & 458752), 280);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new w(this, basicItem, z11, function1, function12, function13, i11);
        }
    }

    public final void setCurrentLocationButtonState(@NotNull b bVar) {
        bVar.getClass();
        this.f9108v.setValue(bVar);
    }

    public final void setHideBottomSheet(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.f9106t = function0;
    }

    public final void setListScrollToTopRequestId(@Nullable Long l) {
        this.f9097j.setValue(l);
    }

    public final void setMarkerType(@Nullable o oVar) {
        this.f9098k.setValue(oVar);
    }

    public final void setOnCurrentLocationButtonClicked(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.f9109w = function0;
    }

    public final void setOnFavoriteClicked(@NotNull Function1<? super BasicItem, Unit> function1) {
        function1.getClass();
        this.f9100n = function1;
    }

    public final void setOnFlashSalesItemCardClicked(@NotNull Function1<? super ItemId, Unit> function1) {
        function1.getClass();
        this.f9099m = function1;
    }

    public final void setOnFullyExpanded(@NotNull Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        this.f9104r = function1;
    }

    public final void setOnItemCardClicked(@NotNull Function1<? super ItemId, Unit> function1) {
        function1.getClass();
        this.l = function1;
    }

    public final void setOnListButtonClicked(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.f9101o = function0;
    }

    public final void setOnSheetReachedTheTopView(@NotNull Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        this.f9105s = function1;
    }

    public final void setSheetData(@Nullable y yVar) {
        this.f9096i.setValue(yVar);
    }

    public final void setShowBottomSheet(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.f9107u = function0;
    }

    public final void setTopOffset(int i11) {
        this.f9102p = i11;
    }

    public final void setTopViewHeightDp(int i11) {
        this.f9103q = i11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapBottomSheet(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapBottomSheet(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ MapBottomSheet(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
