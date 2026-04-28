package yi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.app.tgtg.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k extends FunctionReferenceImpl implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f46009a = new k(3, pg.q.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/app/tgtg/databinding/CheckoutAddressContainerBinding;", 0);

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.checkout_address_container, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        if (viewInflate != null) {
            FragmentContainerView fragmentContainerView = (FragmentContainerView) viewInflate;
            return new pg.q(fragmentContainerView, fragmentContainerView);
        }
        c50.w.l("rootView");
        return null;
    }
}
