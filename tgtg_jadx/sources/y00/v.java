package y00;

import com.google.android.gms.internal.measurement.cc;
import com.google.android.gms.internal.measurement.fc;
import com.google.android.gms.internal.measurement.i5;
import com.google.android.gms.internal.measurement.rc;
import com.google.android.gms.internal.measurement.s5;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ v f45223b = new v(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ v f45224c = new v(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ v f45225d = new v(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ v f45226e = new v(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ v f45227f = new v(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ v f45228g = new v(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ v f45229h = new v(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ v f45230i = new v(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ v f45231j = new v(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ v f45232k = new v(9);
    public static final /* synthetic */ v l = new v(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ v f45233m = new v(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ v f45234n = new v(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ v f45235o = new v(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ v f45236p = new v(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ v f45237q = new v(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ v f45238r = new v(16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ v f45239s = new v(17);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ v f45240t = new v(18);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ v f45241u = new v(19);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ v f45242v = new v(20);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ v f45243w = new v(21);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ v f45244x = new v(22);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ v f45245y = new v(23);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ v f45246z = new v(24);
    public static final /* synthetic */ v A = new v(25);
    public static final /* synthetic */ v B = new v(26);
    public static final /* synthetic */ v C = new v(27);
    public static final /* synthetic */ v D = new v(28);
    public static final /* synthetic */ v E = new v(29);

    public /* synthetic */ v(int i11) {
        this.f45247a = i11;
    }

    @Override // y00.w
    public final Object a() {
        switch (this.f45247a) {
            case 0:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.v3.f11957a.get()).booleanValue());
            case 1:
                List list = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (String) com.google.android.gms.internal.measurement.e3.f11370a.i(14, "measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp").get();
            case 2:
                List list2 = g0.f44762a;
                return (String) com.google.android.gms.internal.measurement.n3.f11655c.get();
            case 3:
                List list3 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(68, ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS, "measurement.upload.max_conversions_per_day").get()).longValue());
            case 4:
                List list4 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (String) com.google.android.gms.internal.measurement.e3.f11370a.i(78, "measurement.upload.url", "https://app-measurement.com/a").get();
            case 5:
                List list5 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (String) com.google.android.gms.internal.measurement.e3.f11370a.i(45, "measurement.sgtm.upload.backoff_http_codes", "404,429,503,504").get();
            case 6:
                List list6 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(52, 21600000L, "measurement.sgtm.upload.retry_max_wait").get();
            case 7:
                List list7 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(42, 10L, "measurement.sgtm.batch.retry_max_count").get()).longValue());
            case 8:
                List list8 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(50, 5000L, "measurement.sgtm.upload.min_delay_after_startup").get();
            case 9:
                List list9 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(40, 240000L, "measurement.sgtm.batch.long_queuing_threshold").get();
            case 10:
                List list10 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(79, 3600000L, "measurement.upload.window_interval").get();
            case 11:
                List list11 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(9, 1000L, "measurement.upload.debug_upload_interval").get();
            case 12:
                List list12 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(53, 86400000L, "measurement.upload.stale_data_deletion_interval").get();
            case 13:
                List list13 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (String) com.google.android.gms.internal.measurement.e3.f11370a.i(8, "measurement.config.url_scheme", "https").get();
            case 14:
                List list14 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(73, 518400000L, "measurement.upload.max_queue_time").get();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                List list15 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(22, 200L, "measurement.audience.filter_result_max_count").get()).longValue());
            case 16:
                List list16 = g0.f44762a;
                com.google.android.gms.internal.measurement.d4.f11337b.get();
                return (Boolean) com.google.android.gms.internal.measurement.e4.f11371a.b("measurement.test.boolean_flag", 0, false).get();
            case 17:
                List list17 = g0.f44762a;
                com.google.android.gms.internal.measurement.d4.f11337b.get();
                return (Long) com.google.android.gms.internal.measurement.e4.f11371a.f(4, -1L, "measurement.test.long_flag").get();
            case 18:
                List list18 = g0.f44762a;
                com.google.android.gms.internal.measurement.d4.f11337b.get();
                i5 i5Var = com.google.android.gms.internal.measurement.e4.f11371a;
                AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) i5Var.f11487b;
                fc fcVar = (fc) atomicReferenceArray.get(2);
                if (fcVar == null) {
                    cc ccVar = new cc("measurement.test.double_flag", (rc) ((s5) i5Var.f11488c).f11844b);
                    while (true) {
                        if (atomicReferenceArray.compareAndSet(2, null, ccVar)) {
                            fcVar = ccVar;
                        } else if (atomicReferenceArray.get(2) != null) {
                            fcVar = (fc) atomicReferenceArray.get(2);
                            fcVar.getClass();
                        }
                    }
                }
                return (Double) fcVar.get();
            case 19:
                List list19 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(19, 500L, "measurement.upload.max_event_parameter_value_length").get()).longValue());
            case 20:
                List list20 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(62, 7200000L, "measurement.redaction.app_instance_id.ttl").get();
            case 21:
                List list21 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(18, 1L, "measurement.dma_consent.max_daily_dcu_realtime_events").get()).longValue());
            case 22:
                List list22 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (String) com.google.android.gms.internal.measurement.e3.f11370a.i(58, "measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion").get();
            case 23:
                List list23 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (String) com.google.android.gms.internal.measurement.e3.f11370a.i(80, "measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot").get();
            case 24:
                List list24 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(75, 65536L, "measurement.upload.max_batch_size").get()).longValue());
            case 25:
                List list25 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(55, 90L, "measurement.rb.attribution.client.min_time_after_boot_seconds").get()).longValue());
            case 26:
                List list26 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Boolean) com.google.android.gms.internal.measurement.e3.f11370a.b("measurement.config.bundle_for_all_apps_on_backgrounded", 2, true).get();
            case 27:
                List list27 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Boolean) com.google.android.gms.internal.measurement.e3.f11370a.b("measurement.config.default_flag_values", 10, true).get();
            case 28:
                List list28 = g0.f44762a;
                return (Boolean) com.google.android.gms.internal.measurement.t3.f11862b.get();
            default:
                List list29 = g0.f44762a;
                return (Boolean) com.google.android.gms.internal.measurement.z3.f12080a.get();
        }
    }
}
