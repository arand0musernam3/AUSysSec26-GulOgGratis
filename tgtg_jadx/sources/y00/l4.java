package y00;

import android.app.BroadcastOptions;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import com.google.android.gms.internal.measurement.a9;
import com.google.android.gms.internal.measurement.b9;
import com.google.android.gms.internal.measurement.d8;
import com.google.android.gms.internal.measurement.g8;
import com.google.android.gms.internal.measurement.k9;
import com.google.android.gms.internal.measurement.l9;
import com.google.android.gms.internal.measurement.s7;
import com.google.android.gms.internal.measurement.s8;
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.internal.measurement.w8;
import com.google.android.gms.internal.measurement.x7;
import com.google.android.gms.internal.measurement.z8;
import com.google.android.gms.internal.measurement.zzaeh;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationLogTimestampFormatterKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l4 implements x1 {
    public static volatile l4 K;
    public final HashMap B;
    public final HashMap C;
    public final HashMap D;
    public a3 F;
    public String G;
    public t3 H;
    public long I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f44920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f44921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f44922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c1 f44923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z3 f44924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f44925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n4 f44926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a1 f44927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o3 f44928i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f1 f44930k;
    public final n1 l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f44932n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f44933o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f44934p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f44936r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f44937s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f44938t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f44939u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f44940v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public FileLock f44941w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FileChannel f44942x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f44943y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList f44944z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f44931m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinkedList f44935q = new LinkedList();
    public final HashMap E = new HashMap();
    public final i4 J = new i4(this, 0);
    public long A = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h4 f44929j = new h4(this);

    public l4(androidx.appcompat.view.a aVar) {
        this.l = n1.s(aVar.f1840a, null, null, null);
        n4 n4Var = new n4(this);
        n4Var.r();
        this.f44926g = n4Var;
        a1 a1Var = new a1(this, 0);
        a1Var.r();
        this.f44921b = a1Var;
        h1 h1Var = new h1(this);
        h1Var.r();
        this.f44920a = h1Var;
        this.B = new HashMap();
        this.C = new HashMap();
        this.D = new HashMap();
        d().y(new a8.f(this, aVar));
    }

    public static l4 C(Context context) {
        com.google.android.gms.common.internal.i0.h(context);
        com.google.android.gms.common.internal.i0.h(context.getApplicationContext());
        if (K == null) {
            synchronized (l4.class) {
                try {
                    if (K == null) {
                        androidx.appcompat.view.a aVar = new androidx.appcompat.view.a();
                        com.google.android.gms.common.internal.i0.h(context);
                        Context applicationContext = context.getApplicationContext();
                        com.google.android.gms.common.internal.i0.h(applicationContext);
                        aVar.f1840a = applicationContext;
                        K = new l4(aVar);
                    }
                } finally {
                }
            }
        }
        return K;
    }

    public static final void D(s8 s8Var, int i11, String str) {
        List listI = s8Var.i();
        for (int i12 = 0; i12 < listI.size(); i12++) {
            if ("_err".equals(((w8) listI.get(i12)).u())) {
                return;
            }
        }
        v8 v8VarF = w8.F();
        v8VarF.i("_err");
        v8VarF.k(i11);
        w8 w8Var = (w8) v8VarF.d();
        v8 v8VarF2 = w8.F();
        v8VarF2.i("_ev");
        v8VarF2.j(str);
        w8 w8Var2 = (w8) v8VarF2.d();
        s8Var.l(w8Var);
        s8Var.l(w8Var2);
    }

    public static final void E(s8 s8Var, String str) {
        List listI = s8Var.i();
        for (int i11 = 0; i11 < listI.size(); i11++) {
            if (str.equals(((w8) listI.get(i11)).u())) {
                s8Var.n(i11);
                return;
            }
        }
    }

    public static void S(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    public static final boolean T(t4 t4Var) {
        return !TextUtils.isEmpty(t4Var.f45171b);
    }

    public static final void U(f4 f4Var) {
        if (f4Var == null) {
            com.braze.h2.b("Upload Component not created");
        } else {
            if (f4Var.f44757d) {
                return;
            }
            com.braze.h2.b("Component not initialized: ".concat(String.valueOf(f4Var.getClass())));
        }
    }

    public static final Boolean V(t4 t4Var) {
        Boolean bool = t4Var.f45184p;
        String str = t4Var.C;
        if (!TextUtils.isEmpty(str)) {
            int iOrdinal = ((y1) t10.c.t(str).f39648a).ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    public final void A(b1 b1Var) {
        q1.e eVar;
        q1.e eVar2;
        d().p();
        if (TextUtils.isEmpty(b1Var.H())) {
            String strE = b1Var.E();
            com.google.android.gms.common.internal.i0.h(strE);
            B(strE, 204, null, null, null);
            return;
        }
        String strE2 = b1Var.E();
        com.google.android.gms.common.internal.i0.h(strE2);
        b().f45267o.b(strE2, "Fetching remote configuration");
        h1 h1Var = this.f44920a;
        U(h1Var);
        x7 x7VarB = h1Var.B(strE2);
        U(h1Var);
        h1Var.p();
        String str = (String) h1Var.f44842o.get(strE2);
        if (x7VarB != null) {
            if (TextUtils.isEmpty(str)) {
                eVar2 = null;
            } else {
                eVar2 = new q1.e(0);
                eVar2.put("If-Modified-Since", str);
            }
            U(h1Var);
            h1Var.p();
            String str2 = (String) h1Var.f44843p.get(strE2);
            if (!TextUtils.isEmpty(str2)) {
                if (eVar2 == null) {
                    eVar2 = new q1.e(0);
                }
                eVar2.put("If-None-Match", str2);
            }
            eVar = eVar2;
        } else {
            eVar = null;
        }
        this.f44938t = true;
        a1 a1Var = this.f44921b;
        U(a1Var);
        u6.f fVar = new u6.f(this);
        n1 n1Var = (n1) a1Var.f21216b;
        a1Var.p();
        a1Var.q();
        h4 h4Var = a1Var.f44586c.f44929j;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) g0.f44777f.a(null)).encodedAuthority((String) g0.f44780g.a(null)).path("config/app/".concat(String.valueOf(b1Var.H()))).appendQueryParameter("platform", AnalyticsPlatformParams.channel);
        ((n1) h4Var.f21216b).f44985d.v();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(161000L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            l1 l1Var = n1Var.f44988g;
            n1.m(l1Var);
            l1Var.B(new z0(a1Var, b1Var.E(), url, (byte[]) null, eVar, fVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45260g.c("Failed to parse config URL. Not fetching. appId", w0.x(b1Var.E()), string);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0174 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:11:0x0045, B:21:0x0063, B:58:0x0177, B:29:0x0080, B:34:0x00dc, B:33:0x00ca, B:35:0x00e1, B:39:0x00f8, B:43:0x010e, B:45:0x0126, B:47:0x0141, B:49:0x014a, B:51:0x0150, B:52:0x0154, B:54:0x015d, B:56:0x016c, B:57:0x0174, B:46:0x0132, B:40:0x00ff, B:42:0x0108), top: B:66:0x0045, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(java.lang.String r10, int r11, java.lang.Throwable r12, byte[] r13, java.util.Map r14) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.l4.B(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final int F(String str, x0.e eVar) {
        a2 a2Var;
        y1 y1VarT;
        h1 h1Var = this.f44920a;
        if (h1Var.L(str) == null) {
            eVar.j(a2.AD_PERSONALIZATION, h.FAILSAFE);
            return 1;
        }
        m mVar = this.f44922c;
        U(mVar);
        b1 b1VarT0 = mVar.t0(str);
        if (b1VarT0 == null || ((y1) t10.c.t(b1VarT0.s()).f39648a) != y1.POLICY || (y1VarT = h1Var.t(str, (a2Var = a2.AD_PERSONALIZATION))) == y1.UNINITIALIZED) {
            a2 a2Var2 = a2.AD_PERSONALIZATION;
            eVar.j(a2Var2, h.REMOTE_DEFAULT);
            if (h1Var.K(str, a2Var2)) {
                return 0;
            }
        } else {
            eVar.j(a2Var, h.REMOTE_ENFORCED_DEFAULT);
            if (y1VarT == y1.GRANTED) {
                return 0;
            }
        }
        return 1;
    }

    public final HashMap G(t8 t8Var) {
        Serializable serializableH;
        HashMap map = new HashMap();
        k0();
        HashMap map2 = new HashMap();
        for (w8 w8Var : t8Var.v()) {
            if (w8Var.u().startsWith("gad_") && (serializableH = n4.H(w8Var)) != null) {
                map2.put(w8Var.u(), serializableH);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    public final void H() {
        d().p();
        if (this.f44935q.isEmpty()) {
            return;
        }
        if (this.H == null) {
            this.H = new t3(this, this.l, 2);
        }
        if (this.H.f44981c != 0) {
            return;
        }
        c().getClass();
        long jMax = Math.max(0L, ((long) ((Integer) g0.A0.a(null)).intValue()) - (SystemClock.elapsedRealtime() - this.I));
        b().f45267o.b(Long.valueOf(jMax), "Scheduling notify next app runnable, delay in ms");
        if (this.H == null) {
            this.H = new t3(this, this.l, 2);
        }
        this.H.b(jMax);
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x049b A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:228:0x0750, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:223:0x0728, B:225:0x072e, B:227:0x073c, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:231:0x0767, B:233:0x0779, B:235:0x0782, B:246:0x07b4, B:236:0x078a, B:238:0x0793, B:240:0x0799, B:243:0x07a5, B:245:0x07af, B:247:0x07b7, B:248:0x07c3, B:251:0x07cb, B:253:0x07dd, B:254:0x07e8, B:256:0x07f0, B:260:0x081f, B:262:0x083b, B:264:0x0850, B:266:0x086c, B:268:0x0881, B:269:0x089d, B:271:0x08a3, B:273:0x08bb, B:274:0x08c9, B:276:0x08d9, B:277:0x08e7, B:278:0x08ea, B:280:0x0934, B:282:0x093a, B:288:0x0965, B:290:0x096d, B:291:0x098b, B:293:0x0991, B:294:0x09a5, B:296:0x09bc, B:298:0x09d6, B:300:0x09e8, B:302:0x09f2, B:303:0x09f5, B:305:0x0a50, B:306:0x0a63, B:309:0x0a6b, B:312:0x0a8a, B:314:0x0aa3, B:316:0x0ab8, B:318:0x0abd, B:320:0x0ac1, B:322:0x0ac5, B:324:0x0acf, B:326:0x0ad8, B:328:0x0adc, B:330:0x0ae2, B:332:0x0aed, B:334:0x0afb, B:401:0x0d5c, B:336:0x0b03, B:338:0x0b1f, B:343:0x0b3c, B:345:0x0b5c, B:346:0x0b64, B:348:0x0b6a, B:350:0x0b7c, B:356:0x0b92, B:358:0x0ba8, B:359:0x0bcb, B:361:0x0bd7, B:363:0x0bed, B:364:0x0c2d, B:370:0x0c49, B:372:0x0c54, B:374:0x0c58, B:376:0x0c5c, B:378:0x0c60, B:379:0x0c6c, B:380:0x0c71, B:382:0x0c77, B:384:0x0c8d, B:385:0x0c92, B:400:0x0d59, B:387:0x0cd1, B:389:0x0cd5, B:393:0x0ce9, B:395:0x0d05, B:396:0x0d0c, B:399:0x0d4d, B:390:0x0cda, B:341:0x0b25, B:402:0x0d62, B:404:0x0d6c, B:405:0x0d80, B:406:0x0d88, B:408:0x0d8e, B:409:0x0da2, B:411:0x0db4, B:431:0x0e67, B:433:0x0e6d, B:435:0x0e84, B:438:0x0e8f, B:440:0x0e99, B:442:0x0ec0, B:444:0x0ed0, B:445:0x0eda, B:447:0x0ee8, B:448:0x0ef2, B:449:0x0efd, B:451:0x0f0f, B:454:0x0f16, B:459:0x0f59, B:455:0x0f25, B:457:0x0f33, B:458:0x0f40, B:460:0x0f68, B:461:0x0f7b, B:465:0x0f9b, B:464:0x0f86, B:412:0x0dcf, B:414:0x0dd5, B:416:0x0de7, B:418:0x0dee, B:424:0x0e06, B:426:0x0e0d, B:428:0x0e58, B:430:0x0e5f, B:429:0x0e5c, B:425:0x0e0a, B:417:0x0deb, B:283:0x094a, B:285:0x0950, B:287:0x0956, B:267:0x087e, B:263:0x084d, B:257:0x07f6, B:259:0x07fc, B:466:0x0fa4), top: B:472:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04ba A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:228:0x0750, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:223:0x0728, B:225:0x072e, B:227:0x073c, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:231:0x0767, B:233:0x0779, B:235:0x0782, B:246:0x07b4, B:236:0x078a, B:238:0x0793, B:240:0x0799, B:243:0x07a5, B:245:0x07af, B:247:0x07b7, B:248:0x07c3, B:251:0x07cb, B:253:0x07dd, B:254:0x07e8, B:256:0x07f0, B:260:0x081f, B:262:0x083b, B:264:0x0850, B:266:0x086c, B:268:0x0881, B:269:0x089d, B:271:0x08a3, B:273:0x08bb, B:274:0x08c9, B:276:0x08d9, B:277:0x08e7, B:278:0x08ea, B:280:0x0934, B:282:0x093a, B:288:0x0965, B:290:0x096d, B:291:0x098b, B:293:0x0991, B:294:0x09a5, B:296:0x09bc, B:298:0x09d6, B:300:0x09e8, B:302:0x09f2, B:303:0x09f5, B:305:0x0a50, B:306:0x0a63, B:309:0x0a6b, B:312:0x0a8a, B:314:0x0aa3, B:316:0x0ab8, B:318:0x0abd, B:320:0x0ac1, B:322:0x0ac5, B:324:0x0acf, B:326:0x0ad8, B:328:0x0adc, B:330:0x0ae2, B:332:0x0aed, B:334:0x0afb, B:401:0x0d5c, B:336:0x0b03, B:338:0x0b1f, B:343:0x0b3c, B:345:0x0b5c, B:346:0x0b64, B:348:0x0b6a, B:350:0x0b7c, B:356:0x0b92, B:358:0x0ba8, B:359:0x0bcb, B:361:0x0bd7, B:363:0x0bed, B:364:0x0c2d, B:370:0x0c49, B:372:0x0c54, B:374:0x0c58, B:376:0x0c5c, B:378:0x0c60, B:379:0x0c6c, B:380:0x0c71, B:382:0x0c77, B:384:0x0c8d, B:385:0x0c92, B:400:0x0d59, B:387:0x0cd1, B:389:0x0cd5, B:393:0x0ce9, B:395:0x0d05, B:396:0x0d0c, B:399:0x0d4d, B:390:0x0cda, B:341:0x0b25, B:402:0x0d62, B:404:0x0d6c, B:405:0x0d80, B:406:0x0d88, B:408:0x0d8e, B:409:0x0da2, B:411:0x0db4, B:431:0x0e67, B:433:0x0e6d, B:435:0x0e84, B:438:0x0e8f, B:440:0x0e99, B:442:0x0ec0, B:444:0x0ed0, B:445:0x0eda, B:447:0x0ee8, B:448:0x0ef2, B:449:0x0efd, B:451:0x0f0f, B:454:0x0f16, B:459:0x0f59, B:455:0x0f25, B:457:0x0f33, B:458:0x0f40, B:460:0x0f68, B:461:0x0f7b, B:465:0x0f9b, B:464:0x0f86, B:412:0x0dcf, B:414:0x0dd5, B:416:0x0de7, B:418:0x0dee, B:424:0x0e06, B:426:0x0e0d, B:428:0x0e58, B:430:0x0e5f, B:429:0x0e5c, B:425:0x0e0a, B:417:0x0deb, B:283:0x094a, B:285:0x0950, B:287:0x0956, B:267:0x087e, B:263:0x084d, B:257:0x07f6, B:259:0x07fc, B:466:0x0fa4), top: B:472:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05ea A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:228:0x0750, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:223:0x0728, B:225:0x072e, B:227:0x073c, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:231:0x0767, B:233:0x0779, B:235:0x0782, B:246:0x07b4, B:236:0x078a, B:238:0x0793, B:240:0x0799, B:243:0x07a5, B:245:0x07af, B:247:0x07b7, B:248:0x07c3, B:251:0x07cb, B:253:0x07dd, B:254:0x07e8, B:256:0x07f0, B:260:0x081f, B:262:0x083b, B:264:0x0850, B:266:0x086c, B:268:0x0881, B:269:0x089d, B:271:0x08a3, B:273:0x08bb, B:274:0x08c9, B:276:0x08d9, B:277:0x08e7, B:278:0x08ea, B:280:0x0934, B:282:0x093a, B:288:0x0965, B:290:0x096d, B:291:0x098b, B:293:0x0991, B:294:0x09a5, B:296:0x09bc, B:298:0x09d6, B:300:0x09e8, B:302:0x09f2, B:303:0x09f5, B:305:0x0a50, B:306:0x0a63, B:309:0x0a6b, B:312:0x0a8a, B:314:0x0aa3, B:316:0x0ab8, B:318:0x0abd, B:320:0x0ac1, B:322:0x0ac5, B:324:0x0acf, B:326:0x0ad8, B:328:0x0adc, B:330:0x0ae2, B:332:0x0aed, B:334:0x0afb, B:401:0x0d5c, B:336:0x0b03, B:338:0x0b1f, B:343:0x0b3c, B:345:0x0b5c, B:346:0x0b64, B:348:0x0b6a, B:350:0x0b7c, B:356:0x0b92, B:358:0x0ba8, B:359:0x0bcb, B:361:0x0bd7, B:363:0x0bed, B:364:0x0c2d, B:370:0x0c49, B:372:0x0c54, B:374:0x0c58, B:376:0x0c5c, B:378:0x0c60, B:379:0x0c6c, B:380:0x0c71, B:382:0x0c77, B:384:0x0c8d, B:385:0x0c92, B:400:0x0d59, B:387:0x0cd1, B:389:0x0cd5, B:393:0x0ce9, B:395:0x0d05, B:396:0x0d0c, B:399:0x0d4d, B:390:0x0cda, B:341:0x0b25, B:402:0x0d62, B:404:0x0d6c, B:405:0x0d80, B:406:0x0d88, B:408:0x0d8e, B:409:0x0da2, B:411:0x0db4, B:431:0x0e67, B:433:0x0e6d, B:435:0x0e84, B:438:0x0e8f, B:440:0x0e99, B:442:0x0ec0, B:444:0x0ed0, B:445:0x0eda, B:447:0x0ee8, B:448:0x0ef2, B:449:0x0efd, B:451:0x0f0f, B:454:0x0f16, B:459:0x0f59, B:455:0x0f25, B:457:0x0f33, B:458:0x0f40, B:460:0x0f68, B:461:0x0f7b, B:465:0x0f9b, B:464:0x0f86, B:412:0x0dcf, B:414:0x0dd5, B:416:0x0de7, B:418:0x0dee, B:424:0x0e06, B:426:0x0e0d, B:428:0x0e58, B:430:0x0e5f, B:429:0x0e5c, B:425:0x0e0a, B:417:0x0deb, B:283:0x094a, B:285:0x0950, B:287:0x0956, B:267:0x087e, B:263:0x084d, B:257:0x07f6, B:259:0x07fc, B:466:0x0fa4), top: B:472:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0606 A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:228:0x0750, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:223:0x0728, B:225:0x072e, B:227:0x073c, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:231:0x0767, B:233:0x0779, B:235:0x0782, B:246:0x07b4, B:236:0x078a, B:238:0x0793, B:240:0x0799, B:243:0x07a5, B:245:0x07af, B:247:0x07b7, B:248:0x07c3, B:251:0x07cb, B:253:0x07dd, B:254:0x07e8, B:256:0x07f0, B:260:0x081f, B:262:0x083b, B:264:0x0850, B:266:0x086c, B:268:0x0881, B:269:0x089d, B:271:0x08a3, B:273:0x08bb, B:274:0x08c9, B:276:0x08d9, B:277:0x08e7, B:278:0x08ea, B:280:0x0934, B:282:0x093a, B:288:0x0965, B:290:0x096d, B:291:0x098b, B:293:0x0991, B:294:0x09a5, B:296:0x09bc, B:298:0x09d6, B:300:0x09e8, B:302:0x09f2, B:303:0x09f5, B:305:0x0a50, B:306:0x0a63, B:309:0x0a6b, B:312:0x0a8a, B:314:0x0aa3, B:316:0x0ab8, B:318:0x0abd, B:320:0x0ac1, B:322:0x0ac5, B:324:0x0acf, B:326:0x0ad8, B:328:0x0adc, B:330:0x0ae2, B:332:0x0aed, B:334:0x0afb, B:401:0x0d5c, B:336:0x0b03, B:338:0x0b1f, B:343:0x0b3c, B:345:0x0b5c, B:346:0x0b64, B:348:0x0b6a, B:350:0x0b7c, B:356:0x0b92, B:358:0x0ba8, B:359:0x0bcb, B:361:0x0bd7, B:363:0x0bed, B:364:0x0c2d, B:370:0x0c49, B:372:0x0c54, B:374:0x0c58, B:376:0x0c5c, B:378:0x0c60, B:379:0x0c6c, B:380:0x0c71, B:382:0x0c77, B:384:0x0c8d, B:385:0x0c92, B:400:0x0d59, B:387:0x0cd1, B:389:0x0cd5, B:393:0x0ce9, B:395:0x0d05, B:396:0x0d0c, B:399:0x0d4d, B:390:0x0cda, B:341:0x0b25, B:402:0x0d62, B:404:0x0d6c, B:405:0x0d80, B:406:0x0d88, B:408:0x0d8e, B:409:0x0da2, B:411:0x0db4, B:431:0x0e67, B:433:0x0e6d, B:435:0x0e84, B:438:0x0e8f, B:440:0x0e99, B:442:0x0ec0, B:444:0x0ed0, B:445:0x0eda, B:447:0x0ee8, B:448:0x0ef2, B:449:0x0efd, B:451:0x0f0f, B:454:0x0f16, B:459:0x0f59, B:455:0x0f25, B:457:0x0f33, B:458:0x0f40, B:460:0x0f68, B:461:0x0f7b, B:465:0x0f9b, B:464:0x0f86, B:412:0x0dcf, B:414:0x0dd5, B:416:0x0de7, B:418:0x0dee, B:424:0x0e06, B:426:0x0e0d, B:428:0x0e58, B:430:0x0e5f, B:429:0x0e5c, B:425:0x0e0a, B:417:0x0deb, B:283:0x094a, B:285:0x0950, B:287:0x0956, B:267:0x087e, B:263:0x084d, B:257:0x07f6, B:259:0x07fc, B:466:0x0fa4), top: B:472:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x061b A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:228:0x0750, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:223:0x0728, B:225:0x072e, B:227:0x073c, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:231:0x0767, B:233:0x0779, B:235:0x0782, B:246:0x07b4, B:236:0x078a, B:238:0x0793, B:240:0x0799, B:243:0x07a5, B:245:0x07af, B:247:0x07b7, B:248:0x07c3, B:251:0x07cb, B:253:0x07dd, B:254:0x07e8, B:256:0x07f0, B:260:0x081f, B:262:0x083b, B:264:0x0850, B:266:0x086c, B:268:0x0881, B:269:0x089d, B:271:0x08a3, B:273:0x08bb, B:274:0x08c9, B:276:0x08d9, B:277:0x08e7, B:278:0x08ea, B:280:0x0934, B:282:0x093a, B:288:0x0965, B:290:0x096d, B:291:0x098b, B:293:0x0991, B:294:0x09a5, B:296:0x09bc, B:298:0x09d6, B:300:0x09e8, B:302:0x09f2, B:303:0x09f5, B:305:0x0a50, B:306:0x0a63, B:309:0x0a6b, B:312:0x0a8a, B:314:0x0aa3, B:316:0x0ab8, B:318:0x0abd, B:320:0x0ac1, B:322:0x0ac5, B:324:0x0acf, B:326:0x0ad8, B:328:0x0adc, B:330:0x0ae2, B:332:0x0aed, B:334:0x0afb, B:401:0x0d5c, B:336:0x0b03, B:338:0x0b1f, B:343:0x0b3c, B:345:0x0b5c, B:346:0x0b64, B:348:0x0b6a, B:350:0x0b7c, B:356:0x0b92, B:358:0x0ba8, B:359:0x0bcb, B:361:0x0bd7, B:363:0x0bed, B:364:0x0c2d, B:370:0x0c49, B:372:0x0c54, B:374:0x0c58, B:376:0x0c5c, B:378:0x0c60, B:379:0x0c6c, B:380:0x0c71, B:382:0x0c77, B:384:0x0c8d, B:385:0x0c92, B:400:0x0d59, B:387:0x0cd1, B:389:0x0cd5, B:393:0x0ce9, B:395:0x0d05, B:396:0x0d0c, B:399:0x0d4d, B:390:0x0cda, B:341:0x0b25, B:402:0x0d62, B:404:0x0d6c, B:405:0x0d80, B:406:0x0d88, B:408:0x0d8e, B:409:0x0da2, B:411:0x0db4, B:431:0x0e67, B:433:0x0e6d, B:435:0x0e84, B:438:0x0e8f, B:440:0x0e99, B:442:0x0ec0, B:444:0x0ed0, B:445:0x0eda, B:447:0x0ee8, B:448:0x0ef2, B:449:0x0efd, B:451:0x0f0f, B:454:0x0f16, B:459:0x0f59, B:455:0x0f25, B:457:0x0f33, B:458:0x0f40, B:460:0x0f68, B:461:0x0f7b, B:465:0x0f9b, B:464:0x0f86, B:412:0x0dcf, B:414:0x0dd5, B:416:0x0de7, B:418:0x0dee, B:424:0x0e06, B:426:0x0e0d, B:428:0x0e58, B:430:0x0e5f, B:429:0x0e5c, B:425:0x0e0a, B:417:0x0deb, B:283:0x094a, B:285:0x0950, B:287:0x0956, B:267:0x087e, B:263:0x084d, B:257:0x07f6, B:259:0x07fc, B:466:0x0fa4), top: B:472:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x078a A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:228:0x0750, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:223:0x0728, B:225:0x072e, B:227:0x073c, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:231:0x0767, B:233:0x0779, B:235:0x0782, B:246:0x07b4, B:236:0x078a, B:238:0x0793, B:240:0x0799, B:243:0x07a5, B:245:0x07af, B:247:0x07b7, B:248:0x07c3, B:251:0x07cb, B:253:0x07dd, B:254:0x07e8, B:256:0x07f0, B:260:0x081f, B:262:0x083b, B:264:0x0850, B:266:0x086c, B:268:0x0881, B:269:0x089d, B:271:0x08a3, B:273:0x08bb, B:274:0x08c9, B:276:0x08d9, B:277:0x08e7, B:278:0x08ea, B:280:0x0934, B:282:0x093a, B:288:0x0965, B:290:0x096d, B:291:0x098b, B:293:0x0991, B:294:0x09a5, B:296:0x09bc, B:298:0x09d6, B:300:0x09e8, B:302:0x09f2, B:303:0x09f5, B:305:0x0a50, B:306:0x0a63, B:309:0x0a6b, B:312:0x0a8a, B:314:0x0aa3, B:316:0x0ab8, B:318:0x0abd, B:320:0x0ac1, B:322:0x0ac5, B:324:0x0acf, B:326:0x0ad8, B:328:0x0adc, B:330:0x0ae2, B:332:0x0aed, B:334:0x0afb, B:401:0x0d5c, B:336:0x0b03, B:338:0x0b1f, B:343:0x0b3c, B:345:0x0b5c, B:346:0x0b64, B:348:0x0b6a, B:350:0x0b7c, B:356:0x0b92, B:358:0x0ba8, B:359:0x0bcb, B:361:0x0bd7, B:363:0x0bed, B:364:0x0c2d, B:370:0x0c49, B:372:0x0c54, B:374:0x0c58, B:376:0x0c5c, B:378:0x0c60, B:379:0x0c6c, B:380:0x0c71, B:382:0x0c77, B:384:0x0c8d, B:385:0x0c92, B:400:0x0d59, B:387:0x0cd1, B:389:0x0cd5, B:393:0x0ce9, B:395:0x0d05, B:396:0x0d0c, B:399:0x0d4d, B:390:0x0cda, B:341:0x0b25, B:402:0x0d62, B:404:0x0d6c, B:405:0x0d80, B:406:0x0d88, B:408:0x0d8e, B:409:0x0da2, B:411:0x0db4, B:431:0x0e67, B:433:0x0e6d, B:435:0x0e84, B:438:0x0e8f, B:440:0x0e99, B:442:0x0ec0, B:444:0x0ed0, B:445:0x0eda, B:447:0x0ee8, B:448:0x0ef2, B:449:0x0efd, B:451:0x0f0f, B:454:0x0f16, B:459:0x0f59, B:455:0x0f25, B:457:0x0f33, B:458:0x0f40, B:460:0x0f68, B:461:0x0f7b, B:465:0x0f9b, B:464:0x0f86, B:412:0x0dcf, B:414:0x0dd5, B:416:0x0de7, B:418:0x0dee, B:424:0x0e06, B:426:0x0e0d, B:428:0x0e58, B:430:0x0e5f, B:429:0x0e5c, B:425:0x0e0a, B:417:0x0deb, B:283:0x094a, B:285:0x0950, B:287:0x0956, B:267:0x087e, B:263:0x084d, B:257:0x07f6, B:259:0x07fc, B:466:0x0fa4), top: B:472:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0b5c A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:228:0x0750, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:223:0x0728, B:225:0x072e, B:227:0x073c, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:231:0x0767, B:233:0x0779, B:235:0x0782, B:246:0x07b4, B:236:0x078a, B:238:0x0793, B:240:0x0799, B:243:0x07a5, B:245:0x07af, B:247:0x07b7, B:248:0x07c3, B:251:0x07cb, B:253:0x07dd, B:254:0x07e8, B:256:0x07f0, B:260:0x081f, B:262:0x083b, B:264:0x0850, B:266:0x086c, B:268:0x0881, B:269:0x089d, B:271:0x08a3, B:273:0x08bb, B:274:0x08c9, B:276:0x08d9, B:277:0x08e7, B:278:0x08ea, B:280:0x0934, B:282:0x093a, B:288:0x0965, B:290:0x096d, B:291:0x098b, B:293:0x0991, B:294:0x09a5, B:296:0x09bc, B:298:0x09d6, B:300:0x09e8, B:302:0x09f2, B:303:0x09f5, B:305:0x0a50, B:306:0x0a63, B:309:0x0a6b, B:312:0x0a8a, B:314:0x0aa3, B:316:0x0ab8, B:318:0x0abd, B:320:0x0ac1, B:322:0x0ac5, B:324:0x0acf, B:326:0x0ad8, B:328:0x0adc, B:330:0x0ae2, B:332:0x0aed, B:334:0x0afb, B:401:0x0d5c, B:336:0x0b03, B:338:0x0b1f, B:343:0x0b3c, B:345:0x0b5c, B:346:0x0b64, B:348:0x0b6a, B:350:0x0b7c, B:356:0x0b92, B:358:0x0ba8, B:359:0x0bcb, B:361:0x0bd7, B:363:0x0bed, B:364:0x0c2d, B:370:0x0c49, B:372:0x0c54, B:374:0x0c58, B:376:0x0c5c, B:378:0x0c60, B:379:0x0c6c, B:380:0x0c71, B:382:0x0c77, B:384:0x0c8d, B:385:0x0c92, B:400:0x0d59, B:387:0x0cd1, B:389:0x0cd5, B:393:0x0ce9, B:395:0x0d05, B:396:0x0d0c, B:399:0x0d4d, B:390:0x0cda, B:341:0x0b25, B:402:0x0d62, B:404:0x0d6c, B:405:0x0d80, B:406:0x0d88, B:408:0x0d8e, B:409:0x0da2, B:411:0x0db4, B:431:0x0e67, B:433:0x0e6d, B:435:0x0e84, B:438:0x0e8f, B:440:0x0e99, B:442:0x0ec0, B:444:0x0ed0, B:445:0x0eda, B:447:0x0ee8, B:448:0x0ef2, B:449:0x0efd, B:451:0x0f0f, B:454:0x0f16, B:459:0x0f59, B:455:0x0f25, B:457:0x0f33, B:458:0x0f40, B:460:0x0f68, B:461:0x0f7b, B:465:0x0f9b, B:464:0x0f86, B:412:0x0dcf, B:414:0x0dd5, B:416:0x0de7, B:418:0x0dee, B:424:0x0e06, B:426:0x0e0d, B:428:0x0e58, B:430:0x0e5f, B:429:0x0e5c, B:425:0x0e0a, B:417:0x0deb, B:283:0x094a, B:285:0x0950, B:287:0x0956, B:267:0x087e, B:263:0x084d, B:257:0x07f6, B:259:0x07fc, B:466:0x0fa4), top: B:472:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0b90 A[PHI: r13
      0x0b90: PHI (r13v11 long) = (r13v10 long), (r13v36 long) binds: [B:344:0x0b5a, B:524:0x0b90] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0ba8 A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:228:0x0750, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:223:0x0728, B:225:0x072e, B:227:0x073c, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:231:0x0767, B:233:0x0779, B:235:0x0782, B:246:0x07b4, B:236:0x078a, B:238:0x0793, B:240:0x0799, B:243:0x07a5, B:245:0x07af, B:247:0x07b7, B:248:0x07c3, B:251:0x07cb, B:253:0x07dd, B:254:0x07e8, B:256:0x07f0, B:260:0x081f, B:262:0x083b, B:264:0x0850, B:266:0x086c, B:268:0x0881, B:269:0x089d, B:271:0x08a3, B:273:0x08bb, B:274:0x08c9, B:276:0x08d9, B:277:0x08e7, B:278:0x08ea, B:280:0x0934, B:282:0x093a, B:288:0x0965, B:290:0x096d, B:291:0x098b, B:293:0x0991, B:294:0x09a5, B:296:0x09bc, B:298:0x09d6, B:300:0x09e8, B:302:0x09f2, B:303:0x09f5, B:305:0x0a50, B:306:0x0a63, B:309:0x0a6b, B:312:0x0a8a, B:314:0x0aa3, B:316:0x0ab8, B:318:0x0abd, B:320:0x0ac1, B:322:0x0ac5, B:324:0x0acf, B:326:0x0ad8, B:328:0x0adc, B:330:0x0ae2, B:332:0x0aed, B:334:0x0afb, B:401:0x0d5c, B:336:0x0b03, B:338:0x0b1f, B:343:0x0b3c, B:345:0x0b5c, B:346:0x0b64, B:348:0x0b6a, B:350:0x0b7c, B:356:0x0b92, B:358:0x0ba8, B:359:0x0bcb, B:361:0x0bd7, B:363:0x0bed, B:364:0x0c2d, B:370:0x0c49, B:372:0x0c54, B:374:0x0c58, B:376:0x0c5c, B:378:0x0c60, B:379:0x0c6c, B:380:0x0c71, B:382:0x0c77, B:384:0x0c8d, B:385:0x0c92, B:400:0x0d59, B:387:0x0cd1, B:389:0x0cd5, B:393:0x0ce9, B:395:0x0d05, B:396:0x0d0c, B:399:0x0d4d, B:390:0x0cda, B:341:0x0b25, B:402:0x0d62, B:404:0x0d6c, B:405:0x0d80, B:406:0x0d88, B:408:0x0d8e, B:409:0x0da2, B:411:0x0db4, B:431:0x0e67, B:433:0x0e6d, B:435:0x0e84, B:438:0x0e8f, B:440:0x0e99, B:442:0x0ec0, B:444:0x0ed0, B:445:0x0eda, B:447:0x0ee8, B:448:0x0ef2, B:449:0x0efd, B:451:0x0f0f, B:454:0x0f16, B:459:0x0f59, B:455:0x0f25, B:457:0x0f33, B:458:0x0f40, B:460:0x0f68, B:461:0x0f7b, B:465:0x0f9b, B:464:0x0f86, B:412:0x0dcf, B:414:0x0dd5, B:416:0x0de7, B:418:0x0dee, B:424:0x0e06, B:426:0x0e0d, B:428:0x0e58, B:430:0x0e5f, B:429:0x0e5c, B:425:0x0e0a, B:417:0x0deb, B:283:0x094a, B:285:0x0950, B:287:0x0956, B:267:0x087e, B:263:0x084d, B:257:0x07f6, B:259:0x07fc, B:466:0x0fa4), top: B:472:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0bcb A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:228:0x0750, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:223:0x0728, B:225:0x072e, B:227:0x073c, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:231:0x0767, B:233:0x0779, B:235:0x0782, B:246:0x07b4, B:236:0x078a, B:238:0x0793, B:240:0x0799, B:243:0x07a5, B:245:0x07af, B:247:0x07b7, B:248:0x07c3, B:251:0x07cb, B:253:0x07dd, B:254:0x07e8, B:256:0x07f0, B:260:0x081f, B:262:0x083b, B:264:0x0850, B:266:0x086c, B:268:0x0881, B:269:0x089d, B:271:0x08a3, B:273:0x08bb, B:274:0x08c9, B:276:0x08d9, B:277:0x08e7, B:278:0x08ea, B:280:0x0934, B:282:0x093a, B:288:0x0965, B:290:0x096d, B:291:0x098b, B:293:0x0991, B:294:0x09a5, B:296:0x09bc, B:298:0x09d6, B:300:0x09e8, B:302:0x09f2, B:303:0x09f5, B:305:0x0a50, B:306:0x0a63, B:309:0x0a6b, B:312:0x0a8a, B:314:0x0aa3, B:316:0x0ab8, B:318:0x0abd, B:320:0x0ac1, B:322:0x0ac5, B:324:0x0acf, B:326:0x0ad8, B:328:0x0adc, B:330:0x0ae2, B:332:0x0aed, B:334:0x0afb, B:401:0x0d5c, B:336:0x0b03, B:338:0x0b1f, B:343:0x0b3c, B:345:0x0b5c, B:346:0x0b64, B:348:0x0b6a, B:350:0x0b7c, B:356:0x0b92, B:358:0x0ba8, B:359:0x0bcb, B:361:0x0bd7, B:363:0x0bed, B:364:0x0c2d, B:370:0x0c49, B:372:0x0c54, B:374:0x0c58, B:376:0x0c5c, B:378:0x0c60, B:379:0x0c6c, B:380:0x0c71, B:382:0x0c77, B:384:0x0c8d, B:385:0x0c92, B:400:0x0d59, B:387:0x0cd1, B:389:0x0cd5, B:393:0x0ce9, B:395:0x0d05, B:396:0x0d0c, B:399:0x0d4d, B:390:0x0cda, B:341:0x0b25, B:402:0x0d62, B:404:0x0d6c, B:405:0x0d80, B:406:0x0d88, B:408:0x0d8e, B:409:0x0da2, B:411:0x0db4, B:431:0x0e67, B:433:0x0e6d, B:435:0x0e84, B:438:0x0e8f, B:440:0x0e99, B:442:0x0ec0, B:444:0x0ed0, B:445:0x0eda, B:447:0x0ee8, B:448:0x0ef2, B:449:0x0efd, B:451:0x0f0f, B:454:0x0f16, B:459:0x0f59, B:455:0x0f25, B:457:0x0f33, B:458:0x0f40, B:460:0x0f68, B:461:0x0f7b, B:465:0x0f9b, B:464:0x0f86, B:412:0x0dcf, B:414:0x0dd5, B:416:0x0de7, B:418:0x0dee, B:424:0x0e06, B:426:0x0e0d, B:428:0x0e58, B:430:0x0e5f, B:429:0x0e5c, B:425:0x0e0a, B:417:0x0deb, B:283:0x094a, B:285:0x0950, B:287:0x0956, B:267:0x087e, B:263:0x084d, B:257:0x07f6, B:259:0x07fc, B:466:0x0fa4), top: B:472:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c1 A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:228:0x0750, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:223:0x0728, B:225:0x072e, B:227:0x073c, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:231:0x0767, B:233:0x0779, B:235:0x0782, B:246:0x07b4, B:236:0x078a, B:238:0x0793, B:240:0x0799, B:243:0x07a5, B:245:0x07af, B:247:0x07b7, B:248:0x07c3, B:251:0x07cb, B:253:0x07dd, B:254:0x07e8, B:256:0x07f0, B:260:0x081f, B:262:0x083b, B:264:0x0850, B:266:0x086c, B:268:0x0881, B:269:0x089d, B:271:0x08a3, B:273:0x08bb, B:274:0x08c9, B:276:0x08d9, B:277:0x08e7, B:278:0x08ea, B:280:0x0934, B:282:0x093a, B:288:0x0965, B:290:0x096d, B:291:0x098b, B:293:0x0991, B:294:0x09a5, B:296:0x09bc, B:298:0x09d6, B:300:0x09e8, B:302:0x09f2, B:303:0x09f5, B:305:0x0a50, B:306:0x0a63, B:309:0x0a6b, B:312:0x0a8a, B:314:0x0aa3, B:316:0x0ab8, B:318:0x0abd, B:320:0x0ac1, B:322:0x0ac5, B:324:0x0acf, B:326:0x0ad8, B:328:0x0adc, B:330:0x0ae2, B:332:0x0aed, B:334:0x0afb, B:401:0x0d5c, B:336:0x0b03, B:338:0x0b1f, B:343:0x0b3c, B:345:0x0b5c, B:346:0x0b64, B:348:0x0b6a, B:350:0x0b7c, B:356:0x0b92, B:358:0x0ba8, B:359:0x0bcb, B:361:0x0bd7, B:363:0x0bed, B:364:0x0c2d, B:370:0x0c49, B:372:0x0c54, B:374:0x0c58, B:376:0x0c5c, B:378:0x0c60, B:379:0x0c6c, B:380:0x0c71, B:382:0x0c77, B:384:0x0c8d, B:385:0x0c92, B:400:0x0d59, B:387:0x0cd1, B:389:0x0cd5, B:393:0x0ce9, B:395:0x0d05, B:396:0x0d0c, B:399:0x0d4d, B:390:0x0cda, B:341:0x0b25, B:402:0x0d62, B:404:0x0d6c, B:405:0x0d80, B:406:0x0d88, B:408:0x0d8e, B:409:0x0da2, B:411:0x0db4, B:431:0x0e67, B:433:0x0e6d, B:435:0x0e84, B:438:0x0e8f, B:440:0x0e99, B:442:0x0ec0, B:444:0x0ed0, B:445:0x0eda, B:447:0x0ee8, B:448:0x0ef2, B:449:0x0efd, B:451:0x0f0f, B:454:0x0f16, B:459:0x0f59, B:455:0x0f25, B:457:0x0f33, B:458:0x0f40, B:460:0x0f68, B:461:0x0f7b, B:465:0x0f9b, B:464:0x0f86, B:412:0x0dcf, B:414:0x0dd5, B:416:0x0de7, B:418:0x0dee, B:424:0x0e06, B:426:0x0e0d, B:428:0x0e58, B:430:0x0e5f, B:429:0x0e5c, B:425:0x0e0a, B:417:0x0deb, B:283:0x094a, B:285:0x0950, B:287:0x0956, B:267:0x087e, B:263:0x084d, B:257:0x07f6, B:259:0x07fc, B:466:0x0fa4), top: B:472:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0289 A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:228:0x0750, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:223:0x0728, B:225:0x072e, B:227:0x073c, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:231:0x0767, B:233:0x0779, B:235:0x0782, B:246:0x07b4, B:236:0x078a, B:238:0x0793, B:240:0x0799, B:243:0x07a5, B:245:0x07af, B:247:0x07b7, B:248:0x07c3, B:251:0x07cb, B:253:0x07dd, B:254:0x07e8, B:256:0x07f0, B:260:0x081f, B:262:0x083b, B:264:0x0850, B:266:0x086c, B:268:0x0881, B:269:0x089d, B:271:0x08a3, B:273:0x08bb, B:274:0x08c9, B:276:0x08d9, B:277:0x08e7, B:278:0x08ea, B:280:0x0934, B:282:0x093a, B:288:0x0965, B:290:0x096d, B:291:0x098b, B:293:0x0991, B:294:0x09a5, B:296:0x09bc, B:298:0x09d6, B:300:0x09e8, B:302:0x09f2, B:303:0x09f5, B:305:0x0a50, B:306:0x0a63, B:309:0x0a6b, B:312:0x0a8a, B:314:0x0aa3, B:316:0x0ab8, B:318:0x0abd, B:320:0x0ac1, B:322:0x0ac5, B:324:0x0acf, B:326:0x0ad8, B:328:0x0adc, B:330:0x0ae2, B:332:0x0aed, B:334:0x0afb, B:401:0x0d5c, B:336:0x0b03, B:338:0x0b1f, B:343:0x0b3c, B:345:0x0b5c, B:346:0x0b64, B:348:0x0b6a, B:350:0x0b7c, B:356:0x0b92, B:358:0x0ba8, B:359:0x0bcb, B:361:0x0bd7, B:363:0x0bed, B:364:0x0c2d, B:370:0x0c49, B:372:0x0c54, B:374:0x0c58, B:376:0x0c5c, B:378:0x0c60, B:379:0x0c6c, B:380:0x0c71, B:382:0x0c77, B:384:0x0c8d, B:385:0x0c92, B:400:0x0d59, B:387:0x0cd1, B:389:0x0cd5, B:393:0x0ce9, B:395:0x0d05, B:396:0x0d0c, B:399:0x0d4d, B:390:0x0cda, B:341:0x0b25, B:402:0x0d62, B:404:0x0d6c, B:405:0x0d80, B:406:0x0d88, B:408:0x0d8e, B:409:0x0da2, B:411:0x0db4, B:431:0x0e67, B:433:0x0e6d, B:435:0x0e84, B:438:0x0e8f, B:440:0x0e99, B:442:0x0ec0, B:444:0x0ed0, B:445:0x0eda, B:447:0x0ee8, B:448:0x0ef2, B:449:0x0efd, B:451:0x0f0f, B:454:0x0f16, B:459:0x0f59, B:455:0x0f25, B:457:0x0f33, B:458:0x0f40, B:460:0x0f68, B:461:0x0f7b, B:465:0x0f9b, B:464:0x0f86, B:412:0x0dcf, B:414:0x0dd5, B:416:0x0de7, B:418:0x0dee, B:424:0x0e06, B:426:0x0e0d, B:428:0x0e58, B:430:0x0e5f, B:429:0x0e5c, B:425:0x0e0a, B:417:0x0deb, B:283:0x094a, B:285:0x0950, B:287:0x0956, B:267:0x087e, B:263:0x084d, B:257:0x07f6, B:259:0x07fc, B:466:0x0fa4), top: B:472:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029e A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:228:0x0750, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:223:0x0728, B:225:0x072e, B:227:0x073c, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:231:0x0767, B:233:0x0779, B:235:0x0782, B:246:0x07b4, B:236:0x078a, B:238:0x0793, B:240:0x0799, B:243:0x07a5, B:245:0x07af, B:247:0x07b7, B:248:0x07c3, B:251:0x07cb, B:253:0x07dd, B:254:0x07e8, B:256:0x07f0, B:260:0x081f, B:262:0x083b, B:264:0x0850, B:266:0x086c, B:268:0x0881, B:269:0x089d, B:271:0x08a3, B:273:0x08bb, B:274:0x08c9, B:276:0x08d9, B:277:0x08e7, B:278:0x08ea, B:280:0x0934, B:282:0x093a, B:288:0x0965, B:290:0x096d, B:291:0x098b, B:293:0x0991, B:294:0x09a5, B:296:0x09bc, B:298:0x09d6, B:300:0x09e8, B:302:0x09f2, B:303:0x09f5, B:305:0x0a50, B:306:0x0a63, B:309:0x0a6b, B:312:0x0a8a, B:314:0x0aa3, B:316:0x0ab8, B:318:0x0abd, B:320:0x0ac1, B:322:0x0ac5, B:324:0x0acf, B:326:0x0ad8, B:328:0x0adc, B:330:0x0ae2, B:332:0x0aed, B:334:0x0afb, B:401:0x0d5c, B:336:0x0b03, B:338:0x0b1f, B:343:0x0b3c, B:345:0x0b5c, B:346:0x0b64, B:348:0x0b6a, B:350:0x0b7c, B:356:0x0b92, B:358:0x0ba8, B:359:0x0bcb, B:361:0x0bd7, B:363:0x0bed, B:364:0x0c2d, B:370:0x0c49, B:372:0x0c54, B:374:0x0c58, B:376:0x0c5c, B:378:0x0c60, B:379:0x0c6c, B:380:0x0c71, B:382:0x0c77, B:384:0x0c8d, B:385:0x0c92, B:400:0x0d59, B:387:0x0cd1, B:389:0x0cd5, B:393:0x0ce9, B:395:0x0d05, B:396:0x0d0c, B:399:0x0d4d, B:390:0x0cda, B:341:0x0b25, B:402:0x0d62, B:404:0x0d6c, B:405:0x0d80, B:406:0x0d88, B:408:0x0d8e, B:409:0x0da2, B:411:0x0db4, B:431:0x0e67, B:433:0x0e6d, B:435:0x0e84, B:438:0x0e8f, B:440:0x0e99, B:442:0x0ec0, B:444:0x0ed0, B:445:0x0eda, B:447:0x0ee8, B:448:0x0ef2, B:449:0x0efd, B:451:0x0f0f, B:454:0x0f16, B:459:0x0f59, B:455:0x0f25, B:457:0x0f33, B:458:0x0f40, B:460:0x0f68, B:461:0x0f7b, B:465:0x0f9b, B:464:0x0f86, B:412:0x0dcf, B:414:0x0dd5, B:416:0x0de7, B:418:0x0dee, B:424:0x0e06, B:426:0x0e0d, B:428:0x0e58, B:430:0x0e5f, B:429:0x0e5c, B:425:0x0e0a, B:417:0x0deb, B:283:0x094a, B:285:0x0950, B:287:0x0956, B:267:0x087e, B:263:0x084d, B:257:0x07f6, B:259:0x07fc, B:466:0x0fa4), top: B:472:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02db A[Catch: all -> 0x0125, TRY_LEAVE, TryCatch #0 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:228:0x0750, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:223:0x0728, B:225:0x072e, B:227:0x073c, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:231:0x0767, B:233:0x0779, B:235:0x0782, B:246:0x07b4, B:236:0x078a, B:238:0x0793, B:240:0x0799, B:243:0x07a5, B:245:0x07af, B:247:0x07b7, B:248:0x07c3, B:251:0x07cb, B:253:0x07dd, B:254:0x07e8, B:256:0x07f0, B:260:0x081f, B:262:0x083b, B:264:0x0850, B:266:0x086c, B:268:0x0881, B:269:0x089d, B:271:0x08a3, B:273:0x08bb, B:274:0x08c9, B:276:0x08d9, B:277:0x08e7, B:278:0x08ea, B:280:0x0934, B:282:0x093a, B:288:0x0965, B:290:0x096d, B:291:0x098b, B:293:0x0991, B:294:0x09a5, B:296:0x09bc, B:298:0x09d6, B:300:0x09e8, B:302:0x09f2, B:303:0x09f5, B:305:0x0a50, B:306:0x0a63, B:309:0x0a6b, B:312:0x0a8a, B:314:0x0aa3, B:316:0x0ab8, B:318:0x0abd, B:320:0x0ac1, B:322:0x0ac5, B:324:0x0acf, B:326:0x0ad8, B:328:0x0adc, B:330:0x0ae2, B:332:0x0aed, B:334:0x0afb, B:401:0x0d5c, B:336:0x0b03, B:338:0x0b1f, B:343:0x0b3c, B:345:0x0b5c, B:346:0x0b64, B:348:0x0b6a, B:350:0x0b7c, B:356:0x0b92, B:358:0x0ba8, B:359:0x0bcb, B:361:0x0bd7, B:363:0x0bed, B:364:0x0c2d, B:370:0x0c49, B:372:0x0c54, B:374:0x0c58, B:376:0x0c5c, B:378:0x0c60, B:379:0x0c6c, B:380:0x0c71, B:382:0x0c77, B:384:0x0c8d, B:385:0x0c92, B:400:0x0d59, B:387:0x0cd1, B:389:0x0cd5, B:393:0x0ce9, B:395:0x0d05, B:396:0x0d0c, B:399:0x0d4d, B:390:0x0cda, B:341:0x0b25, B:402:0x0d62, B:404:0x0d6c, B:405:0x0d80, B:406:0x0d88, B:408:0x0d8e, B:409:0x0da2, B:411:0x0db4, B:431:0x0e67, B:433:0x0e6d, B:435:0x0e84, B:438:0x0e8f, B:440:0x0e99, B:442:0x0ec0, B:444:0x0ed0, B:445:0x0eda, B:447:0x0ee8, B:448:0x0ef2, B:449:0x0efd, B:451:0x0f0f, B:454:0x0f16, B:459:0x0f59, B:455:0x0f25, B:457:0x0f33, B:458:0x0f40, B:460:0x0f68, B:461:0x0f7b, B:465:0x0f9b, B:464:0x0f86, B:412:0x0dcf, B:414:0x0dd5, B:416:0x0de7, B:418:0x0dee, B:424:0x0e06, B:426:0x0e0d, B:428:0x0e58, B:430:0x0e5f, B:429:0x0e5c, B:425:0x0e0a, B:417:0x0deb, B:283:0x094a, B:285:0x0950, B:287:0x0956, B:267:0x087e, B:263:0x084d, B:257:0x07f6, B:259:0x07fc, B:466:0x0fa4), top: B:472:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean I(long r47, java.lang.String r49) {
        /*
            Method dump skipped, instruction units count: 4028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.l4.I(long, java.lang.String):boolean");
    }

    public final void J(a9 a9Var, long j9, boolean z11) {
        p4 p4Var;
        Object obj;
        String str = true != z11 ? "_lte" : "_se";
        m mVar = this.f44922c;
        U(mVar);
        p4 p4VarL0 = mVar.l0(a9Var.q(), str);
        if (p4VarL0 == null || (obj = p4VarL0.f45072e) == null) {
            String strQ = a9Var.q();
            c().getClass();
            p4Var = new p4(strQ, "auto", str, System.currentTimeMillis(), Long.valueOf(j9));
        } else {
            String strQ2 = a9Var.q();
            c().getClass();
            p4Var = new p4(strQ2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j9));
        }
        k9 k9VarE = l9.E();
        k9VarE.b();
        ((l9) k9VarE.f11483b).G(str);
        c().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        k9VarE.b();
        ((l9) k9VarE.f11483b).F(jCurrentTimeMillis);
        Object obj2 = p4Var.f45072e;
        long jLongValue = ((Long) obj2).longValue();
        k9VarE.b();
        ((l9) k9VarE.f11483b).J(jLongValue);
        l9 l9Var = (l9) k9VarE.d();
        int iB0 = n4.b0(a9Var, str);
        if (iB0 >= 0) {
            a9Var.b();
            ((b9) a9Var.f11483b).g0(iB0, l9Var);
        } else {
            a9Var.b();
            ((b9) a9Var.f11483b).h0(l9Var);
        }
        if (j9 > 0) {
            m mVar2 = this.f44922c;
            U(mVar2);
            mVar2.k0(p4Var);
            b().f45267o.c("Updated engagement user property. scope, value", true != z11 ? "lifetime" : "session-scoped", obj2);
        }
    }

    public final boolean K(s8 s8Var, s8 s8Var2) {
        com.google.android.gms.common.internal.i0.b("_e".equals(s8Var.o()));
        k0();
        w8 w8VarZ = n4.z((t8) s8Var.d(), "_sc");
        String strW = w8VarZ == null ? null : w8VarZ.w();
        k0();
        w8 w8VarZ2 = n4.z((t8) s8Var2.d(), "_pc");
        String strW2 = w8VarZ2 != null ? w8VarZ2.w() : null;
        if (strW2 == null || !strW2.equals(strW)) {
            return false;
        }
        com.google.android.gms.common.internal.i0.b("_e".equals(s8Var.o()));
        k0();
        w8 w8VarZ3 = n4.z((t8) s8Var.d(), "_et");
        if (w8VarZ3 == null || !w8VarZ3.x() || w8VarZ3.y() <= 0) {
            return true;
        }
        long jY = w8VarZ3.y();
        k0();
        w8 w8VarZ4 = n4.z((t8) s8Var2.d(), "_et");
        if (w8VarZ4 != null && w8VarZ4.y() > 0) {
            jY += w8VarZ4.y();
        }
        k0();
        n4.x(s8Var2, "_et", Long.valueOf(jY));
        k0();
        n4.x(s8Var, "_fr", 1L);
        return true;
    }

    public final void L(s8 s8Var, String str, String str2) {
        ArrayList arrayList = new ArrayList(s8Var.i());
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList.size()) {
                i11 = -1;
                break;
            } else if (str.equals(((w8) arrayList.get(i11)).u())) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        double dC = s8Var.k(i11).C() * 1000000.0d;
        if (dC == 0.0d) {
            dC = s8Var.k(i11).y() * 1000000.0d;
        }
        if (dC > 9.223372036854776E18d || dC < -9.223372036854776E18d) {
            b().f45263j.c(w.a0.p("Data lost. Purchase ", str, " is too big. appId"), w0.x(str2), Double.valueOf(dC));
            return;
        }
        s8Var.n(i11);
        v8 v8VarF = w8.F();
        v8VarF.i(str);
        v8VarF.k(Math.round(dC));
        s8Var.l((w8) v8VarF.d());
    }

    public final boolean M() {
        d().p();
        m0();
        m mVar = this.f44922c;
        U(mVar);
        if (mVar.L("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        m mVar2 = this.f44922c;
        U(mVar2);
        return !TextUtils.isEmpty(mVar2.x());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0327  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N() {
        /*
            Method dump skipped, instruction units count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.l4.N():void");
    }

    public final void O() {
        d().p();
        if (this.f44938t || this.f44939u || this.f44940v) {
            b().f45267o.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f44938t), Boolean.valueOf(this.f44939u), Boolean.valueOf(this.f44940v));
            return;
        }
        b().f45267o.a("Stopping uploading service(s)");
        ArrayList arrayList = this.f44934p;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ArrayList arrayList2 = this.f44934p;
        com.google.android.gms.common.internal.i0.h(arrayList2);
        arrayList2.clear();
    }

    public final Boolean P(b1 b1Var) {
        try {
            long jQ = b1Var.Q();
            n1 n1Var = this.l;
            if (jQ != -2147483648L) {
                if (b1Var.Q() == xz.c.a(n1Var.f44982a).d(0, b1Var.E()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = xz.c.a(n1Var.f44982a).d(0, b1Var.E()).versionName;
                String strO = b1Var.O();
                if (strO != null && strO.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final t4 Q(String str) {
        m mVar = this.f44922c;
        U(mVar);
        b1 b1VarT0 = mVar.t0(str);
        if (b1VarT0 != null) {
            n1 n1Var = b1VarT0.f44590a;
            if (!TextUtils.isEmpty(b1VarT0.O())) {
                Boolean boolP = P(b1VarT0);
                if (boolP != null && !boolP.booleanValue()) {
                    b().f45260g.b(w0.x(str), "App version does not match; dropping. appId");
                    return null;
                }
                String strH = b1VarT0.H();
                String strO = b1VarT0.O();
                long jQ = b1VarT0.Q();
                l1 l1Var = n1Var.f44988g;
                n1.m(l1Var);
                l1Var.p();
                String str2 = b1VarT0.l;
                l1 l1Var2 = n1Var.f44988g;
                n1.m(l1Var2);
                l1Var2.p();
                long j9 = b1VarT0.f44601m;
                l1 l1Var3 = n1Var.f44988g;
                n1.m(l1Var3);
                l1Var3.p();
                long j11 = b1VarT0.f44602n;
                l1 l1Var4 = n1Var.f44988g;
                n1.m(l1Var4);
                l1Var4.p();
                boolean z11 = b1VarT0.f44603o;
                String strK = b1VarT0.K();
                l1 l1Var5 = n1Var.f44988g;
                n1.m(l1Var5);
                l1Var5.p();
                boolean z12 = b1VarT0.f44604p;
                Boolean boolX = b1VarT0.x();
                long jB = b1VarT0.b();
                l1 l1Var6 = n1Var.f44988g;
                n1.m(l1Var6);
                l1Var6.p();
                ArrayList arrayList = b1VarT0.f44607s;
                String strG = e(str).g();
                boolean z13 = b1VarT0.z();
                l1 l1Var7 = n1Var.f44988g;
                n1.m(l1Var7);
                l1Var7.p();
                long j12 = b1VarT0.f44610v;
                int i11 = e(str).f44617b;
                String str3 = p0(str).f45017b;
                l1 l1Var8 = n1Var.f44988g;
                n1.m(l1Var8);
                l1Var8.p();
                int i12 = b1VarT0.f44612x;
                l1 l1Var9 = n1Var.f44988g;
                n1.m(l1Var9);
                l1Var9.p();
                return new t4(str, strH, strO, jQ, str2, j9, j11, (String) null, z11, false, strK, 0L, 0, z12, false, boolX, jB, (List) arrayList, strG, "", (String) null, z13, j12, i11, str3, i12, b1VarT0.B, b1VarT0.D(), b1VarT0.s(), 0L, b1VarT0.t(), 0L);
            }
        }
        b().f45266n.b(str, "No app data available; dropping");
        return null;
    }

    public final boolean R(String str, String str2) {
        m mVar = this.f44922c;
        U(mVar);
        r rVarP = mVar.P("events", str, str2);
        return rVarP == null || rVarP.f45093c < 1;
    }

    public final void W() {
        d().p();
        m0();
        if (this.f44932n) {
            return;
        }
        this.f44932n = true;
        d().p();
        FileLock fileLock = this.f44941w;
        n1 n1Var = this.l;
        if (fileLock == null || !fileLock.isValid()) {
            ((n1) this.f44922c.f21216b).getClass();
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(n1Var.f44982a.getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
                this.f44942x = channel;
                FileLock fileLockTryLock = channel.tryLock();
                this.f44941w = fileLockTryLock;
                if (fileLockTryLock == null) {
                    b().f45260g.a("Storage concurrent data access panic");
                    return;
                }
                b().f45267o.a("Storage concurrent access okay");
            } catch (FileNotFoundException e5) {
                b().f45260g.b(e5, "Failed to acquire storage lock");
                return;
            } catch (IOException e11) {
                b().f45260g.b(e11, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e12) {
                b().f45263j.b(e12, "Storage lock already acquired");
                return;
            }
        } else {
            b().f45267o.a("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.f44942x;
        d().p();
        int i11 = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            b().f45260g.a("Bad channel to read from");
        } else {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int i12 = fileChannel.read(byteBufferAllocate);
                if (i12 == 4) {
                    byteBufferAllocate.flip();
                    i11 = byteBufferAllocate.getInt();
                } else if (i12 != -1) {
                    b().f45263j.b(Integer.valueOf(i12), "Unexpected data length. Bytes read");
                }
            } catch (IOException e13) {
                b().f45260g.b(e13, "Failed to read from channel");
            }
        }
        o0 o0VarR = n1Var.r();
        o0VarR.q();
        int i13 = o0VarR.f45023f;
        d().p();
        if (i11 > i13) {
            b().f45260g.c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i11), Integer.valueOf(i13));
            return;
        }
        if (i11 < i13) {
            FileChannel fileChannel2 = this.f44942x;
            d().p();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                b().f45260g.a("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                byteBufferAllocate2.putInt(i13);
                byteBufferAllocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(byteBufferAllocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        b().f45260g.b(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    b().f45267o.c("Storage version upgraded. Previous, current version", Integer.valueOf(i11), Integer.valueOf(i13));
                    return;
                } catch (IOException e14) {
                    b().f45260g.b(e14, "Failed to write to channel");
                }
            }
            b().f45260g.c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i11), Integer.valueOf(i13));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X(y00.o4 r24, y00.t4 r25) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.l4.X(y00.o4, y00.t4):void");
    }

    public final void Y(String str, t4 t4Var) {
        d().p();
        m0();
        boolean zT = T(t4Var);
        String str2 = t4Var.f45170a;
        if (zT) {
            if (!t4Var.f45177h) {
                d0(t4Var);
                return;
            }
            Boolean boolV = V(t4Var);
            if ("_npa".equals(str) && boolV != null) {
                b().f45266n.a("Falling back to manifest metadata value for ad personalization");
                c().getClass();
                X(new o4(System.currentTimeMillis(), Long.valueOf(true != boolV.booleanValue() ? 0L : 1L), "_npa", "auto"), t4Var);
                return;
            }
            u0 u0Var = b().f45266n;
            n1 n1Var = this.l;
            u0Var.b(n1Var.f44991j.c(str), "Removing user property");
            m mVar = this.f44922c;
            U(mVar);
            mVar.d0();
            try {
                d0(t4Var);
                if ("_id".equals(str)) {
                    m mVar2 = this.f44922c;
                    U(mVar2);
                    com.google.android.gms.common.internal.i0.h(str2);
                    mVar2.j0(str2, "_lair");
                }
                m mVar3 = this.f44922c;
                U(mVar3);
                com.google.android.gms.common.internal.i0.h(str2);
                mVar3.j0(str2, str);
                m mVar4 = this.f44922c;
                U(mVar4);
                mVar4.e0();
                b().f45266n.b(n1Var.f44991j.c(str), "User property removed");
                m mVar5 = this.f44922c;
                U(mVar5);
                mVar5.f0();
            } catch (Throwable th2) {
                m mVar6 = this.f44922c;
                U(mVar6);
                mVar6.f0();
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x043a A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ac, B:74:0x01bc, B:76:0x01d4, B:105:0x0298, B:107:0x02c4, B:108:0x02c7, B:110:0x02e8, B:151:0x03b0, B:152:0x03b3, B:160:0x045f, B:113:0x02ff, B:118:0x031e, B:120:0x0326, B:122:0x032c, B:126:0x033f, B:130:0x0352, B:134:0x035e, B:137:0x0372, B:142:0x0391, B:144:0x0399, B:146:0x03a1, B:148:0x03a7, B:140:0x037f, B:128:0x034a, B:116:0x030c, B:77:0x01e4, B:79:0x020e, B:80:0x021a, B:82:0x0221, B:84:0x0227, B:86:0x0231, B:88:0x0237, B:90:0x023d, B:92:0x0243, B:93:0x0248, B:99:0x0261, B:101:0x0265, B:102:0x0276, B:103:0x0281, B:104:0x028c, B:153:0x03dc, B:155:0x0411, B:156:0x0414, B:157:0x043a, B:159:0x0441, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0144 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ac, B:74:0x01bc, B:76:0x01d4, B:105:0x0298, B:107:0x02c4, B:108:0x02c7, B:110:0x02e8, B:151:0x03b0, B:152:0x03b3, B:160:0x045f, B:113:0x02ff, B:118:0x031e, B:120:0x0326, B:122:0x032c, B:126:0x033f, B:130:0x0352, B:134:0x035e, B:137:0x0372, B:142:0x0391, B:144:0x0399, B:146:0x03a1, B:148:0x03a7, B:140:0x037f, B:128:0x034a, B:116:0x030c, B:77:0x01e4, B:79:0x020e, B:80:0x021a, B:82:0x0221, B:84:0x0227, B:86:0x0231, B:88:0x0237, B:90:0x023d, B:92:0x0243, B:93:0x0248, B:99:0x0261, B:101:0x0265, B:102:0x0276, B:103:0x0281, B:104:0x028c, B:153:0x03dc, B:155:0x0411, B:156:0x0414, B:157:0x043a, B:159:0x0441, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014b A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ac, B:74:0x01bc, B:76:0x01d4, B:105:0x0298, B:107:0x02c4, B:108:0x02c7, B:110:0x02e8, B:151:0x03b0, B:152:0x03b3, B:160:0x045f, B:113:0x02ff, B:118:0x031e, B:120:0x0326, B:122:0x032c, B:126:0x033f, B:130:0x0352, B:134:0x035e, B:137:0x0372, B:142:0x0391, B:144:0x0399, B:146:0x03a1, B:148:0x03a7, B:140:0x037f, B:128:0x034a, B:116:0x030c, B:77:0x01e4, B:79:0x020e, B:80:0x021a, B:82:0x0221, B:84:0x0227, B:86:0x0231, B:88:0x0237, B:90:0x023d, B:92:0x0243, B:93:0x0248, B:99:0x0261, B:101:0x0265, B:102:0x0276, B:103:0x0281, B:104:0x028c, B:153:0x03dc, B:155:0x0411, B:156:0x0414, B:157:0x043a, B:159:0x0441, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0158 A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ac, B:74:0x01bc, B:76:0x01d4, B:105:0x0298, B:107:0x02c4, B:108:0x02c7, B:110:0x02e8, B:151:0x03b0, B:152:0x03b3, B:160:0x045f, B:113:0x02ff, B:118:0x031e, B:120:0x0326, B:122:0x032c, B:126:0x033f, B:130:0x0352, B:134:0x035e, B:137:0x0372, B:142:0x0391, B:144:0x0399, B:146:0x03a1, B:148:0x03a7, B:140:0x037f, B:128:0x034a, B:116:0x030c, B:77:0x01e4, B:79:0x020e, B:80:0x021a, B:82:0x0221, B:84:0x0227, B:86:0x0231, B:88:0x0237, B:90:0x023d, B:92:0x0243, B:93:0x0248, B:99:0x0261, B:101:0x0265, B:102:0x0276, B:103:0x0281, B:104:0x028c, B:153:0x03dc, B:155:0x0411, B:156:0x0414, B:157:0x043a, B:159:0x0441, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0163 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ac, B:74:0x01bc, B:76:0x01d4, B:105:0x0298, B:107:0x02c4, B:108:0x02c7, B:110:0x02e8, B:151:0x03b0, B:152:0x03b3, B:160:0x045f, B:113:0x02ff, B:118:0x031e, B:120:0x0326, B:122:0x032c, B:126:0x033f, B:130:0x0352, B:134:0x035e, B:137:0x0372, B:142:0x0391, B:144:0x0399, B:146:0x03a1, B:148:0x03a7, B:140:0x037f, B:128:0x034a, B:116:0x030c, B:77:0x01e4, B:79:0x020e, B:80:0x021a, B:82:0x0221, B:84:0x0227, B:86:0x0231, B:88:0x0237, B:90:0x023d, B:92:0x0243, B:93:0x0248, B:99:0x0261, B:101:0x0265, B:102:0x0276, B:103:0x0281, B:104:0x028c, B:153:0x03dc, B:155:0x0411, B:156:0x0414, B:157:0x043a, B:159:0x0441, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016f A[Catch: all -> 0x00fc, TRY_LEAVE, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ac, B:74:0x01bc, B:76:0x01d4, B:105:0x0298, B:107:0x02c4, B:108:0x02c7, B:110:0x02e8, B:151:0x03b0, B:152:0x03b3, B:160:0x045f, B:113:0x02ff, B:118:0x031e, B:120:0x0326, B:122:0x032c, B:126:0x033f, B:130:0x0352, B:134:0x035e, B:137:0x0372, B:142:0x0391, B:144:0x0399, B:146:0x03a1, B:148:0x03a7, B:140:0x037f, B:128:0x034a, B:116:0x030c, B:77:0x01e4, B:79:0x020e, B:80:0x021a, B:82:0x0221, B:84:0x0227, B:86:0x0231, B:88:0x0237, B:90:0x023d, B:92:0x0243, B:93:0x0248, B:99:0x0261, B:101:0x0265, B:102:0x0276, B:103:0x0281, B:104:0x028c, B:153:0x03dc, B:155:0x0411, B:156:0x0414, B:157:0x043a, B:159:0x0441, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(y00.t4 r37) {
        /*
            Method dump skipped, instruction units count: 1145
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.l4.Z(y00.t4):void");
    }

    @Override // y00.x1
    public final ky.p a() {
        return this.l.f44984c;
    }

    public final void a0(e eVar, t4 t4Var) {
        u uVar;
        com.google.android.gms.common.internal.i0.e(eVar.f44689a);
        com.google.android.gms.common.internal.i0.h(eVar.f44690b);
        com.google.android.gms.common.internal.i0.h(eVar.f44691c);
        com.google.android.gms.common.internal.i0.e(eVar.f44691c.f45052b);
        d().p();
        m0();
        if (T(t4Var)) {
            if (!t4Var.f45177h) {
                d0(t4Var);
                return;
            }
            e eVar2 = new e(eVar);
            boolean z11 = false;
            eVar2.f44693e = false;
            m mVar = this.f44922c;
            U(mVar);
            mVar.d0();
            try {
                m mVar2 = this.f44922c;
                U(mVar2);
                String str = eVar2.f44689a;
                com.google.android.gms.common.internal.i0.h(str);
                e eVarP0 = mVar2.p0(str, eVar2.f44691c.f45052b);
                n1 n1Var = this.l;
                if (eVarP0 != null && !eVarP0.f44690b.equals(eVar2.f44690b)) {
                    b().f45263j.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", n1Var.f44991j.c(eVar2.f44691c.f45052b), eVar2.f44690b, eVarP0.f44690b);
                }
                if (eVarP0 != null && eVarP0.f44693e) {
                    eVar2.f44690b = eVarP0.f44690b;
                    eVar2.f44692d = eVarP0.f44692d;
                    eVar2.f44696h = eVarP0.f44696h;
                    eVar2.f44694f = eVarP0.f44694f;
                    eVar2.f44697i = eVarP0.f44697i;
                    eVar2.f44693e = true;
                    o4 o4Var = eVar2.f44691c;
                    eVar2.f44691c = new o4(eVarP0.f44691c.f45053c, o4Var.d(), o4Var.f45052b, eVarP0.f44691c.f45056f);
                } else if (TextUtils.isEmpty(eVar2.f44694f)) {
                    o4 o4Var2 = eVar2.f44691c;
                    eVar2.f44691c = new o4(eVar2.f44692d, o4Var2.d(), o4Var2.f45052b, eVar2.f44691c.f45056f);
                    eVar2.f44693e = true;
                    z11 = true;
                }
                if (eVar2.f44693e) {
                    o4 o4Var3 = eVar2.f44691c;
                    String str2 = eVar2.f44689a;
                    com.google.android.gms.common.internal.i0.h(str2);
                    String str3 = eVar2.f44690b;
                    String str4 = o4Var3.f45052b;
                    long j9 = o4Var3.f45053c;
                    Object objD = o4Var3.d();
                    com.google.android.gms.common.internal.i0.h(objD);
                    p4 p4Var = new p4(str2, str3, str4, j9, objD);
                    Object obj = p4Var.f45072e;
                    String str5 = p4Var.f45070c;
                    m mVar3 = this.f44922c;
                    U(mVar3);
                    if (mVar3.k0(p4Var)) {
                        b().f45266n.d("User property updated immediately", eVar2.f44689a, n1Var.f44991j.c(str5), obj);
                    } else {
                        b().f45260g.d("(2)Too many active user properties, ignoring", w0.x(eVar2.f44689a), n1Var.f44991j.c(str5), obj);
                    }
                    if (z11 && (uVar = eVar2.f44697i) != null) {
                        l(new u(uVar, eVar2.f44692d, 0L), t4Var);
                    }
                }
                m mVar4 = this.f44922c;
                U(mVar4);
                if (mVar4.o0(eVar2)) {
                    b().f45266n.d("Conditional property added", eVar2.f44689a, n1Var.f44991j.c(eVar2.f44691c.f45052b), eVar2.f44691c.d());
                } else {
                    b().f45260g.d("Too many conditional properties, ignoring", w0.x(eVar2.f44689a), n1Var.f44991j.c(eVar2.f44691c.f45052b), eVar2.f44691c.d());
                }
                m mVar5 = this.f44922c;
                U(mVar5);
                mVar5.e0();
                m mVar6 = this.f44922c;
                U(mVar6);
                mVar6.f0();
            } catch (Throwable th2) {
                m mVar7 = this.f44922c;
                U(mVar7);
                mVar7.f0();
                throw th2;
            }
        }
    }

    @Override // y00.x1
    public final w0 b() {
        n1 n1Var = this.l;
        com.google.android.gms.common.internal.i0.h(n1Var);
        w0 w0Var = n1Var.f44987f;
        n1.m(w0Var);
        return w0Var;
    }

    public final void b0(e eVar, t4 t4Var) {
        com.google.android.gms.common.internal.i0.e(eVar.f44689a);
        com.google.android.gms.common.internal.i0.h(eVar.f44691c);
        com.google.android.gms.common.internal.i0.e(eVar.f44691c.f45052b);
        d().p();
        m0();
        if (T(t4Var)) {
            if (!t4Var.f45177h) {
                d0(t4Var);
                return;
            }
            m mVar = this.f44922c;
            U(mVar);
            mVar.d0();
            try {
                d0(t4Var);
                String str = eVar.f44689a;
                com.google.android.gms.common.internal.i0.h(str);
                m mVar2 = this.f44922c;
                U(mVar2);
                e eVarP0 = mVar2.p0(str, eVar.f44691c.f45052b);
                n1 n1Var = this.l;
                if (eVarP0 != null) {
                    b().f45266n.c("Removing conditional user property", eVar.f44689a, n1Var.f44991j.c(eVar.f44691c.f45052b));
                    m mVar3 = this.f44922c;
                    U(mVar3);
                    mVar3.q0(str, eVar.f44691c.f45052b);
                    if (eVarP0.f44693e) {
                        m mVar4 = this.f44922c;
                        U(mVar4);
                        mVar4.j0(str, eVar.f44691c.f45052b);
                    }
                    u uVar = eVar.f44699k;
                    if (uVar != null) {
                        t tVar = uVar.f45196b;
                        u uVarX = l0().X(uVar.f45195a, tVar != null ? tVar.h() : null, eVarP0.f44690b, uVar.f45198d, uVar.f45199e, true);
                        com.google.android.gms.common.internal.i0.h(uVarX);
                        l(uVarX, t4Var);
                    }
                } else {
                    b().f45263j.c("Conditional user property doesn't exist", w0.x(eVar.f44689a), n1Var.f44991j.c(eVar.f44691c.f45052b));
                }
                m mVar5 = this.f44922c;
                U(mVar5);
                mVar5.e0();
                m mVar6 = this.f44922c;
                U(mVar6);
                mVar6.f0();
            } catch (Throwable th2) {
                m mVar7 = this.f44922c;
                U(mVar7);
                mVar7.f0();
                throw th2;
            }
        }
    }

    @Override // y00.x1
    public final vz.b c() {
        n1 n1Var = this.l;
        com.google.android.gms.common.internal.i0.h(n1Var);
        return n1Var.f44992k;
    }

    public final void c0(t4 t4Var, long j9) throws Throwable {
        m mVar = this.f44922c;
        U(mVar);
        String str = t4Var.f45170a;
        com.google.android.gms.common.internal.i0.h(str);
        b1 b1VarT0 = mVar.t0(str);
        if (b1VarT0 != null) {
            l0();
            String str2 = t4Var.f45171b;
            String strH = b1VarT0.H();
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean zIsEmpty2 = TextUtils.isEmpty(strH);
            if (!zIsEmpty && !zIsEmpty2) {
                com.google.android.gms.common.internal.i0.h(str2);
                if (!str2.equals(strH)) {
                    b().f45263j.b(w0.x(b1VarT0.E()), "New GMP App Id passed in. Removing cached database data. appId");
                    m mVar2 = this.f44922c;
                    U(mVar2);
                    n1 n1Var = (n1) mVar2.f21216b;
                    String strE = b1VarT0.E();
                    mVar2.q();
                    mVar2.p();
                    com.google.android.gms.common.internal.i0.e(strE);
                    try {
                        SQLiteDatabase sQLiteDatabaseG0 = mVar2.g0();
                        String[] strArr = {strE};
                        int iDelete = sQLiteDatabaseG0.delete("events", "app_id=?", strArr) + sQLiteDatabaseG0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseG0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseG0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseG0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseG0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseG0.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseG0.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseG0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseG0.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseG0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseG0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseG0.delete("diagnostic_signals", "app_id=?", strArr);
                        if (n1Var.f44985d.A(null, g0.f44770c1)) {
                            iDelete += sQLiteDatabaseG0.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (iDelete > 0) {
                            w0 w0Var = n1Var.f44987f;
                            n1.m(w0Var);
                            w0Var.f45267o.c("Deleted application data. app, records", strE, Integer.valueOf(iDelete));
                        }
                    } catch (SQLiteException e5) {
                        w0 w0Var2 = n1Var.f44987f;
                        n1.m(w0Var2);
                        w0Var2.f45260g.c("Error deleting application data. appId, error", w0.x(strE), e5);
                    }
                    b1VarT0 = null;
                }
            }
        }
        if (b1VarT0 != null) {
            boolean z11 = (b1VarT0.Q() == -2147483648L || b1VarT0.Q() == t4Var.f45179j) ? false : true;
            String strO = b1VarT0.O();
            if (z11 || ((b1VarT0.Q() != -2147483648L || strO == null || strO.equals(t4Var.f45172c)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", strO);
                u uVar = new u("_au", new t(bundle), "auto", j9, 0L);
                if (f0().A(null, g0.X0)) {
                    i(uVar, t4Var);
                } else {
                    j(uVar, t4Var);
                }
            }
        }
    }

    @Override // y00.x1
    public final l1 d() {
        n1 n1Var = this.l;
        com.google.android.gms.common.internal.i0.h(n1Var);
        l1 l1Var = n1Var.f44988g;
        n1.m(l1Var);
        return l1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y00.b1 d0(y00.t4 r13) {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.l4.d0(y00.t4):y00.b1");
    }

    public final b2 e(String str) {
        b2 b2Var = b2.f44615c;
        d().p();
        m0();
        HashMap map = this.B;
        b2 b2VarJ = (b2) map.get(str);
        if (b2VarJ == null) {
            m mVar = this.f44922c;
            U(mVar);
            b2VarJ = mVar.J(str);
            if (b2VarJ == null) {
                b2VarJ = b2.f44615c;
            }
            d().p();
            m0();
            map.put(str, b2VarJ);
            m mVar2 = this.f44922c;
            U(mVar2);
            mVar2.V(str, b2VarJ);
        }
        return b2VarJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List e0(Bundle bundle, t4 t4Var) {
        int[] iArr;
        d().p();
        com.google.android.gms.internal.measurement.f4.a();
        g gVarF0 = f0();
        String str = t4Var.f45170a;
        if (!gVarF0.A(str, g0.O0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    b().f45260g.a("Uri sources and timestamps do not match");
                } else {
                    int i11 = 0;
                    while (i11 < intArray.length) {
                        m mVar = this.f44922c;
                        U(mVar);
                        n1 n1Var = (n1) mVar.f21216b;
                        int i12 = intArray[i11];
                        long j9 = longArray[i11];
                        com.google.android.gms.common.internal.i0.e(str);
                        mVar.p();
                        mVar.q();
                        try {
                            iArr = intArray;
                        } catch (SQLiteException e5) {
                            e = e5;
                            iArr = intArray;
                        }
                        try {
                            int iDelete = mVar.g0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i12), String.valueOf(j9)});
                            w0 w0Var = n1Var.f44987f;
                            n1.m(w0Var);
                            u0 u0Var = w0Var.f45267o;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iDelete).length() + 46);
                            sb2.append("Pruned ");
                            sb2.append(iDelete);
                            sb2.append(" trigger URIs. appId, source, timestamp");
                            u0Var.d(sb2.toString(), str, Integer.valueOf(i12), Long.valueOf(j9));
                        } catch (SQLiteException e11) {
                            e = e11;
                            w0 w0Var2 = n1Var.f44987f;
                            n1.m(w0Var2);
                            w0Var2.f45260g.c("Error pruning trigger URIs. appId", w0.x(str), e);
                        }
                        i11++;
                        intArray = iArr;
                    }
                }
            }
        }
        m mVar2 = this.f44922c;
        U(mVar2);
        String str2 = t4Var.f45170a;
        com.google.android.gms.common.internal.i0.e(str2);
        mVar2.p();
        mVar2.q();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = mVar2.g0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new y3(cursorQuery.getInt(2), cursorQuery.getLong(1), string));
                    } while (cursorQuery.moveToNext());
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th2;
            }
        } catch (SQLiteException e12) {
            w0 w0Var3 = ((n1) mVar2.f21216b).f44987f;
            n1.m(w0Var3);
            w0Var3.f45260g.c("Error querying trigger uris. appId", w0.x(str2), e12);
            arrayList = Collections.EMPTY_LIST;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    @Override // y00.x1
    public final Context f() {
        return this.l.f44982a;
    }

    public final g f0() {
        n1 n1Var = this.l;
        com.google.android.gms.common.internal.i0.h(n1Var);
        return n1Var.f44985d;
    }

    public final long g() {
        c().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        o3 o3Var = this.f44928i;
        o3Var.q();
        o3Var.p();
        d1 d1Var = o3Var.f45050k;
        long jA = d1Var.a();
        if (jA == 0) {
            r4 r4Var = ((n1) o3Var.f21216b).f44990i;
            n1.k(r4Var);
            jA = ((long) r4Var.p0().nextInt(ConversationLogTimestampFormatterKt.MILLISECONDS_IN_A_DAY)) + 1;
            d1Var.b(jA);
        }
        return ((((jCurrentTimeMillis + jA) / 1000) / 60) / 60) / 24;
    }

    public final h1 g0() {
        h1 h1Var = this.f44920a;
        U(h1Var);
        return h1Var;
    }

    public final void h(String str, u uVar) {
        m mVar = this.f44922c;
        U(mVar);
        b1 b1VarT0 = mVar.t0(str);
        if (b1VarT0 != null) {
            n1 n1Var = b1VarT0.f44590a;
            if (!TextUtils.isEmpty(b1VarT0.O())) {
                Boolean boolP = P(b1VarT0);
                if (boolP == null) {
                    if (!"_ui".equals(uVar.f45195a)) {
                        b().f45263j.b(w0.x(str), "Could not find package. appId");
                    }
                } else if (!boolP.booleanValue()) {
                    b().f45260g.b(w0.x(str), "App version does not match; dropping event. appId");
                    return;
                }
                String strH = b1VarT0.H();
                String strO = b1VarT0.O();
                long jQ = b1VarT0.Q();
                l1 l1Var = n1Var.f44988g;
                n1.m(l1Var);
                l1Var.p();
                String str2 = b1VarT0.l;
                l1 l1Var2 = n1Var.f44988g;
                n1.m(l1Var2);
                l1Var2.p();
                long j9 = b1VarT0.f44601m;
                l1 l1Var3 = n1Var.f44988g;
                n1.m(l1Var3);
                l1Var3.p();
                long j11 = b1VarT0.f44602n;
                l1 l1Var4 = n1Var.f44988g;
                n1.m(l1Var4);
                l1Var4.p();
                boolean z11 = b1VarT0.f44603o;
                String strK = b1VarT0.K();
                l1 l1Var5 = n1Var.f44988g;
                n1.m(l1Var5);
                l1Var5.p();
                boolean z12 = b1VarT0.f44604p;
                Boolean boolX = b1VarT0.x();
                long jB = b1VarT0.b();
                l1 l1Var6 = n1Var.f44988g;
                n1.m(l1Var6);
                l1Var6.p();
                ArrayList arrayList = b1VarT0.f44607s;
                String strG = e(str).g();
                boolean z13 = b1VarT0.z();
                l1 l1Var7 = n1Var.f44988g;
                n1.m(l1Var7);
                l1Var7.p();
                long j12 = b1VarT0.f44610v;
                int i11 = e(str).f44617b;
                String str3 = p0(str).f45017b;
                l1 l1Var8 = n1Var.f44988g;
                n1.m(l1Var8);
                l1Var8.p();
                int i12 = b1VarT0.f44612x;
                l1 l1Var9 = n1Var.f44988g;
                n1.m(l1Var9);
                l1Var9.p();
                i(uVar, new t4(str, strH, strO, jQ, str2, j9, j11, (String) null, z11, false, strK, 0L, 0, z12, false, boolX, jB, (List) arrayList, strG, "", (String) null, z13, j12, i11, str3, i12, b1VarT0.B, b1VarT0.D(), b1VarT0.s(), 0L, b1VarT0.t(), 0L));
                return;
            }
        }
        b().f45266n.b(str, "No app data available; dropping event");
    }

    public final m h0() {
        m mVar = this.f44922c;
        U(mVar);
        return mVar;
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x007d: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:126), block:B:18:0x007d */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(y00.u r11, y00.t4 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.l4.i(y00.u, y00.t4):void");
    }

    public final c1 i0() {
        c1 c1Var = this.f44923d;
        if (c1Var != null) {
            return c1Var;
        }
        com.braze.h2.b("Network broadcast receiver not created");
        return null;
    }

    public final void j(u uVar, t4 t4Var) {
        long j9;
        List listS0;
        n1 n1Var;
        List listS02;
        List<e> listS03;
        long j11;
        String str;
        com.google.android.gms.common.internal.i0.h(t4Var);
        String str2 = t4Var.f45170a;
        com.google.android.gms.common.internal.i0.e(str2);
        d().p();
        m0();
        long j12 = uVar.f45198d;
        long j13 = uVar.f45199e;
        x0 x0VarA = x0.a(uVar);
        d().p();
        a3 a3Var = this.F;
        if (a3Var == null || (str = this.G) == null || !str.equals(str2)) {
            a3Var = null;
        }
        r4.m0(a3Var, x0VarA.f45298e, false);
        u uVarB = x0VarA.b();
        k0();
        if (TextUtils.isEmpty(t4Var.f45171b)) {
            return;
        }
        if (!t4Var.f45177h) {
            d0(t4Var);
            return;
        }
        List list = t4Var.f45186r;
        if (list != null) {
            String str3 = uVarB.f45195a;
            if (!list.contains(str3)) {
                b().f45266n.d("Dropping non-safelisted event. appId, event name, origin", str2, str3, uVarB.f45197c);
                return;
            }
            Bundle bundleH = uVarB.f45196b.h();
            j9 = j12;
            bundleH.putLong("ga_safelisted", 1L);
            uVarB = new u(str3, new t(bundleH), uVarB.f45197c, uVarB.f45198d, uVarB.f45199e);
        } else {
            j9 = j12;
        }
        m mVar = this.f44922c;
        U(mVar);
        mVar.d0();
        try {
            String str4 = uVarB.f45195a;
            if ("_s".equals(str4)) {
                m mVar2 = this.f44922c;
                U(mVar2);
                if (!mVar2.E(str2, "_s") && uVarB.f45196b.f45137a.getLong("_sid") != 0) {
                    m mVar3 = this.f44922c;
                    U(mVar3);
                    if (mVar3.E(str2, "_f")) {
                        m mVar4 = this.f44922c;
                        U(mVar4);
                        mVar4.I(str2, null, "_sid", k(str2, uVarB));
                    } else {
                        m mVar5 = this.f44922c;
                        U(mVar5);
                        if (mVar5.E(str2, "_v")) {
                            m mVar42 = this.f44922c;
                            U(mVar42);
                            mVar42.I(str2, null, "_sid", k(str2, uVarB));
                        } else {
                            m mVar6 = this.f44922c;
                            U(mVar6);
                            c().getClass();
                            mVar6.I(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", k(str2, uVarB));
                        }
                    }
                }
            }
            m mVar7 = this.f44922c;
            U(mVar7);
            com.google.android.gms.common.internal.i0.e(str2);
            mVar7.p();
            mVar7.q();
            int i11 = (j9 > 0L ? 1 : (j9 == 0L ? 0 : -1));
            if (i11 < 0) {
                w0 w0Var = ((n1) mVar7.f21216b).f44987f;
                n1.m(w0Var);
                w0Var.f45263j.c("Invalid time querying timed out conditional properties", w0.x(str2), Long.valueOf(j9));
                listS0 = Collections.EMPTY_LIST;
            } else {
                listS0 = mVar7.s0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j9)});
            }
            Iterator it = listS0.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                n1Var = this.l;
                if (!zHasNext) {
                    break;
                }
                e eVar = (e) it.next();
                if (eVar != null) {
                    b().f45267o.d("User property timed out", eVar.f44689a, n1Var.f44991j.c(eVar.f44691c.f45052b), eVar.f44691c.d());
                    u uVar2 = eVar.f44695g;
                    if (uVar2 != null) {
                        j11 = j9;
                        l(new u(uVar2, j11, j13), t4Var);
                    } else {
                        j11 = j9;
                    }
                    m mVar8 = this.f44922c;
                    U(mVar8);
                    mVar8.q0(str2, eVar.f44691c.f45052b);
                    j9 = j11;
                }
            }
            long j14 = j9;
            m mVar9 = this.f44922c;
            U(mVar9);
            com.google.android.gms.common.internal.i0.e(str2);
            mVar9.p();
            mVar9.q();
            if (i11 < 0) {
                w0 w0Var2 = ((n1) mVar9.f21216b).f44987f;
                n1.m(w0Var2);
                w0Var2.f45263j.c("Invalid time querying expired conditional properties", w0.x(str2), Long.valueOf(j14));
                listS02 = Collections.EMPTY_LIST;
            } else {
                listS02 = mVar9.s0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j14)});
            }
            ArrayList arrayList = new ArrayList(listS02.size());
            Iterator it2 = listS02.iterator();
            while (it2.hasNext()) {
                e eVar2 = (e) it2.next();
                if (eVar2 != null) {
                    Iterator it3 = it2;
                    int i12 = i11;
                    long j15 = j14;
                    b().f45267o.d("User property expired", eVar2.f44689a, n1Var.f44991j.c(eVar2.f44691c.f45052b), eVar2.f44691c.d());
                    m mVar10 = this.f44922c;
                    U(mVar10);
                    mVar10.j0(str2, eVar2.f44691c.f45052b);
                    u uVar3 = eVar2.f44699k;
                    if (uVar3 != null) {
                        arrayList.add(uVar3);
                    }
                    m mVar11 = this.f44922c;
                    U(mVar11);
                    mVar11.q0(str2, eVar2.f44691c.f45052b);
                    it2 = it3;
                    i11 = i12;
                    j14 = j15;
                }
            }
            int i13 = i11;
            long j16 = j14;
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                long j17 = j16;
                l(new u((u) it4.next(), j17, j13), t4Var);
                j16 = j17;
                j13 = j13;
            }
            long j18 = j13;
            long j19 = j16;
            m mVar12 = this.f44922c;
            U(mVar12);
            com.google.android.gms.common.internal.i0.e(str2);
            com.google.android.gms.common.internal.i0.e(str4);
            mVar12.p();
            mVar12.q();
            if (i13 < 0) {
                n1 n1Var2 = (n1) mVar12.f21216b;
                w0 w0Var3 = n1Var2.f44987f;
                n1.m(w0Var3);
                w0Var3.f45263j.d("Invalid time querying triggered conditional properties", w0.x(str2), n1Var2.f44991j.a(str4), Long.valueOf(j19));
                listS03 = Collections.EMPTY_LIST;
            } else {
                listS03 = mVar12.s0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j19)});
            }
            ArrayList arrayList2 = new ArrayList(listS03.size());
            for (e eVar3 : listS03) {
                if (eVar3 != null) {
                    o4 o4Var = eVar3.f44691c;
                    String str5 = eVar3.f44689a;
                    com.google.android.gms.common.internal.i0.h(str5);
                    long j21 = j19;
                    String str6 = eVar3.f44690b;
                    String str7 = o4Var.f45052b;
                    Object objD = o4Var.d();
                    com.google.android.gms.common.internal.i0.h(objD);
                    p4 p4Var = new p4(str5, str6, str7, j21, objD);
                    j19 = j21;
                    Object obj = p4Var.f45072e;
                    String str8 = p4Var.f45070c;
                    m mVar13 = this.f44922c;
                    U(mVar13);
                    if (mVar13.k0(p4Var)) {
                        b().f45267o.d("User property triggered", eVar3.f44689a, n1Var.f44991j.c(str8), obj);
                    } else {
                        b().f45260g.d("Too many active user properties, ignoring", w0.x(eVar3.f44689a), n1Var.f44991j.c(str8), obj);
                    }
                    u uVar4 = eVar3.f44697i;
                    if (uVar4 != null) {
                        arrayList2.add(uVar4);
                    }
                    eVar3.f44691c = new o4(p4Var);
                    eVar3.f44693e = true;
                    m mVar14 = this.f44922c;
                    U(mVar14);
                    mVar14.o0(eVar3);
                }
            }
            l(uVarB, t4Var);
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                long j22 = j18;
                l(new u((u) it5.next(), j19, j22), t4Var);
                j18 = j22;
            }
            m mVar15 = this.f44922c;
            U(mVar15);
            mVar15.e0();
            m mVar16 = this.f44922c;
            U(mVar16);
            mVar16.f0();
        } catch (Throwable th2) {
            m mVar17 = this.f44922c;
            U(mVar17);
            mVar17.f0();
            throw th2;
        }
    }

    public final c j0() {
        c cVar = this.f44925f;
        U(cVar);
        return cVar;
    }

    public final Bundle k(String str, u uVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", uVar.f45196b.f45137a.getLong("_sid"));
        m mVar = this.f44922c;
        U(mVar);
        p4 p4VarL0 = mVar.l0(str, "_sno");
        if (p4VarL0 != null) {
            Object obj = p4VarL0.f45072e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final n4 k0() {
        n4 n4Var = this.f44926g;
        U(n4Var);
        return n4Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:73|(4:75|(0)(1:78)|85|(1:87)(1:88))|77|79|336|80|84|85|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02e4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02e5, code lost:
    
        ((y00.n1) r10.f21216b).b().t().c("Error pruning currencies. appId", y00.w0.x(r11), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03d1 A[Catch: all -> 0x01c3, TryCatch #0 {all -> 0x01c3, blocks: (B:37:0x01a1, B:40:0x01b0, B:42:0x01b8, B:48:0x01c7, B:90:0x0356, B:99:0x038e, B:101:0x03d1, B:103:0x03d6, B:104:0x03ed, B:106:0x03f8, B:108:0x0412, B:110:0x0418, B:111:0x042f, B:114:0x044c, B:118:0x046b, B:119:0x0482, B:120:0x048b, B:123:0x04a8, B:124:0x04bc, B:126:0x04c4, B:128:0x04ce, B:130:0x04d4, B:131:0x04db, B:132:0x04e8, B:138:0x052d, B:139:0x0542, B:141:0x0571, B:144:0x059b, B:146:0x05a5, B:150:0x05f2, B:152:0x061d, B:154:0x064a, B:155:0x064d, B:157:0x0655, B:158:0x0658, B:160:0x0660, B:161:0x0663, B:163:0x066b, B:164:0x066e, B:166:0x0677, B:167:0x067b, B:169:0x0689, B:170:0x068c, B:172:0x06bb, B:174:0x06cd, B:178:0x06e2, B:183:0x06f0, B:186:0x06f9, B:190:0x0707, B:194:0x0716, B:198:0x0725, B:202:0x0734, B:206:0x0743, B:210:0x0750, B:214:0x075f, B:215:0x076b, B:217:0x0771, B:218:0x0774, B:220:0x078a, B:221:0x0794, B:223:0x07a1, B:225:0x07ab, B:226:0x07ae, B:235:0x07e5, B:151:0x060d, B:135:0x0512, B:93:0x0368, B:94:0x0374, B:96:0x037a, B:98:0x0388, B:53:0x01e5, B:56:0x01f7, B:58:0x020c, B:64:0x0224, B:69:0x0254, B:71:0x025a, B:73:0x0268, B:75:0x0276, B:78:0x0289, B:85:0x0310, B:87:0x031a, B:79:0x02b9, B:80:0x02d2, B:84:0x02fa, B:83:0x02e5, B:67:0x0230, B:68:0x024e), top: B:335:0x01a1, inners: #1, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x08be A[Catch: all -> 0x084c, TryCatch #7 {all -> 0x084c, blocks: (B:228:0x07c4, B:230:0x07c8, B:233:0x07da, B:236:0x07ee, B:238:0x07f8, B:240:0x0804, B:242:0x080e, B:244:0x081c, B:246:0x0836, B:250:0x0855, B:252:0x0863, B:253:0x086c, B:255:0x087b, B:257:0x08be, B:260:0x08c9, B:261:0x08d3, B:262:0x08d4, B:264:0x08de), top: B:347:0x07c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x08de A[Catch: all -> 0x084c, TRY_LEAVE, TryCatch #7 {all -> 0x084c, blocks: (B:228:0x07c4, B:230:0x07c8, B:233:0x07da, B:236:0x07ee, B:238:0x07f8, B:240:0x0804, B:242:0x080e, B:244:0x081c, B:246:0x0836, B:250:0x0855, B:252:0x0863, B:253:0x086c, B:255:0x087b, B:257:0x08be, B:260:0x08c9, B:261:0x08d3, B:262:0x08d4, B:264:0x08de), top: B:347:0x07c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x093e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0967 A[Catch: all -> 0x0908, TryCatch #4 {all -> 0x0908, blocks: (B:266:0x08e5, B:268:0x08fc, B:272:0x090b, B:274:0x0941, B:276:0x0949, B:278:0x0953, B:279:0x095d, B:281:0x0967, B:282:0x0971, B:283:0x097a, B:285:0x0980, B:287:0x09ca, B:289:0x09dc, B:293:0x09f7, B:295:0x0a07, B:292:0x09eb, B:299:0x0a1a, B:300:0x0a5c, B:301:0x0a67, B:302:0x0a7c, B:304:0x0a82, B:313:0x0ac9, B:314:0x0b1c, B:316:0x0b2d, B:330:0x0b94, B:321:0x0b47, B:322:0x0b4a, B:307:0x0a8f, B:309:0x0ab5, B:327:0x0b65, B:328:0x0b7e, B:329:0x0b7f), top: B:342:0x08e5, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0980 A[Catch: all -> 0x0908, TryCatch #4 {all -> 0x0908, blocks: (B:266:0x08e5, B:268:0x08fc, B:272:0x090b, B:274:0x0941, B:276:0x0949, B:278:0x0953, B:279:0x095d, B:281:0x0967, B:282:0x0971, B:283:0x097a, B:285:0x0980, B:287:0x09ca, B:289:0x09dc, B:293:0x09f7, B:295:0x0a07, B:292:0x09eb, B:299:0x0a1a, B:300:0x0a5c, B:301:0x0a67, B:302:0x0a7c, B:304:0x0a82, B:313:0x0ac9, B:314:0x0b1c, B:316:0x0b2d, B:330:0x0b94, B:321:0x0b47, B:322:0x0b4a, B:307:0x0a8f, B:309:0x0ab5, B:327:0x0b65, B:328:0x0b7e, B:329:0x0b7f), top: B:342:0x08e5, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0a82 A[Catch: all -> 0x0908, TryCatch #4 {all -> 0x0908, blocks: (B:266:0x08e5, B:268:0x08fc, B:272:0x090b, B:274:0x0941, B:276:0x0949, B:278:0x0953, B:279:0x095d, B:281:0x0967, B:282:0x0971, B:283:0x097a, B:285:0x0980, B:287:0x09ca, B:289:0x09dc, B:293:0x09f7, B:295:0x0a07, B:292:0x09eb, B:299:0x0a1a, B:300:0x0a5c, B:301:0x0a67, B:302:0x0a7c, B:304:0x0a82, B:313:0x0ac9, B:314:0x0b1c, B:316:0x0b2d, B:330:0x0b94, B:321:0x0b47, B:322:0x0b4a, B:307:0x0a8f, B:309:0x0ab5, B:327:0x0b65, B:328:0x0b7e, B:329:0x0b7f), top: B:342:0x08e5, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0b2d A[Catch: all -> 0x0908, SQLiteException -> 0x0b43, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x0b43, blocks: (B:314:0x0b1c, B:316:0x0b2d), top: B:340:0x0b1c, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0b45  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0a8f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x031a A[Catch: all -> 0x01c3, TryCatch #0 {all -> 0x01c3, blocks: (B:37:0x01a1, B:40:0x01b0, B:42:0x01b8, B:48:0x01c7, B:90:0x0356, B:99:0x038e, B:101:0x03d1, B:103:0x03d6, B:104:0x03ed, B:106:0x03f8, B:108:0x0412, B:110:0x0418, B:111:0x042f, B:114:0x044c, B:118:0x046b, B:119:0x0482, B:120:0x048b, B:123:0x04a8, B:124:0x04bc, B:126:0x04c4, B:128:0x04ce, B:130:0x04d4, B:131:0x04db, B:132:0x04e8, B:138:0x052d, B:139:0x0542, B:141:0x0571, B:144:0x059b, B:146:0x05a5, B:150:0x05f2, B:152:0x061d, B:154:0x064a, B:155:0x064d, B:157:0x0655, B:158:0x0658, B:160:0x0660, B:161:0x0663, B:163:0x066b, B:164:0x066e, B:166:0x0677, B:167:0x067b, B:169:0x0689, B:170:0x068c, B:172:0x06bb, B:174:0x06cd, B:178:0x06e2, B:183:0x06f0, B:186:0x06f9, B:190:0x0707, B:194:0x0716, B:198:0x0725, B:202:0x0734, B:206:0x0743, B:210:0x0750, B:214:0x075f, B:215:0x076b, B:217:0x0771, B:218:0x0774, B:220:0x078a, B:221:0x0794, B:223:0x07a1, B:225:0x07ab, B:226:0x07ae, B:235:0x07e5, B:151:0x060d, B:135:0x0512, B:93:0x0368, B:94:0x0374, B:96:0x037a, B:98:0x0388, B:53:0x01e5, B:56:0x01f7, B:58:0x020c, B:64:0x0224, B:69:0x0254, B:71:0x025a, B:73:0x0268, B:75:0x0276, B:78:0x0289, B:85:0x0310, B:87:0x031a, B:79:0x02b9, B:80:0x02d2, B:84:0x02fa, B:83:0x02e5, B:67:0x0230, B:68:0x024e), top: B:335:0x01a1, inners: #1, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0368 A[Catch: all -> 0x01c3, TryCatch #0 {all -> 0x01c3, blocks: (B:37:0x01a1, B:40:0x01b0, B:42:0x01b8, B:48:0x01c7, B:90:0x0356, B:99:0x038e, B:101:0x03d1, B:103:0x03d6, B:104:0x03ed, B:106:0x03f8, B:108:0x0412, B:110:0x0418, B:111:0x042f, B:114:0x044c, B:118:0x046b, B:119:0x0482, B:120:0x048b, B:123:0x04a8, B:124:0x04bc, B:126:0x04c4, B:128:0x04ce, B:130:0x04d4, B:131:0x04db, B:132:0x04e8, B:138:0x052d, B:139:0x0542, B:141:0x0571, B:144:0x059b, B:146:0x05a5, B:150:0x05f2, B:152:0x061d, B:154:0x064a, B:155:0x064d, B:157:0x0655, B:158:0x0658, B:160:0x0660, B:161:0x0663, B:163:0x066b, B:164:0x066e, B:166:0x0677, B:167:0x067b, B:169:0x0689, B:170:0x068c, B:172:0x06bb, B:174:0x06cd, B:178:0x06e2, B:183:0x06f0, B:186:0x06f9, B:190:0x0707, B:194:0x0716, B:198:0x0725, B:202:0x0734, B:206:0x0743, B:210:0x0750, B:214:0x075f, B:215:0x076b, B:217:0x0771, B:218:0x0774, B:220:0x078a, B:221:0x0794, B:223:0x07a1, B:225:0x07ab, B:226:0x07ae, B:235:0x07e5, B:151:0x060d, B:135:0x0512, B:93:0x0368, B:94:0x0374, B:96:0x037a, B:98:0x0388, B:53:0x01e5, B:56:0x01f7, B:58:0x020c, B:64:0x0224, B:69:0x0254, B:71:0x025a, B:73:0x0268, B:75:0x0276, B:78:0x0289, B:85:0x0310, B:87:0x031a, B:79:0x02b9, B:80:0x02d2, B:84:0x02fa, B:83:0x02e5, B:67:0x0230, B:68:0x024e), top: B:335:0x01a1, inners: #1, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(y00.u r42, y00.t4 r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.l4.l(y00.u, y00.t4):void");
    }

    public final r4 l0() {
        n1 n1Var = this.l;
        com.google.android.gms.common.internal.i0.h(n1Var);
        r4 r4Var = n1Var.f44990i;
        n1.k(r4Var);
        return r4Var;
    }

    public final void m(b1 b1Var, a9 a9Var) {
        x0.e eVar;
        l9 l9Var;
        d().p();
        m0();
        String strF0 = ((b9) a9Var.f11483b).F0();
        EnumMap enumMap = new EnumMap(a2.class);
        int i11 = 0;
        if (strF0.length() < a2.values().length || strF0.charAt(0) != '1') {
            eVar = new x0.e(2);
        } else {
            a2[] a2VarArrValues = a2.values();
            int length = a2VarArrValues.length;
            int i12 = 0;
            int i13 = 1;
            while (i12 < length) {
                enumMap.put(a2VarArrValues[i12], h.a(strF0.charAt(i13)));
                i12++;
                i13++;
            }
            eVar = new x0.e(enumMap);
        }
        String strE = b1Var.E();
        d().p();
        m0();
        b2 b2VarE = e(strE);
        EnumMap enumMap2 = b2VarE.f44616a;
        a2 a2Var = a2.AD_STORAGE;
        y1 y1Var = (y1) enumMap2.get(a2Var);
        if (y1Var == null) {
            y1Var = y1.UNINITIALIZED;
        }
        int i14 = b2VarE.f44617b;
        int iOrdinal = y1Var.ordinal();
        if (iOrdinal == 1) {
            eVar.j(a2Var, h.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            eVar.i(a2Var, i14);
        } else {
            eVar.j(a2Var, h.FAILSAFE);
        }
        a2 a2Var2 = a2.ANALYTICS_STORAGE;
        y1 y1Var2 = (y1) enumMap2.get(a2Var2);
        if (y1Var2 == null) {
            y1Var2 = y1.UNINITIALIZED;
        }
        int iOrdinal2 = y1Var2.ordinal();
        if (iOrdinal2 == 1) {
            eVar.j(a2Var2, h.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            eVar.i(a2Var2, i14);
        } else {
            eVar.j(a2Var2, h.FAILSAFE);
        }
        String strE2 = b1Var.E();
        d().p();
        m0();
        o oVarR0 = r0(strE2, p0(strE2), e(strE2), eVar);
        String str = oVarR0.f45019d;
        Boolean bool = oVarR0.f45018c;
        com.google.android.gms.common.internal.i0.h(bool);
        boolean zBooleanValue = bool.booleanValue();
        a9Var.b();
        ((b9) a9Var.f11483b).j1(zBooleanValue);
        if (!TextUtils.isEmpty(str)) {
            a9Var.b();
            ((b9) a9Var.f11483b).k1(str);
        }
        d().p();
        m0();
        Iterator it = Collections.unmodifiableList(((b9) a9Var.f11483b).Z1()).iterator();
        while (true) {
            if (it.hasNext()) {
                l9Var = (l9) it.next();
                if ("_npa".equals(l9Var.v())) {
                    break;
                }
            } else {
                l9Var = null;
                break;
            }
        }
        if (l9Var != null) {
            a2 a2Var3 = a2.AD_PERSONALIZATION;
            h hVar = (h) ((EnumMap) eVar.f43625b).get(a2Var3);
            if (hVar == null) {
                hVar = h.UNSET;
            }
            if (hVar == h.UNSET) {
                m mVar = this.f44922c;
                U(mVar);
                p4 p4VarL0 = mVar.l0(b1Var.E(), "_npa");
                if (p4VarL0 != null) {
                    String str2 = p4VarL0.f45069b;
                    if ("tcf".equals(str2)) {
                        eVar.j(a2Var3, h.TCF);
                    } else if ("app".equals(str2)) {
                        eVar.j(a2Var3, h.API);
                    } else {
                        eVar.j(a2Var3, h.MANIFEST);
                    }
                } else {
                    Boolean boolX = b1Var.x();
                    if (boolX == null || ((boolX.booleanValue() && l9Var.z() != 1) || !(boolX.booleanValue() || l9Var.z() == 0))) {
                        eVar.j(a2Var3, h.API);
                    } else {
                        eVar.j(a2Var3, h.MANIFEST);
                    }
                }
            }
        } else {
            int iF = F(b1Var.E(), eVar);
            k9 k9VarE = l9.E();
            k9VarE.b();
            ((l9) k9VarE.f11483b).G("_npa");
            c().getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            k9VarE.b();
            ((l9) k9VarE.f11483b).F(jCurrentTimeMillis);
            k9VarE.b();
            ((l9) k9VarE.f11483b).J(iF);
            l9 l9Var2 = (l9) k9VarE.d();
            a9Var.b();
            ((b9) a9Var.f11483b).h0(l9Var2);
            b().f45267o.c("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(iF));
        }
        String string = eVar.toString();
        a9Var.b();
        ((b9) a9Var.f11483b).i1(string);
        String strE3 = b1Var.E();
        h1 h1Var = this.f44920a;
        h1Var.p();
        h1Var.v(strE3);
        s7 s7VarL = h1Var.L(strE3);
        boolean z11 = s7VarL == null || !s7VarL.w() || s7VarL.x();
        List listX = a9Var.X();
        for (int i15 = 0; i15 < listX.size(); i15++) {
            if ("_tcf".equals(((t8) listX.get(i15)).y())) {
                s8 s8Var = (s8) ((t8) listX.get(i15)).k();
                List listI = s8Var.i();
                int i16 = 0;
                while (true) {
                    if (i16 >= listI.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((w8) listI.get(i16)).u())) {
                        String strW = ((w8) listI.get(i16)).w();
                        if (z11 && strW.length() > 4) {
                            char[] charArray = strW.toCharArray();
                            int i17 = 1;
                            while (true) {
                                if (i17 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i17)) {
                                    i11 = i17;
                                    break;
                                }
                                i17++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11 | 1);
                            strW = String.valueOf(charArray);
                        }
                        v8 v8VarF = w8.F();
                        v8VarF.i("_tcfd");
                        v8VarF.j(strW);
                        s8Var.b();
                        ((t8) s8Var.f11483b).K(i16, (w8) v8VarF.d());
                    } else {
                        i16++;
                    }
                }
                a9Var.Z(i15, s8Var);
                return;
            }
        }
    }

    public final void m0() {
        if (this.f44931m.get()) {
            return;
        }
        com.braze.h2.b("UploadController is not initialized");
    }

    public final void n(b1 b1Var, a9 a9Var) {
        Serializable serializableH;
        d().p();
        m0();
        d8 d8VarY = g8.Y();
        n1 n1Var = b1Var.f44590a;
        l1 l1Var = n1Var.f44988g;
        n1.m(l1Var);
        l1Var.p();
        byte[] bArr = b1Var.H;
        if (bArr != null) {
            try {
                d8VarY = (d8) n4.a0(d8VarY, bArr);
            } catch (zzaeh unused) {
                b().f45263j.b(w0.x(b1Var.E()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        Iterator it = a9Var.X().iterator();
        while (it.hasNext()) {
            t8 t8Var = (t8) it.next();
            if (t8Var.y().equals("_cmp")) {
                w8 w8VarZ = n4.z(t8Var, "gclid");
                Serializable serializableH2 = w8VarZ == null ? null : n4.H(w8VarZ);
                if (serializableH2 == null) {
                    serializableH2 = "";
                }
                String str = (String) serializableH2;
                w8 w8VarZ2 = n4.z(t8Var, "gbraid");
                Serializable serializableH3 = w8VarZ2 == null ? null : n4.H(w8VarZ2);
                if (serializableH3 == null) {
                    serializableH3 = "";
                }
                String str2 = (String) serializableH3;
                w8 w8VarZ3 = n4.z(t8Var, "gad_source");
                Serializable serializableH4 = w8VarZ3 == null ? null : n4.H(w8VarZ3);
                if (serializableH4 == null) {
                    serializableH4 = "";
                }
                String str3 = (String) serializableH4;
                w8 w8VarZ4 = n4.z(t8Var, "deep_link_url");
                Serializable serializableH5 = w8VarZ4 == null ? null : n4.H(w8VarZ4);
                String str4 = (String) (serializableH5 != null ? serializableH5 : "");
                String[] strArrSplit = ((String) g0.f44767b1.a(null)).split(MessageLogView.COMMA_SEPARATOR);
                k0();
                HashMap map = new HashMap();
                for (w8 w8Var : t8Var.v()) {
                    Iterator it2 = it;
                    if (Arrays.asList(strArrSplit).contains(w8Var.u()) && (serializableH = n4.H(w8Var)) != null) {
                        map.put(w8Var.u(), serializableH);
                    }
                    it = it2;
                }
                Iterator it3 = it;
                if (!map.isEmpty()) {
                    w8 w8VarZ5 = n4.z(t8Var, "click_timestamp");
                    Serializable serializableH6 = w8VarZ5 == null ? null : n4.H(w8VarZ5);
                    long jLongValue = ((Long) (serializableH6 != null ? serializableH6 : 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = t8Var.A();
                    }
                    long j9 = jLongValue;
                    w8 w8VarZ6 = n4.z(t8Var, "_cis");
                    if ("referrer API v2".equals(w8VarZ6 == null ? null : n4.H(w8VarZ6))) {
                        if (j9 > ((g8) d8VarY.f11483b).V()) {
                            if (str.isEmpty()) {
                                d8VarY.b();
                                ((g8) d8VarY.f11483b).w();
                            } else {
                                d8VarY.b();
                                ((g8) d8VarY.f11483b).v(str);
                            }
                            if (str2.isEmpty()) {
                                d8VarY.b();
                                ((g8) d8VarY.f11483b).y();
                            } else {
                                d8VarY.b();
                                ((g8) d8VarY.f11483b).x(str2);
                            }
                            if (str3.isEmpty()) {
                                d8VarY.b();
                                ((g8) d8VarY.f11483b).A();
                            } else {
                                d8VarY.b();
                                ((g8) d8VarY.f11483b).z(str3);
                            }
                            d8VarY.b();
                            ((g8) d8VarY.f11483b).B(j9);
                            d8VarY.b();
                            ((g8) d8VarY.f11483b).D().clear();
                            HashMap mapG = G(t8Var);
                            d8VarY.b();
                            ((g8) d8VarY.f11483b).D().putAll(mapG);
                        }
                    } else if (j9 > ((g8) d8VarY.f11483b).N()) {
                        if (str.isEmpty()) {
                            d8VarY.b();
                            ((g8) d8VarY.f11483b).b0();
                        } else {
                            d8VarY.b();
                            ((g8) d8VarY.f11483b).a0(str);
                        }
                        if (str2.isEmpty()) {
                            d8VarY.b();
                            ((g8) d8VarY.f11483b).d0();
                        } else {
                            d8VarY.b();
                            ((g8) d8VarY.f11483b).c0(str2);
                        }
                        if (str3.isEmpty()) {
                            d8VarY.b();
                            ((g8) d8VarY.f11483b).t();
                        } else {
                            d8VarY.b();
                            ((g8) d8VarY.f11483b).e0(str3);
                        }
                        if (f0().A(null, g0.f44764a1)) {
                            if (str4.isEmpty()) {
                                d8VarY.b();
                                ((g8) d8VarY.f11483b).F();
                            } else {
                                d8VarY.b();
                                ((g8) d8VarY.f11483b).E(str4);
                            }
                        }
                        d8VarY.b();
                        ((g8) d8VarY.f11483b).u(j9);
                        d8VarY.b();
                        ((g8) d8VarY.f11483b).C().clear();
                        HashMap mapG2 = G(t8Var);
                        d8VarY.b();
                        ((g8) d8VarY.f11483b).C().putAll(mapG2);
                    }
                }
                it = it3;
            }
        }
        if (!((g8) d8VarY.d()).equals(g8.Z())) {
            g8 g8Var = (g8) d8VarY.d();
            a9Var.b();
            ((b9) a9Var.f11483b).o1(g8Var);
        }
        byte[] bArrA = ((g8) d8VarY.d()).a();
        l1 l1Var2 = n1Var.f44988g;
        n1.m(l1Var2);
        l1Var2.p();
        b1Var.R |= b1Var.H != bArrA;
        b1Var.H = bArrA;
        if (b1Var.o()) {
            m mVar = this.f44922c;
            U(mVar);
            mVar.u0(b1Var, false);
        }
        if (f0().A(null, g0.f44764a1)) {
            for (int i11 = 0; i11 < a9Var.Y(); i11++) {
                t8 t8VarY1 = ((b9) a9Var.f11483b).Y1(i11);
                if ("_cmp".equals(t8VarY1.y())) {
                    s8 s8Var = (s8) t8VarY1.k();
                    List listI = s8Var.i();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= listI.size()) {
                            break;
                        }
                        if ("deep_link_url".equals(((w8) listI.get(i12)).u())) {
                            s8Var.n(i12);
                            a9Var.Z(i11, s8Var);
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
        if (f0().A(null, g0.Z0)) {
            m mVar2 = this.f44922c;
            U(mVar2);
            mVar2.j0(b1Var.E(), "_lgclid");
        }
    }

    public final void n0(t4 t4Var) {
        d().p();
        m0();
        String str = t4Var.f45170a;
        com.google.android.gms.common.internal.i0.e(str);
        b2 b2VarC = b2.c(t4Var.f45192x, t4Var.f45187s);
        e(str);
        b().f45267o.c("Setting storage consent for package", str, b2VarC);
        d().p();
        m0();
        this.B.put(str, b2VarC);
        m mVar = this.f44922c;
        U(mVar);
        mVar.V(str, b2VarC);
    }

    public final String o(b2 b2Var) {
        if (!b2Var.i(a2.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        l0().p0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void o0(t4 t4Var) {
        d().p();
        m0();
        String str = t4Var.f45170a;
        com.google.android.gms.common.internal.i0.e(str);
        o oVarB = o.b(t4Var.f45193y);
        b().f45267o.c("Setting DMA consent for package", str, oVarB);
        d().p();
        m0();
        y1 y1VarA = o.c(100, q0(str)).a();
        this.C.put(str, oVarB);
        m mVar = this.f44922c;
        U(mVar);
        com.google.android.gms.common.internal.i0.h(str);
        com.google.android.gms.common.internal.i0.h(oVarB);
        mVar.p();
        mVar.q();
        b2 b2VarJ = mVar.J(str);
        b2 b2Var = b2.f44615c;
        if (b2VarJ == b2Var) {
            mVar.V(str, b2Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", oVarB.f45017b);
        mVar.O(contentValues);
        y1 y1VarA2 = o.c(100, q0(str)).a();
        d().p();
        m0();
        y1 y1Var = y1.DENIED;
        boolean z11 = y1VarA == y1Var && y1VarA2 == y1.GRANTED;
        boolean z12 = y1VarA == y1.GRANTED && y1VarA2 == y1Var;
        if (z11 || z12) {
            b().f45267o.b(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            m mVar2 = this.f44922c;
            U(mVar2);
            if (mVar2.v0(g(), str, false, false, false, false).f44869f < f0().y(str, g0.f44794l0)) {
                bundle.putLong("_r", 1L);
                m mVar3 = this.f44922c;
                U(mVar3);
                b().f45267o.c("_dcu realtime event count", str, Long.valueOf(mVar3.v0(g(), str, false, false, true, false).f44869f));
            }
            this.J.b(str, "_dcu", bundle);
        }
    }

    public final void p(ArrayList arrayList) {
        com.google.android.gms.common.internal.i0.b(!arrayList.isEmpty());
        if (this.f44943y != null) {
            b().f45260g.a("Set uploading progress before finishing the previous upload");
        } else {
            this.f44943y = new ArrayList(arrayList);
        }
    }

    public final o p0(String str) {
        d().p();
        m0();
        HashMap map = this.C;
        o oVar = (o) map.get(str);
        if (oVar != null) {
            return oVar;
        }
        m mVar = this.f44922c;
        U(mVar);
        com.google.android.gms.common.internal.i0.h(str);
        mVar.p();
        mVar.q();
        o oVarB = o.b(mVar.N("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        map.put(str, oVarB);
        return oVarB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ab A[Catch: all -> 0x0028, TryCatch #4 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00a8, B:24:0x00ae, B:25:0x00b1, B:27:0x00ca, B:28:0x00df, B:30:0x00f0, B:32:0x00f6, B:35:0x010b, B:45:0x012a, B:47:0x012f, B:48:0x0132, B:49:0x0133, B:50:0x0138, B:55:0x017d, B:71:0x01a5, B:73:0x01ab, B:75:0x01b6, B:79:0x01c1, B:80:0x01c4, B:33:0x00fb, B:37:0x010f, B:42:0x0117), top: B:91:0x000e, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r11v0, types: [y00.l4] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.l4.q():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    public final Bundle q0(String str) {
        d().p();
        m0();
        h1 h1Var = this.f44920a;
        U(h1Var);
        if (h1Var.L(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        b2 b2VarE = e(str);
        Bundle bundle2 = new Bundle();
        Iterator it = b2VarE.f44616a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iOrdinal = ((y1) entry.getValue()).ordinal();
            String str2 = iOrdinal != 2 ? iOrdinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((a2) entry.getKey()).zze, str2);
            }
        }
        bundle.putAll(bundle2);
        o oVarR0 = r0(str, p0(str), b2VarE, new x0.e(2));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : oVarR0.f45020e.entrySet()) {
            int iOrdinal2 = ((y1) entry2.getValue()).ordinal();
            String str3 = iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((a2) entry2.getKey()).zze, str3);
            }
        }
        Boolean bool = oVarR0.f45018c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = oVarR0.f45019d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        m mVar = this.f44922c;
        U(mVar);
        p4 p4VarL0 = mVar.l0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (p4VarL0 != null ? p4VarL0.f45072e.equals(1L) : F(str, new x0.e(2))) ? "granted" : "denied");
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[PHI: r0 r11 r24
      0x006f: PHI (r0v128 java.util.List) = (r0v8 java.util.List), (r0v150 java.util.List) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r11v74 android.database.Cursor) = (r11v5 android.database.Cursor), (r11v76 android.database.Cursor) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r24v10 long) = (r24v2 long), (r24v11 long) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0a7b  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x07f3 A[EDGE_INSN: B:439:0x07f3->B:313:0x07f3 BREAK  A[LOOP:4: B:259:0x064a->B:312:0x07e5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x07e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:476:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:478:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:479:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v77 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r31v0, types: [java.lang.Object, y00.l4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(long r32, java.lang.String r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.l4.r(long, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y00.o r0(java.lang.String r11, y00.o r12, y00.b2 r13, x0.e r14) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.l4.r0(java.lang.String, y00.o, y00.b2, x0.e):y00.o");
    }

    public final boolean s(String str, String str2) {
        m mVar = this.f44922c;
        U(mVar);
        b1 b1VarT0 = mVar.t0(str);
        HashMap map = this.E;
        if (b1VarT0 != null && l0().V(str, b1VarT0.D())) {
            map.remove(str2);
            return true;
        }
        k4 k4Var = (k4) map.get(str2);
        if (k4Var != null) {
            k4Var.f44901a.c().getClass();
            if (System.currentTimeMillis() < k4Var.f44903c) {
                return false;
            }
        }
        return true;
    }

    public final void t(String str) {
        l4 l4Var;
        Throwable th2;
        d().p();
        m0();
        this.f44940v = true;
        try {
            n1 n1Var = this.l;
            n1Var.getClass();
            Boolean bool = n1Var.p().f44963f;
            try {
                if (bool == null) {
                    b().f45263j.a("Upload data called on the client side before use of service was decided");
                } else if (bool.booleanValue()) {
                    b().f45260g.a("Upload called in the client side when service should be used");
                } else if (this.f44933o > 0) {
                    N();
                } else {
                    a1 a1Var = this.f44921b;
                    U(a1Var);
                    if (a1Var.t()) {
                        m mVar = this.f44922c;
                        U(mVar);
                        if (mVar.v(str)) {
                            m mVar2 = this.f44922c;
                            U(mVar2);
                            com.google.android.gms.common.internal.i0.e(str);
                            mVar2.p();
                            mVar2.q();
                            List listU = mVar2.u(str, c4.d(z2.GOOGLE_SIGNAL), 1);
                            m4 m4Var = listU.isEmpty() ? null : (m4) listU.get(0);
                            if (m4Var != null) {
                                z8 z8Var = m4Var.f44970b;
                                b().f45267o.d("[sgtm] Uploading data from upload queue. appId, type, url", str, m4Var.f44973e, m4Var.f44971c);
                                byte[] bArrA = z8Var.a();
                                if (Log.isLoggable(b().z(), 2)) {
                                    n4 n4Var = this.f44926g;
                                    U(n4Var);
                                    b().f45267o.d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrA.length), n4Var.Q(z8Var));
                                }
                                g4 g4Var = new g4(m4Var.f44971c, m4Var.f44972d, m4Var.f44973e, null);
                                this.f44939u = true;
                                a1 a1Var2 = this.f44921b;
                                U(a1Var2);
                                l4Var = this;
                                try {
                                    a1Var2.w(str, g4Var, z8Var, new t5.a(22, l4Var, str, m4Var, false));
                                } catch (Throwable th3) {
                                    th = th3;
                                    th2 = th;
                                    l4Var.f44940v = false;
                                    O();
                                    throw th2;
                                }
                            }
                            l4Var.f44940v = false;
                            O();
                        }
                        b().f45267o.b(str, "[sgtm] Upload queue has no batches for appId");
                    } else {
                        b().f45267o.a("Network not connected, ignoring upload request");
                        N();
                    }
                }
                l4Var = this;
                l4Var.f44940v = false;
                O();
            } catch (Throwable th4) {
                th2 = th4;
                l4Var = this;
                l4Var.f44940v = false;
                O();
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            l4Var = this;
        }
    }

    public final void u(String str, boolean z11, Long l, Long l7) {
        m mVar = this.f44922c;
        U(mVar);
        b1 b1VarT0 = mVar.t0(str);
        if (b1VarT0 != null) {
            n1 n1Var = b1VarT0.f44590a;
            l1 l1Var = n1Var.f44988g;
            n1.m(l1Var);
            l1Var.p();
            b1VarT0.R |= b1VarT0.f44613y != z11;
            b1VarT0.f44613y = z11;
            l1 l1Var2 = n1Var.f44988g;
            n1.m(l1Var2);
            l1Var2.p();
            b1VarT0.R |= !Objects.equals(b1VarT0.f44614z, l);
            b1VarT0.f44614z = l;
            l1 l1Var3 = n1Var.f44988g;
            n1.m(l1Var3);
            l1Var3.p();
            b1VarT0.R |= !Objects.equals(b1VarT0.A, l7);
            b1VarT0.A = l7;
            if (b1VarT0.o()) {
                m mVar2 = this.f44922c;
                U(mVar2);
                mVar2.u0(b1VarT0, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(com.google.android.gms.internal.measurement.a9 r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.l4.v(com.google.android.gms.internal.measurement.a9, java.lang.String):void");
    }

    public final void w(a9 a9Var, u90.j jVar) {
        String strN0;
        String strN02;
        for (int i11 = 0; i11 < a9Var.Y(); i11++) {
            s8 s8Var = (s8) ((b9) a9Var.f11483b).Y1(i11).k();
            Iterator it = s8Var.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((w8) it.next()).u())) {
                    if (((b9) jVar.f40914b).K0() >= f0().y(((b9) jVar.f40914b).t(), g0.f44793k0)) {
                        int iY = f0().y(((b9) jVar.f40914b).t(), g0.f44817x0);
                        LinkedList linkedList = this.f44935q;
                        n4 n4Var = this.f44926g;
                        if (iY > 0) {
                            m mVar = this.f44922c;
                            U(mVar);
                            if (mVar.v0(g(), ((b9) jVar.f40914b).t(), false, false, false, true).f44870g > iY) {
                                v8 v8VarF = w8.F();
                                v8VarF.i("_tnr");
                                v8VarF.k(1L);
                                s8Var.l((w8) v8VarF.d());
                            } else {
                                if (f0().A(((b9) jVar.f40914b).t(), g0.Q0)) {
                                    strN02 = l0().n0();
                                    v8 v8VarF2 = w8.F();
                                    v8VarF2.i("_tu");
                                    v8VarF2.j(strN02);
                                    s8Var.l((w8) v8VarF2.d());
                                } else {
                                    strN02 = null;
                                }
                                v8 v8VarF3 = w8.F();
                                v8VarF3.i("_tr");
                                v8VarF3.k(1L);
                                s8Var.l((w8) v8VarF3.d());
                                U(n4Var);
                                y3 y3VarO = n4Var.O(((b9) jVar.f40914b).t(), a9Var, s8Var, strN02);
                                if (y3VarO != null) {
                                    b().f45267o.c("Generated trigger URI. appId, uri", ((b9) jVar.f40914b).t(), y3VarO.f45326a);
                                    m mVar2 = this.f44922c;
                                    U(mVar2);
                                    mVar2.K(((b9) jVar.f40914b).t(), y3VarO);
                                    if (!linkedList.contains(((b9) jVar.f40914b).t())) {
                                        linkedList.add(((b9) jVar.f40914b).t());
                                    }
                                }
                            }
                        } else {
                            if (f0().A(((b9) jVar.f40914b).t(), g0.Q0)) {
                                strN0 = l0().n0();
                                v8 v8VarF4 = w8.F();
                                v8VarF4.i("_tu");
                                v8VarF4.j(strN0);
                                s8Var.l((w8) v8VarF4.d());
                            } else {
                                strN0 = null;
                            }
                            v8 v8VarF5 = w8.F();
                            v8VarF5.i("_tr");
                            v8VarF5.k(1L);
                            s8Var.l((w8) v8VarF5.d());
                            U(n4Var);
                            y3 y3VarO2 = n4Var.O(((b9) jVar.f40914b).t(), a9Var, s8Var, strN0);
                            if (y3VarO2 != null) {
                                b().f45267o.c("Generated trigger URI. appId, uri", ((b9) jVar.f40914b).t(), y3VarO2.f45326a);
                                m mVar3 = this.f44922c;
                                U(mVar3);
                                mVar3.K(((b9) jVar.f40914b).t(), y3VarO2);
                                if (!linkedList.contains(((b9) jVar.f40914b).t())) {
                                    linkedList.add(((b9) jVar.f40914b).t());
                                }
                            }
                        }
                    }
                    t8 t8Var = (t8) s8Var.d();
                    a9Var.b();
                    ((b9) a9Var.f11483b).b0(i11, t8Var);
                }
            }
        }
    }

    public final void x(String str, v8 v8Var, Bundle bundle, String str2) {
        int iU;
        List listF = f0().A(str2, g0.f44764a1) ? vz.c.f("_o", "_sn", "_sc", "_si", "deep_link_url") : vz.c.f("_o", "_sn", "_sc", "_si");
        if (r4.U(((w8) v8Var.f11483b).u()) || r4.U(str)) {
            iU = f0().u(str2, true);
        } else {
            g gVarF0 = f0();
            gVarF0.getClass();
            iU = Math.max(Math.min(gVarF0.y(str2, g0.f44781g0), 500), 100);
        }
        long j9 = iU;
        long jCodePointCount = ((w8) v8Var.f11483b).w().codePointCount(0, ((w8) v8Var.f11483b).w().length());
        l0();
        String strU = ((w8) v8Var.f11483b).u();
        f0();
        String strW = r4.w(strU, 40, true);
        if (jCodePointCount <= j9 || listF.contains(((w8) v8Var.f11483b).u())) {
            return;
        }
        if ("_ev".equals(((w8) v8Var.f11483b).u())) {
            l0();
            bundle.putString("_ev", r4.w(((w8) v8Var.f11483b).w(), f0().u(str2, true), true));
            return;
        }
        b().l.c("Param value is too long; discarded. Name, value length", strW, Long.valueOf(jCodePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strW);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(((w8) v8Var.f11483b).u());
    }

    public final boolean y(s8 s8Var) {
        ArrayList arrayList = new ArrayList(s8Var.i());
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if ("value".equals(((w8) arrayList.get(i13)).u())) {
                i11 = i13;
            } else if ("currency".equals(((w8) arrayList.get(i13)).u())) {
                i12 = i13;
            }
        }
        if (i11 == -1) {
            if (!f0().A(null, g0.f44779f1) || !"_iap".equals(s8Var.o())) {
                return true;
            }
            E(s8Var, "_c");
            D(s8Var, 18, "value");
            return false;
        }
        if (!((w8) arrayList.get(i11)).x() && !((w8) arrayList.get(i11)).B()) {
            b().l.a("Value must be specified with a numeric type.");
            s8Var.n(i11);
            E(s8Var, "_c");
            D(s8Var, 18, "value");
            return false;
        }
        if (i12 != -1) {
            String strW = ((w8) arrayList.get(i12)).w();
            if (strW.length() == 3) {
                int iCharCount = 0;
                while (iCharCount < strW.length()) {
                    int iCodePointAt = strW.codePointAt(iCharCount);
                    if (Character.isLetter(iCodePointAt)) {
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return true;
            }
        }
        b().l.a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
        s8Var.n(i11);
        E(s8Var, "_c");
        D(s8Var, 19, "currency");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0086 A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0015, B:8:0x001d, B:10:0x002a, B:11:0x0034, B:19:0x0048, B:24:0x0098, B:23:0x0086, B:25:0x00a5, B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:83:0x0236, B:85:0x024a, B:87:0x0255, B:95:0x0274, B:89:0x025b, B:91:0x0264, B:93:0x026a, B:94:0x026e, B:96:0x0277, B:97:0x027f, B:33:0x00ef, B:98:0x0280), top: B:103:0x0015, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5 A[Catch: all -> 0x0018, PHI: r0
      0x00a5: PHI (r0v2 int) = (r0v0 int), (r0v35 int) binds: [B:12:0x003b, B:18:0x0046] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0015, B:8:0x001d, B:10:0x002a, B:11:0x0034, B:19:0x0048, B:24:0x0098, B:23:0x0086, B:25:0x00a5, B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:83:0x0236, B:85:0x024a, B:87:0x0255, B:95:0x0274, B:89:0x025b, B:91:0x0264, B:93:0x026a, B:94:0x026e, B:96:0x0277, B:97:0x027f, B:33:0x00ef, B:98:0x0280), top: B:103:0x0015, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00de A[Catch: all -> 0x0018, SQLiteException -> 0x00cd, TryCatch #3 {SQLiteException -> 0x00cd, blocks: (B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:83:0x0236, B:85:0x024a, B:87:0x0255, B:95:0x0274, B:89:0x025b, B:91:0x0264, B:93:0x026a, B:94:0x026e, B:96:0x0277, B:97:0x027f, B:33:0x00ef), top: B:107:0x00ba, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ef A[Catch: all -> 0x0018, SQLiteException -> 0x00cd, TryCatch #3 {SQLiteException -> 0x00cd, blocks: (B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:83:0x0236, B:85:0x024a, B:87:0x0255, B:95:0x0274, B:89:0x025b, B:91:0x0264, B:93:0x026a, B:94:0x026e, B:96:0x0277, B:97:0x027f, B:33:0x00ef), top: B:107:0x00ba, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113 A[Catch: all -> 0x016b, TryCatch #2 {all -> 0x016b, blocks: (B:35:0x0102, B:36:0x010b, B:38:0x0113, B:40:0x0127, B:42:0x0134, B:43:0x0136, B:47:0x0151, B:49:0x015b, B:54:0x016e, B:55:0x0174, B:57:0x017a, B:59:0x018f, B:61:0x01a5, B:62:0x01a7, B:64:0x01b3, B:66:0x01cf, B:68:0x01f4, B:69:0x0203, B:70:0x0207, B:72:0x020d, B:73:0x0214, B:76:0x0222, B:78:0x0226, B:81:0x022d, B:82:0x022e), top: B:106:0x0102, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017a A[Catch: all -> 0x016b, TryCatch #2 {all -> 0x016b, blocks: (B:35:0x0102, B:36:0x010b, B:38:0x0113, B:40:0x0127, B:42:0x0134, B:43:0x0136, B:47:0x0151, B:49:0x015b, B:54:0x016e, B:55:0x0174, B:57:0x017a, B:59:0x018f, B:61:0x01a5, B:62:0x01a7, B:64:0x01b3, B:66:0x01cf, B:68:0x01f4, B:69:0x0203, B:70:0x0207, B:72:0x020d, B:73:0x0214, B:76:0x0222, B:78:0x0226, B:81:0x022d, B:82:0x022e), top: B:106:0x0102, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cf A[Catch: all -> 0x016b, TryCatch #2 {all -> 0x016b, blocks: (B:35:0x0102, B:36:0x010b, B:38:0x0113, B:40:0x0127, B:42:0x0134, B:43:0x0136, B:47:0x0151, B:49:0x015b, B:54:0x016e, B:55:0x0174, B:57:0x017a, B:59:0x018f, B:61:0x01a5, B:62:0x01a7, B:64:0x01b3, B:66:0x01cf, B:68:0x01f4, B:69:0x0203, B:70:0x0207, B:72:0x020d, B:73:0x0214, B:76:0x0222, B:78:0x0226, B:81:0x022d, B:82:0x022e), top: B:106:0x0102, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020d A[Catch: all -> 0x016b, TRY_LEAVE, TryCatch #2 {all -> 0x016b, blocks: (B:35:0x0102, B:36:0x010b, B:38:0x0113, B:40:0x0127, B:42:0x0134, B:43:0x0136, B:47:0x0151, B:49:0x015b, B:54:0x016e, B:55:0x0174, B:57:0x017a, B:59:0x018f, B:61:0x01a5, B:62:0x01a7, B:64:0x01b3, B:66:0x01cf, B:68:0x01f4, B:69:0x0203, B:70:0x0207, B:72:0x020d, B:73:0x0214, B:76:0x0222, B:78:0x0226, B:81:0x022d, B:82:0x022e), top: B:106:0x0102, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024a A[Catch: all -> 0x0018, SQLiteException -> 0x00cd, TryCatch #3 {SQLiteException -> 0x00cd, blocks: (B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:83:0x0236, B:85:0x024a, B:87:0x0255, B:95:0x0274, B:89:0x025b, B:91:0x0264, B:93:0x026a, B:94:0x026e, B:96:0x0277, B:97:0x027f, B:33:0x00ef), top: B:107:0x00ba, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025b A[Catch: all -> 0x0018, SQLiteException -> 0x00cd, TryCatch #3 {SQLiteException -> 0x00cd, blocks: (B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:83:0x0236, B:85:0x024a, B:87:0x0255, B:95:0x0274, B:89:0x025b, B:91:0x0264, B:93:0x026a, B:94:0x026e, B:96:0x0277, B:97:0x027f, B:33:0x00ef), top: B:107:0x00ba, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(boolean r19, int r20, java.lang.Throwable r21, byte[] r22, java.lang.String r23, java.util.List r24, java.util.Map r25) {
        /*
            Method dump skipped, instruction units count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.l4.z(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List, java.util.Map):void");
    }
}
