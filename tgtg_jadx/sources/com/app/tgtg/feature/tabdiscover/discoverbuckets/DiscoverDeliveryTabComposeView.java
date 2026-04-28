package com.app.tgtg.feature.tabdiscover.discoverbuckets;

import android.content.Context;
import android.util.AttributeSet;
import c5.a;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import g3.y0;
import hi.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class DiscoverDeliveryTabComposeView extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9268k = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DiscoverBucket f9269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Function0 f9270j;

    public /* synthetic */ DiscoverDeliveryTabComposeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // c5.a
    public final void a(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-78187537);
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            DiscoverBucket discoverBucket = this.f9269i;
            boolean zH = sVar.h(this);
            Object objM = sVar.M();
            if (zH || objM == m.f29332a) {
                objM = new d(this, 3);
                sVar.k0(objM);
            }
            b.d(discoverBucket, (Function0) objM, null, sVar, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new y0(this, i11, 9);
        }
    }

    @Nullable
    public final DiscoverBucket getBucket() {
        return this.f9269i;
    }

    @Nullable
    public final Function0<Unit> getOnButtonClicked() {
        return this.f9270j;
    }

    public final void setBucket(@Nullable DiscoverBucket discoverBucket) {
        this.f9269i = discoverBucket;
    }

    public final void setOnButtonClicked(@Nullable Function0<Unit> function0) {
        this.f9270j = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DiscoverDeliveryTabComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoverDeliveryTabComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DiscoverDeliveryTabComposeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
