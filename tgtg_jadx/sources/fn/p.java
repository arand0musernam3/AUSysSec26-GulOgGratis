package fn;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.z1;
import com.app.tgtg.model.remote.item.MagicBagItemInformation;
import com.app.tgtg.model.remote.item.response.Item;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mv.e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r70.c f17841b;

    public /* synthetic */ p(r70.c cVar, int i11) {
        this.f17840a = i11;
        this.f17841b = cVar;
    }

    @Override // androidx.recyclerview.widget.z1
    public final void b(View view) {
        MagicBagItemInformation information;
        int i11 = this.f17840a;
        view.getClass();
        switch (i11) {
            case 0:
                if (view instanceof hq.c) {
                    hq.c cVar = (hq.c) view;
                    ArrayList arrayList = cVar.f22346h.f28136a;
                    ArrayList<Item> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (obj instanceof Item) {
                            arrayList2.add(obj);
                        }
                    }
                    for (Item item : arrayList2) {
                        e0 impressionHelper = cVar.getImpressionHelper();
                        String str = item.getInformation().mo340getItemIdFvU5WIY() + cv.g.DISCOVER;
                        impressionHelper.getClass();
                        impressionHelper.f30176b.remove(str);
                    }
                    t tVar = (t) this.f17841b;
                    String string = cVar.getBinding().f34886u.getText().toString();
                    int iComputeHorizontalScrollOffset = cVar.getBinding().f34885t.computeHorizontalScrollOffset();
                    ArrayList arrayList3 = tVar.f17858r;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : arrayList3) {
                        if (Intrinsics.areEqual(((Pair) obj2).f26485a, string)) {
                            arrayList4.add(obj2);
                        }
                    }
                    if (arrayList4.isEmpty()) {
                        arrayList3.add(new Pair(string, Integer.valueOf(iComputeHorizontalScrollOffset)));
                    } else {
                        Pair pair = new Pair(((Pair) arrayList4.get(0)).f26485a, Integer.valueOf(iComputeHorizontalScrollOffset));
                        arrayList3.remove(arrayList4.get(0));
                        arrayList3.add(pair);
                    }
                }
                break;
            default:
                lq.m mVar = view instanceof lq.m ? (lq.m) view : null;
                mq.a item2 = mVar != null ? mVar.getItem() : null;
                Item item3 = item2 instanceof Item ? (Item) item2 : null;
                if (item3 != null && (information = item3.getInformation()) != null) {
                    String strMo340getItemIdFvU5WIY = information.mo340getItemIdFvU5WIY();
                    e0 impressionHelper2 = ((hq.c) this.f17841b).getImpressionHelper();
                    String str2 = strMo340getItemIdFvU5WIY + cv.g.DISCOVER;
                    impressionHelper2.getClass();
                    impressionHelper2.f30176b.remove(str2);
                    break;
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.z1
    public final void c(View view) {
        int i11 = this.f17840a;
        view.getClass();
        switch (i11) {
            case 0:
                t tVar = (t) this.f17841b;
                if (view instanceof hq.c) {
                    hq.c cVar = (hq.c) view;
                    String string = cVar.getBinding().f34886u.getText().toString();
                    ArrayList arrayList = tVar.f17858r;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (Intrinsics.areEqual(((Pair) obj).f26485a, string)) {
                            arrayList2.add(obj);
                        }
                    }
                    int iIntValue = !arrayList2.isEmpty() ? ((Number) ((Pair) arrayList2.get(0)).f26486b).intValue() : 0;
                    RecyclerView recyclerView = cVar.getBinding().f34885t;
                    recyclerView.getClass();
                    if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
                        recyclerView.addOnLayoutChangeListener(new q(iIntValue));
                    } else {
                        recyclerView.scrollBy(iIntValue, 0);
                    }
                }
                break;
        }
    }
}
