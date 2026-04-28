package ak;

import a3.n2;
import a90.d;
import aa.l0;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.r2;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import pg.j1;
import pg.x0;
import v80.b2;
import v80.f0;
import v80.p0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f1506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f1507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b2 f1508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f1509d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, x0 x0Var) {
        super(x0Var.f35261b);
        this.f1509d = bVar;
        this.f1506a = x0Var;
        this.f1507b = f0.b(p0.f42144a);
    }

    public static final void a(a aVar, FlashSalesItem flashSalesItem, boolean z11) {
        x0 x0Var = aVar.f1506a;
        j1 j1Var = (j1) x0Var.f35266g;
        ConstraintLayout constraintLayout = x0Var.f35261b;
        TextView textView = x0Var.f35268i;
        j1Var.f34922b.setVisibility(!z11 ? 0 : 8);
        ((j1) x0Var.f35266g).f34923c.setVisibility(z11 ? 8 : 0);
        ((TextView) x0Var.f35267h).setVisibility(z11 ? 0 : 4);
        textView.setTextColor(constraintLayout.getContext().getColor(z11 ? R.color.primary_30 : R.color.neutral_70));
        if (!z11) {
            textView.setText(constraintLayout.getContext().getString(R.string.flash_sales_nothing_right_now));
            return;
        }
        String intervalEnd = mv.d.l(flashSalesItem).getIntervalEnd();
        Long lValueOf = intervalEnd != null ? Long.valueOf(mv.p0.h(intervalEnd)) : null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue() - jCurrentTimeMillis;
            b2 b2Var = aVar.f1508c;
            if (b2Var != null && b2Var.g()) {
                b2 b2Var2 = aVar.f1508c;
                if (b2Var2 != null) {
                    b2Var2.a(null);
                }
                aVar.f1508c = null;
            }
            aVar.f1508c = mv.d.v(aVar.f1507b, jLongValue, new n2(3, aVar, flashSalesItem), new l0(x0Var, null, 3), 2);
        }
    }
}
