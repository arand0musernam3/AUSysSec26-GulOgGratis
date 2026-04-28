package y00;

import java.util.List;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ x f45269b = new x(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ x f45270c = new x(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ x f45271d = new x(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ x f45272e = new x(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ x f45273f = new x(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ x f45274g = new x(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ x f45275h = new x(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ x f45276i = new x(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ x f45277j = new x(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ x f45278k = new x(9);
    public static final /* synthetic */ x l = new x(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ x f45279m = new x(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ x f45280n = new x(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ x f45281o = new x(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ x f45282p = new x(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ x f45283q = new x(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ x f45284r = new x(16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ x f45285s = new x(17);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ x f45286t = new x(18);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ x f45287u = new x(19);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ x f45288v = new x(20);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ x f45289w = new x(21);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ x f45290x = new x(22);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ x f45291y = new x(23);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ x f45292z = new x(24);
    public static final /* synthetic */ x A = new x(25);
    public static final /* synthetic */ x B = new x(26);
    public static final /* synthetic */ x C = new x(27);
    public static final /* synthetic */ x D = new x(28);
    public static final /* synthetic */ x E = new x(29);

    public /* synthetic */ x(int i11) {
        this.f45293a = i11;
    }

    @Override // y00.w
    public final Object a() {
        switch (this.f45293a) {
            case 0:
                List list = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(1, 3600000L, "measurement.app_uninstalled_additional_ad_id_cache_time").get();
            case 1:
                List list2 = g0.f44762a;
                return (String) com.google.android.gms.internal.measurement.n3.f11653a.get();
            case 2:
                List list3 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(69, 1000L, "measurement.upload.max_error_events_per_day").get()).longValue());
            case 3:
                List list4 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(74, 10L, "measurement.upload.max_realtime_events_per_day").get()).longValue());
            case 4:
                List list5 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (String) com.google.android.gms.internal.measurement.e3.f11370a.i(16, "measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d").get();
            case 5:
                List list6 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(51, 600000L, "measurement.sgtm.upload.retry_interval").get();
            case 6:
                List list7 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(41, 1800000L, "measurement.sgtm.batch.retry_interval").get();
            case 7:
                List list8 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(47, 5000L, "measurement.sgtm.upload.max_queued_batches").get()).longValue());
            case 8:
                List list9 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(49, 1000L, "measurement.sgtm.upload.min_delay_after_broadcast").get();
            case 9:
                List list10 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(5, 86400000L, "measurement.config.cache_time").get();
            case 10:
                List list11 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(65, 3600000L, "measurement.upload.interval").get();
            case 11:
                List list12 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(28, 500L, "measurement.upload.minimum_delay").get();
            case 12:
                List list13 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(34, 604800000L, "measurement.upload.refresh_blacklisted_config_interval").get();
            case 13:
                List list14 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(77, 1800000L, "measurement.upload.retry_time").get();
            case 14:
                List list15 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(15, 605000L, "measurement.upload.google_signal_max_queue_time").get();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                List list16 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(36, 5000L, "measurement.service_client.idle_disconnect_millis").get();
            case 16:
                List list17 = g0.f44762a;
                com.google.android.gms.internal.measurement.d4.f11337b.get();
                return (String) com.google.android.gms.internal.measurement.e4.f11371a.i(5, "measurement.test.string_flag", "---").get();
            case 17:
                List list18 = g0.f44762a;
                com.google.android.gms.internal.measurement.d4.f11337b.get();
                return (Long) com.google.android.gms.internal.measurement.e4.f11371a.f(1, -1L, "measurement.test.cached_long_flag").get();
            case 18:
                List list19 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(21, 50L, "measurement.experiment.max_ids").get()).longValue());
            case 19:
                List list20 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(3, 100L, "measurement.max_bundles_per_iteration").get()).longValue());
            case 20:
                List list21 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(67, 100L, "measurement.upload.max_bundles").get()).longValue());
            case 21:
                List list22 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (String) com.google.android.gms.internal.measurement.e3.f11370a.i(60, "measurement.rb.attribution.uri_scheme", "https").get();
            case 22:
                List list23 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(12, 3600000L, "measurement.session.engagement_interval").get();
            case 23:
                List list24 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (String) com.google.android.gms.internal.measurement.e3.f11370a.i(13, "measurement.rb.attribution.event_params", "value|currency").get();
            case 24:
                List list25 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(57, 864000000L, "measurement.rb.attribution.max_queue_time").get();
            case 25:
                List list26 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(25, 0L, "measurement.rb.attribution.max_trigger_uris_queried_at_once").get()).longValue());
            case 26:
                List list27 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Boolean) com.google.android.gms.internal.measurement.e3.f11370a.b("measurement.config.notify_trigger_uris_on_backgrounded", 31, true).get();
            case 27:
                List list28 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(11, 3600000L, "45769094").get();
            case 28:
                List list29 = g0.f44762a;
                return (Boolean) com.google.android.gms.internal.measurement.t3.f11861a.get();
            default:
                List list30 = g0.f44762a;
                return (Boolean) com.google.android.gms.internal.measurement.v4.f11958a.get();
        }
    }
}
