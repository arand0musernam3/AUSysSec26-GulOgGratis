package y00;

import com.google.android.gms.internal.measurement.x4;
import java.util.List;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y f45301b = new y(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ y f45302c = new y(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ y f45303d = new y(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ y f45304e = new y(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ y f45305f = new y(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ y f45306g = new y(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ y f45307h = new y(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ y f45308i = new y(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ y f45309j = new y(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ y f45310k = new y(9);
    public static final /* synthetic */ y l = new y(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ y f45311m = new y(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ y f45312n = new y(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ y f45313o = new y(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ y f45314p = new y(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ y f45315q = new y(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ y f45316r = new y(16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ y f45317s = new y(17);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ y f45318t = new y(18);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ y f45319u = new y(19);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ y f45320v = new y(20);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ y f45321w = new y(21);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ y f45322x = new y(22);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ y f45323y = new y(23);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ y f45324z = new y(24);
    public static final /* synthetic */ y A = new y(25);
    public static final /* synthetic */ y B = new y(26);
    public static final /* synthetic */ y C = new y(27);
    public static final /* synthetic */ y D = new y(28);
    public static final /* synthetic */ y E = new y(29);

    public /* synthetic */ y(int i11) {
        this.f45325a = i11;
    }

    @Override // y00.w
    public final Object a() {
        switch (this.f45325a) {
            case 0:
                List list = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (String) com.google.android.gms.internal.measurement.e3.f11370a.i(4, "measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid").get();
            case 1:
                List list2 = g0.f44762a;
                return (String) com.google.android.gms.internal.measurement.n3.f11654b.get();
            case 2:
                List list3 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(72, 50000L, "measurement.upload.max_public_events_per_day").get()).longValue());
            case 3:
                List list4 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(20, 100000L, "measurement.store.max_stored_events_per_app").get()).longValue());
            case 4:
                List list5 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (String) com.google.android.gms.internal.measurement.e3.f11370a.i(44, "measurement.sgtm.service_upload_apps_list", "").get();
            case 5:
                List list6 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(29, 86400000L, "measurement.monitoring.sample_period_millis").get();
            case 6:
                List list7 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(43, 21600000L, "measurement.sgtm.batch.retry_max_wait").get();
            case 7:
                List list8 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(46, 5L, "measurement.sgtm.upload.batches_retrieval_limit").get()).longValue());
            case 8:
                List list9 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(48, 600000L, "measurement.sgtm.upload.min_delay_after_background").get();
            case 9:
                List list10 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(63, 43200000L, "measurement.upload.backoff_period").get();
            case 10:
                List list11 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(33, ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS, "measurement.upload.realtime_upload_interval").get();
            case 11:
                List list12 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(27, TimeConstants.ONE_MINUTE_DIFFERENCE, "measurement.alarm_manager.minimum_interval").get();
            case 12:
                List list13 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(64, 15000L, "measurement.upload.initial_upload_delay_time").get();
            case 13:
                List list14 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(76, 6L, "measurement.upload.retry_count").get()).longValue());
            case 14:
                List list15 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(17, 4L, "measurement.lifetimevalue.max_currency_tracked").get()).longValue());
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                List list16 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(38, 1000L, "measurement.service_client.reconnect_millis").get();
            case 16:
                List list17 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (String) com.google.android.gms.internal.measurement.e3.f11370a.i(7, "measurement.config.url_authority", "app-measurement.com").get();
            case 17:
                List list18 = g0.f44762a;
                com.google.android.gms.internal.measurement.d4.f11337b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e4.f11371a.f(3, -2L, "measurement.test.int_flag").get()).longValue());
            case 18:
                List list19 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(23, 27L, "measurement.upload.max_item_scoped_custom_parameters").get()).longValue());
            case 19:
                List list20 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (Long) com.google.android.gms.internal.measurement.e3.f11370a.f(61, 604800000L, "measurement.sdk.attribution.cache.ttl").get();
            case 20:
                List list21 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(26, 7L, "measurement.rb.attribution.client.min_ad_services_version").get()).longValue());
            case 21:
                List list22 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (String) com.google.android.gms.internal.measurement.e3.f11370a.i(56, "measurement.rb.attribution.uri_authority", "google-analytics.com").get();
            case 22:
                List list23 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (String) com.google.android.gms.internal.measurement.e3.f11370a.i(32, "measurement.rb.attribution.app_allowlist", "").get();
            case 23:
                List list24 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return (String) com.google.android.gms.internal.measurement.e3.f11370a.i(59, "measurement.rb.attribution.query_parameters_to_remove", "").get();
            case 24:
                List list25 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(54, 16L, "measurement.rb.attribution.max_retry_delay_seconds").get()).longValue());
            case 25:
                List list26 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(24, 1000L, "measurement.rb.max_trigger_registrations_per_day").get()).longValue());
            case 26:
                List list27 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(30, 3000L, "measurement.rb.attribution.notify_app_delay_millis").get()).longValue());
            case 27:
                List list28 = g0.f44762a;
                com.google.android.gms.internal.measurement.d3.f11335b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.e3.f11370a.f(66, 65536L, "measurement.upload.max_bundle_size").get()).longValue());
            case 28:
                List list29 = g0.f44762a;
                return (Boolean) com.google.android.gms.internal.measurement.t3.f11863c.get();
            default:
                List list30 = g0.f44762a;
                return (Boolean) x4.f12030a.get();
        }
    }
}
