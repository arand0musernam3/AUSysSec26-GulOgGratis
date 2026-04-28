package h70;

import android.content.res.Resources;
import android.util.Log;
import androidx.fragment.app.r;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f21650c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21651a;

    static {
        int i11 = 0;
        f21649b = new a(i11, 0);
        f21650c = new a(i11, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i11, int i12) {
        super(i11);
        this.f21651a = i12;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, u70.j] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Field field;
        switch (this.f21651a) {
            case 0:
                i70.b bVar = new i70.b();
                Object obj = i70.e.f23495a;
                r rVar = new r(bVar, 20);
                try {
                    Object value = i70.e.f23496b.getValue();
                    if (value != null && (field = (Field) i70.e.f23497c.getValue()) != null) {
                        Object obj2 = field.get(value);
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<android.view.View> /* = java.util.ArrayList<android.view.View> */");
                        }
                        field.set(value, rVar.invoke((ArrayList) obj2));
                    }
                } catch (Throwable th2) {
                    Log.w("WindowManagerSpy", th2);
                }
                return bVar;
            default:
                try {
                    return Resources.getSystem().getString(Resources.getSystem().getIdentifier("tooltip_popup_title", "string", AnalyticsPlatformParams.channel));
                } catch (Resources.NotFoundException unused) {
                    return "Tooltip";
                }
        }
    }
}
