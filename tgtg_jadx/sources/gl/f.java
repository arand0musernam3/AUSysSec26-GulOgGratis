package gl;

import android.content.Context;
import android.widget.Toast;
import com.app.tgtg.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mv.r0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f20537b;

    public /* synthetic */ f(l lVar, int i11) {
        this.f20536a = i11;
        this.f20537b = lVar;
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        int i11 = this.f20536a;
        l lVar = this.f20537b;
        switch (i11) {
            case 0:
                l.o(lVar);
                break;
            case 1:
                vg.e eVar = (vg.e) obj;
                if (eVar != null) {
                    lVar.f20560m.a(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, null);
                    lVar.l = eVar;
                }
                break;
            default:
                if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                    Context contextRequireContext = lVar.requireContext();
                    contextRequireContext.getClass();
                    String string = r0.u(contextRequireContext) ? lVar.requireActivity().getString(R.string.generic_err_undefined_error) : lVar.requireActivity().getString(R.string.generic_error_unable_to_connect_to_internet_please_try_again_later);
                    string.getClass();
                    Toast.makeText(lVar.requireActivity(), string, 1).show();
                }
                break;
        }
        return Unit.f26487a;
    }
}
