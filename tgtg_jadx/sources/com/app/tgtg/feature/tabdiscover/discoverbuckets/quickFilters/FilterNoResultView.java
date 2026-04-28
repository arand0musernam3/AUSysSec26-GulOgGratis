package com.app.tgtg.feature.tabdiscover.discoverbuckets.quickFilters;

import android.content.Context;
import android.util.AttributeSet;
import c5.a;
import g3.y0;
import jt.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z20.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class FilterNoResultView extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f9287m = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f9288i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f9289j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f9290k;
    public Function0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterNoResultView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.l = new jq.a(9);
    }

    @Override // c5.a
    public final void a(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(1445697513);
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            String str = this.f9288i;
            String str2 = this.f9289j;
            String str3 = this.f9290k;
            boolean zH = sVar.h(this);
            Object objM = sVar.M();
            if (zH || objM == m.f29332a) {
                objM = new g(this, 12);
                sVar.k0(objM);
            }
            b.e(str, str2, str3, (Function0) objM, sVar, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new y0(this, i11, 27);
        }
    }

    @Nullable
    public final String getFilterNoResultButton() {
        return this.f9290k;
    }

    @Nullable
    public final String getFilterNoResultSubText() {
        return this.f9289j;
    }

    @Nullable
    public final String getFilterNoResultTitle() {
        return this.f9288i;
    }

    @NotNull
    public final Function0<Unit> getOnRemoveBtnClicked() {
        return this.l;
    }

    public final void setFilterNoResultButton(@Nullable String str) {
        this.f9290k = str;
    }

    public final void setFilterNoResultSubText(@Nullable String str) {
        this.f9289j = str;
    }

    public final void setFilterNoResultTitle(@Nullable String str) {
        this.f9288i = str;
    }

    public final void setOnRemoveBtnClicked(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.l = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilterNoResultView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilterNoResultView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ FilterNoResultView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
