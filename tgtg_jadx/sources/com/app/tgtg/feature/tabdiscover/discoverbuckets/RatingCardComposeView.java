package com.app.tgtg.feature.tabdiscover.discoverbuckets;

import android.content.Context;
import android.util.AttributeSet;
import c5.a;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.order.Order;
import g3.q9;
import g3.y0;
import hi.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m3.f;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class RatingCardComposeView extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f9277m = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Order f9278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public DiscoverBucket f9279j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Function0 f9280k;
    public Function1 l;

    public /* synthetic */ RatingCardComposeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // c5.a
    public final void a(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(1081345395);
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            Order order = this.f9278i;
            DiscoverBucket discoverBucket = this.f9279j;
            boolean zH = sVar.h(this);
            Object objM = sVar.M();
            f fVar = m.f29332a;
            if (zH || objM == fVar) {
                objM = new d(this, 6);
                sVar.k0(objM);
            }
            Function0 function0 = (Function0) objM;
            boolean zH2 = sVar.h(this);
            Object objM2 = sVar.M();
            if (zH2 || objM2 == fVar) {
                objM2 = new q9(this, 18);
                sVar.k0(objM2);
            }
            w.j(order, discoverBucket, function0, (Function1) objM2, null, sVar, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new y0(this, i11, 13);
        }
    }

    @Nullable
    public final DiscoverBucket getBucket() {
        return this.f9279j;
    }

    @Nullable
    public final Function0<Unit> getOnCloseClicked() {
        return this.f9280k;
    }

    @Nullable
    public final Function1<Integer, Unit> getOnRatingSelected() {
        return this.l;
    }

    @Nullable
    public final Order getOrder() {
        return this.f9278i;
    }

    public final void setBucket(@Nullable DiscoverBucket discoverBucket) {
        this.f9279j = discoverBucket;
    }

    public final void setOnCloseClicked(@Nullable Function0<Unit> function0) {
        this.f9280k = function0;
    }

    public final void setOnRatingSelected(@Nullable Function1<? super Integer, Unit> function1) {
        this.l = function1;
    }

    public final void setOrder(@Nullable Order order) {
        this.f9278i = order;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RatingCardComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingCardComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RatingCardComposeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
