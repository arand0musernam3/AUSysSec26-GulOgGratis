package y00;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c0 implements w, kotlin.coroutines.f, r5.s, zz.b, zz.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c0 f44635b = new c0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c0 f44636c = new c0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c0 f44637d = new c0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c0 f44638e = new c0(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c0 f44639f = new c0(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ c0 f44640g = new c0(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ c0 f44641h = new c0(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ c0 f44642i = new c0(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44643a;

    public /* synthetic */ c0(int i11) {
        this.f44643a = i11;
    }

    @Override // y00.w
    public Object a() {
        switch (this.f44643a) {
            case 0:
                List list = g0.f44762a;
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.g3.f11431a.get()).longValue());
            case 1:
                List list2 = g0.f44762a;
                return (Boolean) com.google.android.gms.internal.measurement.o4.f11691a.get();
            case 2:
                List list3 = g0.f44762a;
                com.google.android.gms.internal.measurement.f4.f11406b.get();
                return (Boolean) com.google.android.gms.internal.measurement.g4.f11432a.b("measurement.rb.attribution.service", 6, true).get();
            case 3:
                List list4 = g0.f44762a;
                com.google.android.gms.internal.measurement.f4.f11406b.get();
                return (Boolean) com.google.android.gms.internal.measurement.g4.f11432a.b("measurement.rb.attribution.enable_trigger_redaction", 7, true).get();
            case 4:
                List list5 = g0.f44762a;
                com.google.android.gms.internal.measurement.f4.f11406b.get();
                return (Boolean) com.google.android.gms.internal.measurement.g4.f11432a.b("measurement.rb.attribution.service.trigger_uris_high_priority", 2, true).get();
            case 5:
                List list6 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(71, 100000L, "measurement.upload.max_events_per_day").get()).longValue());
            case 6:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.x3.f12029b.get()).booleanValue());
            default:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.q4.f11781a.get()).booleanValue());
        }
    }

    @Override // zz.b
    public int c(Context context, String str, boolean z11) {
        return zz.d.d(context, str, z11);
    }

    @Override // zz.b
    public int d(Context context, String str) {
        return zz.d.a(context, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[PHI: r4
      0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // zz.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.measurement.vf g(android.content.Context r3, java.lang.String r4, zz.b r5) {
        /*
            r2 = this;
            com.google.android.gms.internal.measurement.vf r0 = new com.google.android.gms.internal.measurement.vf
            r0.<init>()
            int r1 = r5.d(r3, r4)
            r0.f11968a = r1
            r1 = 1
            int r3 = r5.c(r3, r4, r1)
            r0.f11969b = r3
            int r4 = r0.f11968a
            if (r4 != 0) goto L1b
            r4 = 0
            if (r3 != 0) goto L1b
            r1 = r4
            goto L1e
        L1b:
            if (r4 < r3) goto L1e
            r1 = -1
        L1e:
            r0.f11970c = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.c0.g(android.content.Context, java.lang.String, zz.b):com.google.android.gms.internal.measurement.vf");
    }

    @Override // r5.s
    public int i(int i11) {
        return i11 == 0 ? i11 : i11 - 1;
    }

    @Override // r5.s
    public int r(int i11) {
        return i11 == 0 ? i11 : i11 + 1;
    }
}
