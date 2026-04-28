package vm;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f42487b;

    public /* synthetic */ p(List list, int i11) {
        this.f42486a = i11;
        this.f42487b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f42486a) {
            case 0:
                this.f42487b.get(((Number) obj).intValue());
                break;
            case 1:
                this.f42487b.get(((Number) obj).intValue());
                break;
            case 2:
                this.f42487b.get(((Number) obj).intValue());
                break;
            default:
                this.f42487b.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
