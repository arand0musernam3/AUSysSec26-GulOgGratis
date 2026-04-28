package com.app.tgtg.feature.tabdiscover.discoverbuckets.quickFilters;

import android.content.Context;
import android.util.AttributeSet;
import c5.a;
import com.app.tgtg.model.remote.item.QuickFilter;
import g3.y0;
import java.util.ArrayList;
import java.util.List;
import k9.f;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m3.i;
import m3.k1;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class QuickFilterView extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9291k = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f9292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Function1 f9293j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickFilterView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.f9292i = i.w(n0.f26529a);
        this.f9293j = new f(4);
    }

    private final List<QuickFilter> getActiveFilterIds() {
        List<QuickFilter> quickFilterList = getQuickFilterList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : quickFilterList) {
            QuickFilter quickFilter = (QuickFilter) obj;
            if (quickFilter.getEnabled() && !Intrinsics.areEqual(quickFilter.getId(), "ALL")) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9 A[LOOP:2: B:35:0x00e3->B:37:0x00e9, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Unit i(com.app.tgtg.feature.tabdiscover.discoverbuckets.quickFilters.QuickFilterView r12, com.app.tgtg.model.remote.item.QuickFilter r13) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.feature.tabdiscover.discoverbuckets.quickFilters.QuickFilterView.i(com.app.tgtg.feature.tabdiscover.discoverbuckets.quickFilters.QuickFilterView, com.app.tgtg.model.remote.item.QuickFilter):kotlin.Unit");
    }

    @Override // c5.a
    public final void a(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1852072409);
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        if (!sVar.R(i12 & 1, (i12 & 3) != 2)) {
            sVar.U();
        } else if (getQuickFilterList().isEmpty()) {
            sVar.a0(-1938910853);
            sVar.q(false);
        } else {
            sVar.a0(-1939185699);
            List<QuickFilter> quickFilterList = getQuickFilterList();
            boolean zH = sVar.h(this);
            Object objM = sVar.M();
            if (zH || objM == m.f29332a) {
                objM = new jd.a(this, 14);
                sVar.k0(objM);
            }
            a.a.p(quickFilterList, (Function1) objM, sVar, 0);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new y0(this, i11, 28);
        }
    }

    @NotNull
    public final Function1<List<QuickFilter>, Unit> getOnFilterClicked() {
        return this.f9293j;
    }

    @NotNull
    public final List<QuickFilter> getQuickFilterList() {
        return (List) this.f9292i.getValue();
    }

    public final void setOnFilterClicked(@NotNull Function1<? super List<QuickFilter>, Unit> function1) {
        function1.getClass();
        this.f9293j = function1;
    }

    public final void setQuickFilterList(@NotNull List<QuickFilter> list) {
        list.getClass();
        this.f9292i.setValue(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickFilterView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickFilterView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ QuickFilterView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
