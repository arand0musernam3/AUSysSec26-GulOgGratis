package com.app.tgtg.feature.tabdiscover.discoverbuckets.loyaltycardpromo;

import android.content.Context;
import android.util.AttributeSet;
import c5.a;
import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails;
import g3.y0;
import i2.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m3.b1;
import m3.f;
import m3.i;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class DiscoverLoyaltyCardPromoView extends a {
    public static final /* synthetic */ int l = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LoyaltyCardDetails f9284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Function1 f9285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Function0 f9286k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoverLoyaltyCardPromoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.f9285j = new im.a(19);
        this.f9286k = new iu.a(29);
    }

    @Override // c5.a
    public final void a(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(1879094790);
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            Object objM = sVar.M();
            f fVar = m.f29332a;
            if (objM == fVar) {
                objM = i.w(Boolean.TRUE);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.a0(-490731077);
                LoyaltyCardDetails loyaltyCardDetails = this.f9284i;
                boolean zH = sVar.h(this);
                Object objM2 = sVar.M();
                if (zH || objM2 == fVar) {
                    objM2 = new jd.a(this, 2);
                    sVar.k0(objM2);
                }
                Function1 function1 = (Function1) objM2;
                boolean zH2 = sVar.h(this);
                Object objM3 = sVar.M();
                if (zH2 || objM3 == fVar) {
                    objM3 = new e(12, this, b1Var);
                    sVar.k0(objM3);
                }
                a.a.h(loyaltyCardDetails, function1, (Function0) objM3, sVar, 0);
                sVar.q(false);
            } else {
                sVar.a0(-490422596);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new y0(this, i11, 23);
        }
    }

    @Nullable
    public final LoyaltyCardDetails getLoyaltyCardDetails() {
        return this.f9284i;
    }

    @NotNull
    public final Function1<LoyaltyCardDetails, Unit> getOnLoyaltyCardPromoClicked() {
        return this.f9285j;
    }

    @NotNull
    public final Function0<Unit> getOnLoyaltyCardPromoDismissed() {
        return this.f9286k;
    }

    public final void setLoyaltyCardDetails(@Nullable LoyaltyCardDetails loyaltyCardDetails) {
        this.f9284i = loyaltyCardDetails;
    }

    public final void setOnLoyaltyCardPromoClicked(@NotNull Function1<? super LoyaltyCardDetails, Unit> function1) {
        function1.getClass();
        this.f9285j = function1;
    }

    public final void setOnLoyaltyCardPromoDismissed(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.f9286k = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DiscoverLoyaltyCardPromoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DiscoverLoyaltyCardPromoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ DiscoverLoyaltyCardPromoView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
