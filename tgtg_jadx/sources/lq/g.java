package lq;

import androidx.recyclerview.widget.t;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import com.app.tgtg.model.remote.item.response.Item;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f28123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f28124c;

    public g(ArrayList arrayList, ArrayList arrayList2, int i11) {
        this.f28122a = i11;
        arrayList.getClass();
        switch (i11) {
            case 1:
                this.f28123b = arrayList;
                this.f28124c = arrayList2;
                break;
            default:
                this.f28123b = arrayList;
                this.f28124c = arrayList2;
                break;
        }
    }

    @Override // androidx.recyclerview.widget.t
    public final boolean areContentsTheSame(int i11, int i12) {
        switch (this.f28122a) {
            case 0:
                return ((FlashSalesItem) this.f28123b.get(i11)).displayedParametersAreEqual((FlashSalesItem) this.f28124c.get(i12));
            default:
                return ((mq.a) this.f28123b.get(i11)).displayedParametersAreEqual((mq.a) this.f28124c.get(i12));
        }
    }

    @Override // androidx.recyclerview.widget.t
    public final boolean areItemsTheSame(int i11, int i12) {
        switch (this.f28122a) {
            case 0:
                return ItemId.m201equalsimpl0(((FlashSalesItem) this.f28124c.get(i12)).getInformation().mo340getItemIdFvU5WIY(), ((FlashSalesItem) this.f28123b.get(i11)).getInformation().mo340getItemIdFvU5WIY());
            default:
                mq.a aVar = (mq.a) this.f28124c.get(i12);
                mq.a aVar2 = (mq.a) this.f28123b.get(i11);
                if ((aVar instanceof mq.b) && (aVar2 instanceof mq.b)) {
                    return Intrinsics.areEqual(aVar, aVar2);
                }
                if ((aVar instanceof mq.d) && (aVar2 instanceof mq.d)) {
                    return Intrinsics.areEqual(aVar, aVar2);
                }
                if ((aVar instanceof mq.c) && (aVar2 instanceof mq.c)) {
                    return Intrinsics.areEqual(aVar, aVar2);
                }
                if ((aVar instanceof Item) && (aVar2 instanceof Item)) {
                    return ItemId.m201equalsimpl0(((Item) aVar).getInformation().mo340getItemIdFvU5WIY(), ((Item) aVar2).getInformation().mo340getItemIdFvU5WIY());
                }
                return false;
        }
    }

    @Override // androidx.recyclerview.widget.t
    public final int getNewListSize() {
        switch (this.f28122a) {
            case 0:
                return this.f28124c.size();
            default:
                return this.f28124c.size();
        }
    }

    @Override // androidx.recyclerview.widget.t
    public final int getOldListSize() {
        switch (this.f28122a) {
        }
        return this.f28123b.size();
    }
}
