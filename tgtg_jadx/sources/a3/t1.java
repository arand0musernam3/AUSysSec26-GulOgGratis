package a3;

import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3.c3 f576b;

    public /* synthetic */ t1(m3.c3 c3Var, int i11) {
        this.f575a = i11;
        this.f576b = c3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f575a;
        m3.c3 c3Var = this.f576b;
        switch (i11) {
            case 0:
                return new h4.b(((h4.b) c3Var.getValue()).f21378a);
            case 1:
                t1.l lVar = y1.f633a;
                return new h4.b(((h4.b) c3Var.getValue()).f21378a);
            case 2:
                return Float.valueOf(((Number) c3Var.getValue()).floatValue());
            case 3:
                return Float.valueOf(((Number) c3Var.getValue()).floatValue());
            case 4:
                return Boolean.valueOf(((Number) c3Var.getValue()).floatValue() > 0.0f);
            case 5:
                return Boolean.valueOf(((Number) c3Var.getValue()).floatValue() > 0.0f);
            case 6:
                List list = (List) c3Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Intrinsics.areEqual(((g9.l) obj).f20163b.f20257a, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            default:
                int i12 = SurpriseBagOrderActivity.f9178y;
                long j9 = 1000;
                return Long.valueOf((((Number) c3Var.getValue()).longValue() / j9) * j9);
        }
    }
}
