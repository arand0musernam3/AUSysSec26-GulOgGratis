package qz;

import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.w5;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f37320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f37322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f37323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f37324e;

    public c0(g gVar, int i11, a aVar, long j9, long j11) {
        this.f37320a = gVar;
        this.f37321b = i11;
        this.f37322c = aVar;
        this.f37323d = j9;
        this.f37324e = j11;
    }

    public static com.google.android.gms.common.internal.j a(z zVar, com.google.android.gms.common.internal.f fVar, int i11) {
        com.google.android.gms.common.internal.j telemetryConfiguration = fVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.f11128b) {
            return null;
        }
        int[] iArr = telemetryConfiguration.f11130d;
        int i12 = 0;
        if (iArr != null) {
            while (i12 < iArr.length) {
                if (iArr[i12] != i11) {
                    i12++;
                }
            }
            return null;
        }
        int[] iArr2 = telemetryConfiguration.f11132f;
        if (iArr2 != null) {
            while (i12 < iArr2.length) {
                if (iArr2[i12] == i11) {
                    return null;
                }
                i12++;
            }
        }
        if (zVar.f37412r < telemetryConfiguration.f11131e) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j9;
        long j11;
        g gVar = this.f37320a;
        if (gVar.g()) {
            com.google.android.gms.common.internal.s sVar = (com.google.android.gms.common.internal.s) com.google.android.gms.common.internal.r.e().f11181a;
            if (sVar == null || sVar.f11190b) {
                z zVar = (z) gVar.f37345j.get(this.f37322c);
                if (zVar != null) {
                    Object obj = zVar.f37403h;
                    if (obj instanceof com.google.android.gms.common.internal.f) {
                        com.google.android.gms.common.internal.f fVar = (com.google.android.gms.common.internal.f) obj;
                        long j12 = this.f37323d;
                        boolean z11 = j12 > 0;
                        int gCoreServiceId = fVar.getGCoreServiceId();
                        if (sVar != null) {
                            z11 &= sVar.f11191c;
                            int i17 = sVar.f11192d;
                            int i18 = sVar.f11193e;
                            i11 = sVar.f11189a;
                            if (fVar.hasConnectionInfo() && !fVar.isConnecting()) {
                                com.google.android.gms.common.internal.j jVarA = a(zVar, fVar, this.f37321b);
                                if (jVarA == null) {
                                    return;
                                }
                                boolean z12 = jVarA.f11129c && j12 > 0;
                                i18 = jVarA.f11131e;
                                z11 = z12;
                            }
                            i13 = i17;
                            i12 = i18;
                        } else {
                            i11 = 0;
                            i12 = 100;
                            i13 = 5000;
                        }
                        int iElapsedRealtime = -1;
                        if (task.isSuccessful()) {
                            i16 = 0;
                            i15 = 0;
                        } else if (task.l()) {
                            i15 = -1;
                            i16 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof ApiException) {
                                Status status = ((ApiException) exception).f11049a;
                                i14 = status.f11059a;
                                pz.b bVar = status.f11062d;
                                if (bVar != null) {
                                    i15 = bVar.f35644b;
                                }
                                i16 = i14;
                            } else {
                                i14 = 101;
                            }
                            i15 = -1;
                            i16 = i14;
                        }
                        if (z11) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f37324e);
                            j9 = j12;
                            j11 = jCurrentTimeMillis;
                        } else {
                            j9 = 0;
                            j11 = 0;
                        }
                        d0 d0Var = new d0(new com.google.android.gms.common.internal.p(this.f37321b, i16, i15, j9, j11, null, null, gCoreServiceId, iElapsedRealtime), i11, i13, i12);
                        w5 w5Var = gVar.f37348n;
                        w5Var.sendMessage(w5Var.obtainMessage(18, d0Var));
                    }
                }
            }
        }
    }
}
