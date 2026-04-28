package nm;

import androidx.fragment.app.Fragment;
import com.app.tgtg.feature.main.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import lm.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f31090b;

    public /* synthetic */ b(e eVar, int i11) {
        this.f31089a = i11;
        this.f31090b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f31089a) {
            case 0:
                this.f31090b.y();
                break;
            case 1:
                MainActivity.f9078v = true;
                this.f31090b.w();
                break;
            case 2:
                break;
            case 3:
                this.f31090b.w();
                break;
            case 4:
                this.f31090b.y();
                break;
            default:
                Fragment parentFragment = this.f31090b.getParentFragment();
                i iVar = parentFragment instanceof i ? (i) parentFragment : null;
                if (iVar != null) {
                    iVar.q();
                }
                break;
        }
        return Unit.f26487a;
    }
}
