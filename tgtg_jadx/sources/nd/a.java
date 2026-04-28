package nd;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import fd.z;
import ia0.a0;
import java.io.File;
import td.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30816a;

    public /* synthetic */ a(int i11) {
        this.f30816a = i11;
    }

    public final z a(Object obj, o oVar) {
        switch (this.f30816a) {
            case 0:
                return fd.o.k(((Uri) obj).toString());
            case 1:
                return fd.o.a(((File) obj).getPath());
            case 2:
                return fd.o.a(((a0) obj).f23603a.s());
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = oVar.f40030a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return fd.o.k("android.resource://" + context.getPackageName() + ExpiryDateInput.SEPARATOR + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            default:
                return fd.o.k((String) obj);
        }
    }
}
