package hq;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.StoreReferralCardComposeView;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pg.v0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f22416h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f22417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v0 f22418g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@NotNull Context context) {
        super(context, 4);
        context.getClass();
        if (!isInEditMode()) {
            b();
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i11 = v0.f35203u;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        v0 v0Var = (v0) a8.k.Z(layoutInflaterFrom, R.layout.discover_store_referral, this, true, null);
        v0Var.getClass();
        this.f22418g = v0Var;
        setLayoutParams(new RecyclerView.a(-1, -2));
    }

    @Override // hq.j
    public void setDiscoverRow(@NotNull nq.d dVar) {
        dVar.getClass();
        if (dVar instanceof nq.l) {
            nq.l lVar = (nq.l) dVar;
            DiscoverBucket discoverBucket = lVar.f31368a;
            this.f22417f = lVar.f31369b;
            v0 v0Var = this.f22418g;
            StoreReferralCardComposeView storeReferralCardComposeView = v0Var.f35204s;
            if (discoverBucket == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bucket");
                discoverBucket = null;
            }
            String description = discoverBucket.getDescription();
            if (description == null) {
                description = "";
            }
            storeReferralCardComposeView.setTitle(description);
            v0Var.f35204s.setOnCardClicked(new hi.d(this, 9));
        }
    }
}
