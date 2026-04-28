package hq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.quickFilters.QuickFilterView;
import com.app.tgtg.model.remote.item.QuickFilter;
import g3.q9;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import pg.s0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f22406h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function1 f22407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s0 f22408g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(@NotNull Context context) {
        super(context, 2);
        context.getClass();
        if (!isInEditMode()) {
            b();
        }
        this.f22407f = new hb0.q(6);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.discover_quick_filter_bucket_view, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate == null) {
            c50.w.l("rootView");
            throw null;
        }
        QuickFilterView quickFilterView = (QuickFilterView) viewInflate;
        this.f22408g = new s0(quickFilterView, quickFilterView);
        setLayoutParams(new RecyclerView.a(-1, -2));
    }

    @NotNull
    public final s0 getBinding() {
        return this.f22408g;
    }

    @NotNull
    public final Function1<List<QuickFilter>, Unit> getOnFilterClicked() {
        return this.f22407f;
    }

    public final void setBinding(@NotNull s0 s0Var) {
        s0Var.getClass();
        this.f22408g = s0Var;
    }

    @Override // hq.j
    public void setDiscoverRow(@NotNull nq.d dVar) {
        dVar.getClass();
        if (dVar instanceof nq.j) {
            QuickFilterView quickFilterView = this.f22408g.f35146b;
            List<QuickFilter> quickFilters = ((nq.j) dVar).f31364a.getQuickFilters();
            if (quickFilters == null) {
                quickFilters = n0.f26529a;
            }
            quickFilterView.setQuickFilterList(quickFilters);
            this.f22408g.f35146b.setOnFilterClicked(new q9(this, 17));
        }
    }

    public final void setOnFilterClicked(@NotNull Function1<? super List<QuickFilter>, Unit> function1) {
        function1.getClass();
        this.f22407f = function1;
    }
}
