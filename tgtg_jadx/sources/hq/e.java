package hq;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.DiscoverDeliveryTabComposeView;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pg.j0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f22355e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0 f22356d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context) {
        super(context);
        context.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i11 = j0.f34918u;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        j0 j0Var = (j0) a8.k.Z(layoutInflaterFrom, R.layout.discover_delivery_card, this, true, null);
        j0Var.getClass();
        this.f22356d = j0Var;
        setLayoutParams(new RecyclerView.a(-1, -2));
    }

    @Override // hq.j
    public void setDiscoverRow(@NotNull nq.d dVar) {
        dVar.getClass();
        if (dVar instanceof nq.b) {
            DiscoverBucket discoverBucket = ((nq.b) dVar).f31348a;
            j0 j0Var = this.f22356d;
            DiscoverDeliveryTabComposeView discoverDeliveryTabComposeView = j0Var.f34919s;
            if (discoverBucket == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bucket");
                discoverBucket = null;
            }
            discoverDeliveryTabComposeView.setBucket(discoverBucket);
            j0Var.f34919s.setOnButtonClicked(new hi.d(this, 2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i11 = j0.f34918u;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        j0 j0Var = (j0) a8.k.Z(layoutInflaterFrom, R.layout.discover_delivery_card, this, true, null);
        j0Var.getClass();
        this.f22356d = j0Var;
        setLayoutParams(new RecyclerView.a(-1, -2));
    }
}
