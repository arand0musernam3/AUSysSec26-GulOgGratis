package hq;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.DiscoverAlmostSoldOutComposeView;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pg.v f22339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22340e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        super(context);
        context.getClass();
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.discover_almost_sold_out_view, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate == null) {
            c50.w.l("rootView");
            throw null;
        }
        DiscoverAlmostSoldOutComposeView discoverAlmostSoldOutComposeView = (DiscoverAlmostSoldOutComposeView) viewInflate;
        this.f22339d = new pg.v(discoverAlmostSoldOutComposeView, discoverAlmostSoldOutComposeView, 1);
        setLayoutParams(new RecyclerView.a(-1, -2));
    }

    @Override // hq.j
    public void setDiscoverRow(@NotNull nq.d dVar) {
        dVar.getClass();
        if (dVar instanceof nq.a) {
            nq.a aVar = (nq.a) dVar;
            DiscoverBucket discoverBucket = aVar.f31345a;
            this.f22340e = aVar.f31346b;
            pg.v vVar = this.f22339d;
            DiscoverAlmostSoldOutComposeView discoverAlmostSoldOutComposeView = (DiscoverAlmostSoldOutComposeView) vVar.f35202c;
            if (discoverBucket == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bucket");
                discoverBucket = null;
            }
            discoverAlmostSoldOutComposeView.setBucket(discoverBucket);
            ((DiscoverAlmostSoldOutComposeView) vVar.f35202c).setFullySoldOut(this.f22340e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.discover_almost_sold_out_view, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate != null) {
            DiscoverAlmostSoldOutComposeView discoverAlmostSoldOutComposeView = (DiscoverAlmostSoldOutComposeView) viewInflate;
            this.f22339d = new pg.v(discoverAlmostSoldOutComposeView, discoverAlmostSoldOutComposeView, 1);
            setLayoutParams(new RecyclerView.a(-1, -2));
            return;
        }
        c50.w.l("rootView");
        throw null;
    }
}
