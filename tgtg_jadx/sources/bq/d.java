package bq;

import a3.x0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import bg.n0;
import c6.y;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import com.app.tgtg.model.remote.item.response.ItemState;
import java.util.ArrayList;
import java.util.List;
import lv.t;
import org.jetbrains.annotations.NotNull;
import pg.c1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6588c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f6589b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context) {
        super(context);
        context.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i11 = c1.f34811v;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        c1 c1Var = (c1) a8.k.Z(layoutInflaterFrom, R.layout.flash_sales_favorite_card, this, true, null);
        c1Var.getClass();
        this.f6589b = c1Var;
        c1Var.f34813t.setOnClickListener(new n0(2, context, this));
        CardView cardView = c1Var.f34812s;
        cardView.setRadius(0.0f);
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        layoutParams.getClass();
        int iD = (int) d70.b.d(t.f28253g);
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(iD, iD, iD, iD);
        cardView.requestLayout();
        setLayoutParams(new RecyclerView.a(-1, -2));
    }

    @Override // bq.g
    public final void a(StoreInformation storeInformation, y yVar, zp.b bVar) {
        ArrayList arrayList;
        storeInformation.getClass();
        yVar.getClass();
        bVar.getClass();
        setStore(storeInformation);
        List<BasicItem> items = storeInformation.getItems();
        if (items != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : items) {
                if (obj instanceof FlashSalesItem) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList();
            for (Object obj2 : arrayList2) {
                FlashSalesItem flashSalesItem = (FlashSalesItem) obj2;
                if (mv.d.j(flashSalesItem) == ItemState.AVAILABLE || mv.d.j(flashSalesItem) == ItemState.FEW_LEFT) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.f6589b.f34814u.setAdapter(new ak.b(arrayList, new x0(bVar, 27), 0));
    }
}
