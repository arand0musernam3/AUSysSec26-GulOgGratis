package fd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import v80.p0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17573a;

    public /* synthetic */ n(int i11) {
        this.f17573a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = 0;
        switch (this.f17573a) {
            case 0:
                c90.f fVar = p0.f42144a;
                return a90.p.f1044a.f43295e;
            case 1:
                return (jd.h) jd.i.f24987a.getValue();
            case 2:
                List listL0 = CollectionsKt.l0((List) ae.m.f1259a.getValue(), new a60.r(7));
                ArrayList arrayList = new ArrayList();
                int size = listL0.size();
                while (i11 < size) {
                    ((sd.e) listL0.get(i11)).getClass();
                    pd.j jVar = new pd.j(new qw.c(23));
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(z.class);
                    Pair pair = orCreateKotlinClass == null ? null : new Pair(jVar, orCreateKotlinClass);
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                    i11++;
                }
                return arrayList;
            default:
                List listL02 = CollectionsKt.l0((List) ae.m.f1260b.getValue(), new a60.r(8));
                ArrayList arrayList2 = new ArrayList();
                int size2 = listL02.size();
                while (i11 < size2) {
                    ((wd.b) listL02.get(i11)).getClass();
                    arrayList2.add(new vd.e());
                    i11++;
                }
                return arrayList2;
        }
    }
}
