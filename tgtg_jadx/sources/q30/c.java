package q30;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.o6;
import com.google.android.gms.internal.measurement.p6;
import com.google.android.gms.internal.measurement.q6;
import com.google.android.gms.internal.measurement.s6;
import com.google.android.gms.internal.measurement.t6;
import com.google.android.gms.internal.measurement.x5;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import y00.u2;
import zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a7 f35982a;

    public c(a7 a7Var) {
        this.f35982a = a7Var;
    }

    @Override // y00.u2
    public final void b(String str, String str2, Bundle bundle) {
        a7 a7Var = this.f35982a;
        a7Var.a(new t6(a7Var, str, str2, bundle, true));
    }

    @Override // y00.u2
    public final String c() {
        x5 x5Var = new x5();
        a7 a7Var = this.f35982a;
        a7Var.a(new s6(a7Var, x5Var, 4, false));
        return (String) x5.C(x5Var.b(500L), String.class);
    }

    @Override // y00.u2
    public final String d() {
        x5 x5Var = new x5();
        a7 a7Var = this.f35982a;
        a7Var.a(new s6(a7Var, x5Var, 3, false));
        return (String) x5.C(x5Var.b(500L), String.class);
    }

    @Override // y00.u2
    public final void e(Bundle bundle) {
        a7 a7Var = this.f35982a;
        a7Var.a(new n6(a7Var, bundle, 0));
    }

    @Override // y00.u2
    public final void f(String str) {
        a7 a7Var = this.f35982a;
        a7Var.a(new q6(a7Var, str, 1));
    }

    @Override // y00.u2
    public final void g(String str) {
        a7 a7Var = this.f35982a;
        a7Var.a(new q6(a7Var, str, 0));
    }

    @Override // y00.u2
    public final void h(String str, String str2, Bundle bundle) {
        a7 a7Var = this.f35982a;
        a7Var.a(new o6(a7Var, str, str2, bundle, 0));
    }

    @Override // y00.u2
    public final List i(String str, String str2) {
        x5 x5Var = new x5();
        a7 a7Var = this.f35982a;
        a7Var.a(new o6(a7Var, str, str2, x5Var, 1));
        List list = (List) x5.C(x5Var.b(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // y00.u2
    public final int j(String str) {
        x5 x5Var = new x5();
        a7 a7Var = this.f35982a;
        a7Var.a(new p6(a7Var, str, x5Var, 1));
        Integer num = (Integer) x5.C(x5Var.b(ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // y00.u2
    public final String k() {
        x5 x5Var = new x5();
        a7 a7Var = this.f35982a;
        a7Var.a(new s6(a7Var, x5Var, 1));
        return (String) x5.C(x5Var.b(50L), String.class);
    }

    @Override // y00.u2
    public final long l() {
        return this.f35982a.d();
    }

    @Override // y00.u2
    public final String m() {
        x5 x5Var = new x5();
        a7 a7Var = this.f35982a;
        a7Var.a(new s6(a7Var, x5Var, 0));
        return (String) x5.C(x5Var.b(500L), String.class);
    }

    @Override // y00.u2
    public final Map n(String str, String str2, boolean z11) {
        x5 x5Var = new x5();
        a7 a7Var = this.f35982a;
        a7Var.a(new t6(a7Var, str, str2, z11, x5Var));
        Bundle bundleB = x5Var.b(5000L);
        if (bundleB == null || bundleB.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleB.size());
        for (String str3 : bundleB.keySet()) {
            Object obj = bundleB.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }
}
