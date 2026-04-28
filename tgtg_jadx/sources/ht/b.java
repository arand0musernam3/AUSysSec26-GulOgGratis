package ht;

import a90.v;
import android.database.Cursor;
import e0.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22488a = new a(23, 24, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22489b = new a(24, 25, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f22490c = new a(25, 26, 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f22491d = new a(27, 28, 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f22492e = new a(30, 31, 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f22493f = new a(31, 32, 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f22494g = new a(32, 33, 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f22495h = new c(7, 8, 17);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f22496i = new c(8, 9, 18);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f22497j = new c(9, 10, 19);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f22498k = new a(10, 11, 7);
    public static final a l = new a(11, 12, 8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f22499m = new a(12, 13, 9);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f22500n = new a(13, 14, 10);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f22501o = new a(14, 15, 11);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f22502p = new a(15, 16, 12);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f22503q = new a(16, 17, 13);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f22504r = new a(17, 18, 14);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f22505s = new a(18, 19, 15);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f22506t = new a(19, 20, 16);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f22507u = new a(20, 21, 17);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f22508v = new a(21, 22, 18);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f22509w = new a(22, 23, 19);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f22510x = new a(26, 27, 20);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f22511y = new a(28, 29, 21);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f22512z = new a(29, 30, 22);
    public static final a A = new a(33, 34, 23);
    public static final a B = new a(34, 35, 24);
    public static final a C = new a(35, 36, 25);
    public static final a D = new a(36, 37, 26);
    public static final a E = new a(37, 38, 27);
    public static final a F = new a(38, 39, 28);
    public static final a G = new a(39, 40, 29);
    public static final c H = new c(40, 41, 0);
    public static final c I = new c(41, 42, 1);
    public static final c J = new c(42, 43, 2);
    public static final c K = new c(43, 44, 3);
    public static final c L = new c(44, 45, 4);
    public static final c M = new c(45, 46, 5);
    public static final c N = new c(46, 47, 6);
    public static final c O = new c(47, 48, 7);
    public static final c P = new c(48, 49, 8);
    public static final c Q = new c(49, 50, 9);
    public static final c R = new c(50, 51, 10);
    public static final c S = new c(51, 52, 11);
    public static final c T = new c(52, 53, 12);
    public static final c U = new c(53, 54, 13);
    public static final c V = new c(54, 55, 14);
    public static final c W = new c(55, 56, 15);
    public static final c X = new c(56, 57, 16);

    public static final boolean a(ja.b bVar, String str) {
        try {
            bVar.getClass();
            Cursor cursorU = bVar.u(new v("SELECT * FROM orders LIMIT 0", 2));
            try {
                boolean z11 = cursorU.getColumnIndex(str) != -1;
                cursorU.close();
                return z11;
            } finally {
            }
        } catch (Exception e5) {
            sa0.a.f38953a.c(f.k("migration exception, message = ", e5.getMessage()), new Object[0]);
            return false;
        }
    }
}
