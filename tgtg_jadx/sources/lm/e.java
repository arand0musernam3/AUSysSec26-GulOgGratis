package lm;

import androidx.fragment.app.Fragment;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.BasicItemInformation;
import com.app.tgtg.model.remote.item.response.BasicItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f27910j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f27911k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(i iVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f27910j = i11;
        this.f27911k = iVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f27910j) {
            case 0:
                return new e(this.f27911k, cVar, 0);
            default:
                return new e(this.f27911k, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f27910j) {
        }
        return ((e) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        BasicItemInformation information;
        int i11 = this.f27910j;
        i iVar = this.f27911k;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                iVar.w(true);
                return Unit.f26487a;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                mm.a aVar3 = iVar.f27923m;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
                    aVar3 = null;
                }
                int i12 = 0;
                if (aVar3.i(0) != null) {
                    mm.a aVar4 = iVar.f27923m;
                    if (aVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
                        aVar4 = null;
                    }
                    mm.a aVar5 = iVar.f27923m;
                    if (aVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
                        aVar5 = null;
                    }
                    Fragment fragmentI = aVar4.i(!(aVar5.i(0) instanceof nm.e) ? 1 : 0);
                    fragmentI.getClass();
                    List list = (List) iVar.s().F.f45488a.getValue();
                    list.getClass();
                    br.k kVar = ((nm.e) fragmentI).f31104o;
                    ArrayList arrayList = kVar.f6635a;
                    if (arrayList != null) {
                        for (Object obj2 : arrayList) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                d0.n();
                                throw null;
                            }
                            BasicItem basicItem = (BasicItem) ((ov.b) obj2).f33761a;
                            String strMo340getItemIdFvU5WIY = (basicItem == null || (information = basicItem.getInformation()) == null) ? null : information.mo340getItemIdFvU5WIY();
                            boolean zI = CollectionsKt.I(list, strMo340getItemIdFvU5WIY != null ? ItemId.m197boximpl(strMo340getItemIdFvU5WIY) : null);
                            if (basicItem == null || basicItem.getFavorite() != zI) {
                                if (basicItem != null) {
                                    basicItem.setFavorite(zI);
                                }
                                kVar.notifyItemChanged(i12);
                            }
                            i12 = i13;
                        }
                    }
                }
                return Unit.f26487a;
        }
    }
}
