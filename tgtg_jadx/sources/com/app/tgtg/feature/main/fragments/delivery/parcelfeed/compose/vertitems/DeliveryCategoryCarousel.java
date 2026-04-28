package com.app.tgtg.feature.main.fragments.delivery.parcelfeed.compose.vertitems;

import a3.f1;
import a3.r2;
import android.content.Context;
import android.util.AttributeSet;
import c5.a;
import cn.u;
import com.app.tgtg.model.remote.item.response.CategoryNavigationCard;
import f2.e0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m3.h1;
import m3.i;
import m3.k1;
import m3.n;
import m3.s;
import m3.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class DeliveryCategoryCarousel extends a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f9125q = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f9126i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k1 f9127j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k1 f9128k;
    public final k1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h1 f9129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Function2 f9130n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Function2 f9131o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Function2 f9132p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryCategoryCarousel(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        n0 n0Var = n0.f26529a;
        this.f9126i = i.w(n0Var);
        this.f9127j = i.w("");
        this.f9128k = i.w(Boolean.FALSE);
        this.l = i.w(n0Var);
        this.f9129m = new h1(0);
        this.f9130n = new r2(29);
        byte b8 = 0;
        this.f9131o = new u(0, b8);
        this.f9132p = new u(1, b8);
    }

    @Override // c5.a
    public final void a(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-173878495);
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            lx.u.a(new cn.a(getCategoryList(), getSelectedId(), getOldIndex(), ((Boolean) this.f9128k.getValue()).booleanValue(), e0.a(0, 0, 0, 3, sVar), getHasNavigationImpressionList()), this.f9131o, this.f9130n, this.f9132p, sVar, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f1(this, i11, 17);
        }
    }

    @NotNull
    public final List<CategoryNavigationCard> getCategoryList() {
        return (List) this.f9126i.getValue();
    }

    @NotNull
    public final List<Integer> getHasNavigationImpressionList() {
        return (List) this.l.getValue();
    }

    public final int getOldIndex() {
        return this.f9129m.h();
    }

    @NotNull
    public final Function2<String, Integer, Unit> getOnCategoryScrolledTo() {
        return this.f9131o;
    }

    @NotNull
    public final Function2<Integer, String, Unit> getOnImpression() {
        return this.f9130n;
    }

    @NotNull
    public final Function2<String, String, Unit> getOnSelectCategory() {
        return this.f9132p;
    }

    @NotNull
    public final String getSelectedId() {
        return (String) this.f9127j.getValue();
    }

    public final void setCategoryList(@NotNull List<CategoryNavigationCard> list) {
        list.getClass();
        this.f9126i.setValue(list);
    }

    public final void setHasNavigationImpressionList(@NotNull List<Integer> list) {
        list.getClass();
        this.l.setValue(list);
    }

    public final void setNewCategory(boolean z11) {
        this.f9128k.setValue(Boolean.valueOf(z11));
    }

    public final void setOldIndex(int i11) {
        this.f9129m.i(i11);
    }

    public final void setOnCategoryScrolledTo(@NotNull Function2<? super String, ? super Integer, Unit> function2) {
        function2.getClass();
        this.f9131o = function2;
    }

    public final void setOnImpression(@NotNull Function2<? super Integer, ? super String, Unit> function2) {
        function2.getClass();
        this.f9130n = function2;
    }

    public final void setOnSelectCategory(@NotNull Function2<? super String, ? super String, Unit> function2) {
        function2.getClass();
        this.f9132p = function2;
    }

    public final void setSelectedId(@NotNull String str) {
        str.getClass();
        this.f9127j.setValue(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeliveryCategoryCarousel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeliveryCategoryCarousel(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ DeliveryCategoryCarousel(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
