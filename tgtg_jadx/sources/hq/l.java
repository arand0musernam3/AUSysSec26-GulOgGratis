package hq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.quickFilters.FilterNoResultView;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import hp.f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import pg.l0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f22384h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function0 f22385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l0 f22386g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull Context context) {
        super(context, 1);
        context.getClass();
        if (!isInEditMode()) {
            b();
        }
        this.f22385f = new f0(9);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.discover_filter_no_result_view, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate == null) {
            c50.w.l("rootView");
            throw null;
        }
        FilterNoResultView filterNoResultView = (FilterNoResultView) viewInflate;
        this.f22386g = new l0(filterNoResultView, filterNoResultView);
        setLayoutParams(new RecyclerView.a(-1, -2));
    }

    @NotNull
    public final l0 getBinding() {
        return this.f22386g;
    }

    @NotNull
    public final Function0<Unit> getOnRemoveBtnClicked() {
        return this.f22385f;
    }

    public final void setBinding(@NotNull l0 l0Var) {
        l0Var.getClass();
        this.f22386g = l0Var;
    }

    @Override // hq.j
    public void setDiscoverRow(@NotNull nq.d dVar) {
        dVar.getClass();
        if (dVar instanceof nq.e) {
            FilterNoResultView filterNoResultView = this.f22386g.f34970b;
            DiscoverBucket discoverBucket = ((nq.e) dVar).f31353a;
            filterNoResultView.setFilterNoResultTitle(discoverBucket.getTitle());
            this.f22386g.f34970b.setFilterNoResultSubText(discoverBucket.getSubtext());
            this.f22386g.f34970b.setFilterNoResultButton(discoverBucket.getButton());
            this.f22386g.f34970b.setOnRemoveBtnClicked(new hi.d(this, 5));
        }
    }

    public final void setOnRemoveBtnClicked(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.f22385f = function0;
    }
}
