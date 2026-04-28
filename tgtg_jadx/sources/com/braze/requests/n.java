package com.braze.requests;

import java.util.LinkedHashMap;
import kotlin.collections.e0;
import kotlin.collections.w0;
import zendesk.faye.internal.Bayeux;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f10447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f10448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f10449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f10450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f10451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f10452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f10453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f10454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n f10455j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n f10456k;
    public static final n l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final n f10457m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f10458n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final n f10459o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ n[] f10460p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10461a;

    static {
        n nVar = new n("CONTENT_CARD_SYNC", 0, "content_cards/sync");
        f10449d = nVar;
        n nVar2 = new n("FEATURE_FLAG_SYNC", 1, "feature_flags/sync");
        f10450e = nVar2;
        n nVar3 = new n("V3_DATA", 2, Bayeux.KEY_DATA);
        f10451f = nVar3;
        n nVar4 = new n("TEMPLATE_REQUEST", 3, "template");
        f10452g = nVar4;
        n nVar5 = new n("PUSH_DELIVERY_EVENTS", 4, "push/delivery_events");
        f10453h = nVar5;
        n nVar6 = new n("GEOFENCE_REFRESH", 5, "geofence/request");
        f10454i = nVar6;
        n nVar7 = new n("GEOFENCE_REPORT", 6, "geofence/report");
        f10455j = nVar7;
        n nVar8 = new n("PUSH_REDELIVER", 7, "push/redeliver");
        f10456k = nVar8;
        n nVar9 = new n("BANNERS_SYNC", 8, "banners/sync");
        l = nVar9;
        n nVar10 = new n("SDK_DEBUGGER_INIT", 9, "debugger/init");
        f10457m = nVar10;
        n nVar11 = new n("SDK_DEBUGGER_LOG", 10, "debugger/log");
        f10458n = nVar11;
        n nVar12 = new n("DUST_CONFIG", 11, "dust/config");
        f10459o = nVar12;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10, nVar11, nVar12};
        f10460p = nVarArr;
        a80.b bVar = new a80.b(nVarArr);
        f10447b = new m();
        int iA = w0.a(e0.o(bVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        k90.f fVar = new k90.f(bVar, 1);
        while (fVar.hasNext()) {
            Object next = fVar.next();
            linkedHashMap.put(((n) next).f10461a, next);
        }
        f10448c = linkedHashMap;
    }

    public n(String str, int i11, String str2) {
        this.f10461a = str2;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f10460p.clone();
    }
}
