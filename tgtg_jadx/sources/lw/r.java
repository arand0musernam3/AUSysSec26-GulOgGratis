package lw;

import com.braze.storage.w2;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28333a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f28334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28335c;

    public /* synthetic */ r(String str, Set set) {
        this.f28335c = str;
        this.f28334b = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28333a) {
            case 0:
                return w2.a(this.f28335c, this.f28334b);
            default:
                this.f28334b.add(this.f28335c);
                return Unit.f26487a;
        }
    }

    public /* synthetic */ r(Set set, String str) {
        this.f28334b = set;
        this.f28335c = str;
    }
}
