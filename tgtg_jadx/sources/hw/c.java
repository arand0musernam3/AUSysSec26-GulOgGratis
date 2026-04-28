package hw;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.requests.e f22549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f22550c;

    public /* synthetic */ c(com.braze.requests.e eVar, ArrayList arrayList, int i11) {
        this.f22548a = i11;
        this.f22549b = eVar;
        this.f22550c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f22548a) {
            case 0:
                return com.braze.requests.e.b(this.f22549b, this.f22550c);
            default:
                return com.braze.requests.e.a(this.f22549b, this.f22550c);
        }
    }
}
