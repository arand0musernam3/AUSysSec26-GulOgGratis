package hq;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.RatingCardComposeView;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.order.NpsRating;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderRatingItem;
import com.app.tgtg.model.remote.order.Rating;
import g3.q9;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f22409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Function2 f22410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public nq.k f22411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DiscoverBucket f22412i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Order f22413j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public gv.b f22414k;
    public final pg.v l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final OrderRatingItem f22415m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 3);
        context.getClass();
        if (!isInEditMode()) {
            b();
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.discover_rating_compose, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate == null) {
            c50.w.l("rootView");
            throw null;
        }
        RatingCardComposeView ratingCardComposeView = (RatingCardComposeView) viewInflate;
        this.l = new pg.v(ratingCardComposeView, ratingCardComposeView, 4);
        this.f22415m = new OrderRatingItem(new Rating(0, (List) null, 2, (DefaultConstructorMarker) null), new Rating(0, (List) null, 2, (DefaultConstructorMarker) null), new Rating(0, (List) null, 2, (DefaultConstructorMarker) null), (List) null, (String) null, (NpsRating) null, (Boolean) null, (Boolean) null, (String) null, (Boolean) null, 1016, (DefaultConstructorMarker) null);
        setLayoutParams(new RecyclerView.a(-1, -2));
    }

    public static Unit c(w wVar, int i11) {
        wVar.setRating(i11);
        return Unit.f26487a;
    }

    private final void setRating(int i11) {
        this.f22415m.getOverall().setScore(i11);
        getLocalNotificationManager().a();
        Function2 function2 = this.f22410g;
        if (function2 != null) {
            Order order = this.f22413j;
            if (order == null) {
                Intrinsics.throwUninitializedPropertyAccessException("order");
                order = null;
            }
            function2.invoke(order, Integer.valueOf(i11));
        }
        Runnable runnable = this.f22409f;
        if (runnable != null) {
            runnable.run();
        }
    }

    @NotNull
    public final nq.d getBucket() {
        nq.k kVar = this.f22411h;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("discoverRow");
        return null;
    }

    @NotNull
    public final gv.b getLocalNotificationManager() {
        gv.b bVar = this.f22414k;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("localNotificationManager");
        return null;
    }

    @Override // hq.j
    public void setDiscoverRow(@NotNull nq.d dVar) {
        dVar.getClass();
        if (dVar instanceof nq.k) {
            nq.k kVar = (nq.k) dVar;
            this.f22411h = kVar;
            DiscoverBucket discoverBucket = kVar.f31366a;
            this.f22412i = discoverBucket;
            Order order = null;
            if (discoverBucket == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bucket");
                discoverBucket = null;
            }
            Order ratingOrder = discoverBucket.getRatingOrder();
            ratingOrder.getClass();
            this.f22413j = ratingOrder;
            RatingCardComposeView ratingCardComposeView = (RatingCardComposeView) this.l.f35202c;
            ratingCardComposeView.setOrder(ratingOrder);
            DiscoverBucket discoverBucket2 = this.f22412i;
            if (discoverBucket2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bucket");
                discoverBucket2 = null;
            }
            ratingCardComposeView.setBucket(discoverBucket2);
            ratingCardComposeView.setOnCloseClicked(new hi.d(this, 7));
            ratingCardComposeView.setOnRatingSelected(new q9(this, 19));
            cv.b eventTrackingManager = getEventTrackingManager();
            cv.i iVar = cv.i.SCREEN_RATE_ORDER;
            dv.a aVar = dv.a.ORDER_ID;
            Order order2 = this.f22413j;
            if (order2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("order");
            } else {
                order = order2;
            }
            eventTrackingManager.c(iVar, h0.g.E(new Pair(aVar, new dv.c(order.m429getOrderIdreIZeYA())), new Pair(dv.a.SOURCE, new dv.c("Discover"))));
        }
    }

    public final void setLocalNotificationManager(@NotNull gv.b bVar) {
        bVar.getClass();
        this.f22414k = bVar;
    }

    public final void setSelfRemovalRunnable(@NotNull Runnable runnable) {
        runnable.getClass();
        this.f22409f = runnable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@NotNull Context context) {
        super(context, 3);
        context.getClass();
        if (!isInEditMode()) {
            b();
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.discover_rating_compose, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate != null) {
            RatingCardComposeView ratingCardComposeView = (RatingCardComposeView) viewInflate;
            this.l = new pg.v(ratingCardComposeView, ratingCardComposeView, 4);
            this.f22415m = new OrderRatingItem(new Rating(0, (List) null, 2, (DefaultConstructorMarker) null), new Rating(0, (List) null, 2, (DefaultConstructorMarker) null), new Rating(0, (List) null, 2, (DefaultConstructorMarker) null), (List) null, (String) null, (NpsRating) null, (Boolean) null, (Boolean) null, (String) null, (Boolean) null, 1016, (DefaultConstructorMarker) null);
            setLayoutParams(new RecyclerView.a(-1, -2));
            return;
        }
        c50.w.l("rootView");
        throw null;
    }
}
