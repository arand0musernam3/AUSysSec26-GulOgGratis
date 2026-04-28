package bq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h1;
import c50.w;
import c6.y;
import com.app.tgtg.R;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.response.BasicItem;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f6607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mc.a f6610e;

    public j(Context context, ArrayList arrayList, String str, String str2) {
        super(context);
        this.f6607b = arrayList;
        this.f6608c = str;
        this.f6609d = str2;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.store_view_more_item, (ViewGroup) this, false);
        addView(viewInflate);
        int i11 = R.id.loaderView;
        if (((TGTGLoadingView) pd.g.t(R.id.loaderView, viewInflate)) != null) {
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
            int i12 = R.id.rvStoreList;
            RecyclerView recyclerView = (RecyclerView) pd.g.t(R.id.rvStoreList, viewInflate);
            if (recyclerView != null) {
                i12 = R.id.title;
                TextView textView = (TextView) pd.g.t(R.id.title, viewInflate);
                if (textView != null) {
                    this.f6610e = new mc.a(relativeLayout, recyclerView, textView, 6);
                    recyclerView.setLayoutManager(new GridLayoutManager(context, arrayList.size() > 1 ? 2 : arrayList.size(), 0));
                    new h1().attachToRecyclerView(recyclerView);
                    return;
                }
            }
            i11 = i12;
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        throw null;
    }

    @Override // bq.g
    public final void a(StoreInformation storeInformation, y yVar, zp.b bVar) {
        storeInformation.getClass();
        yVar.getClass();
        bVar.getClass();
        setStore(storeInformation);
        mc.a aVar = this.f6610e;
        ((TextView) aVar.f29924d).setText(getContext().getText(R.string.store_view_more_from_this_store_title));
        ((RecyclerView) aVar.f29923c).setAdapter(new i(this.f6607b, this.f6608c, this.f6609d, bVar));
    }

    @NotNull
    public final List<BasicItem> getItems() {
        return this.f6607b;
    }
}
