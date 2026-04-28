package a4;

import androidx.compose.runtime.tooling.DiagnosticComposeException;
import com.app.tgtg.model.local.AppConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final ArrayList a(a aVar) {
        int[] iArr = {AppConstants.PERMISSIONS_REQUEST_USE_LOCATION, AppConstants.PERMISSIONS_REQUEST_CALL_PHONE, 204, 206, 207, 125, -127, 126665345, 200};
        List list = aVar.f680a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            d dVar = (d) list.get(i11);
            if (!y.t(iArr, dVar.f682a)) {
                if (dVar.f682a == 100) {
                    int i13 = i11 + 2;
                    if (i13 < size && ((d) list.get(i13)).f682a == 1000) {
                        break;
                    }
                    i0.y(arrayList);
                } else {
                    arrayList.add(dVar);
                }
            }
            i11 = i12;
        }
        return arrayList;
    }

    public static final boolean b(Throwable th2, Function0 function0) {
        DiagnosticComposeException diagnosticComposeException;
        th2.getClass();
        List listB = b80.c.f6062a.b(th2);
        int size = listB.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            if (((Throwable) listB.get(i11)) instanceof DiagnosticComposeException) {
                return false;
            }
        }
        try {
            a aVar = (a) function0.invoke();
            if (aVar != null && !aVar.f680a.isEmpty()) {
                z11 = true;
            }
            if (z11) {
                aVar.getClass();
                diagnosticComposeException = new DiagnosticComposeException(aVar);
            } else {
                diagnosticComposeException = null;
            }
        } catch (Throwable th3) {
            diagnosticComposeException = th3;
        }
        if (diagnosticComposeException != null) {
            u70.e.a(th2, diagnosticComposeException);
        }
        return z11;
    }
}
