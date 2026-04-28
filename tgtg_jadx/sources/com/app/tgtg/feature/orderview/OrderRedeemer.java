package com.app.tgtg.feature.orderview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c50.p;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.order.OrderType;
import fo.a;
import fo.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mv.d;
import mv.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.g;
import pg.z2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class OrderRedeemer extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f9158c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z2 f9159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f9160b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderRedeemer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        OrderType.Companion companion = OrderType.INSTANCE;
        int i12 = 0;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.order_redeemer_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i13 = R.id.accessibilityContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) g.t(R.id.accessibilityContainer, viewInflate);
        if (constraintLayout != null) {
            i13 = R.id.btnCollect;
            Button button = (Button) g.t(R.id.btnCollect, viewInflate);
            if (button != null) {
                i13 = R.id.slideCollect;
                OrderSwiper orderSwiper = (OrderSwiper) g.t(R.id.slideCollect, viewInflate);
                if (orderSwiper != null) {
                    i13 = R.id.slideContainer;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) g.t(R.id.slideContainer, viewInflate);
                    if (constraintLayout2 != null) {
                        i13 = R.id.sliderDescRedeem;
                        if (((TextView) g.t(R.id.sliderDescRedeem, viewInflate)) != null) {
                            i13 = R.id.sliderText;
                            TextView textView = (TextView) g.t(R.id.sliderText, viewInflate);
                            if (textView != null) {
                                z2 z2Var = new z2((ConstraintLayout) viewInflate, constraintLayout, button, orderSwiper, constraintLayout2, textView);
                                this.f9159a = z2Var;
                                Context context2 = getContext();
                                context2.getClass();
                                if (r0.q(context2)) {
                                    constraintLayout.setVisibility(0);
                                    constraintLayout2.setVisibility(8);
                                    d.x(button, new p(this, 23));
                                    return;
                                } else {
                                    constraintLayout.setVisibility(8);
                                    constraintLayout2.setVisibility(0);
                                    orderSwiper.setOnSeekBarChangeListener(new a(this, z2Var, i12));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
        throw null;
    }

    @NotNull
    public final z2 getBinding() {
        return this.f9159a;
    }

    @Nullable
    public final b getRedeemListener() {
        return this.f9160b;
    }

    public final void setProgress(int i11) {
        this.f9159a.f35323c.setProgress(i11);
    }

    public final void setRedeemListener(@Nullable b bVar) {
        this.f9160b = bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderRedeemer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderRedeemer(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ OrderRedeemer(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
