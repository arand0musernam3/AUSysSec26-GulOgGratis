package y00;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.c6;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44853a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f44855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f44856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f44857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f44858f;

    public i2(t2 t2Var, AtomicReference atomicReference, String str, String str2, boolean z11) {
        this.f44857e = atomicReference;
        this.f44854b = str;
        this.f44855c = str2;
        this.f44856d = z11;
        Objects.requireNonNull(t2Var);
        this.f44858f = t2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x010b A[Catch: RuntimeException -> 0x00e5, TRY_ENTER, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:66:0x0152, B:69:0x016b, B:71:0x017a, B:70:0x0172, B:72:0x018d, B:74:0x0193, B:76:0x0199, B:78:0x019f, B:80:0x01a5, B:82:0x01ad, B:84:0x01b5, B:86:0x01bb, B:87:0x01cd, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:101:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152 A[Catch: RuntimeException -> 0x00e5, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:66:0x0152, B:69:0x016b, B:71:0x017a, B:70:0x0172, B:72:0x018d, B:74:0x0193, B:76:0x0199, B:78:0x019f, B:80:0x01a5, B:82:0x01ad, B:84:0x01b5, B:86:0x01bb, B:87:0x01cd, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:101:0x0094 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.i2.run():void");
    }

    public i2(com.google.firebase.messaging.j jVar, boolean z11, Uri uri, String str, String str2) {
        this.f44856d = z11;
        this.f44857e = uri;
        this.f44854b = str;
        this.f44855c = str2;
        this.f44858f = jVar;
    }

    public i2(AppMeasurementDynamiteService appMeasurementDynamiteService, c6 c6Var, String str, String str2, boolean z11) {
        this.f44857e = c6Var;
        this.f44854b = str;
        this.f44855c = str2;
        this.f44856d = z11;
        this.f44858f = appMeasurementDynamiteService;
    }

    public i2(m3 m3Var, t4 t4Var, boolean z11, t tVar, Bundle bundle) {
        this.f44857e = t4Var;
        this.f44856d = z11;
        this.f44854b = tVar;
        this.f44855c = bundle;
        Objects.requireNonNull(m3Var);
        this.f44858f = m3Var;
    }
}
