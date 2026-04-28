package pg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.R;
import com.app.tgtg.feature.orderview.OrderSwiper;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f34925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OrderSwiper f34926b;

    public j3(ConstraintLayout constraintLayout, OrderSwiper orderSwiper) {
        this.f34925a = constraintLayout;
        this.f34926b = orderSwiper;
    }

    public static j3 a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R.layout.special_reward_redeemer_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        OrderSwiper orderSwiper = (OrderSwiper) pd.g.t(R.id.slideRedeem, viewInflate);
        if (orderSwiper != null) {
            return new j3(constraintLayout, orderSwiper);
        }
        c50.w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.slideRedeem)));
        return null;
    }

    @Override // sa.a
    public final View getRoot() {
        return this.f34925a;
    }
}
