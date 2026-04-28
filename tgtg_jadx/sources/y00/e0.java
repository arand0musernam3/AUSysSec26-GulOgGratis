package y00;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.vf;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e0 implements w, y30.a, yc.e, t1.z, zz.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ e0 f44700b = new e0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e0 f44701c = new e0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e0 f44702d = new e0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e0 f44703e = new e0(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ e0 f44704f = new e0(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ e0 f44705g = new e0(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ e0 f44706h = new e0(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44707a;

    public /* synthetic */ e0(int i11) {
        this.f44707a = i11;
    }

    @Override // y00.w
    public Object a() {
        switch (this.f44707a) {
            case 0:
                List list = g0.f44762a;
                return (Boolean) com.google.android.gms.internal.measurement.r3.f11816b.get();
            case 1:
                List list2 = g0.f44762a;
                return (Boolean) com.google.android.gms.internal.measurement.s4.f11839a.get();
            case 2:
                List list3 = g0.f44762a;
                com.google.android.gms.internal.measurement.f4.f11406b.get();
                return (Boolean) com.google.android.gms.internal.measurement.g4.f11432a.b("measurement.rb.attribution.uuid_generation", 8, true).get();
            case 3:
                List list4 = g0.f44762a;
                return (Boolean) com.google.android.gms.internal.measurement.i4.f11485a.get();
            case 4:
                List list5 = g0.f44762a;
                return (Boolean) com.google.android.gms.internal.measurement.k4.f11560a.get();
            case 5:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.x3.f12028a.get()).booleanValue());
            default:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.m4.f11625a.get()).booleanValue());
        }
    }

    @Override // yc.e
    public boolean b() {
        return true;
    }

    @Override // t1.z
    public float d() {
        return 0.0f;
    }

    @Override // t1.z
    public float e(float f11, long j9) {
        return 0.0f;
    }

    @Override // t1.z
    public float f(float f11, float f12, long j9) {
        return 0.0f;
    }

    @Override // zz.c
    public vf g(Context context, String str, zz.b bVar) {
        vf vfVar = new vf();
        int iD = bVar.d(context, str);
        vfVar.f11968a = iD;
        if (iD != 0) {
            vfVar.f11970c = -1;
            return vfVar;
        }
        int iC = bVar.c(context, str, true);
        vfVar.f11969b = iC;
        if (iC != 0) {
            vfVar.f11970c = 1;
        }
        return vfVar;
    }

    @Override // y30.a
    public void h(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // t1.z
    public long k(float f11) {
        return 0L;
    }

    @Override // t1.z
    public float l(float f11, float f12) {
        return 0.0f;
    }

    @Override // yc.e
    public void shutdown() {
    }
}
