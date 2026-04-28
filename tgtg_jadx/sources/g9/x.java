package g9;

import android.content.Context;
import android.content.res.Resources;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static String a(ky.b bVar, int i11) {
        bVar.getClass();
        if (i11 <= 16777215) {
            return String.valueOf(i11);
        }
        try {
            Context context = bVar.f26684a;
            context.getClass();
            String resourceName = context.getResources().getResourceName(i11);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i11);
        }
    }

    public static Sequence b(z zVar) {
        zVar.getClass();
        return o80.o.d(zVar, new g2.q(28));
    }
}
