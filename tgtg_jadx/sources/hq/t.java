package hq;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.DiscoverNothingWithinDistanceComposeView;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pg.r0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f22405d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@NotNull Context context) {
        super(context);
        context.getClass();
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.discover_nothing_within_distance_view, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate == null) {
            c50.w.l("rootView");
            throw null;
        }
        DiscoverNothingWithinDistanceComposeView discoverNothingWithinDistanceComposeView = (DiscoverNothingWithinDistanceComposeView) viewInflate;
        this.f22405d = new r0(discoverNothingWithinDistanceComposeView, discoverNothingWithinDistanceComposeView);
        setLayoutParams(new RecyclerView.a(-1, -2));
    }

    @NotNull
    public final r0 getBinding() {
        return this.f22405d;
    }

    public final void setBinding(@NotNull r0 r0Var) {
        r0Var.getClass();
        this.f22405d = r0Var;
    }

    @Override // hq.j
    public void setDiscoverRow(@NotNull nq.d dVar) {
        dVar.getClass();
        if (dVar instanceof nq.i) {
            DiscoverBucket discoverBucket = ((nq.i) dVar).f31362a;
            DiscoverNothingWithinDistanceComposeView discoverNothingWithinDistanceComposeView = this.f22405d.f35115b;
            if (discoverBucket == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bucket");
                discoverBucket = null;
            }
            discoverNothingWithinDistanceComposeView.setBucket(discoverBucket);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.discover_nothing_within_distance_view, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate != null) {
            DiscoverNothingWithinDistanceComposeView discoverNothingWithinDistanceComposeView = (DiscoverNothingWithinDistanceComposeView) viewInflate;
            this.f22405d = new r0(discoverNothingWithinDistanceComposeView, discoverNothingWithinDistanceComposeView);
            setLayoutParams(new RecyclerView.a(-1, -2));
            return;
        }
        c50.w.l("rootView");
        throw null;
    }
}
