package l9;

import g9.v;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f27558b;

    public /* synthetic */ g(v vVar, int i11) {
        this.f27557a = i11;
        this.f27558b = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zContains;
        String str = (String) obj;
        switch (this.f27557a) {
            case 0:
                str.getClass();
                zContains = this.f27558b.c().contains(str);
                break;
            default:
                str.getClass();
                zContains = this.f27558b.c().contains(str);
                break;
        }
        return Boolean.valueOf(!zContains);
    }
}
