package ho;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.app.tgtg.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import pg.j1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p extends FunctionReferenceImpl implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f22251a = new p(3, j1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/app/tgtg/databinding/LayoutFlashSalesLogoBinding;", 0);

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.layout_flash_sales_logo, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        return j1.a(viewInflate);
    }
}
