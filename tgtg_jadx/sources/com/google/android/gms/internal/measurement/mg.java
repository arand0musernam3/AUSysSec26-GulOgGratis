package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class mg {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final lg f11644f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final lg f11646h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tg f11639a = new tg("cause", Throwable.class, false, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final tg f11640b = new tg("ratelimit_count", Integer.class, false, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tg f11641c = new tg("sampling_count", Integer.class, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final tg f11642d = new tg("ratelimit_period", gg.class, false, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final tg f11643e = new tg("skipped", Integer.class, false, false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final tg f11645g = new tg("forced", Boolean.class, false, false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final tg f11647i = new tg("stack_size", ah.class, false, false);

    static {
        boolean z11 = true;
        f11644f = new lg("group_by", Object.class, z11, z11, 0);
        f11646h = new lg("tags", y.class, false, z11, 1);
    }
}
