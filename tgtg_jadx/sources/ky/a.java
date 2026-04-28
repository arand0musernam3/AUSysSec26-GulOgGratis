package ky;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f26683b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i11) {
        super(0);
        this.f26682a = i11;
        this.f26683b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        int i11 = this.f26682a;
        b bVar = this.f26683b;
        switch (i11) {
            case 0:
                Intent intentRegisterReceiver = bVar.f26684a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                intentRegisterReceiver.getClass();
                int intExtra = intentRegisterReceiver.getIntExtra("health", -1);
                if (intExtra == -1) {
                    return "";
                }
                switch (intExtra) {
                    case 2:
                        return "good";
                    case 3:
                        return "overheat";
                    case 4:
                        return "dead";
                    case 5:
                        return "over voltage";
                    case 6:
                        return "unspecified failure";
                    case 7:
                        return "cold";
                    default:
                        return PaymentMethodTypes.UNKNOWN;
                }
            default:
                Object objInvoke = Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", null).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance(bVar.f26684a), null);
                objInvoke.getClass();
                return String.valueOf(((Double) objInvoke).doubleValue());
        }
    }
}
