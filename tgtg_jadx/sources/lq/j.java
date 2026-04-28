package lq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.r2;
import androidx.recyclerview.widget.v;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f28127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DiscoverBucket f28128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f28130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public vz.a f28131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Consumer f28132f;

    public j(d dVar) {
        dVar.getClass();
        this.f28127a = dVar;
        this.f28130d = new ArrayList();
    }

    public final void a(DiscoverBucket discoverBucket) {
        ArrayList arrayList;
        discoverBucket.getClass();
        this.f28128b = discoverBucket;
        String fillerType = discoverBucket.getFillerType();
        fillerType.getClass();
        this.f28129c = fillerType;
        ArrayList<BasicItem> items = discoverBucket.getItems();
        if (items != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : items) {
                if (obj instanceof FlashSalesItem) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        ArrayList arrayList3 = this.f28130d;
        v vVarA = androidx.recyclerview.widget.d.a(new g(arrayList3, arrayList, 0));
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        vVarA.a(new androidx.recyclerview.widget.c(this));
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemCount() {
        return this.f28130d.size() + 1;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemViewType(int i11) {
        if (i11 != 0) {
            return R.layout.discover_item_view_compose;
        }
        int i12 = i.$EnumSwitchMapping$0[this.f28127a.ordinal()];
        if (i12 == 1) {
            return R.layout.discover_flash_sales_item_info;
        }
        if (i12 == 2) {
            return R.layout.discover_flash_sales_item_info_vertical;
        }
        e40.a.f();
        return 0;
    }

    @Override // androidx.recyclerview.widget.l1
    public final void onBindViewHolder(r2 r2Var, int i11) {
        r2Var.getClass();
        if (r2Var instanceof h) {
            ((h) r2Var).f28125a.setItem((mq.a) this.f28130d.get(i11 - 1));
        } else if (r2Var instanceof f) {
            f fVar = (f) r2Var;
            DiscoverBucket discoverBucket = this.f28128b;
            if (discoverBucket == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bucket");
                discoverBucket = null;
            }
            ((TextView) fVar.f28121a.f35201b).setText(discoverBucket.getDescription());
        }
    }

    @Override // androidx.recyclerview.widget.l1
    public final r2 onCreateViewHolder(ViewGroup viewGroup, int i11) throws Exception {
        viewGroup.getClass();
        if (i11 == R.layout.discover_flash_sales_item_info) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.discover_flash_sales_item_info, viewGroup, false);
            if (viewInflate != null) {
                return new e((TextView) viewInflate);
            }
            w.l("rootView");
            return null;
        }
        if (i11 == R.layout.discover_flash_sales_item_info_vertical) {
            View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.discover_flash_sales_item_info_vertical, viewGroup, false);
            TextView textView = (TextView) pd.g.t(R.id.description, viewInflate2);
            if (textView != null) {
                return new f(new pg.v((LinearLayout) viewInflate2, textView));
            }
            w.l("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(R.id.description)));
            return null;
        }
        if (i11 != R.layout.discover_item_view_compose) {
            throw new Exception(j4.s.f(i11, "There is no match for viewType -> "));
        }
        Context context = viewGroup.getContext();
        context.getClass();
        s sVar = new s(context);
        sVar.setIsDiscover(this.f28127a == d.HORIZONTAL);
        return new h(this, sVar);
    }
}
