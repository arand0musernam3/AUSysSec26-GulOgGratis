package x80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f44055a = new q(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f44056b = a90.g.l(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44057c = a90.g.l(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a90.v f44058d = new a90.v("BUFFERED", 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a90.v f44059e = new a90.v("SHOULD_BUFFER", 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a90.v f44060f = new a90.v("S_RESUMING_BY_RCV", 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a90.v f44061g = new a90.v("RESUMING_BY_EB", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a90.v f44062h = new a90.v("POISONED", 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a90.v f44063i = new a90.v("DONE_RCV", 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a90.v f44064j = new a90.v("INTERRUPTED_SEND", 0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a90.v f44065k = new a90.v("INTERRUPTED_RCV", 0);
    public static final a90.v l = new a90.v("CHANNEL_CLOSED", 0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a90.v f44066m = new a90.v("SUSPEND", 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a90.v f44067n = new a90.v("SUSPEND_NO_WAITER", 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a90.v f44068o = new a90.v("FAILED", 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a90.v f44069p = new a90.v("NO_RECEIVE_RESULT", 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a90.v f44070q = new a90.v("CLOSE_HANDLER_CLOSED", 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a90.v f44071r = new a90.v("CLOSE_HANDLER_INVOKED", 0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a90.v f44072s = new a90.v("NO_CLOSE_CAUSE", 0);

    public static final boolean a(v80.k kVar, Object obj, i80.n nVar) {
        a90.v vVarN = kVar.n(obj, nVar);
        if (vVarN == null) {
            return false;
        }
        kVar.o(vVarN);
        return true;
    }
}
