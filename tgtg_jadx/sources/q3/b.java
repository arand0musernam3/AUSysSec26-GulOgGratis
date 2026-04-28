package q3;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f35956b;

    public /* synthetic */ b(int i11, Collection collection) {
        this.f35955a = i11;
        this.f35956b = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zContains;
        switch (this.f35955a) {
            case 0:
                zContains = this.f35956b.contains(obj);
                break;
            case 1:
                zContains = this.f35956b.contains(obj);
                break;
            case 2:
                zContains = this.f35956b.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(this.f35956b);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
