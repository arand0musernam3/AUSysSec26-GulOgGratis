package fn;

import b0.f3;
import com.app.tgtg.model.local.BasketManager;
import java.util.function.Predicate;
import jg.b0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f17827b;

    public /* synthetic */ h(Function1 function1, int i11) {
        this.f17826a = i11;
        this.f17827b = function1;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f17826a) {
            case 0:
                return ((Boolean) ((cp.i) this.f17827b).invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) ((im.a) this.f17827b).invoke(obj)).booleanValue();
            case 2:
                return ((Boolean) ((im.a) this.f17827b).invoke(obj)).booleanValue();
            case 3:
                return ((Boolean) ((b0) this.f17827b).invoke(obj)).booleanValue();
            case 4:
                return ((Boolean) ((b0) this.f17827b).invoke(obj)).booleanValue();
            case 5:
                return ((Boolean) ((im.a) this.f17827b).invoke(obj)).booleanValue();
            case 6:
                return ((Boolean) ((im.a) this.f17827b).invoke(obj)).booleanValue();
            case 7:
                return ((Boolean) ((im.a) this.f17827b).invoke(obj)).booleanValue();
            case 8:
                return ((Boolean) ((im.a) this.f17827b).invoke(obj)).booleanValue();
            case 9:
                return ((Boolean) ((im.a) this.f17827b).invoke(obj)).booleanValue();
            case 10:
                return ((Boolean) ((im.a) this.f17827b).invoke(obj)).booleanValue();
            case 11:
                return ((Boolean) ((im.a) this.f17827b).invoke(obj)).booleanValue();
            case 12:
                return ((Boolean) ((f3) this.f17827b).invoke(obj)).booleanValue();
            case 13:
                return BasketManager.addOrRemoveItem$lambda$2((qb.s) this.f17827b, obj);
            case 14:
                return BasketManager.setQuantity$lambda$2((qb.s) this.f17827b, obj);
            default:
                return ((Boolean) ((b3.q) this.f17827b).invoke(obj)).booleanValue();
        }
    }
}
