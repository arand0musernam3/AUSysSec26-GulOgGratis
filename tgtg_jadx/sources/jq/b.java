package jq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.loyaltycardpromo.DiscoverLoyaltyCardPromoView;
import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails;
import hq.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import nq.d;
import nq.g;
import org.jetbrains.annotations.NotNull;
import pg.q0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f25363i = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function1 f25364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Function0 f25365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q0 f25366h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context) {
        super(context, 5);
        context.getClass();
        if (!isInEditMode()) {
            b();
        }
        this.f25364f = new im.a(20);
        this.f25365g = new a(0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.discover_loyaltycard_promo_view, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate == null) {
            w.l("rootView");
            throw null;
        }
        DiscoverLoyaltyCardPromoView discoverLoyaltyCardPromoView = (DiscoverLoyaltyCardPromoView) viewInflate;
        this.f25366h = new q0(discoverLoyaltyCardPromoView, discoverLoyaltyCardPromoView);
        setLayoutParams(new RecyclerView.a(-1, -2));
    }

    @NotNull
    public final q0 getBinding() {
        return this.f25366h;
    }

    @NotNull
    public final Function1<LoyaltyCardDetails, Unit> getOnLoyaltyCardPromoClicked() {
        return this.f25364f;
    }

    @NotNull
    public final Function0<Unit> getOnLoyaltyCardPromoDismissed() {
        return this.f25365g;
    }

    public final void setBinding(@NotNull q0 q0Var) {
        q0Var.getClass();
        this.f25366h = q0Var;
    }

    @Override // hq.j
    public void setDiscoverRow(@NotNull d dVar) {
        dVar.getClass();
        if (dVar instanceof g) {
            this.f25366h.f35080b.setLoyaltyCardDetails(((g) dVar).f31358a.getLoyaltyCardDetails());
            this.f25366h.f35080b.setOnLoyaltyCardPromoClicked(new jd.a(this, 3));
            this.f25366h.f35080b.setOnLoyaltyCardPromoDismissed(new hi.d(this, 29));
        }
    }

    public final void setOnLoyaltyCardPromoClicked(@NotNull Function1<? super LoyaltyCardDetails, Unit> function1) {
        function1.getClass();
        this.f25364f = function1;
    }

    public final void setOnLoyaltyCardPromoDismissed(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.f25365g = function0;
    }
}
