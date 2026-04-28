package com.app.tgtg.feature.main.fragments.delivery.parcelfeed.compose.vertitems;

import android.content.Context;
import android.util.AttributeSet;
import c5.a;
import cn.u;
import cn.y;
import com.app.tgtg.model.remote.item.response.SortingChoice;
import g3.v3;
import g3.w6;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m3.i;
import m3.k1;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import o00.x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class DeliverySortingBottomSheet extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f9133m = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f9134i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k1 f9135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Function2 f9136k;
    public final k1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliverySortingBottomSheet(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.f9134i = i.w(n0.f26529a);
        this.f9135j = i.w(null);
        this.f9136k = new u(3, (byte) 0);
        this.l = i.w(Boolean.FALSE);
    }

    @Override // c5.a
    public final void a(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(354989437);
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            w6 w6VarF = v3.f(0, 3, null, sVar);
            List<SortingChoice> sortingChoices = getSortingChoices();
            String selectedSortingId = getSelectedSortingId();
            boolean showBs = getShowBs();
            boolean zH = sVar.h(this);
            Object objM = sVar.M();
            if (zH || objM == m.f29332a) {
                objM = new y(this);
                sVar.k0(objM);
            }
            x0.c(sortingChoices, selectedSortingId, w6VarF, showBs, (Function2) objM, sVar, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new y(this, i11);
        }
    }

    @NotNull
    public final Function2<SortingChoice, Boolean, Unit> getOnSelectSorting() {
        return this.f9136k;
    }

    @Nullable
    public final String getSelectedSortingId() {
        return (String) this.f9135j.getValue();
    }

    public final boolean getShowBs() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    @NotNull
    public final List<SortingChoice> getSortingChoices() {
        return (List) this.f9134i.getValue();
    }

    public final void setOnSelectSorting(@NotNull Function2<? super SortingChoice, ? super Boolean, Unit> function2) {
        function2.getClass();
        this.f9136k = function2;
    }

    public final void setSelectedSortingId(@Nullable String str) {
        this.f9135j.setValue(str);
    }

    public final void setShowBs(boolean z11) {
        this.l.setValue(Boolean.valueOf(z11));
    }

    public final void setSortingChoices(@NotNull List<SortingChoice> list) {
        list.getClass();
        this.f9134i.setValue(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeliverySortingBottomSheet(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeliverySortingBottomSheet(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ DeliverySortingBottomSheet(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
