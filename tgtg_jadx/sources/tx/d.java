package tx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.app.tgtg.feature.main.MainActivity;
import com.facebook.CustomTabActivity;
import com.facebook.CustomTabMainActivity;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.play.core.install.zza;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import y00.l1;
import y00.n1;
import y00.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static d f40503c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f40505b;

    public d(Context context) {
        this.f40504a = 0;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f40505b = applicationContext;
    }

    public static final d a() {
        if (yx.a.f46339a.contains(d.class)) {
            return null;
        }
        try {
            return f40503c;
        } catch (Throwable th2) {
            yx.a.a(d.class, th2);
            return null;
        }
    }

    public void finalize() throws Throwable {
        switch (this.f40504a) {
            case 0:
                Set set = yx.a.f46339a;
                if (!set.contains(this)) {
                    try {
                        if (!set.contains(this)) {
                            try {
                                d9.c cVarA = d9.c.a((Context) this.f40505b);
                                cVarA.getClass();
                                cVarA.d(this);
                            } catch (Throwable th2) {
                                yx.a.a(this, th2);
                                return;
                            }
                            break;
                        }
                    } catch (Throwable th3) {
                        yx.a.a(this, th3);
                        return;
                    }
                }
                break;
            default:
                super.finalize();
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f40504a) {
            case 0:
                if (yx.a.f46339a.contains(this)) {
                    return;
                }
                try {
                    bx.m mVar = new bx.m(context, (String) null);
                    StringBuilder sb2 = new StringBuilder("bf_");
                    sb2.append(intent != null ? intent.getStringExtra("event_name") : null);
                    String string = sb2.toString();
                    Bundle bundleExtra = intent != null ? intent.getBundleExtra("event_args") : null;
                    Bundle bundle = new Bundle();
                    Set<String> setKeySet = bundleExtra != null ? bundleExtra.keySet() : null;
                    if (setKeySet != null) {
                        for (String str : setKeySet) {
                            str.getClass();
                            bundle.putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(str, "-"), ""), ""), (String) bundleExtra.get(str));
                        }
                    }
                    ax.a0 a0Var = ax.a0.f4849a;
                    if (ax.s0.c()) {
                        mVar.d(bundle, string);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    yx.a.a(this, th2);
                    return;
                }
            case 1:
                z20.c cVar = (z20.c) this.f40505b;
                boolean zEquals = context.getPackageName().equals(intent.getStringExtra("package.name"));
                a30.j jVar = cVar.f46940a;
                if (!zEquals) {
                    jVar.b("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
                    return;
                }
                jVar.b("List of extras in received intent:", new Object[0]);
                for (String str2 : intent.getExtras().keySet()) {
                    cVar.f46940a.b("Key: %s; value: %s", str2, intent.getExtras().get(str2));
                }
                a30.j jVar2 = cVar.f46940a;
                jVar2.b("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
                jVar2.b("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
                jVar2.b("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
                zza zzaVar = new zza(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
                cVar.f46940a.b("ListenerRegistryBroadcastReceiver.onReceive: %s", zzaVar);
                synchronized (cVar) {
                    Iterator it = new HashSet(cVar.f46943d).iterator();
                    while (it.hasNext()) {
                        MainActivity mainActivity = (MainActivity) ((b30.a) it.next());
                        mainActivity.getClass();
                        if (zzaVar.f12741a == 11) {
                            mainActivity.p0(mainActivity.f0(), mainActivity.e0());
                        }
                        break;
                    }
                }
                return;
            case 2:
                context.getClass();
                intent.getClass();
                if (Intrinsics.areEqual("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction())) {
                    ax.a0 a0Var2 = ax.a0.f4849a;
                    LoginButton loginButton = (LoginButton) ((c40.q) this.f40505b).f7095e;
                    loginButton.m();
                    loginButton.k();
                    return;
                }
                return;
            case 3:
                context.getClass();
                intent.getClass();
                ((CustomTabActivity) this.f40505b).finish();
                return;
            case 4:
                context.getClass();
                intent.getClass();
                CustomTabMainActivity customTabMainActivity = (CustomTabMainActivity) this.f40505b;
                Intent intent2 = new Intent(customTabMainActivity, (Class<?>) CustomTabMainActivity.class);
                int i11 = CustomTabMainActivity.f10978c;
                intent2.setAction("CustomTabMainActivity.action_refresh");
                intent2.putExtra("CustomTabMainActivity.extra_url", intent.getStringExtra("CustomTabMainActivity.extra_url"));
                intent2.addFlags(603979776);
                customTabMainActivity.startActivity(intent2);
                return;
            case 5:
                ((c5.b) this.f40505b).s();
                return;
            case 6:
                context.getClass();
                intent.getClass();
                ob.a aVar = (ob.a) this.f40505b;
                int i12 = aVar.f32409g;
                intent.getClass();
                switch (i12) {
                    case 0:
                        String action = intent.getAction();
                        if (action == null) {
                            return;
                        }
                        ib.w.d().a(ob.b.f32410a, "Received ".concat(action));
                        switch (action.hashCode()) {
                            case -1886648615:
                                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                    aVar.b(Boolean.FALSE);
                                    return;
                                }
                                return;
                            case -54942926:
                                if (action.equals("android.os.action.DISCHARGING")) {
                                    aVar.b(Boolean.FALSE);
                                    return;
                                }
                                return;
                            case 948344062:
                                if (action.equals("android.os.action.CHARGING")) {
                                    aVar.b(Boolean.TRUE);
                                    return;
                                }
                                return;
                            case 1019184907:
                                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                    aVar.b(Boolean.TRUE);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    case 1:
                        if (intent.getAction() == null) {
                            return;
                        }
                        ib.w.d().a(ob.c.f32411a, "Received " + intent.getAction());
                        String action2 = intent.getAction();
                        if (action2 != null) {
                            int iHashCode = action2.hashCode();
                            if (iHashCode == -1980154005) {
                                if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    aVar.b(Boolean.TRUE);
                                    return;
                                }
                                return;
                            } else {
                                if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                    aVar.b(Boolean.FALSE);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    default:
                        if (intent.getAction() == null) {
                            return;
                        }
                        ib.w.d().a(ob.i.f32424a, "Received " + intent.getAction());
                        String action3 = intent.getAction();
                        if (action3 != null) {
                            int iHashCode2 = action3.hashCode();
                            if (iHashCode2 == -1181163412) {
                                if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    aVar.b(Boolean.FALSE);
                                    return;
                                }
                                return;
                            } else {
                                if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                    aVar.b(Boolean.TRUE);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                }
            default:
                n1 n1Var = (n1) this.f40505b;
                if (intent == null) {
                    w0 w0Var = n1Var.f44987f;
                    n1.m(w0Var);
                    w0Var.f45263j.a("App receiver called with null intent");
                    return;
                }
                String action4 = intent.getAction();
                if (action4 == null) {
                    w0 w0Var2 = n1Var.f44987f;
                    n1.m(w0Var2);
                    w0Var2.f45263j.a("App receiver called with null action");
                    return;
                }
                int iHashCode3 = action4.hashCode();
                if (iHashCode3 != -1928239649) {
                    if (iHashCode3 == 1279883384 && action4.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                        w0 w0Var3 = n1Var.f44987f;
                        n1.m(w0Var3);
                        w0Var3.f45267o.a("[sgtm] App Receiver notified batches are available");
                        l1 l1Var = n1Var.f44988g;
                        n1.m(l1Var);
                        l1Var.y(new a8.f(this, 28));
                        return;
                    }
                } else if (action4.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                    f4.a();
                    if (n1Var.f44985d.A(null, y00.g0.P0)) {
                        w0 w0Var4 = n1Var.f44987f;
                        n1.m(w0Var4);
                        w0Var4.f45267o.a("App receiver notified triggers are available");
                        l1 l1Var2 = n1Var.f44988g;
                        n1.m(l1Var2);
                        l1Var2.y(new z7.c(n1Var, 1));
                        return;
                    }
                    return;
                }
                w0 w0Var5 = n1Var.f44987f;
                n1.m(w0Var5);
                w0Var5.f45263j.a("App receiver called with unknown action");
                return;
        }
    }

    public d(n1 n1Var) {
        this.f40504a = 7;
        this.f40505b = n1Var;
    }

    public /* synthetic */ d(Object obj, int i11) {
        this.f40504a = i11;
        this.f40505b = obj;
    }
}
