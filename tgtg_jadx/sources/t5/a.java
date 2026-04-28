package t5;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import android.widget.ImageView;
import bg.r;
import c50.w;
import coil.request.NullRequestDataException;
import com.app.tgtg.customview.ExpandableTextView;
import com.app.tgtg.feature.catering.ui.CateringItemDetailsActivity;
import com.app.tgtg.model.remote.item.response.CateringItem;
import com.braze.h2;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import cv.i;
import e6.j;
import ed.o;
import ed.q;
import ia0.c0;
import ia0.d0;
import ia0.h0;
import ia0.i0;
import ia0.j0;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import l8.m;
import m2.s0;
import m3.c3;
import pc.h;
import q1.t0;
import s0.g0;
import ss.w0;
import ss.x;
import ss.x0;
import uh.g;
import y00.v2;
import y00.y0;
import yc.e;
import zc.f;
import zc.k;
import zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents;
import zw.a3;
import zw.e2;
import zw.i1;
import zw.k0;
import zw.l1;
import zw.n1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements i0, r, j, v2, y0, y3.d, y30.b, y30.a, e, a30.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a f39789e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f39791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f39792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f39793d;

    public a(int i11) {
        this.f39790a = i11;
        switch (i11) {
            case 3:
                this.f39791b = new AtomicReference(u3.e.f40653c);
                this.f39792c = new Object();
                break;
            case 5:
                this.f39791b = new WeakHashMap();
                this.f39792c = new WeakHashMap();
                this.f39793d = new WeakHashMap();
                break;
            case 13:
                d2.e eVar = new d2.e(5, false);
                eVar.f13775b = Float.NaN;
                this.f39791b = eVar;
                this.f39792c = new s0();
                break;
            default:
                this.f39793d = new l20.c(21);
                break;
        }
    }

    public static void K(List list, Size size) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        list.addAll(arrayList);
    }

    public static final void d(a aVar, Network network, boolean z11) {
        boolean z12;
        Network[] allNetworks = ((ConnectivityManager) aVar.f39791b).getAllNetworks();
        int length = allNetworks.length;
        boolean z13 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            Network network2 = allNetworks[i11];
            if (Intrinsics.areEqual(network2, network)) {
                z12 = z11;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) aVar.f39791b).getNetworkCapabilities(network2);
                z12 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z12) {
                z13 = true;
                break;
            }
            i11++;
        }
        q qVar = (q) aVar.f39792c;
        synchronized (qVar) {
            try {
                h hVar = (h) qVar.f15942a.get();
                if (hVar != null) {
                    o oVar = hVar.f34659e;
                    if (oVar != null && oVar.getLevel() <= 4) {
                        oVar.log("NetworkObserver", 4, z13 ? "ONLINE" : "OFFLINE", null);
                    }
                    qVar.f15946e = z13;
                } else {
                    qVar.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static f g(k kVar, Throwable th2) {
        Drawable drawableB;
        if (th2 instanceof NullRequestDataException) {
            Drawable drawable = kVar.F;
            zc.c cVar = kVar.H;
            Integer num = kVar.E;
            cVar.getClass();
            drawableB = ed.h.b(kVar, drawable, num);
            if (drawableB == null) {
                Drawable drawable2 = kVar.D;
                Integer num2 = kVar.C;
                cVar.getClass();
                drawableB = ed.h.b(kVar, drawable2, num2);
            }
        } else {
            Drawable drawable3 = kVar.D;
            Integer num3 = kVar.C;
            kVar.H.getClass();
            drawableB = ed.h.b(kVar, drawable3, num3);
        }
        return new f(drawableB, kVar, th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static n1 p(l1 l1Var, String str) {
        n1 n1VarP;
        n1 n1Var = (n1) l1Var;
        if (str.equals(n1Var.f48294c)) {
            return n1Var;
        }
        for (Object obj : l1Var.getChildren()) {
            if (obj instanceof n1) {
                n1 n1Var2 = (n1) obj;
                if (str.equals(n1Var2.f48294c)) {
                    return n1Var2;
                }
                if ((obj instanceof l1) && (n1VarP = p((l1) obj, str)) != null) {
                    return n1VarP;
                }
            }
        }
        return null;
    }

    public static a s(InputStream inputStream) {
        a3 a3Var = new a3();
        a3Var.f48154a = null;
        a3Var.f48155b = null;
        a3Var.f48156c = false;
        a3Var.f48158e = false;
        a3Var.f48159f = null;
        a3Var.f48160g = null;
        a3Var.f48161h = false;
        a3Var.f48162i = null;
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i11 = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i11 == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            a3Var.B(inputStream);
            return a3Var.f48154a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    public static LocationRequest t() {
        LocationRequest locationRequest = new LocationRequest(102, 3600000L, 600000L, 0L, LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
        long j9 = locationRequest.f12107c;
        long j11 = locationRequest.f12106b;
        if (j9 == j11 / 6) {
            locationRequest.f12107c = 1666L;
        }
        if (locationRequest.f12113i == j11) {
            locationRequest.f12113i = ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS;
        }
        locationRequest.f12106b = ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS;
        locationRequest.f12107c = 5000L;
        s00.h.a(100);
        locationRequest.f12105a = 100;
        return locationRequest;
    }

    public static ArrayList u(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(v0.a.f41584a);
        arrayList2.add(v0.a.f41586c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList2.add(rational);
                        break;
                    }
                    if (v0.a.a((Rational) it2.next(), size)) {
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    public static Rational w(int i11, boolean z11) {
        if (i11 == -1 || i11 == 0) {
            return z11 ? v0.a.f41584a : v0.a.f41585b;
        }
        if (i11 == 1) {
            return z11 ? v0.a.f41586c : v0.a.f41587d;
        }
        wd.a.r("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i11);
        return null;
    }

    public static HashMap x(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = u(arrayList).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (v0.a.a(rational, size)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static boolean y(k kVar, Bitmap.Config config) {
        if (config == Bitmap.Config.HARDWARE) {
            if (!kVar.f47475m) {
                return false;
            }
            bd.b bVar = kVar.f47466c;
            if (bVar instanceof bd.a) {
                ImageView imageView = ((bd.a) bVar).f6105b;
                if (imageView.isAttachedToWindow() && !imageView.isHardwareAccelerated()) {
                    return false;
                }
            }
        }
        return true;
    }

    public synchronized void A(String str, String str2) {
        str2.getClass();
        try {
            Cursor cursorQuery = ((xb.a) this.f39792c).a().query(true, "entries", new String[]{"id"}, "(state=? OR state=? OR (state=? AND process_id IS NULL)) AND type=?", new String[]{"0", "3", "1", str2}, null, null, "id ASC", String.valueOf(((ub.b) this.f39791b).f40985c));
            if (cursorQuery != null) {
                try {
                    SQLiteStatement sQLiteStatementCompileStatement = ((xb.a) this.f39792c).a().compileStatement("UPDATE entries SET state=1, process_id='" + str + "' WHERE id=?;");
                    cursorQuery.moveToFirst();
                    while (!cursorQuery.isAfterLast()) {
                        sQLiteStatementCompileStatement.bindLong(1, cursorQuery.getLong(0));
                        sQLiteStatementCompileStatement.execute();
                        cursorQuery.moveToNext();
                    }
                    cursorQuery.close();
                } finally {
                }
            }
        } catch (Exception e5) {
            ((ub.a) this.f39793d).p("AnalyticsSQLiteDataSource", "Unable to mark entries for delivery", e5);
        }
    }

    public void B() {
        switch (this.f39790a) {
            case 10:
                ((x0) this.f39792c).f39269a.a(new f70.a());
                break;
            default:
                ((x) this.f39792c).f39268a.a(new f70.a());
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zc.n C(zc.k r17, ad.h r18) {
        /*
            r16 = this;
            r0 = r17
            r4 = r18
            java.util.List r1 = r0.f47471h
            android.graphics.Bitmap$Config r2 = r0.f47469f
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L1a
            android.graphics.Bitmap$Config[] r1 = ed.k.f15927a
            boolean r1 = kotlin.collections.y.v(r1, r2)
            if (r1 == 0) goto L17
            goto L1a
        L17:
            r1 = r16
            goto L31
        L1a:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
            if (r2 != r1) goto L34
            boolean r1 = y(r0, r2)
            if (r1 == 0) goto L17
            r1 = r16
            java.lang.Object r3 = r1.f39793d
            ed.m r3 = (ed.m) r3
            boolean r3 = r3.s(r4)
            if (r3 == 0) goto L31
            goto L36
        L31:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            goto L36
        L34:
            r1 = r16
        L36:
            a.a r3 = r4.f1227a
            ad.b r5 = ad.b.f1222b
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r5)
            if (r3 != 0) goto L4d
            a.a r3 = r4.f1228b
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r5)
            if (r3 == 0) goto L49
            goto L4d
        L49:
            ad.g r3 = r0.f47487y
        L4b:
            r5 = r3
            goto L50
        L4d:
            ad.g r3 = ad.g.FIT
            goto L4b
        L50:
            boolean r3 = r0.f47476n
            if (r3 == 0) goto L63
            java.util.List r3 = r0.f47471h
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L63
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ALPHA_8
            if (r2 == r3) goto L63
            r3 = 1
        L61:
            r7 = r3
            goto L65
        L63:
            r3 = 0
            goto L61
        L65:
            zc.n r3 = new zc.n
            android.content.Context r1 = r0.f47464a
            boolean r6 = ed.h.a(r0)
            boolean r8 = r0.f47477o
            q90.t r10 = r0.f47473j
            zc.s r11 = r0.f47474k
            zc.p r12 = r0.f47488z
            zc.b r13 = r0.f47478p
            zc.b r14 = r0.f47479q
            zc.b r15 = r0.f47480r
            r0 = r3
            r3 = 0
            r9 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.a.C(zc.k, ad.h):zc.n");
    }

    public void D(String str, String str2) {
        str2.getClass();
        ((Properties) this.f39792c).setProperty(str, str2);
        H();
    }

    public void E() {
        m00.a aVar = (m00.a) this.f39791b;
        tt.a aVar2 = (tt.a) this.f39793d;
        aVar.getClass();
        String simpleName = tt.a.class.getSimpleName();
        com.google.android.gms.common.internal.i0.i(aVar2, "Listener must not be null");
        com.google.android.gms.common.internal.i0.f(simpleName, "Listener type must not be empty");
        aVar.doUnregisterEventListener(new qz.k(aVar2, simpleName), 2418).i(w0.a.f42801c, l20.c.f26793b);
        this.f39792c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F(android.graphics.Canvas r10, y9.h r11) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.a.F(android.graphics.Canvas, y9.h):void");
    }

    public n1 G(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String strReplace = str.replace("\\\n", "").replace("\\A", "\n");
        if (strReplace.length() <= 1 || !strReplace.startsWith("#")) {
            return null;
        }
        String strSubstring = strReplace.substring(1);
        HashMap map = (HashMap) this.f39793d;
        if (strSubstring.length() == 0) {
            return null;
        }
        if (strSubstring.equals(((i1) this.f39791b).f48294c)) {
            return (i1) this.f39791b;
        }
        if (map.containsKey(strSubstring)) {
            return (n1) map.get(strSubstring);
        }
        n1 n1VarP = p((i1) this.f39791b, strSubstring);
        map.put(strSubstring, n1VarP);
        return n1VarP;
    }

    public void H() {
        File file = (File) this.f39793d;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ((Properties) this.f39792c).store(fileOutputStream, (String) null);
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th2) {
            kf.b bVar = (kf.b) this.f39791b;
            if (bVar != null) {
                bVar.a("Failed to save property file with path " + file.getAbsolutePath() + ", error stacktrace: " + u70.e.b(th2));
            }
        }
    }

    public void I(Object obj) {
        long jC = u3.e.c();
        if (jC == u3.k.f40662a) {
            this.f39793d = obj;
            return;
        }
        synchronized (this.f39792c) {
            u3.j jVar = (u3.j) ((AtomicReference) this.f39791b).get();
            int iA = jVar.a(jC);
            if (iA < 0) {
                ((AtomicReference) this.f39791b).set(jVar.b(jC, obj));
            } else {
                jVar.f40661c[iA] = obj;
            }
        }
    }

    public void J(String str) {
        if (str != null) {
            this.f39791b = str;
        } else {
            w.l("Null backendName");
        }
    }

    public void L() {
        t0 t0Var = (t0) this.f39791b;
        String str = (String) this.f39792c;
        List list = (List) t0Var.k(str);
        if (list != null) {
            list.remove((Function0) this.f39793d);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        t0Var.m(str, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zc.n M(zc.n r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            android.graphics.Bitmap$Config r2 = r0.f47491b
            zc.b r3 = r0.f47503o
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.HARDWARE
            r5 = 1
            if (r2 != r4) goto L1d
            java.lang.Object r4 = r1.f39793d
            ed.m r4 = (ed.m) r4
            boolean r4 = r4.e()
            if (r4 == 0) goto L18
            goto L1d
        L18:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r4 = r5
        L1b:
            r8 = r2
            goto L1f
        L1d:
            r4 = 0
            goto L1b
        L1f:
            zc.b r2 = r0.f47503o
            boolean r2 = r2.a()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.f39792c
            ed.q r2 = (ed.q) r2
            monitor-enter(r2)
            r2.a()     // Catch: java.lang.Throwable -> L39
            boolean r6 = r2.f15946e     // Catch: java.lang.Throwable -> L39
            monitor-exit(r2)
            if (r6 != 0) goto L3c
            zc.b r3 = zc.b.DISABLED
        L36:
            r21 = r3
            goto L3e
        L39:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L39
            throw r0
        L3c:
            r5 = r4
            goto L36
        L3e:
            if (r5 == 0) goto L6a
            android.content.Context r7 = r0.f47490a
            android.graphics.ColorSpace r9 = r0.f47492c
            ad.h r10 = r0.f47493d
            ad.g r11 = r0.f47494e
            boolean r12 = r0.f47495f
            boolean r13 = r0.f47496g
            boolean r14 = r0.f47497h
            java.lang.String r15 = r0.f47498i
            q90.t r2 = r0.f47499j
            zc.s r3 = r0.f47500k
            zc.p r4 = r0.l
            zc.b r5 = r0.f47501m
            zc.b r0 = r0.f47502n
            zc.n r6 = new zc.n
            r20 = r0
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r6
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.a.M(zc.n):zc.n");
    }

    public synchronized void N(int i11, ArrayList arrayList) {
        SQLiteDatabase sQLiteDatabaseA = ((xb.a) this.f39792c).a();
        try {
            sQLiteDatabaseA.execSQL("UPDATE entries SET state=" + i11 + " WHERE id IN (" + y9.w.G(arrayList) + ");");
        } catch (Exception e5) {
            ((ub.a) this.f39793d).p("AnalyticsSQLiteDataSource", "Unable to update statuses", e5);
        }
    }

    public synchronized void O(int i11, int i12, long j9, long j11) {
        ((y00.n1) this.f39791b).f44992k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.f39793d;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((sz.b) this.f39792c).c(new t(0, Arrays.asList(new p(36301, i11, 0, j9, j11, null, null, 0, i12)))).e(new androidx.recyclerview.widget.j(2, jElapsedRealtime, this));
    }

    @Override // a30.c
    public Object a() {
        return new z20.e((z20.j) ((a30.c) this.f39791b).a(), (z20.c) ((a30.c) this.f39792c).a(), ((m) ((u6.f) this.f39793d).f40820a).f27469a);
    }

    @Override // yc.e
    public boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f39791b;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:55:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:55:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // y00.v2, y00.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.String r9, int r10, java.lang.Throwable r11, byte[] r12, java.util.Map r13) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.a.c(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    @Override // ia0.i0
    public void cancel() {
        switch (this.f39790a) {
            case 6:
                ((i0) this.f39791b).cancel();
                break;
            default:
                ((v90.e) ((e20.a) this.f39793d).f15581e).cancel();
                break;
        }
    }

    @Override // bg.r
    public void e() {
        ExpandableTextView expandableTextView = (ExpandableTextView) this.f39793d;
        CateringItemDetailsActivity cateringItemDetailsActivity = (CateringItemDetailsActivity) this.f39791b;
        int i11 = CateringItemDetailsActivity.f8972o;
        g gVarF = cateringItemDetailsActivity.F();
        i iVar = i.TEMP_ACTION_UNFOLD_ITEM_DESCRIPTION;
        dv.a aVar = dv.a.ITEM_ID;
        CateringItem cateringItem = (CateringItem) this.f39792c;
        Pair pair = new Pair(aVar, new dv.c(cateringItem.getInformation().mo340getItemIdFvU5WIY()));
        dv.a aVar2 = dv.a.STORE_ID;
        String strM370getStoreId7QsYvu8 = mv.d.m(cateringItem).m370getStoreId7QsYvu8();
        if (strM370getStoreId7QsYvu8 == null) {
            strM370getStoreId7QsYvu8 = null;
        }
        gVarF.d(iVar, h0.g.E(pair, new Pair(aVar2, new dv.c(strM370getStoreId7QsYvu8))));
        expandableTextView.getViewTreeObserver().addOnPreDrawListener(new en.i(cateringItemDetailsActivity, expandableTextView, 1));
    }

    public wy.i f() {
        String strConcat = ((String) this.f39791b) == null ? " backendName" : "";
        if (((ty.d) this.f39793d) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new wy.i((String) this.f39791b, (byte[]) this.f39792c, (ty.d) this.f39793d);
        }
        h2.b("Missing required properties:".concat(strConcat));
        return null;
    }

    @Override // ia0.i0
    public j0 getSource() {
        switch (this.f39790a) {
            case 6:
                return (d0) this.f39792c;
            default:
                return (u90.f) this.f39792c;
        }
    }

    @Override // y30.a
    public void h(Bundle bundle) {
        synchronized (this.f39792c) {
            try {
                x30.b bVar = x30.b.f43820a;
                bVar.c("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f39793d = new CountDownLatch(1);
                ((x0.e) this.f39791b).h(bundle);
                bVar.c("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f39793d).await(500, TimeUnit.MILLISECONDS)) {
                        bVar.c("App exception callback received from Analytics listener.");
                    } else {
                        bVar.d("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f39793d = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // y30.b
    public void i(Bundle bundle, String str) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f39793d;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    public Object j() {
        long jC = u3.e.c();
        if (jC == u3.k.f40662a) {
            return this.f39793d;
        }
        u3.j jVar = (u3.j) ((AtomicReference) this.f39791b).get();
        int iA = jVar.a(jC);
        if (iA >= 0) {
            return jVar.f40661c[iA];
        }
        return null;
    }

    public c k() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((l20.c) this.f39793d)) {
            try {
                c cVar = (c) this.f39792c;
                if (cVar != null && localeList == ((LocaleList) this.f39791b)) {
                    return cVar;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.add(new b(localeList.get(i11)));
                }
                c cVar2 = new c(arrayList);
                this.f39791b = localeList;
                this.f39792c = cVar2;
                return cVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public h4.a l() {
        e2 e2Var;
        e2 e2Var2;
        e2 e2Var3;
        e2 e2Var4;
        float fC;
        e2 e2Var5;
        i1 i1Var = (i1) this.f39791b;
        k0 k0Var = i1Var.f48239r;
        k0 k0Var2 = i1Var.f48240s;
        if (k0Var == null || k0Var.i() || (e2Var = k0Var.f48262b) == (e2Var2 = e2.percent) || e2Var == (e2Var3 = e2.f48186em) || e2Var == (e2Var4 = e2.f48187ex)) {
            return new h4.a(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fC2 = k0Var.c();
        if (k0Var2 == null) {
            h4.a aVar = ((i1) this.f39791b).f48360o;
            fC = aVar != null ? (aVar.f21377e * fC2) / aVar.f21376d : fC2;
        } else {
            if (k0Var2.i() || (e2Var5 = k0Var2.f48262b) == e2Var2 || e2Var5 == e2Var3 || e2Var5 == e2Var4) {
                return new h4.a(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fC = k0Var2.c();
        }
        return new h4.a(0.0f, 0.0f, fC2, fC);
    }

    public RectF m() {
        i1 i1Var = (i1) this.f39791b;
        if (i1Var == null) {
            i4.a.f("SVG document is empty");
            return null;
        }
        h4.a aVar = i1Var.f48360o;
        if (aVar == null) {
            return null;
        }
        aVar.getClass();
        return new RectF(aVar.f21374b, aVar.f21375c, aVar.c(), aVar.d());
    }

    @Override // ia0.i0
    public h0 n() {
        switch (this.f39790a) {
            case 6:
                return (c0) this.f39793d;
            default:
                return (u90.e) this.f39791b;
        }
    }

    @Override // e6.j
    public Object o(e6.i iVar) {
        iVar.a(new a8.f(this, 17), w.b.F());
        ((w0.b) this.f39793d).f42804a.set(iVar);
        return "HandlerScheduledFuture-" + ((Callable) this.f39792c).toString();
    }

    public synchronized ArrayList q(int i11, String str, String str2) {
        ArrayList arrayList;
        Cursor cursorQuery;
        str2.getClass();
        arrayList = new ArrayList();
        try {
            cursorQuery = ((xb.a) this.f39792c).a().query(true, "entries", null, "state=? AND process_id=? AND type=?", new String[]{String.valueOf(1), str, str2}, null, null, "id ASC", String.valueOf(i11));
        } catch (Exception e5) {
            ((ub.a) this.f39793d).p("AnalyticsSQLiteDataSource", "Unable to get entries with process id " + str + ", entryType " + str2 + " and 1 state", e5);
        }
        try {
            cursorQuery.moveToFirst();
            while (!cursorQuery.isAfterLast()) {
                long j9 = cursorQuery.getLong(0);
                String string = cursorQuery.getString(1);
                String string2 = cursorQuery.getString(2);
                string2.getClass();
                arrayList.add(new wb.a(j9, string, string2, cursorQuery.getInt(3), cursorQuery.getString(4), cursorQuery.getString(5), cursorQuery.getString(6)));
                cursorQuery.moveToNext();
            }
            cursorQuery.close();
        } finally {
        }
        return arrayList;
    }

    public synchronized ArrayList r(String str, String str2) {
        ArrayList arrayListQ;
        str2.getClass();
        int i11 = ((ub.b) this.f39791b).f40986d;
        synchronized (this) {
            arrayListQ = q(i11, str, str2);
        }
        return arrayListQ;
        return arrayListQ;
    }

    @Override // yc.e
    public void shutdown() {
        ((ConnectivityManager) this.f39791b).unregisterNetworkCallback((mb.d) this.f39793d);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList v(s0.o2 r13) {
        /*
            Method dump skipped, instruction units count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.a.v(s0.o2):java.util.ArrayList");
    }

    public boolean z() {
        if (((c3) this.f39791b).getValue() != this.f39793d) {
            return true;
        }
        a aVar = (a) this.f39792c;
        return aVar != null && aVar.z();
    }

    public /* synthetic */ a(int i11, boolean z11) {
        this.f39790a = i11;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i11) {
        this.f39790a = i11;
        this.f39791b = obj;
        this.f39792c = obj2;
        this.f39793d = obj3;
    }

    public a(Context context, y00.n1 n1Var) {
        this.f39790a = 19;
        this.f39793d = new AtomicLong(-1L);
        this.f39792c = new sz.b(context, null, sz.b.f39287a, new u("measurement:api"), com.google.android.gms.common.api.k.f11084c);
        this.f39791b = n1Var;
    }

    public a(File file, String str, kf.b bVar) {
        this.f39790a = 26;
        file.getClass();
        this.f39791b = bVar;
        this.f39792c = new Properties();
        this.f39793d = new File(file, str.concat(".properties"));
    }

    public a(w0 w0Var, x0 x0Var, at.c0 c0Var) {
        this.f39790a = 10;
        w0Var.getClass();
        x0Var.getClass();
        c0Var.getClass();
        this.f39791b = w0Var;
        this.f39792c = x0Var;
        this.f39793d = c0Var;
    }

    public a(ss.w wVar, x xVar, at.c0 c0Var) {
        this.f39790a = 11;
        wVar.getClass();
        xVar.getClass();
        c0Var.getClass();
        this.f39791b = wVar;
        this.f39792c = xVar;
        this.f39793d = c0Var;
    }

    public a(Context context) {
        this.f39790a = 1;
        int i11 = LocationServices.f12120a;
        this.f39791b = new m00.a(context, null, m00.a.f28650b, com.google.android.gms.common.api.d.S, com.google.android.gms.common.api.k.f11084c, 0);
        this.f39793d = new tt.a(this);
    }

    public a(h hVar, q qVar, o oVar) {
        Object iVar;
        this.f39790a = 28;
        this.f39791b = hVar;
        this.f39792c = qVar;
        if (ed.d.f15922a) {
            iVar = new a1.b(false, 4);
        } else {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 != 26 && i11 != 27) {
                iVar = new a1.b(true, 4);
            } else {
                iVar = new lz.i(oVar, 12);
            }
        }
        this.f39793d = iVar;
    }

    public a(xb.a aVar, ub.b bVar, jb.b bVar2) {
        this.f39790a = 15;
        ub.a aVar2 = new ub.a(bVar, bVar2);
        bVar2.getClass();
        this.f39791b = bVar;
        this.f39792c = aVar;
        this.f39793d = aVar2;
    }

    public a(i0 i0Var) {
        this.f39790a = 6;
        this.f39791b = i0Var;
        this.f39792c = ia0.b.c(i0Var.getSource());
        this.f39793d = ia0.b.b(i0Var.n());
    }

    public a(x0.e eVar) {
        this.f39790a = 24;
        this.f39792c = new Object();
        this.f39791b = eVar;
    }

    public /* synthetic */ a(int i11, Object obj, Object obj2, Object obj3, boolean z11) {
        this.f39790a = i11;
        this.f39793d = obj;
        this.f39791b = obj2;
        this.f39792c = obj3;
    }

    public a(ConnectivityManager connectivityManager, q qVar) {
        this.f39790a = 25;
        this.f39791b = connectivityManager;
        this.f39792c = qVar;
        mb.d dVar = new mb.d(this, 2);
        this.f39793d = dVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), dVar);
    }

    public a(g0 g0Var, Size size) {
        Rational rational;
        this.f39790a = 17;
        this.f39791b = g0Var;
        g0Var.b();
        g0Var.k();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List listV = g0Var.v(256);
            if (listV.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(listV, new v0.b(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.f39792c = rational;
        this.f39793d = new y0.h(g0Var, rational);
    }

    public a(e20.a aVar) {
        this.f39790a = 7;
        this.f39793d = aVar;
        v90.e eVar = (v90.e) aVar.f15581e;
        this.f39791b = new u90.e(aVar, eVar.g().n(), -1L, true);
        this.f39792c = new u90.f(aVar, eVar.g().getSource(), -1L, true);
    }

    public a(q5.g0 g0Var, a aVar) {
        this.f39790a = 4;
        this.f39791b = g0Var;
        this.f39792c = aVar;
        this.f39793d = g0Var.getValue();
    }
}
