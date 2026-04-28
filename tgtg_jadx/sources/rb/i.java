package rb;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import com.braze.models.FeatureFlag;
import ib.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f37843a = w.f("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z11) {
        String str = f37843a;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z12 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z12 = true;
            }
            if (z11 == z12) {
                w.d().a(str, "Skipping component enablement for ".concat(cls.getName()));
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z11 ? 1 : 2, 1);
            w wVarD = w.d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z11 ? FeatureFlag.ENABLED : "disabled");
            wVarD.a(str, sb2.toString());
        } catch (Exception e5) {
            w wVarD2 = w.d();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z11 ? FeatureFlag.ENABLED : "disabled");
            String string = sb3.toString();
            if (wVarD2.f23766a <= 3) {
                Log.d(str, string, e5);
            }
        }
    }
}
