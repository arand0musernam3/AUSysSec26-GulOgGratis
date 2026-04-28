package com.app.tgtg.feature.recipegenerator.ui;

import android.content.Context;
import android.util.AttributeSet;
import c5.a;
import com.app.tgtg.feature.recipegenerator.ui.DiscoverRecipeGeneratorPromoView;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import g3.y0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lp.d;
import m3.f;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class DiscoverRecipeGeneratorPromoView extends a {
    public static final /* synthetic */ int l = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Function0 f9245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Function0 f9246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DiscoverBucket f9247k;

    public /* synthetic */ DiscoverRecipeGeneratorPromoView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // c5.a
    public final void a(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1631597602);
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            DiscoverBucket discoverBucket = this.f9247k;
            boolean zH = sVar.h(this);
            Object objM = sVar.M();
            f fVar = m.f29332a;
            if (zH || objM == fVar) {
                final int i13 = 0;
                objM = new Function0(this) { // from class: kp.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ DiscoverRecipeGeneratorPromoView f26633b;

                    {
                        this.f26633b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                Function0 function0 = this.f26633b.f9245i;
                                if (function0 != null) {
                                    function0.invoke();
                                }
                                break;
                            default:
                                Function0 function02 = this.f26633b.f9246j;
                                if (function02 != null) {
                                    function02.invoke();
                                }
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar.k0(objM);
            }
            Function0 function0 = (Function0) objM;
            boolean zH2 = sVar.h(this);
            Object objM2 = sVar.M();
            if (zH2 || objM2 == fVar) {
                final int i14 = 1;
                objM2 = new Function0(this) { // from class: kp.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ DiscoverRecipeGeneratorPromoView f26633b;

                    {
                        this.f26633b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                Function0 function02 = this.f26633b.f9245i;
                                if (function02 != null) {
                                    function02.invoke();
                                }
                                break;
                            default:
                                Function0 function022 = this.f26633b.f9246j;
                                if (function022 != null) {
                                    function022.invoke();
                                }
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar.k0(objM2);
            }
            d.s(null, discoverBucket, function0, (Function0) objM2, false, sVar, 0, 17);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new y0(this, i11, 26);
        }
    }

    @Nullable
    public final DiscoverBucket getBucket() {
        return this.f9247k;
    }

    @Nullable
    public final Function0<Unit> getOnDismiss() {
        return this.f9246j;
    }

    @Nullable
    public final Function0<Unit> getOnRecipeGeneratorPromoCardClicked() {
        return this.f9245i;
    }

    public final void setBucket(@Nullable DiscoverBucket discoverBucket) {
        this.f9247k = discoverBucket;
    }

    public final void setOnDismiss(@Nullable Function0<Unit> function0) {
        this.f9246j = function0;
    }

    public final void setOnRecipeGeneratorPromoCardClicked(@Nullable Function0<Unit> function0) {
        this.f9245i = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DiscoverRecipeGeneratorPromoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoverRecipeGeneratorPromoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DiscoverRecipeGeneratorPromoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
