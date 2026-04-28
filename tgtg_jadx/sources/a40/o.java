package a40;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d40.h1;
import d40.i0;
import d40.j0;
import d40.k0;
import d40.k1;
import d40.l1;
import d40.m0;
import d40.m1;
import d40.m2;
import d40.n1;
import d40.n2;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f745r = new h(1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Charset f746s = Charset.forName(ArticleContentView.UTF_8_ENCODING_TYPE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2.z f749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g40.b f750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b40.f f751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g40.b f753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c40.f f755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x30.a f756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y30.a f757k;
    public final k l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g40.b f758m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public w f759n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d10.g f760o = new d10.g();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d10.g f761p = new d10.g();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d10.g f762q = new d10.g();

    public o(Context context, b0 b0Var, x xVar, g40.b bVar, w2.z zVar, a aVar, g40.b bVar2, c40.f fVar, g40.b bVar3, x30.a aVar2, y30.a aVar3, k kVar, b40.f fVar2) {
        new AtomicBoolean(false);
        this.f747a = context;
        this.f752f = b0Var;
        this.f748b = xVar;
        this.f753g = bVar;
        this.f749c = zVar;
        this.f754h = aVar;
        this.f750d = bVar2;
        this.f755i = fVar;
        this.f756j = aVar2;
        this.f757k = aVar3;
        this.l = kVar;
        this.f758m = bVar3;
        this.f751e = fVar2;
    }

    public static d10.o a(o oVar) {
        d10.o oVarB;
        oVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : g40.b.m(((File) oVar.f753g.f20002c).listFiles(f745r))) {
            try {
                long j9 = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    oVarB = Tasks.d(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    oVarB = Tasks.b(new ScheduledThreadPoolExecutor(1), new n(oVar, j9));
                }
                arrayList.add(oVarB);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.e(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05f2  */
    /* JADX WARN: Type inference failed for: r0v7, types: [a40.k] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20, types: [int] */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
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
    public final void b(boolean r32, cz.j r33, boolean r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a40.o.b(boolean, cz.j, boolean):void");
    }

    public final void c(String str, Boolean bool) {
        String str2;
        String str3;
        Integer num;
        Map mapUnmodifiableMap;
        List listUnmodifiableList;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strK = e0.f.k("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strK, null);
        }
        Locale locale = Locale.US;
        b0 b0Var = this.f752f;
        a aVar = this.f754h;
        l1 l1Var = new l1(b0Var.f707c, aVar.f695f, aVar.f696g, b0Var.c().f711a, (aVar.f693d != null ? y.APP_STORE : y.DEVELOPER).a(), aVar.f697h);
        String str4 = Build.VERSION.RELEASE;
        String str5 = Build.VERSION.CODENAME;
        n1 n1Var = new n1(g.g());
        Context context = this.f747a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        int iOrdinal = f.a().ordinal();
        String str6 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = g.a(context);
        boolean zF = g.f();
        int iC = g.c();
        String str7 = Build.MANUFACTURER;
        String str8 = Build.PRODUCT;
        this.f756j.d(str, jCurrentTimeMillis, new k1(l1Var, n1Var, new m1(iOrdinal, iAvailableProcessors, jA, blockCount, zF, iC)));
        if (!bool.booleanValue() || str == null) {
            str2 = str5;
            str3 = str8;
        } else {
            g40.b bVar = this.f750d;
            synchronized (((String) bVar.f20000a)) {
                bVar.f20000a = str;
                c40.e eVar = (c40.e) ((AtomicMarkableReference) ((c40.q) bVar.f20003d).f7093c).getReference();
                synchronized (eVar) {
                    mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(eVar.f7061a));
                }
                a60.y yVar = (a60.y) bVar.f20005f;
                synchronized (yVar) {
                    listUnmodifiableList = Collections.unmodifiableList(new ArrayList(yVar.f940a));
                }
                str2 = str5;
                str3 = str8;
                ((b40.f) bVar.f20002c).f5743b.a(new b0.g(3, bVar, str, mapUnmodifiableMap, listUnmodifiableList));
            }
        }
        c40.f fVar = this.f755i;
        ((c40.d) fVar.f7066b).a();
        fVar.f7066b = c40.f.f7064c;
        if (str != null) {
            fVar.f7066b = new c40.o(((g40.b) fVar.f7065a).h(str, "userlog"));
        }
        this.l.a(str);
        g40.b bVar2 = this.f758m;
        v vVar = (v) bVar2.f20000a;
        Charset charset = n2.f14292a;
        d40.a0 a0Var = new d40.a0();
        a0Var.f14054a = "20.0.4";
        a aVar2 = vVar.f795c;
        String str9 = aVar2.f690a;
        if (str9 == null) {
            c50.w.l("Null gmpAppId");
            return;
        }
        a0Var.f14055b = str9;
        b0 b0Var2 = vVar.f794b;
        String str10 = b0Var2.c().f711a;
        if (str10 == null) {
            c50.w.l("Null installationUuid");
            return;
        }
        a0Var.f14057d = str10;
        a0Var.f14058e = b0Var2.c().f712b;
        a0Var.f14059f = b0Var2.c().f713c;
        String str11 = aVar2.f695f;
        if (str11 == null) {
            c50.w.l("Null buildVersion");
            return;
        }
        a0Var.f14061h = str11;
        String str12 = aVar2.f696g;
        if (str12 == null) {
            c50.w.l("Null displayVersion");
            return;
        }
        a0Var.f14062i = str12;
        a0Var.f14056c = 4;
        a0Var.f14065m = (byte) (a0Var.f14065m | 1);
        i0 i0Var = new i0();
        i0Var.f14191f = false;
        byte b8 = (byte) (i0Var.f14197m | 2);
        i0Var.f14189d = jCurrentTimeMillis;
        i0Var.f14197m = (byte) (b8 | 1);
        if (str == null) {
            c50.w.l("Null identifier");
            return;
        }
        i0Var.f14187b = str;
        String str13 = v.f792g;
        if (str13 == null) {
            c50.w.l("Null generator");
            return;
        }
        i0Var.f14186a = str13;
        String str14 = b0Var2.f707c;
        if (str14 == null) {
            c50.w.l("Null identifier");
            return;
        }
        String str15 = b0Var2.c().f711a;
        ub.a aVar3 = aVar2.f697h;
        if (((f6.p) aVar3.f40982c) == null) {
            aVar3.f40982c = new f6.p(aVar3);
        }
        f6.p pVar = (f6.p) aVar3.f40982c;
        String str16 = pVar.f17420b;
        if (pVar == null) {
            aVar3.f40982c = new f6.p(aVar3);
        }
        i0Var.f14192g = new k0(str14, str11, str12, str15, str16, ((f6.p) aVar3.f40982c).f17421c);
        h1 h1Var = new h1();
        h1Var.f14171a = 3;
        h1Var.f14175e = (byte) (h1Var.f14175e | 1);
        if (str4 == null) {
            c50.w.l("Null version");
            return;
        }
        h1Var.f14172b = str4;
        if (str2 == null) {
            c50.w.l("Null buildVersion");
            return;
        }
        h1Var.f14173c = str2;
        h1Var.f14174d = g.g();
        h1Var.f14175e = (byte) (h1Var.f14175e | 2);
        i0Var.f14194i = h1Var.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        String str17 = Build.CPU_ABI;
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str17) && (num = (Integer) v.f791f.get(str17.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = g.a(vVar.f793a);
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zF2 = g.f();
        int iC2 = g.c();
        m0 m0Var = new m0();
        m0Var.f14260a = iIntValue;
        byte b11 = (byte) (m0Var.f14269j | 1);
        m0Var.f14269j = b11;
        if (str6 == null) {
            c50.w.l("Null model");
            return;
        }
        m0Var.f14261b = str6;
        m0Var.f14262c = iAvailableProcessors2;
        m0Var.f14263d = jA2;
        m0Var.f14264e = blockCount2;
        m0Var.f14265f = zF2;
        m0Var.f14266g = iC2;
        m0Var.f14269j = (byte) (((byte) (((byte) (((byte) (((byte) (b11 | 2)) | 4)) | 8)) | 16)) | 32);
        if (str7 == null) {
            c50.w.l("Null manufacturer");
            return;
        }
        m0Var.f14267h = str7;
        String str18 = str3;
        if (str18 == null) {
            c50.w.l("Null modelClass");
            return;
        }
        m0Var.f14268i = str18;
        i0Var.f14195j = m0Var.a();
        i0Var.l = 3;
        i0Var.f14197m = (byte) (i0Var.f14197m | 4);
        a0Var.f14063j = i0Var.a();
        d40.b0 b0VarA = a0Var.a();
        g40.b bVar3 = ((g40.a) bVar2.f20001b).f19997b;
        m2 m2Var = b0VarA.f14092k;
        if (m2Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str19 = ((j0) m2Var).f14215b;
        try {
            g40.a.f19993g.getClass();
            g40.a.f(bVar3.h(str19, "report"), e40.c.f15747a.e(b0VarA));
            File fileH = bVar3.h(str19, "start-time");
            long j9 = ((j0) m2Var).f14217d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileH), g40.a.f19991e);
            try {
                outputStreamWriter.write("");
                fileH.setLastModified(j9 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e5) {
            String strK2 = e0.f.k("Could not persist report for session ", str19);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strK2, e5);
            }
        }
    }

    public final boolean d(cz.j jVar) throws Throwable {
        b40.f.a();
        w wVar = this.f759n;
        if (wVar != null && wVar.f802e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            b(true, jVar, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e5) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e5);
            return false;
        }
    }

    public final String e() {
        NavigableSet navigableSetC = ((g40.a) this.f758m.f20001b).c();
        if (navigableSetC.isEmpty()) {
            return null;
        }
        return (String) navigableSetC.first();
    }

    public final String f() throws IOException {
        InputStream resourceAsStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        Context context = this.f747a;
        int iD = g.d(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iD == 0 ? null : context.getResources().getString(iD);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(f746s), 0);
        }
        ClassLoader classLoader = o.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bArr = new byte[1024];
            } finally {
            }
        } catch (Throwable th2) {
            try {
                resourceAsStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
        while (true) {
            int i11 = resourceAsStream.read(bArr);
            if (i11 == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                String strEncodeToString = Base64.encodeToString(byteArray, 0);
                resourceAsStream.close();
                return strEncodeToString;
            }
            byteArrayOutputStream.write(bArr, 0, i11);
            resourceAsStream.close();
            throw th2;
        }
    }

    public final void g() {
        try {
            String strF = f();
            if (strF != null) {
                try {
                    ((c40.q) this.f750d.f20004e).h("com.crashlytics.version-control-info", strF);
                } catch (IllegalArgumentException e5) {
                    Context context = this.f747a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e5;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e11) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e11);
        }
    }

    public final void h(d10.o oVar) {
        d10.o oVar2;
        d10.o oVarA;
        d10.g gVar = this.f760o;
        g40.b bVar = ((g40.a) this.f758m.f20001b).f19997b;
        if (g40.b.m(((File) bVar.f20004e).listFiles()).isEmpty() && g40.b.m(((File) bVar.f20005f).listFiles()).isEmpty() && g40.b.m(((File) bVar.f20006g).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            gVar.d(Boolean.FALSE);
            return;
        }
        x30.b bVar2 = x30.b.f43820a;
        bVar2.c("Crash reports are available to be sent.");
        x xVar = this.f748b;
        if (xVar.h()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            gVar.d(Boolean.FALSE);
            oVarA = Tasks.d(Boolean.TRUE);
        } else {
            bVar2.b("Automatic data collection is disabled.");
            bVar2.c("Notifying that unsent reports are available.");
            gVar.d(Boolean.TRUE);
            synchronized (xVar.f808f) {
                oVar2 = ((d10.g) xVar.f809g).f13697a;
            }
            Task taskN = oVar2.n(new qb.e());
            bVar2.b("Waiting for send/deleteUnsentReports to be called.");
            oVarA = b40.b.a(taskN, this.f761p.f13697a);
        }
        oVarA.o(this.f751e.f5742a, new w2.z(this, oVar, false, 4));
    }
}
