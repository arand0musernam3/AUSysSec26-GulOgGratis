package ii;

import android.app.Activity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f23979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f23980c;

    public /* synthetic */ v(ArrayList arrayList, Activity activity, int i11, int i12) {
        this.f23978a = i12;
        this.f23979b = arrayList;
        this.f23980c = activity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f23978a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                l.j(this.f23979b, this.f23980c, nVar, m3.i.F(1));
                break;
            case 1:
                l.c(this.f23979b, this.f23980c, nVar, m3.i.F(1));
                break;
            default:
                l.o(this.f23979b, this.f23980c, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
