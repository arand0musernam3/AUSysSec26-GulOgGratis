package vo;

import android.content.Context;
import com.app.tgtg.feature.postpurchase.phone.AddPhoneNumberFragment;
import kotlin.Unit;
import mv.r0;
import qo.h;
import y80.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddPhoneNumberFragment f42496b;

    public /* synthetic */ a(AddPhoneNumberFragment addPhoneNumberFragment, int i11) {
        this.f42495a = i11;
        this.f42496b = addPhoneNumberFragment;
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        switch (this.f42495a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    Context contextRequireContext = this.f42496b.requireContext();
                    contextRequireContext.getClass();
                    r0.o(contextRequireContext, th2);
                }
                break;
            default:
                ((Boolean) obj).getClass();
                h.c((h) this.f42496b.f9217f.getValue());
                break;
        }
        return Unit.f26487a;
    }
}
