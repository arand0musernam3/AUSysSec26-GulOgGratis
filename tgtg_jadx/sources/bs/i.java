package bs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.r2;
import com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.ui.HiddenStoresActivity;
import com.app.tgtg.model.remote.item.response.BasicItem;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f6680b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f6681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f6682d;

    public i(HiddenStoresActivity hiddenStoresActivity) {
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemCount() {
        return this.f6680b.size();
    }

    @Override // androidx.recyclerview.widget.l1
    public final void onBindViewHolder(r2 r2Var, int i11) {
        r2Var.getClass();
        if (r2Var instanceof h) {
            View view = r2Var.itemView;
            view.getClass();
            k kVar = (k) view;
            kVar.setItem((BasicItem) this.f6680b.get(i11));
            kVar.setMode(this.f6679a);
        }
    }

    @Override // androidx.recyclerview.widget.l1
    public final r2 onCreateViewHolder(ViewGroup viewGroup, int i11) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        a aVar = this.f6682d;
        aVar.getClass();
        a aVar2 = this.f6681c;
        aVar2.getClass();
        return new h(new k(context, aVar, aVar2));
    }
}
