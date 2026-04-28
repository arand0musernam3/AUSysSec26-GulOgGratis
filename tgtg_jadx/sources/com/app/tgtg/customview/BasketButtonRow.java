package com.app.tgtg.customview;

import a3.f1;
import android.content.Context;
import android.util.AttributeSet;
import bg.f;
import bg.g;
import bg.m;
import c5.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: loaded from: classes.dex */
public final class BasketButtonRow extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f8878t = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Function0 f8879i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Function0 f8880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Function0 f8881k;
    public Function0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h1 f8882m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h1 f8883n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k1 f8884o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k1 f8885p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k1 f8886q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k1 f8887r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k1 f8888s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasketButtonRow(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.f8879i = new bg.a(0);
        this.f8880j = new bg.a(1);
        this.f8881k = new bg.a(2);
        this.l = new bg.a(3);
        this.f8882m = new h1(0);
        this.f8883n = new h1(5);
        this.f8884o = i.w("");
        Boolean bool = Boolean.FALSE;
        this.f8885p = i.w(bool);
        this.f8886q = i.w(bool);
        this.f8887r = i.w(g.REGULAR);
        this.f8888s = i.w(bool);
    }

    @Override // c5.a
    public final void a(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(871845785);
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            m.a(this.f8879i, this.f8880j, this.f8881k, this.l, new f(getQuantity(), getStock(), getButtonText(), ((Boolean) this.f8885p.getValue()).booleanValue(), ((Boolean) this.f8886q.getValue()).booleanValue(), getButtonType(), getLoading()), sVar, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f1(this, i11, 8);
        }
    }

    @NotNull
    public final Function0<Unit> getAddQuantity() {
        return this.f8879i;
    }

    @NotNull
    public final String getButtonText() {
        return (String) this.f8884o.getValue();
    }

    @NotNull
    public final g getButtonType() {
        return (g) this.f8887r.getValue();
    }

    public final boolean getLoading() {
        return ((Boolean) this.f8888s.getValue()).booleanValue();
    }

    @NotNull
    public final Function0<Unit> getOnReserveClick() {
        return this.f8881k;
    }

    @NotNull
    public final Function0<Unit> getOnShowMaxLimitPopup() {
        return this.l;
    }

    public final int getQuantity() {
        return this.f8882m.h();
    }

    @NotNull
    public final Function0<Unit> getRemoveQuantity() {
        return this.f8880j;
    }

    public final int getStock() {
        return this.f8883n.h();
    }

    public final void setAddQuantity(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.f8879i = function0;
    }

    public final void setAtMaxLimit(boolean z11) {
        this.f8885p.setValue(Boolean.valueOf(z11));
    }

    public final void setButtonText(@NotNull String str) {
        str.getClass();
        this.f8884o.setValue(str);
    }

    public final void setButtonType(@NotNull g gVar) {
        gVar.getClass();
        this.f8887r.setValue(gVar);
    }

    public final void setLoading(boolean z11) {
        this.f8888s.setValue(Boolean.valueOf(z11));
    }

    public final void setOnReserveClick(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.f8881k = function0;
    }

    public final void setOnShowMaxLimitPopup(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.l = function0;
    }

    public final void setQuantity(int i11) {
        this.f8882m.i(i11);
    }

    public final void setRemoveQuantity(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.f8880j = function0;
    }

    public final void setReserveBtnVisible(boolean z11) {
        this.f8886q.setValue(Boolean.valueOf(z11));
    }

    public final void setStock(int i11) {
        this.f8883n.i(i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BasketButtonRow(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BasketButtonRow(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ BasketButtonRow(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
