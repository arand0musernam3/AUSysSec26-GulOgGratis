package dp;

import com.app.tgtg.feature.logincharity.ui.model.Country;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f15069b;

    public /* synthetic */ g(b1 b1Var, int i11) {
        this.f15068a = i11;
        this.f15069b = b1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15068a) {
            case 0:
                bp.s sVar = (bp.s) obj;
                sVar.getClass();
                b1 b1Var = this.f15069b;
                if (((List) b1Var.getValue()).contains(sVar)) {
                    Iterable iterable = (Iterable) b1Var.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : iterable) {
                        if (sVar != ((bp.s) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    b1Var.setValue(arrayList);
                } else {
                    b1Var.setValue(CollectionsKt.e0((Collection) b1Var.getValue(), sVar));
                }
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                this.f15069b.setValue(str);
                break;
            case 2:
                bp.s sVar2 = (bp.s) obj;
                sVar2.getClass();
                b1 b1Var2 = this.f15069b;
                if (((List) b1Var2.getValue()).contains(sVar2)) {
                    Iterable iterable2 = (Iterable) b1Var2.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : iterable2) {
                        if (((bp.s) obj3) != sVar2) {
                            arrayList2.add(obj3);
                        }
                    }
                    b1Var2.setValue(arrayList2);
                } else {
                    b1Var2.setValue(CollectionsKt.e0((Collection) b1Var2.getValue(), sVar2));
                }
                break;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                this.f15069b.setValue(str2);
                break;
            default:
                Country country = (Country) obj;
                country.getClass();
                this.f15069b.setValue(country);
                break;
        }
        return Unit.f26487a;
    }
}
