package pg;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.feature.orderview.OrderSwiper;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f35321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f35322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OrderSwiper f35323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f35324d;

    public z2(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Button button, OrderSwiper orderSwiper, ConstraintLayout constraintLayout3, TextView textView) {
        this.f35321a = constraintLayout;
        this.f35322b = button;
        this.f35323c = orderSwiper;
        this.f35324d = textView;
    }

    @Override // sa.a
    public final View getRoot() {
        return this.f35321a;
    }
}
