package qt;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m1;
import androidx.lifecycle.p0;
import ao.e1;
import bg.k0;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.OrderId;
import j30.g;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import yi.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f37271b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f37270a = i11;
        this.f37271b = obj;
    }

    @Override // androidx.lifecycle.p0
    public final void a(Object obj) {
        int i11 = this.f37270a;
        Object obj2 = this.f37271b;
        switch (i11) {
            case 0:
                a aVar = (a) obj;
                aVar.getClass();
                Object objA = aVar.a();
                if (objA != null) {
                    ((Function1) obj2).invoke(objA);
                }
                break;
            default:
                final String strM217unboximpl = ((OrderId) obj).m217unboximpl();
                strM217unboximpl.getClass();
                final f0 f0Var = (f0) obj2;
                final int i12 = 0;
                f0.v(f0Var, false, 2);
                if (new g(new ky.b(f0Var.requireContext(), 4)).b(15) != 0) {
                    String strH = f0Var.A().h();
                    if (strH == null) {
                        f0Var.w("orderId is null");
                    } else {
                        f0Var.H(strH);
                    }
                } else {
                    k0 k0Var = new k0(f0Var.requireActivity());
                    k0Var.f6171b = f0Var.getString(R.string.checkout_enble_biometrics_title);
                    k0Var.f6172c = f0Var.getString(R.string.checkout_enble_biometrics_description);
                    k0Var.c(R.string.checkout_enble_biometrics_btn_yes);
                    k0Var.l = new Function0() { // from class: yi.z
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i12) {
                                case 0:
                                    f0 f0Var2 = f0Var;
                                    Executor executorC = androidx.core.app.e.c(f0Var2.requireContext());
                                    executorC.getClass();
                                    LifecycleOwner viewLifecycleOwner = f0Var2.getViewLifecycleOwner();
                                    viewLifecycleOwner.getClass();
                                    v80.f0.B(m1.c(viewLifecycleOwner), null, null, new e1(f0Var2, strM217unboximpl, executorC, null, 27), 3);
                                    break;
                                default:
                                    f0 f0Var3 = f0Var;
                                    f0Var3.B().d();
                                    f0Var3.H(strM217unboximpl);
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    k0Var.b(R.string.checkout_enble_biometrics_btn_no);
                    final int i13 = 1;
                    k0Var.f6182n = new Function0() { // from class: yi.z
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i13) {
                                case 0:
                                    f0 f0Var2 = f0Var;
                                    Executor executorC = androidx.core.app.e.c(f0Var2.requireContext());
                                    executorC.getClass();
                                    LifecycleOwner viewLifecycleOwner = f0Var2.getViewLifecycleOwner();
                                    viewLifecycleOwner.getClass();
                                    v80.f0.B(m1.c(viewLifecycleOwner), null, null, new e1(f0Var2, strM217unboximpl, executorC, null, 27), 3);
                                    break;
                                default:
                                    f0 f0Var3 = f0Var;
                                    f0Var3.B().d();
                                    f0Var3.H(strM217unboximpl);
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    k0Var.f6179j = false;
                    View viewRequireView = f0Var.requireView();
                    viewRequireView.getClass();
                    k0Var.f6184p = viewRequireView;
                    k0Var.f();
                }
                break;
        }
    }
}
