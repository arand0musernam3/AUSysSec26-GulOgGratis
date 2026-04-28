package nm;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import bg.w0;
import com.app.tgtg.customview.GenericErrorView;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.model.local.GenericErrors;
import com.app.tgtg.model.local.SearchFilter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pg.k;
import pg.u1;
import u70.t;
import zj.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f31088b;

    public /* synthetic */ a(e eVar, int i11) {
        this.f31087a = i11;
        this.f31088b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f31087a) {
            case 0:
                List list = (List) obj;
                list.getClass();
                e eVar = this.f31088b;
                k kVar = eVar.f31106q;
                kVar.getClass();
                ((SwipeRefreshLayout) kVar.f34932f).setRefreshing(false);
                if (list.isEmpty()) {
                    if (eVar.t().N == eVar.t().O + 1) {
                        ((j) eVar.f31099i.getValue()).f47948a.getClass();
                        SearchFilter searchFilterA = ft.b.a();
                        if (searchFilterA.isFilterOn() || searchFilterA.isSearchOn()) {
                            eVar.x(new GenericErrors.NoResultWithFilterOn(new b(eVar, 5)));
                        } else {
                            eVar.x(new GenericErrors.NoResultsWithCurrentLocation(new b(eVar, 0)));
                        }
                    }
                } else if (eVar.f31106q != null) {
                    br.k kVar2 = eVar.f31104o;
                    kVar2.a();
                    ArrayList arrayList = kVar2.f6635a;
                    arrayList.getClass();
                    int size = arrayList.size();
                    arrayList.addAll(list);
                    kVar2.notifyItemRangeInserted(size, list.size());
                    if (list.size() < eVar.t().P || eVar.t().N >= eVar.t().R) {
                        eVar.t().Q = true;
                    }
                    k kVar3 = eVar.f31106q;
                    kVar3.getClass();
                    ((GenericErrorView) kVar3.f34929c).setVisibility(8);
                }
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    e eVar2 = this.f31088b;
                    if (eVar2.getActivity() instanceof pt.d) {
                        v6.d activity = eVar2.getActivity();
                        activity.getClass();
                        u1 u1Var = ((MainActivity) ((pt.d) activity)).f9089q;
                        u1Var.getClass();
                        u1Var.f35188w.a();
                    }
                }
                break;
            case 2:
                e eVar3 = this.f31088b;
                t tVar = eVar3.f31100j;
                if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE) && eVar3.isVisible()) {
                    w0 w0Var = (w0) tVar.getValue();
                    k kVar4 = eVar3.f31106q;
                    kVar4.getClass();
                    w0Var.b((ConstraintLayout) kVar4.f34928b);
                } else {
                    ((w0) tVar.getValue()).a();
                }
                break;
            case 3:
                GenericErrors genericErrors = (GenericErrors) obj;
                genericErrors.getClass();
                boolean z11 = genericErrors instanceof GenericErrors.LocationNotAvailable;
                e eVar4 = this.f31088b;
                if (z11) {
                    eVar4.x(new GenericErrors.LocationNotAvailable(new b(eVar4, 3)));
                } else if (genericErrors instanceof GenericErrors.NoLocationSelected) {
                    eVar4.x(new GenericErrors.NoLocationSelected(new b(eVar4, 4)));
                } else {
                    eVar4.x(genericErrors);
                }
                break;
            default:
                cv.e eVar5 = (cv.e) obj;
                eVar5.getClass();
                this.f31088b.t().f40309d.a(eVar5);
                break;
        }
        return Unit.f26487a;
    }
}
