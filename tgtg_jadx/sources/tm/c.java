package tm;

import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.mapService.response.MapClustersResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f40292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f40293k;
    public MapClustersResponse l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f40294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f40295n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f40296o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f40297p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e f40298q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ LatLngInfo f40299r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LatLngInfo f40300s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ double f40301t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f40302u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, LatLngInfo latLngInfo, LatLngInfo latLngInfo2, double d3, boolean z11, x70.c cVar) {
        super(2, cVar);
        this.f40298q = eVar;
        this.f40299r = latLngInfo;
        this.f40300s = latLngInfo2;
        this.f40301t = d3;
        this.f40302u = z11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        c cVar2 = new c(this.f40298q, this.f40299r, this.f40300s, this.f40301t, this.f40302u, cVar);
        cVar2.f40297p = obj;
        return cVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fa A[Catch: all -> 0x0036, b -> 0x0039, TryCatch #2 {b -> 0x0039, all -> 0x0036, blocks: (B:9:0x002d, B:55:0x0159, B:57:0x0165, B:58:0x0167, B:59:0x016b, B:61:0x0171, B:63:0x0181, B:65:0x018d, B:70:0x019d, B:66:0x0190, B:68:0x0198, B:69:0x019b, B:71:0x01a1, B:73:0x01b1, B:74:0x01ba, B:76:0x01c0, B:78:0x01cd, B:80:0x01d9, B:81:0x01dd, B:83:0x01e3, B:91:0x01f8, B:94:0x020c, B:95:0x0219, B:97:0x021f, B:93:0x01fe, B:85:0x01e9, B:87:0x01ef, B:18:0x004c, B:51:0x012f, B:19:0x0056, B:42:0x00f0, B:44:0x00fa, B:46:0x0103, B:47:0x0106, B:21:0x0062, B:27:0x0077, B:29:0x007d, B:30:0x0094, B:32:0x00ab, B:34:0x00b7, B:39:0x00dc, B:38:0x00ca, B:24:0x006b), top: B:110:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0165 A[Catch: all -> 0x0036, b -> 0x0039, TryCatch #2 {b -> 0x0039, all -> 0x0036, blocks: (B:9:0x002d, B:55:0x0159, B:57:0x0165, B:58:0x0167, B:59:0x016b, B:61:0x0171, B:63:0x0181, B:65:0x018d, B:70:0x019d, B:66:0x0190, B:68:0x0198, B:69:0x019b, B:71:0x01a1, B:73:0x01b1, B:74:0x01ba, B:76:0x01c0, B:78:0x01cd, B:80:0x01d9, B:81:0x01dd, B:83:0x01e3, B:91:0x01f8, B:94:0x020c, B:95:0x0219, B:97:0x021f, B:93:0x01fe, B:85:0x01e9, B:87:0x01ef, B:18:0x004c, B:51:0x012f, B:19:0x0056, B:42:0x00f0, B:44:0x00fa, B:46:0x0103, B:47:0x0106, B:21:0x0062, B:27:0x0077, B:29:0x007d, B:30:0x0094, B:32:0x00ab, B:34:0x00b7, B:39:0x00dc, B:38:0x00ca, B:24:0x006b), top: B:110:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0171 A[Catch: all -> 0x0036, b -> 0x0039, TryCatch #2 {b -> 0x0039, all -> 0x0036, blocks: (B:9:0x002d, B:55:0x0159, B:57:0x0165, B:58:0x0167, B:59:0x016b, B:61:0x0171, B:63:0x0181, B:65:0x018d, B:70:0x019d, B:66:0x0190, B:68:0x0198, B:69:0x019b, B:71:0x01a1, B:73:0x01b1, B:74:0x01ba, B:76:0x01c0, B:78:0x01cd, B:80:0x01d9, B:81:0x01dd, B:83:0x01e3, B:91:0x01f8, B:94:0x020c, B:95:0x0219, B:97:0x021f, B:93:0x01fe, B:85:0x01e9, B:87:0x01ef, B:18:0x004c, B:51:0x012f, B:19:0x0056, B:42:0x00f0, B:44:0x00fa, B:46:0x0103, B:47:0x0106, B:21:0x0062, B:27:0x0077, B:29:0x007d, B:30:0x0094, B:32:0x00ab, B:34:0x00b7, B:39:0x00dc, B:38:0x00ca, B:24:0x006b), top: B:110:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b1 A[Catch: all -> 0x0036, b -> 0x0039, TryCatch #2 {b -> 0x0039, all -> 0x0036, blocks: (B:9:0x002d, B:55:0x0159, B:57:0x0165, B:58:0x0167, B:59:0x016b, B:61:0x0171, B:63:0x0181, B:65:0x018d, B:70:0x019d, B:66:0x0190, B:68:0x0198, B:69:0x019b, B:71:0x01a1, B:73:0x01b1, B:74:0x01ba, B:76:0x01c0, B:78:0x01cd, B:80:0x01d9, B:81:0x01dd, B:83:0x01e3, B:91:0x01f8, B:94:0x020c, B:95:0x0219, B:97:0x021f, B:93:0x01fe, B:85:0x01e9, B:87:0x01ef, B:18:0x004c, B:51:0x012f, B:19:0x0056, B:42:0x00f0, B:44:0x00fa, B:46:0x0103, B:47:0x0106, B:21:0x0062, B:27:0x0077, B:29:0x007d, B:30:0x0094, B:32:0x00ab, B:34:0x00b7, B:39:0x00dc, B:38:0x00ca, B:24:0x006b), top: B:110:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021f A[Catch: all -> 0x0036, b -> 0x0039, TRY_LEAVE, TryCatch #2 {b -> 0x0039, all -> 0x0036, blocks: (B:9:0x002d, B:55:0x0159, B:57:0x0165, B:58:0x0167, B:59:0x016b, B:61:0x0171, B:63:0x0181, B:65:0x018d, B:70:0x019d, B:66:0x0190, B:68:0x0198, B:69:0x019b, B:71:0x01a1, B:73:0x01b1, B:74:0x01ba, B:76:0x01c0, B:78:0x01cd, B:80:0x01d9, B:81:0x01dd, B:83:0x01e3, B:91:0x01f8, B:94:0x020c, B:95:0x0219, B:97:0x021f, B:93:0x01fe, B:85:0x01e9, B:87:0x01ef, B:18:0x004c, B:51:0x012f, B:19:0x0056, B:42:0x00f0, B:44:0x00fa, B:46:0x0103, B:47:0x0106, B:21:0x0062, B:27:0x0077, B:29:0x007d, B:30:0x0094, B:32:0x00ab, B:34:0x00b7, B:39:0x00dc, B:38:0x00ca, B:24:0x006b), top: B:110:0x001d }] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tm.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
