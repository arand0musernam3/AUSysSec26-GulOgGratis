package hq;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.core.util.Consumer;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.ItemType;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pg.m0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f22390h = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public vz.a f22391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Consumer f22392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i80.n f22393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m0 f22394g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i11 = m0.f34982x;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        m0 m0Var = (m0) a8.k.Z(layoutInflaterFrom, R.layout.discover_flash_sales_view, this, true, null);
        m0Var.getClass();
        this.f22394g = m0Var;
    }

    @Override // hq.j
    public void setDiscoverRow(@NotNull nq.d dVar) {
        nq.f fVar;
        DiscoverBucket discoverBucket;
        ArrayList<BasicItem> items;
        dVar.getClass();
        boolean z11 = dVar instanceof nq.f;
        m0 m0Var = this.f22394g;
        if (z11 && (items = (discoverBucket = (fVar = (nq.f) dVar).f31355a).getItems()) != null && !items.isEmpty()) {
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                if (((BasicItem) it.next()).getItemType() == ItemType.FLASH_SALES) {
                    TextView textView = m0Var.f34987w;
                    TextView textView2 = m0Var.f34983s;
                    RecyclerView recyclerView = m0Var.f34986v;
                    textView.setText(fVar.f31356b);
                    textView2.setPaintFlags(8 | textView2.getPaintFlags());
                    lq.j jVar = new lq.j(lq.d.HORIZONTAL);
                    jVar.f28131e = new a50.d(18, this, jVar);
                    jVar.f28132f = new c1.q(this, 4);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
                    linearLayoutManager.setOrientation(0);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    recyclerView.setAdapter(jVar);
                    jVar.a(discoverBucket);
                    textView2.getClass();
                    mv.d.x(textView2, new hb0.o(4, this, fVar));
                    recyclerView.k(new n(linearLayoutManager, this));
                    return;
                }
            }
        }
        m0Var.f34987w.setVisibility(8);
        m0Var.f34983s.setVisibility(8);
        m0Var.f34986v.setVisibility(8);
    }

    public final void setFavoriteClickConsumer(@Nullable Consumer<mq.a> consumer) {
        this.f22392e = consumer;
    }

    public final void setFlashSalesConsumer(@Nullable vz.a aVar) {
        this.f22391d = aVar;
    }

    public final void setOnFlashSalesBucketClickListener(@NotNull i80.n nVar) {
        nVar.getClass();
        this.f22393f = nVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
