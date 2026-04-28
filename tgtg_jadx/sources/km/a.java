package km;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import f70.i;
import java.io.Serializable;
import kotlin.Metadata;
import mv.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkm/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f26467a = i.UNKNOWN;

    public abstract z o();

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle bundleRequireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 34) {
            serializable = a70.a.j(bundleRequireArguments);
        } else {
            serializable = bundleRequireArguments.getSerializable("ORIGIN");
            if (!i.class.isInstance(serializable)) {
                serializable = null;
            }
        }
        i iVar = (i) serializable;
        if (iVar != null) {
            this.f26467a = iVar;
        }
    }
}
