package lb;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import ib.e;
import ib.w;
import ib.x;
import ib.y;
import java.util.Set;
import qb.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f27576d = w.f("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f27577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f27578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f27579c;

    public c(Context context, y yVar, boolean z11) {
        this.f27578b = yVar;
        this.f27577a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f27579c = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JobInfo a(o oVar, int i11) {
        int i12;
        String str;
        e eVar = oVar.f36837j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", oVar.f36828a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", oVar.f36846t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", oVar.c());
        JobInfo.Builder builder = new JobInfo.Builder(i11, this.f27577a);
        boolean z11 = eVar.f23713c;
        Set<ib.d> set = eVar.f23719i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z11);
        boolean z12 = eVar.f23714d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z12).setExtras(persistableBundle);
        NetworkRequest networkRequestA = eVar.a();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 28 || networkRequestA == null) {
            x xVar = eVar.f23711a;
            if (i13 < 30 || xVar != x.TEMPORARILY_UNMETERED) {
                int i14 = b.f27575a[xVar.ordinal()];
                if (i14 != 1) {
                    i12 = 2;
                    if (i14 == 2) {
                        i12 = 1;
                    } else if (i14 != 3) {
                        i12 = 4;
                        if (i14 == 4) {
                            i12 = 3;
                        } else if (i14 != 5) {
                            w.d().a(f27576d, "API version too low. Cannot convert network type value " + xVar);
                            i12 = 1;
                        }
                    }
                } else {
                    i12 = 0;
                }
                extras.setRequiredNetworkType(i12);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            extras.getClass();
            extras.setRequiredNetwork(networkRequestA);
        }
        if (!z12) {
            extras.setBackoffCriteria(oVar.f36839m, oVar.l == ib.a.LINEAR ? 0 : 1);
        }
        long jA = oVar.a();
        this.f27578b.getClass();
        long jMax = Math.max(jA - System.currentTimeMillis(), 0L);
        if (i13 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!oVar.f36843q && this.f27579c) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (ib.d dVar : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(dVar.f23708a, dVar.f23709b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(eVar.f23717g);
            extras.setTriggerContentMaxDelay(eVar.f23718h);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(eVar.f23715e);
        extras.setRequiresStorageNotLow(eVar.f23716f);
        Object[] objArr = oVar.f36838k > 0;
        boolean z13 = jMax > 0;
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 31 && oVar.f36843q && objArr == false && !z13) {
            extras.setExpedited(true);
        }
        if (i15 >= 35 && (str = oVar.f36850x) != null) {
            extras.setTraceTag(str);
        }
        return extras.build();
    }
}
